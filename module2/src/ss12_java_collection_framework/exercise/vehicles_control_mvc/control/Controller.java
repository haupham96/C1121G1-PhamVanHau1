package ss12_java_collection_framework.exercise.vehicles_control_mvc.control;


import java.util.Scanner;

public class Controller {
    public static void main(String[] args) {

        int chon;
        do {
            System.out.println();
            System.out.println("CHƯƠNG TRÌNH QUẢN LÝ PHƯƠNG TIỆN GIAO THÔG");
            System.out.println("Chọn chức năng ");
            System.out.println("1. Thêm mới phương tiện ");
            System.out.println("2. Hiển thị phương tiện ");
            System.out.println("3. Xóa phương tiện ");
            System.out.println("4. Thoát ");
            Scanner scanner = new Scanner(System.in);

            chon = Integer.parseInt(scanner.nextLine());
            switch (chon) {
                case 1:
                    System.out.println();
                    System.out.println("Thêm mới phương tiện");
                    System.out.println();
                    System.out.println("1. Thêm xe tải");
                    System.out.println("2. Thêm xe ô tô");
                    System.out.println("3. Thêm xe máy");
                    int chonThem = Integer.parseInt(scanner.nextLine());

                    if (chonThem == 1) {
                        System.out.println("xe tải");
                    } else if (chonThem == 2) {
                        System.out.println("ô tô");
                    } else if (chonThem == 3) {
                        System.out.println("xe máy");
                    } else {
                        System.out.println("CHỈ CHỌN TỪ 1 ĐẾN 3");
                    }
                    break;
                case 2:
                    System.out.println();
                    System.out.println("Hiển thị phương tiện");
                    break;
                case 3:
                    System.out.println();
                    System.out.println("Xóa phương tiện");
                    break;
                case 4:
                    System.err.println(" GOODBYE ! ");
                    System.exit(0);
                default:
                    System.err.println("Mời chọn từ 1 đến 4 ");
                    break;
            }
        } while (chon != 4);
    }
}
