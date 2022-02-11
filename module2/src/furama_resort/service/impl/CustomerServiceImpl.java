package furama_resort.service.impl;

import furama_resort.model.Customer;
import furama_resort.model.Employee;
import furama_resort.service.CustomerService;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CustomerServiceImpl implements CustomerService {
    Scanner scanner = new Scanner(System.in);
    static List<Customer> customerList = new LinkedList<>();

    static {
        Customer customer1 = new Customer("John", "05/06/1991", "Male", "121212121", "0812345678", "john@gmail.com", "C001", "Member", "120 Ly Thai Tong");
        Customer customer2 = new Customer("Mary", "05/02/1991", "Female", "26262626261", "082889752", "mary@gmail.com", "C002", "Platinum", "120 Ngo Quyen");
        customerList.add(customer1);
        customerList.add(customer2);
    }

    @Override
    public void add() {
        System.out.println("Input Name Of Customer");
        String name = scanner.nextLine();

        System.out.println("Input Customer Date Of Birth");
        String dayOfBirth = scanner.nextLine();

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

        System.out.println("Successfully Adding new Customer ");

    }

    @Override
    public void display() {
        for (Customer customer : customerList) {
            System.out.println(customer);
        }
    }

    @Override
    public void edit() {
        System.out.println("Enter Customer Code to Edit");
        String code = scanner.nextLine();
        for (int i = 0; i < customerList.size(); i++) {
            if (customerList.get(i).getCustomerCode().equals(code)) {
                System.out.println("Input Name Of Customer");
                String name = scanner.nextLine();
                customerList.get(i).setName(name);

                System.out.println("Input Customer Date Of Birth");
                String dayOfBirth = scanner.nextLine();
                customerList.get(i).setDateOfBirth(dayOfBirth);

                System.out.println("Input Customer Gender");
                String gender = scanner.nextLine();
                customerList.get(i).setGender(gender);

                System.out.println("Input Customer ID Numbers");
                String ID = scanner.nextLine();
                customerList.get(i).setIDNumber(ID);

                System.out.println("Input Customer phone numbers");
                String phoneNumber = scanner.nextLine();
                customerList.get(i).setPhoneNumber(phoneNumber);

                System.out.println("Input Customer Email ");
                String email = scanner.nextLine();
                customerList.get(i).setEmail(email);

                System.out.println("Input Customer class");
                String customerClass = scanner.nextLine();
                customerList.get(i).setCustomerClass(customerClass);

                System.out.println("Input Customer address");
                String address = scanner.nextLine();
                customerList.get(i).setAddress(address);

                System.out.println("Edit Successfully");
                break;
            }
        }
    }
}
