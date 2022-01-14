//package controller;
//
//import model.service.IStudentService;
//
//
//import java.util.Scanner;
//
//public class StudentController {
//    public static void main(String[] args) {
//        IStudentService iStudentService = new StudentService();
//        Scanner scanner = new Scanner(System.in);
//        while (true) {
//            System.out.println("Menu ứng dụng quản lý học sinh.");
//            System.out.println("1. Hiển thị danh sách\n" +
//                    "2. Thêm mới học sinh\n" +
//                    "3. Chỉnh sửa học sinh\n" +
//                    "4. Xóa học sinh");
//            int choose = Integer.parseInt(scanner.nextLine());
//            switch (choose) {
//                case 1:
//                    iStudentService.findAll();
//                    break;
//                case 2:
//                    iStudentService.createStudent();
//                    break;
//                case 4:
//                    iStudentService.removeStudent();
//                    break;
//            }
//        }
//
//    }
//}
