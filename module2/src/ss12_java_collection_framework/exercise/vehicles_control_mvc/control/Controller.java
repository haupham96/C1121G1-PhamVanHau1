package ss12_java_collection_framework.exercise.vehicles_control_mvc.control;


import ss12_java_collection_framework.exercise.vehicles_control_mvc.service.impl.ChucNangXeMay;
import ss12_java_collection_framework.exercise.vehicles_control_mvc.service.impl.ChucNangXeOTo;
import ss12_java_collection_framework.exercise.vehicles_control_mvc.service.impl.ChucNangXeTai;

import java.util.Scanner;

public class Controller {

    public static void main(String[] args) {
        ChucNangXeTai chucNangXeTai = new ChucNangXeTai();
        ChucNangXeOTo chucNangXeOTo = new ChucNangXeOTo();
        ChucNangXeMay chucNangXeMay = new ChucNangXeMay();
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
                    System.out.println("Chọn loại phương tiện cần thêm ");
                    System.out.println("1. Thêm xe tải");
                    System.out.println("2. Thêm xe ô tô");
                    System.out.println("3. Thêm xe máy");

                    int chonThem = Integer.parseInt(scanner.nextLine());
                    if (chonThem == 1) {
                        chucNangXeTai.them();
                    } else if (chonThem == 2) {
                        chucNangXeOTo.them();
                    } else if (chonThem == 3) {
                        chucNangXeMay.them();
                    } else {
                        System.out.println("CHỈ CHỌN TỪ 1 ĐẾN 3");
                    }
                    break;
                case 2:
                    System.out.println();
                    System.out.println("Chọn loại phương tiện");
                    System.out.println("1. Hiển thị xe tải");
                    System.out.println("2. Hiển thị xe ô tô");
                    System.out.println("3. Hiển thị xe máy");
                    int chonHienThi = Integer.parseInt(scanner.nextLine());
                    if (chonHienThi == 1) {
                        chucNangXeTai.hienThi();
                    } else if (chonHienThi == 2) {
                        chucNangXeOTo.hienThi();
                    } else if (chonHienThi == 3) {
                        chucNangXeMay.hienThi();
                    } else {
                        System.out.println("CHỈ CHỌN TỪ 1 ĐẾN 3");
                    }
                    break;
                case 3:
                    System.out.println();
                    System.out.println("Mời chọn loại xe cần xóa ");
                    System.out.println("1. Xóa xe tải");
                    System.out.println("2. Xóa xe ô tô");
                    System.out.println("3. Xóa xe máy");
                    int chonXoa = Integer.parseInt(scanner.nextLine());
                    if (chonXoa == 1) {
                        chucNangXeTai.xoa();
                    } else if (chonXoa == 2) {
                        chucNangXeOTo.xoa();
                    } else if (chonXoa == 3) {
                        chucNangXeMay.xoa();
                    } else {
                        System.out.println("CHỈ CHỌN TỪ 1 ĐẾN 3");
                    }
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
