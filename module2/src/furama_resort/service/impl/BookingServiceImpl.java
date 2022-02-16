package furama_resort.service.impl;

import furama_resort.model.*;
import furama_resort.service.BookingService;
import furama_resort.service.ContractService;
import furama_resort.util.exception.user_input_exception.UserInputException;
import furama_resort.util.read_and_write_csv.CSVPath;
import furama_resort.util.read_and_write_csv.ReadAndWriteCSV;

import java.util.*;

public class BookingServiceImpl implements BookingService, ContractService {
    FacilityServiceImpl facilityService = new FacilityServiceImpl();
    ReadAndWriteCSV readAndWriteCSV = new ReadAndWriteCSV();
    Scanner scanner = new Scanner(System.in);

    @Override
    public void add() {
        TreeSet<Booking> bookingList = new TreeSet<>();
        TreeSet<Booking> bookingList2 = new TreeSet<>();

        Map<Facility, Integer> facilityMap = facilityService.readHouseRoomVillaCSV();

        List<String> list = readAndWriteCSV.readFileCSV(CSVPath.BOOKING);
        List<String> list2 = readAndWriteCSV.readFileCSV(CSVPath.BOOKING2);

        List<String> customerString = readAndWriteCSV.readFileCSV(CSVPath.CUSTOMER);
        List<Customer> customerList = new ArrayList<>();
        String[] arr;
        for (int i = 0; i < customerString.size(); i++) {
            arr = customerString.get(i).split(",");
            Customer customer = new Customer(arr[0], arr[1], arr[2], arr[3], arr[4], arr[5], arr[6], arr[6], arr[7]);
            customerList.add(customer);
        }

        System.out.println("Booking code ?");
        String bookingCode = scanner.nextLine();
        System.out.println("Day Start ");
        String dayStart = scanner.nextLine();
        System.out.println("Day End ");
        String dayEnd = scanner.nextLine();

        System.out.println("Choose Customer code");
        for (int i = 0; i < customerList.size(); i++) {
            System.out.println((i + 1) + ". " + customerList.get(i));
        }
        int chooseCode = Integer.parseInt(scanner.nextLine());
        String customerCode = customerList.get(chooseCode - 1).getCustomerCode();

        List<Facility> facility = new ArrayList<>();

        facility.addAll(facilityMap.keySet());

        System.out.println("Choose Name of Service ");
        for (int i = 0; i < facility.size(); i++) {
            System.out.println((i + 1) + ". " + facility.get(i));
        }
        int chooseService = Integer.parseInt(scanner.nextLine());
        String nameOfService = facility.get(chooseService - 1).getNameOfService();

        Facility villa = new Villa();
        villa.usingTimes(nameOfService);
        Facility house = new House();
        house.usingTimes(nameOfService);
        Facility room = new Room();
        room.usingTimes(nameOfService);

        System.out.println("Type Of Service");
        String typeOfService = scanner.nextLine();

        Booking booking = new Booking(bookingCode, dayStart, dayEnd, customerCode, nameOfService, typeOfService);
        bookingList.add(booking);
        bookingList2.add(booking);

        List<Booking> bookings = new ArrayList<>();
        List<Booking> bookings2 = new ArrayList<>();
        bookings.addAll(bookingList);
        bookings2.addAll(bookingList2);

        list.addAll(readAndWriteCSV.changeToStringList(bookings));
        list2.addAll(readAndWriteCSV.changeToStringList(bookings2));

        readAndWriteCSV.writeFileCSV(CSVPath.BOOKING, list, false);
        readAndWriteCSV.writeFileCSV(CSVPath.BOOKING2, list2, false);

    }

    @Override
    public void display() {
        TreeSet<Booking> bookingList = new TreeSet<>();
        List<String> list = readAndWriteCSV.readFileCSV(CSVPath.BOOKING);
        String[] arr;

        for (int i = 0; i < list.size(); i++) {
            arr = list.get(i).split(",");
            Booking booking = new Booking(arr[0], arr[1], arr[2], arr[3], arr[4], arr[5]);
            bookingList.add(booking);
        }

        for (Booking booking : bookingList) {
            System.out.println(booking);
        }

    }

