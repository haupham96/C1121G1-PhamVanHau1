package furama_resort.controller;


import furama_resort.service.impl.*;
import furama_resort.util.exception.controller_exception.ControllerException;

import java.util.Scanner;

public class FuramaController {
    Scanner scanner = new Scanner(System.in);
    EmployeeServiceImpl employeeService = new EmployeeServiceImpl();
    CustomerServiceImpl customerService = new CustomerServiceImpl();
    FacilityServiceImpl facilityService = new FacilityServiceImpl();
    BookingServiceImpl bookingService = new BookingServiceImpl();
    PromotionServiceImpl promotionService = new PromotionServiceImpl();

    public void displayMainMenu() throws ControllerException {
        int choice = 0;
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

            try {
                choice = Integer.parseInt(scanner.nextLine());
                if (choice != 1 && choice != 2 && choice != 3 && choice != 4 && choice != 5 && choice != 6) {
                    throw new ControllerException("invalid choice : " + choice);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }

            switch (choice) {
                case 1:
                    int employeeChoice = 0;
                    do {
                        System.out.println();
                        System.out.println("EMPLOYEE MANAGEMENT");
                        System.out.println();
                        System.out.println("1. Display list employees");
                        System.out.println("2. Add new employee");
                        System.out.println("3. Edit employee");
                        System.out.println("4. Return main menu");

                        try {
                            employeeChoice = Integer.parseInt(scanner.nextLine());
                            if ( employeeChoice != 1 && employeeChoice != 2 && employeeChoice != 3 && employeeChoice != 4 ) {
                                throw new ControllerException("invalid choice : " + employeeChoice);
                            }
                        } catch (Exception e) {
                            e.printStackTrace();
                        }

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

                        }
                    } while (employeeChoice != 4);
                    break;
                case 2:
                    int customerChoice = 0;
                    do {
                        System.out.println("CUSTOMER MANAGEMENT");
                        System.out.println();
                        System.out.println("1. Display list customer");
                        System.out.println("2. Add new customer");
                        System.out.println("3. Edit customer");
                        System.out.println("4. Return main menu");
                        
                        try {
                            customerChoice = Integer.parseInt(scanner.nextLine());
                            if ( customerChoice != 1 && customerChoice != 2 && customerChoice != 3 && customerChoice != 4 ) {
                                throw new ControllerException("invalid choice : " + customerChoice);
                            }
                        } catch (Exception e) {
                            e.printStackTrace();
                        }

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

                        }
                    } while (customerChoice != 4);
                    break;
                case 3:
                    int facilityChoice = 0;
                    do {
                        System.out.println("FACILITY MANAGEMENT");
                        System.out.println();
                        System.out.println("1. Display list facility");
                        System.out.println("2. Add new facility");
                        System.out.println("3. Display list facility maintenance");
                        System.out.println("4. Return main menu");
                        
                        try {
                            facilityChoice = Integer.parseInt(scanner.nextLine());
                            if ( facilityChoice != 1 && facilityChoice != 2 && facilityChoice != 3 && facilityChoice != 4 ) {
                                throw new ControllerException("invalid choice : " + facilityChoice);
                            }
                        } catch (Exception e) {
                            e.printStackTrace();
                        }

                        switch (facilityChoice) {
                            case 1:
                                System.out.println("1. Display list facility");
                                System.out.println();
                                facilityService.display();
                                break;
                            case 2:
                                System.out.println("2. Add new facility");
                                System.out.println();
                                int serviceChoice = 0;
                                do {
                                    System.out.println();
                                    System.out.println("1. Add new Villa");
                                    System.out.println("2. Add new House");
                                    System.out.println("3. Add new Room");
                                    System.out.println("4. Back to menu");

                                    try {
                                        serviceChoice = Integer.parseInt(scanner.nextLine());
                                        if ( serviceChoice != 1 && serviceChoice != 2 && serviceChoice != 3 && serviceChoice != 4 ) {
                                            throw new ControllerException("invalid choice : " + serviceChoice);
                                        }
                                    } catch (Exception e) {
                                        e.printStackTrace();
                                    }
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

                        }
                    } while (facilityChoice != 4);
                    break;
                case 4:
                    int bookingChoice=0;
                    do {
                        System.out.println("BOOKING MANAGEMENT");
                        System.out.println();
                        System.out.println("1. Add new booking");
                        System.out.println("2. Display list booking");
                        System.out.println("3. Create new contracts");
                        System.out.println("4. Display list contracts");
                        System.out.println("5. Edit contracts");
                        System.out.println("6. Return main menu");

                        try {
                            bookingChoice = Integer.parseInt(scanner.nextLine());
                            if ( bookingChoice != 1 && bookingChoice != 2 && bookingChoice != 3 && bookingChoice != 4 && bookingChoice != 5 && bookingChoice != 6 ) {
                                throw new ControllerException("invalid choice : " + bookingChoice);
                            }
                        } catch (Exception e) {
                            e.printStackTrace();
                        }


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
                                bookingService.createContract();
                                break;
                            case 4:
                                System.out.println("4. Display list contracts");
                                bookingService.displayContract();
                                break;
                            case 5:
                                System.out.println("5. Edit contracts");
                                bookingService.editContract();
                                break;
                            case 6:
                                System.out.println("6. Return main menu");
                                break;

                        }
                    } while (bookingChoice != 6);
                    break;
                case 5:
                    int promotionChoice=0;
                    do {
                        System.out.println("PROMOTION MANAGEMENT");
                        System.out.println();
                        System.out.println("1. Display list customers use service");
                        System.out.println("2. Display list customers get voucher");
                        System.out.println("3. Return main menu");

                        try {
                            promotionChoice = Integer.parseInt(scanner.nextLine());
                            if ( promotionChoice != 1 && promotionChoice != 2 && promotionChoice != 3 ) {
                                throw new ControllerException("invalid choice : " + promotionChoice);
                            }
                        } catch (Exception e) {
                            e.printStackTrace();
                        }

                        switch (promotionChoice) {
                            case 1:
                                System.out.println("1. Display list customers use service");
                                promotionService.displayCustomerUseService();
                                break;
                            case 2:
                                System.out.println("2. Display list customers get voucher");
                                promotionService.displayCustomerGetVoucher();
                                break;
                            case 3:
                                System.out.println("3. Return main menu");
                                break;

                        }
                    } while (promotionChoice != 3);
                    break;
                case 6:
                    System.out.println("GOODBYE !");
                    System.exit(0);
            }

        } while (true);
    }
}
