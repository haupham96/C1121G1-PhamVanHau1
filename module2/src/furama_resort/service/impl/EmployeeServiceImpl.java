package furama_resort.service.impl;

import furama_resort.model.Employee;
import furama_resort.service.EmployeeService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeServiceImpl implements EmployeeService {
    Scanner scanner = new Scanner(System.in);
    static List<Employee> employeeList = new ArrayList<>();

    static {
        Employee employee1 = new Employee("Andy", "12/12/1994", "Male", "111111111", "090111111111", "andy@gmail.com", "E001", "Graduated", "Receptionist", 9000000);
        Employee employee2 = new Employee("Lisa", "11/01/1994", "Female", "222222222", "0902222222", "Lisa@gmail.com", "E002", "University", "Waitress", 4000000);
        employeeList.add(employee1);
        employeeList.add(employee2);
    }

    @Override
    public void add() {
        System.out.println("Input Name Of Employee");
        String name = scanner.nextLine();

        System.out.println("Input Date Of Birth");
        String dayOfBirth = scanner.nextLine();

        System.out.println("Input Gender");
        String gender = scanner.nextLine();

        System.out.println("Input ID Numbers");
        String ID = scanner.nextLine();

        System.out.println("Input phone numbers");
        String phoneNumber = scanner.nextLine();

        System.out.println("Input Email ");
        String email = scanner.nextLine();

        System.out.println("Input employee Code");
        String employeeCode = scanner.nextLine();

        System.out.println("Input Academic Level");
        String academicLevel = scanner.nextLine();

        System.out.println("Input employee position");
        String position = scanner.nextLine();

        System.out.println("Input employee Salary");
        int salary = Integer.parseInt(scanner.nextLine());

        Employee employee = new Employee(name, dayOfBirth, gender, ID, phoneNumber, email, employeeCode, academicLevel, position, salary);
        employeeList.add(employee);
        System.out.println("Successfully Adding new employee ");
    }

    @Override
    public void display() {
        for(Employee employee:employeeList){
            System.out.println(employee);
        }
    }

    @Override
    public void edit() {
        System.out.println("Enter employee Code to Edit");
        String code = scanner.nextLine();
        for(int i=0;i< employeeList.size();i++){
            if(employeeList.get(i).getEmployeeCode().equals(code)){
                System.out.println(employeeList.get(i).toString());
                System.out.println("Edit Name Of Employee");
                String name = scanner.nextLine();
                employeeList.get(i).setName(name);

                System.out.println("Edit Date Of Birth");
                String dayOfBirth = scanner.nextLine();
                employeeList.get(i).setDateOfBirth(dayOfBirth);

                System.out.println("Edit Gender");
                String gender = scanner.nextLine();
                employeeList.get(i).setGender(gender);

                System.out.println("Edit ID Numbers");
                String ID = scanner.nextLine();
                employeeList.get(i).setIDNumber(ID);

                System.out.println("Edit phone numbers");
                String phoneNumber = scanner.nextLine();
                employeeList.get(i).setPhoneNumber(phoneNumber);

                System.out.println("Edit Email ");
                String email = scanner.nextLine();
                employeeList.get(i).setEmail(email);

                System.out.println("Input Academic Level");
                String academicLevel = scanner.nextLine();
                employeeList.get(i).setAcademicLevel(academicLevel);

                System.out.println("Input employee position");
                String position = scanner.nextLine();
                employeeList.get(i).setPosition(position);

                System.out.println("Input employee Salary");
                int salary = Integer.parseInt(scanner.nextLine());
                employeeList.get(i).setSalary(salary);

                System.out.println("Edit Successfully");

                break;
            }
        }
    }
}