    @Override
    public void createContract() {
        String[] arr;
        Deque<Booking> bookingQueue = new LinkedList<>();
        List<Contract> contractList = new ArrayList<>();
        List<String> contractString = readAndWriteCSV.readFileCSV(CSVPath.CONTRACT);
        for (int i = 0; i < contractString.size(); i++) {
            arr = contractString.get(i).split(",");
            Contract contract = new Contract(Integer.parseInt(arr[0]), arr[1], Integer.parseInt(arr[2]), Integer.parseInt(arr[3]), arr[4]);
            contractList.add(contract);
        }
        List<String> stringList = readAndWriteCSV.readFileCSV(CSVPath.BOOKING2);

        for (int i = 0; i < stringList.size(); i++) {
            arr = stringList.get(i).split(",");
            Booking booking = new Booking(arr[0], arr[1], arr[2], arr[3], arr[4], arr[5]);
            bookingQueue.add(booking);
        }

        Booking booking = bookingQueue.removeFirst();

        String bookingCode = booking.getBookingCode();
        String customerCode = booking.getCustomerCode();

        do {
            try {
                System.out.println("Enter Contract Number");
                int contractNumber = Integer.parseInt(scanner.nextLine());

                System.out.println("Enter Deposit Money");
                int depositMoney = Integer.parseInt(scanner.nextLine());

                System.out.println("Enter Total Money");
                int totalMoney = Integer.parseInt(scanner.nextLine());

                Contract contract = new Contract(contractNumber, bookingCode, depositMoney, totalMoney, customerCode);
                contractList.add(contract);
                List<String> list = readAndWriteCSV.changeToStringList(contractList);
                readAndWriteCSV.writeFileCSV(CSVPath.CONTRACT, list, false);
                list.clear();

                List<Booking> bookingList = new ArrayList<>();
                bookingList.addAll(bookingQueue);
                list = readAndWriteCSV.changeToStringList(bookingList);
                readAndWriteCSV.writeFileCSV(CSVPath.BOOKING2, list, false);
                break;
            } catch (Exception e) {
                UserInputException userInputException = new UserInputException("invalid input");
                userInputException.printStackTrace();
            }
        } while (true);

    }

    @Override
    public void displayContract() {
        String[] arr;
        List<Contract> contractList = new ArrayList<>();
        List<String> list = readAndWriteCSV.readFileCSV(CSVPath.CONTRACT);

        for (int i = 0; i < list.size(); i++) {
            arr = list.get(i).split(",");
            Contract contract = new Contract(Integer.parseInt(arr[0]), arr[1], Integer.parseInt(arr[2]), Integer.parseInt(arr[3]), arr[4]);
            contractList.add(contract);
        }

        for (Contract contract : contractList) {
            System.out.println(contract);
        }
    }

    @Override
    public void editContract() {
        String[] arr;
        List<Contract> contractList = new ArrayList<>();
        List<String> list = readAndWriteCSV.readFileCSV(CSVPath.CONTRACT);

        for (int i = 0; i < list.size(); i++) {
            arr = list.get(i).split(",");
            Contract contract = new Contract(Integer.parseInt(arr[0]), arr[1], Integer.parseInt(arr[2]), Integer.parseInt(arr[3]), arr[4]);
            contractList.add(contract);
        }
        int chooseEditContract;
        do {
            try {
                System.out.println("Choose contract to edit");
                for (int i = 0; i < contractList.size(); i++) {
                    System.out.println((i + 1) + " . " + contractList.get(i));
                }
                chooseEditContract = Integer.parseInt(scanner.nextLine());
                if (chooseEditContract > contractList.size()) {
                    throw new UserInputException("invalid choice");
                }
                chooseEditContract = chooseEditContract - 1;
                break;
            } catch (IndexOutOfBoundsException e) {
                e.printStackTrace();
            } catch (Exception e) {
                UserInputException userInputException = new UserInputException("invalid choice");
                userInputException.printStackTrace();
            }

        } while (true);

        Contract contract = contractList.get(chooseEditContract);

        System.out.println("Enter Booking code to edit");
        String bookingCode = scanner.nextLine();
        contract.setBookingCode(bookingCode);

        do {
            try {
                System.out.println("Enter deposit money to Edit");
                int depositMoney = Integer.parseInt(scanner.nextLine());
                contract.setDepositMoney(depositMoney);

                System.out.println("Enter total money to Edit");
                int totalMoney = Integer.parseInt(scanner.nextLine());
                contract.setTotalMoney(totalMoney);
                break;

            } catch (Exception e) {
                UserInputException userInputException = new UserInputException("invalid input");
                userInputException.printStackTrace();
            }
        } while (true);

        System.out.println("Enter Customer Code to Edit");
        String customerCode = scanner.nextLine();
        contract.setCustomerCode(customerCode);

        System.out.println();
        System.out.println("Edit Complete !");
        List<String> stringList = readAndWriteCSV.changeToStringList(contractList);
        readAndWriteCSV.writeFileCSV(CSVPath.CONTRACT,stringList,false);

    }
}
