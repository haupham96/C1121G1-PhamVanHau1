package furama_resort.service.impl;

import furama_resort.model.Booking;
import furama_resort.model.Contract;
import furama_resort.model.Facility;
import furama_resort.service.BookingService;
import furama_resort.service.ContractService;

import java.util.*;

public class BookingServiceImpl implements BookingService, ContractService {
    Scanner scanner = new Scanner(System.in);
    static TreeSet<Booking> bookingList = new TreeSet<>();
    static Queue<Booking> bookingQueue = new LinkedList<>();
    static List<Contract> contractList = new ArrayList<>();

    static {
        Booking booking = new Booking("BK0001", "01/01/2000", "04/01/2000", "C000", "VillaTest", "Villa");
        Booking booking2 = new Booking("BK0002", "05/01/2000", "10/01/2000", "C001", "VillaTest2", "Villa");
        Booking booking3 = new Booking("BK0003", "07/01/2000", "10/01/2000", "C002", "RoomTest1", "Room");
        Booking booking4 = new Booking("BK0004", "09/01/2000", "12/01/2000", "C003", "RoomTest2", "Room");
        Booking booking5 = new Booking("BK0005", "15/01/2000", "18/01/2000", "C004", "RoomTest3", "Room");
        Booking booking6 = new Booking("BK0006", "20/01/2000", "22/01/2000", "C005", "RoomTest4", "Room");
        bookingList.add(booking);
        bookingList.add(booking2);
        bookingList.add(booking3);
        bookingList.add(booking4);
        bookingList.add(booking5);
        bookingList.add(booking6);

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
        int bookingTimes = FacilityServiceImpl.facilityList.get(facility.get(chooseService - 1)) + 1;
        FacilityServiceImpl.facilityList.replace(facility.get(chooseService - 1), bookingTimes);

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
        bookingQueue.addAll(bookingList);

        if (bookingQueue.size() == 0) {
            System.out.println("Booking Queue is Empty");
        } else {
            Booking booking = bookingQueue.remove();
            System.out.println("Enter Contract Number");
            int contractNumber = Integer.parseInt(scanner.nextLine());

            String bookingCode = booking.getBookingCode();

            System.out.println("Enter Deposit Money");
            int depositMoney = Integer.parseInt(scanner.nextLine());

            System.out.println("Enter Total Money");
            int totalMoney = Integer.parseInt(scanner.nextLine());

            String customerCode = booking.getCustomerCode();

            Contract contract = new Contract(contractNumber, bookingCode, depositMoney, totalMoney, customerCode);
            contractList.add(contract);

        }


    }

    @Override
    public void displayContract() {
        if (contractList.size() == 0) {
            System.out.println("Contract list Empty");
        } else {
            for (Contract contract : contractList) {
                System.out.println(contract);
            }
        }

    }

    @Override
    public void editContract() {
        System.out.println("Choose contract to edit");
        System.out.println();
        for (int i = 0; i < contractList.size(); i++) {
            System.out.println((i + 1) + " . " + contractList.get(i).toString());
        }
        int chooseEditContract = Integer.parseInt(scanner.nextLine());
        chooseEditContract = chooseEditContract - 1;

        Contract contract = contractList.get(chooseEditContract);

        System.out.println("Enter Booking code to edit");
        String bookingCode = scanner.nextLine();
        contract.setBookingCode(bookingCode);

        System.out.println("Enter deposit money to Edit");
        int depositMoney = Integer.parseInt(scanner.nextLine());
        contract.setDepositMoney(depositMoney);

        System.out.println("Enter total money to Edit");
        int totalMoney = Integer.parseInt(scanner.nextLine());
        contract.setTotalMoney(totalMoney);

        System.out.println("Enter Customer Code to Edit");
        String customerCode = scanner.nextLine();
        contract.setCustomerCode(customerCode);

        System.out.println();
        System.out.println("Edit Complete !");

    }
}
