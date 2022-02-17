package furama_resort.service.impl;

import furama_resort.model.Customer;
import furama_resort.service.CustomerService;
import furama_resort.util.exception.user_input_exception.UserInputException;
import furama_resort.util.read_and_write_csv.CSVPath;
import furama_resort.util.read_and_write_csv.ReadAndWriteCSV;
import furama_resort.util.read_and_write_csv.Regex;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CustomerServiceImpl implements CustomerService {
    ReadAndWriteCSV readAndWriteCSV = new ReadAndWriteCSV();
    Scanner scanner = new Scanner(System.in);
    static List<Customer> customerList = new LinkedList<>();

    @Override
    public void add() {
        System.out.println("Input Name Of Customer");
        String name = scanner.nextLine();

        System.out.println("Input Customer Date Of Birth");
        String dayOfBirth = Regex.regexAge(scanner.nextLine(),Regex.DATE);

        System.out.println("Input Customer Gender");
        String gender = scanner.nextLine();

        System.out.println("Input Customer ID Numbers");
        String ID = scanner.nextLine();

        System.out.println("Input Customer phone numbers");
        String phoneNumber = scanner.nextLine();

        System.out.println("Input Customer Email ");
        String email = scanner.nextLine();

        System.out.println("Input Customer Code");
        String customerCode = scanner.nextLine();

        System.out.println("Input Customer class");
        String customerClass = scanner.nextLine();

        System.out.println("Input Customer address");
        String address = scanner.nextLine();

        Customer customer = new Customer(name, dayOfBirth, gender, ID, phoneNumber, email, customerCode, customerClass, address);
        customerList.add(customer);

        List<String> list = readAndWriteCSV.changeToStringList(customerList);
        readAndWriteCSV.writeFileCSV(CSVPath.CUSTOMER, list, true);

        System.out.println("Successfully Adding new Customer ");

    }

    @Override
    public void display() {
        List<String> list = readAndWriteCSV.readFileCSV(CSVPath.CUSTOMER);
        String[] arr;
        for (int i = 0; i < list.size(); i++) {
            arr = list.get(i).split(",");
            Customer customer = new Customer(arr[0], arr[1], arr[2], arr[3], arr[4], arr[5], arr[6], arr[6], arr[7]);
            System.out.println(customer);
        }
    }

    @Override
    public void edit() {
        List<String> list = readAndWriteCSV.readFileCSV(CSVPath.CUSTOMER);
        String[] arr;

        display();
        System.out.println();

        System.out.println("Enter Customer Code to Edit");
        String code = scanner.nextLine();
        for (int i = 0; i < list.size(); i++) {
            arr = list.get(i).split(",");
            Customer customer = new Customer(arr[0], arr[1], arr[2], arr[3], arr[4], arr[5], arr[6], arr[6], arr[7]);
            if (customer.getCustomerCode().equals(code)) {
                System.out.println(customer);
                System.out.println();
                System.out.println("Choose Edit");
                System.out.println("1.Edit Name");
                System.out.println("2.Edit Date Of Birth");
                System.out.println("3.Edit Gender");
                System.out.println("4.Edit ID Numbers");
                System.out.println("5.Edit phone numbers");
                System.out.println("6.Edit Email");
                System.out.println("7.Edit Customer class");
                System.out.println("8.Edit address");

                int choose = 0;
                try {
                    choose = Integer.parseInt(scanner.nextLine());
                    if (choose <= 0 || choose > 8) {
                        throw new UserInputException("out of choice " + choose);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }

                switch (choose) {
                    case 1:
                        System.out.println("Edit Name Of Customer");
                        String name = Regex.regexData(scanner.nextLine(), Regex.TYPE_OF_RENT_BY_TIME, "Invalid Input , Please try Again \n ( EXAMPLE : Aaaaa )");
                        customer.setName(name);
                        break;
                    case 2:
                        System.out.println("Edit Date Of Birth");
                        String dayOfBirth = scanner.nextLine();
                        customer.setDateOfBirth(dayOfBirth);
                        break;
                    case 3:
                        System.out.println("Edit Gender");
                        String gender = scanner.nextLine();
                        customer.setGender(gender);
                        break;
                    case 4:
                        System.out.println("Edit ID Numbers");
                        String ID = scanner.nextLine();
                        customer.setIDNumber(ID);
                        break;
                    case 5:
                        System.out.println("Edit phone numbers");
                        String phoneNumber = scanner.nextLine();
                        customer.setPhoneNumber(phoneNumber);
                        break;
                    case 6:
                        System.out.println("Edit Email ");
                        String email = scanner.nextLine();
                        customer.setEmail(email);
                        break;
                    case 7:
                        System.out.println("Edit Customer class");
                        String customerClass = scanner.nextLine();
                        customer.setCustomerClass(customerClass);
                        break;
                    case 8:
                        System.out.println("Edit customer address");
                        String address = scanner.nextLine();
                        customer.setAddress(address);
                        break;
                }

                list.set(i, customer.getInfor());

                System.out.println("Edit Successfully");
                break;
            }
        }
        readAndWriteCSV.writeFileCSV(CSVPath.CUSTOMER, list, false);
    }
}
