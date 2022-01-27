package furama_resort.service.impl;

import furama_resort.model.Booking;
import furama_resort.model.Facility;
import furama_resort.service.BookingService;
import furama_resort.service.ContractService;

import java.util.*;

public class BookingServiceImpl implements BookingService,ContractService {
    Scanner scanner = new Scanner(System.in);
    CustomerServiceImpl customerService = new CustomerServiceImpl();
    FacilityServiceImpl facilityService = new FacilityServiceImpl();
    static TreeSet<Booking> bookingList = new TreeSet<>();
    static Queue<Booking> bookingQueue = new LinkedList<>();

    static {
        Booking booking = new Booking("BK0001", "01/01/2000", "04/01/2000", "C000", "VillaTest", "Villa");
        bookingList.add(booking);
    }

    @Override
    public void add() {
        System.out.println("Booking code ?");
        String bookingCode = scanner.nextLine();
        System.out.println("Day Start ");
        String dayStart = scanner.nextLine();
        System.out.println("Day End ");
        String dayEnd = scanner.nextLine();

        System.out.println("Choose Customer code");
        for (int i = 0; i < CustomerServiceImpl.customerList.size(); i++) {
            System.out.println((i + 1) + ". " + CustomerServiceImpl.customerList.get(i));
        }
        int chooseCode = Integer.parseInt(scanner.nextLine());
        String customerCode = CustomerServiceImpl.customerList.get(chooseCode - 1).getCustomerCode();

        List<Facility> facility = new ArrayList<>();
        facility.addAll(FacilityServiceImpl.facilityList.keySet());
        System.out.println("Choose Name of Service ");
        for (int i = 0; i < facility.size(); i++) {
            System.out.println((i + 1) + ". " + facility.get(i));
        }
        int chooseService = Integer.parseInt(scanner.nextLine());
        String nameOfService = facility.get(chooseService - 1).getNameOfService();

        System.out.println("Type Of Service");
        String typeOfService = scanner.nextLine();

        Booking booking = new Booking(bookingCode, dayStart, dayEnd, customerCode, nameOfService, typeOfService);
        bookingList.add(booking);

    }

    @Override
    public void display() {
        for (Booking booking : bookingList) {
            System.out.println(booking);
        }

    }

    @Override
    public void createContract() {

    }

    @Override
    public void displayContract() {

    }

    @Override
    public void editContract() {

    }
}
