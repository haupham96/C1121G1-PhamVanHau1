//package model.service.impl;
//
//import model.model.Student;
//import model.service.IStudentService;
//
//import java.util.Scanner;
//
//public class StudentService implements IStudentService {
//    private static Student[] students = new Student[100];
//
//    static {
//        students[0] = new Student("HaiTT", "Quảng Nam", "01/01/0111", 8, "C1121G1");
//        students[1] = new Student("TrungDP", "Quảng Nam", "01/01/0111", 8, "C1121G1");
//    }
//
//
//    @Override
//    public void findAll() {
//        //Vòng lặp 1: temp = students[0]
//        //Vòng lặp 2: temp = student[1]
//        //... vòng lặp 100: temp = student[99]
//        for (Student temp : students) {
//            if (temp == null) {
//                break;
//            }
//            System.out.println(temp);
//        }
//    }
//
//    @Override
//    public void createStudent() {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Mời bạn nhập tên: ");
//        String name = scanner.nextLine();
//        System.out.print("Mời bạn nhập địa chỉ: ");
//        String address = scanner.nextLine();
//        System.out.print("Mời bạn nhập ngày sinh: ");
//        String dateOfBirth = scanner.nextLine();
//        System.out.print("Mời bạn nhập điểm: ");
//        int point = Integer.parseInt(scanner.nextLine());
//        System.out.print("Mời bạn nhập tên lớp: ");
//        String nameClass = scanner.nextLine();
//        Student student = new Student(name, address, dateOfBirth, point, nameClass);
//        for (int i = 0; i < students.length; i++) {
//            if (students[i] == null) {
//                students[i] = student;
//                System.err.println("Thêm mới thành công");
//                break;
//            }
//        }
//    }
//
//    @Override
//    public void removeStudent() {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Mời bạn nhập tên học sinh cần xóa: ");
//        String name = scanner.nextLine();
//        for (int i = 0; i < students.length; i++) {
//            if(students[i]!=null) {
//                if (students[i].zetName().equals(name)) {
//                    for (int j = i; j < students.length - 1; j++) {
//                        students[j] = students[j + 1];
//                    }
//                    break;
//                }
//            } else {
//                System.out.println("Không tìm thấy học sinh");
//                break;
//            }
//
//        }
//    }
//}
