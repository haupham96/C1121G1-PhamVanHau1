package ss6_inheritance.codegym_managerment.service.impl;

import ss6_inheritance.codegym_managerment.model.Person;
import ss6_inheritance.codegym_managerment.model.Student;
import ss6_inheritance.codegym_managerment.service.IStudentService;
import ss6_inheritance.codegym_managerment.util.ReadAndWriteCSVFile;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentServiceImpl implements IStudentService {
    private static final String STUDENT_PATH_FILE = "src\\ss6_inheritance\\codegym_managerment\\data\\Student.csv";
    static Student[] studentList = new Student[100];
    static ArrayList<Student> studentArrayList = new ArrayList<>();
    ReadAndWriteCSVFile readAndWriteCSVFile = new ReadAndWriteCSVFile();

    static {
        System.out.println("Đây là khối static");
        // dùng đẻ khỏi tạo giá trị cho biến static.
        studentList[0] = new Student();
        studentList[1] = new Student();
        studentList[2] = new Student();
        studentList[3] = new Student();
    }

    @Override
    public void add() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập id");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("nhập tên");
        String name = scanner.nextLine();
        System.out.println("nhập địa chỉ");
        String address = scanner.nextLine();
        System.out.println("nhập ngày sinh");
        String birthday = scanner.nextLine();
        System.out.println("nhập tên lớp");
        String classStudent = scanner.nextLine();
        System.out.println("nhập điểm");
        int point = Integer.parseInt(scanner.nextLine());
        Student student = new Student(id, name, address, birthday, classStudent, point);
        List<Student> studentList = new ArrayList<>();
        studentList.add(student);
        // ghi thông tin vào file CSV
        ReadAndWriteCSVFile.writeStudentToCSV1(studentList, STUDENT_PATH_FILE, true);

    }

    // hiện thị
    public static void method1() {

    }

    @Override
    public void display() {
        List<Student> studentList = ReadAndWriteCSVFile.readStudentFromCSVFile(STUDENT_PATH_FILE);
        for (Student s : studentList) {
            System.out.println(s.toString());
        }
    }

    // xóa
    @Override
    public void delete() {
        List<Student> studentList = ReadAndWriteCSVFile.readStudentFromCSVFile(STUDENT_PATH_FILE);
        for (int i = 0; i < studentList.size(); i++) {
            System.out.println((1 + i) + "." + studentList.get(i));
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Chọn student  cần xóa");
        int index = Integer.parseInt(scanner.nextLine());
        studentList.remove(index - 1);
        ReadAndWriteCSVFile.writeStudentToCSV1(studentList, STUDENT_PATH_FILE, false);
    }

    @Override
    public void edit() {
        List<Student> studentList = ReadAndWriteCSVFile.readStudentFromCSVFile(STUDENT_PATH_FILE);
        for (int i = 0; i < studentList.size(); i++) {
            System.out.println((1 + i) + "." + studentList.get(i));
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Chọn student  cần sửa");
        int indexStudent = Integer.parseInt(scanner.nextLine())-1;
        boolean flag = true;
        do {
            System.out.println("Chọn thông tin cần sửa");
            System.out.println("1.Name");
            System.out.println("2.Address");
            System.out.println("3.Ngày sinh");
            System.out.println("4.OK");
            int editIndex = Integer.parseInt(scanner.nextLine());
            switch (editIndex) {
                case 1:
                    System.out.println("Nhập tên sinh viên cần sửa");
                    String newName = scanner.nextLine();
                    studentList.get(indexStudent).setName(newName);
                    break;
                case 2:
                    System.out.println("Nhập dịa chỉ sinh viên cần sửa");
                    String address = scanner.nextLine();
                    studentList.get(indexStudent).setAddress(address);
                    break;
                case 3:
                    System.out.println("Nhập ngày sinh sinh viên cần sửa");
                    String birthday = scanner.nextLine();
                    studentList.get(indexStudent).setBirthday(birthday);
                    break;
                default:
                    flag= false;

            }

        } while (flag);
        ReadAndWriteCSVFile.writeStudentToCSV1(studentList, STUDENT_PATH_FILE, false);
    }

    @Override
    public void seachByName() {
        Scanner scanner = new Scanner(System.in);
        List<Student> studentList = ReadAndWriteCSVFile.readStudentFromCSVFile(STUDENT_PATH_FILE);
        System.out.println("Chọn tên cần tìm kiếm");
        String searchName = scanner.nextLine();
        for (Student student : studentList) {
            if (student.getName().contains(searchName)) {
                System.out.println(student);
            }
        }
    }
}
