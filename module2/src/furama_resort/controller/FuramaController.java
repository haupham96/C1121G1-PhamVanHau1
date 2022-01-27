package furama_resort.controller;

import furama_resort.model.Customer;
import furama_resort.service.impl.BookingServiceImpl;
import furama_resort.service.impl.CustomerServiceImpl;
import furama_resort.service.impl.EmployeeServiceImpl;
import furama_resort.service.impl.FacilityServiceImpl;

import java.util.Scanner;

public class FuramaController {
    Scanner scanner = new Scanner(System.in);
    EmployeeServiceImpl employeeService = new EmployeeServiceImpl();
    CustomerServiceImpl customerService = new CustomerServiceImpl();
    FacilityServiceImpl facilityService = new FacilityServiceImpl();
    BookingServiceImpl bookingService = new BookingServiceImpl();

    public void displayMainMenu() {
        int choice;
        do {
            System.out.println();
            System.out.println("FURAMA RESORT SERVICE");
            System.out.println();
            System.out.println("1. Employee Management");
            System.out.println("2. Customer Management");
            System.out.println("3. Facility Management");
            System.out.println("4. Booking Management");
            System.out.println("5. Promotion Management");
            System.out.println("6. Exit");
            System.out.println();

            choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    int employeeChoice;
                    do {
                        System.out.println();
                        System.out.println("EMPLOYEE MANAGEMENT");
                        System.out.println();
                        System.out.println("1. Display list employees");
                        System.out.println("2. Add new employee");
                        System.out.println("3. Edit employee");
                        System.out.println("4. Return main menu");
                        employeeChoice = Integer.parseInt(scanner.nextLine());

                        switch (employeeChoice) {
                            case 1:
                                System.out.println("1. Display list employees");
                                System.out.println();
                                employeeService.display();
                                break;
                            case 2:
                                System.out.println("2. Add new employee");
                                System.out.println();
                                employeeService.add();
                                break;
                            case 3:
                                System.out.println("3. Edit employee");
                                System.out.println();
                                employeeService.edit();
                                break;
                            case 4:
                                System.out.println("4. Return main menu");
                                break;
                            default:
                                System.out.println("invalid choice");
                                break;
                        }
                    } while (employeeChoice != 4);
                    break;
                case 2:
                    int customerChoice;
                    do {
                        System.out.println("CUSTOMER MANAGEMENT");
                        System.out.println();
                        System.out.println("1. Display list customer");
                        System.out.println("2. Add new customer");
                        System.out.println("3. Edit customer");
                        System.out.println("4. Return main menu");
                        customerChoice = Integer.parseInt(scanner.nextLine());

                        switch (customerChoice) {
                            case 1:
                                System.out.println("1. Display list customer");
                                System.out.println();
                                customerService.display();
                                break;
                            case 2:
                                System.out.println("2. Add new customer");
                                System.out.println();
                                customerService.add();
                                break;
                            case 3:
                                System.out.println("3. Edit customer");
                                System.out.println();
                                customerService.edit();
                                break;
                            case 4:
                                System.out.println("4. Return main menu");
                                break;
                            default:
                                System.out.println("invalid choice");
                                break;
                        }
                    } while (customerChoice != 4);
                    break;
                case 3:
                    int facilityChoice;
                    do {
                        System.out.println("FACILITY MANAGEMENT");
                        System.out.println();
                        System.out.println("1. Display list facility");
                        System.out.println("2. Add new facility");
                        System.out.println("3. Display list facility maintenance");
                        System.out.println("4. Return main menu");
                        facilityChoice = Integer.parseInt(scanner.nextLine());

                        switch (facilityChoice) {
                            case 1:
                                System.out.println("1. Display list facility");
                                System.out.println();
                                facilityService.display();
                                break;
                            case 2:
                                System.out.println("2. Add new facility");
                                System.out.println();
                                int serviceChoice;
                                do {
                                    System.out.println();
                                    System.out.println("1. Add new Villa");
                                    System.out.println("2. Add new House");
                                    System.out.println("3. Add new Room");
                                    System.out.println("4. Back to menu");
                                    serviceChoice = Integer.parseInt(scanner.nextLine());
                                    switch (serviceChoice) {
                                        case 1:
                                            System.out.println("ADD NEW VILLA");
                                            System.out.println();
                                            facilityService.addVilla();
                                            break;
                                        case 2:
                                            System.out.println("ADD NEW HOUSE");
                                            System.out.println();
                                            facilityService.addHouse();
                                            break;
                                        case 3:
                                            System.out.println("ADD NEW ROOM");
                                            System.out.println();
                                            facilityService.addRoom();
                                            break;
                                        case 4:
                                            System.out.println();
                                            break;
                                        default:
                                            System.out.println("invalid choice !");
                                            System.out.println();
                                            break;
                                    }
                                } while (serviceChoice != 4);
                                break;
                            case 3:
                                System.out.println("3. Display list facility maintenance");
                                System.out.println();
                                facilityService.displayMaintenance();
                                break;
                            case 4:
                                System.out.println("4. Return main menu");
                                break;
                            default:
                                System.out.println("invalid choice");
                                break;
                        }
                    } while (facilityChoice != 4);
                    break;
                case 4:
                    int bookingChoice;
                    do {
                        System.out.println("BOOKING MANAGEMENT");
                        System.out.println();
                        System.out.println("1. Add new booking");
                        System.out.println("2. Display list booking");
                        System.out.println("3. Create new contracts");
                        System.out.println("4. Display list contracts");
                        System.out.println("5. Edit contracts");
                        System.out.println("6. Return main menu");
                        bookingChoice = Integer.parseInt(scanner.nextLine());

                        switch (bookingChoice) {
                            case 1:
                                System.out.println("1. Add new booking");
                                System.out.println();
                                bookingService.add();
                                break;
                            case 2:
                                System.out.println("2. Display list booking");
                                bookingService.display();
                                break;
                            case 3:
                                System.out.println("3. Create new contracts");
                                break;
                            case 4:
                                System.out.println("4. Display list contracts");
                                break;
                            case 5:
                                System.out.println("5. Edit contracts");
                                break;
                            case 6:
                                System.out.println("6. Return main menu");
                                break;
                            default:
                                System.out.println("invalid choice");
                                break;
                        }
                    } while (bookingChoice != 6);
                    break;
                case 5:
                    int promotionChoice;
                    do {
                        System.out.println("PROMOTION MANAGEMENT");
                        System.out.println();
                        System.out.println("1. Display list customers use service");
                        System.out.println("2. Display list customers get voucher");
                        System.out.println("3. Return main menu");
                        promotionChoice = Integer.parseInt(scanner.nextLine());

                        switch (promotionChoice) {
                            case 1:
                                System.out.println("1. Display list customers use service");
                                break;
                            case 2:
                                System.out.println("2. Display list customers get voucher");
                                break;
                            case 3:
                                System.out.println("3. Return main menu");
                                break;
                            default:
                                System.out.println("invalid choice");
                                break;
                        }
                    } while (promotionChoice != 3);
                    break;
                case 6:
                    System.out.println("GOODBYE !");
                    System.exit(0);
                default:
                    System.out.println("invalid choice");
                    break;
            }

        } while (true);
    }
}
