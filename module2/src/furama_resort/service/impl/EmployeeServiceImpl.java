package furama_resort.service.impl;

import furama_resort.model.Employee;
import furama_resort.service.EmployeeService;
import furama_resort.util.exception.user_input_exception.UserInputException;
import furama_resort.util.read_and_write_csv.CSVPath;
import furama_resort.util.read_and_write_csv.ReadAndWriteCSV;
import furama_resort.util.regex.Regex;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeServiceImpl implements EmployeeService {
    ReadAndWriteCSV readAndWriteCSVFurama = new ReadAndWriteCSV();
    Scanner scanner = new Scanner(System.in);
    static List<Employee> employeeList = new ArrayList<>();

    @Override
    public void add() {

        System.out.println("Input Name Of Employee");
        String name = scanner.nextLine();

        System.out.println("Input Date Of Birth");
        String dayOfBirth = Regex.regexAge(scanner.nextLine(),Regex.DATE);

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


        do {
            try {
                System.out.println("Input employee Salary");
                int salary = Integer.parseInt(scanner.nextLine());
                Employee employee = new Employee(name, dayOfBirth, gender, ID, phoneNumber, email, employeeCode, academicLevel, position, salary);
                employeeList.add(employee);
                System.out.println("Successfully Adding new employee ");
                break;
            } catch (Exception e) {
                UserInputException userInputException = new UserInputException("invalid input");
                userInputException.printStackTrace();
            }

        } while (true);

        List<String> list = readAndWriteCSVFurama.changeToStringList(employeeList);
        readAndWriteCSVFurama.writeFileCSV(CSVPath.EMPLOYEE, list,true);
    }

    @Override
    public void display() {
        List<String> list = readAndWriteCSVFurama.readFileCSV(CSVPath.EMPLOYEE);
        String[] array;
        String string;

        for (int i = 0; i < list.size(); i++) {
            array = list.get(i).split(",");
            Employee employee = new Employee(array[0], array[1], array[2], array[3], array[4], array[5], array[6], array[7], array[8], Integer.parseInt(array[9]));
            System.out.println(employee);
        }
    }

    @Override
    public void edit() throws UserInputException {
        List<String> list = readAndWriteCSVFurama.readFileCSV(CSVPath.EMPLOYEE);

        String[] array;
        EmployeeServiceImpl employeeService = new EmployeeServiceImpl();
        employeeService.display();
        System.out.println();

        System.out.println("Enter employee Code to Edit");
        String code = scanner.nextLine();
        for (int i = 0; i < list.size(); i++) {

            array = list.get(i).split(",");
            Employee employee = new Employee(array[0], array[1], array[2], array[3], array[4], array[5], array[6], array[7], array[8], Integer.parseInt(array[9]));

            if (employee.getEmployeeCode().equals(code)) {
                System.out.println(employee);
                System.out.println();
                System.out.println("Choose Edit");
                System.out.println("1.Edit Name Of Employee");
                System.out.println("2.Edit Date Of Birth");
                System.out.println("3.Edit Gender");
                System.out.println("4.Edit ID Numbers");
                System.out.println("5.Edit phone numbers");
                System.out.println("6.Edit Email");
                System.out.println("7.Edit Academic Level");
                System.out.println("8.Edit employee position");
                System.out.println("9.Edit employee Salary");

                int choose=0;
                try {
                    choose = Integer.parseInt(scanner.nextLine());
                    if(choose<=0 || choose >9){
                        throw new UserInputException("out of choice "+choose);
                    }
                } catch (Exception e) {
                    UserInputException u = new UserInputException("invalid choose");
                    u.printStackTrace();
                }

                switch (choose) {
                    case 1:
                        System.out.println("Edit Name Of Employee");
                        String name = scanner.nextLine();
                        employee.setName(name);
                        break;
                    case 2:
                        System.out.println("Edit Date Of Birth");
                        String dayOfBirth = scanner.nextLine();
                        employee.setDateOfBirth(dayOfBirth);
                        break;
                    case 3:
                        System.out.println("Edit Gender");
                        String gender = scanner.nextLine();
                        employee.setGender(gender);
                        break;
                    case 4:
                        System.out.println("Edit ID Numbers");
                        String ID = scanner.nextLine();
                        employee.setIDNumber(ID);
                        break;
                    case 5:
                        System.out.println("Edit phone numbers");
                        String phoneNumber = scanner.nextLine();
                        employee.setPhoneNumber(phoneNumber);
                        break;
                    case 6:
                        System.out.println("Edit Email ");
                        String email = scanner.nextLine();
                        employee.setEmail(email);
                        break;
                    case 7:
                        System.out.println("Input Academic Level");
                        String academicLevel = scanner.nextLine();
                        employee.setAcademicLevel(academicLevel);
                        break;
                    case 8:
                        System.out.println("Input employee position");
                        String position = scanner.nextLine();
                        employee.setPosition(position);
                        break;
                    case 9:
                        do {
                            try {
                                System.out.println("Input employee Salary");
                                int salary = Integer.parseInt(scanner.nextLine());
                                employee.setSalary(salary);
                                break;
                            } catch (Exception e) {
                                UserInputException userInputException = new UserInputException("invalid input");
                                userInputException.printStackTrace();
                            }
                        } while (true);
                        break;
                }

                list.set(i, employee.getInfor());
                System.out.println("Edit Successfully");
                break;
            }
        }
        readAndWriteCSVFurama.writeFileCSV(CSVPath.EMPLOYEE, list,false);
    }
}
