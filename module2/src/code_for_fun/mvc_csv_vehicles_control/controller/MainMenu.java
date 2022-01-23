package code_for_fun.mvc_csv_vehicles_control.controller;

import code_for_fun.mvc_csv_vehicles_control.service.impl.ChucNangXeMay;
import code_for_fun.mvc_csv_vehicles_control.service.impl.ChucNangXeOTo;
import code_for_fun.mvc_csv_vehicles_control.service.impl.ChucNangXeTai;
import code_for_fun.mvc_csv_vehicles_control.service.impl.XoaPhuongTien;

import java.util.Scanner;

public class MainMenu {
    Scanner scanner = new Scanner(System.in);

    public void showMenu() {
        ChucNangXeTai chucNangXeTai = new ChucNangXeTai();
        ChucNangXeOTo chucNangXeOTo = new ChucNangXeOTo();
        ChucNangXeMay chucNangXeMay = new ChucNangXeMay();
        int chonChucNang;
        do {
            System.out.println();
            System.out.println("CHƯƠNG TRÌNH QUẢN LÝ PHƯƠNG TIỆN GIAO THÔNG");
            System.out.println("Chọn chức năng :");
            System.out.println("1. Thêm mới phương tiện");
            System.out.println("2. Hiển thị phương tiện");
            System.out.println("3. Xóa phương tiện");
            System.out.println("4. Thoát");
            System.out.println("");
            chonChucNang = Integer.parseInt(scanner.nextLine());
            switch (chonChucNang) {
                case 1:
                    System.out.println("THÊM MỚI PHƯƠNG TIỆN");
                    System.out.println("1. Thêm Xe Tải");
                    System.out.println("2. Thêm Xe Ô Tô");
                    System.out.println("3. Thêm Xe Máy");
                    int chonThem = Integer.parseInt(scanner.nextLine());
                    switch (chonThem){
                        case 1:
                            System.out.println("THÊM XE TẢI");
                            chucNangXeTai.them();
                            break;
                        case 2:
                            System.out.println("THÊM XE Ô TÔ");
                            chucNangXeOTo.them();
                            break;
                        case 3:
                            System.out.println("THÊM XE MÁY");
                            chucNangXeMay.them();
                            break;
                        default:
                            System.out.println("LỖI CHỌN");
                            break;
                    }
                    break;
                case 2:
                    System.out.println("HIỂN THỊ PHƯƠNG TIỆN");
                    System.out.println("1. Hiển thị Xe Tải");
                    System.out.println("2. Hiển thị Xe Ô Tô");
                    System.out.println("3. Hiển thị Xe Máy");
                    int chonHienThi = Integer.parseInt(scanner.nextLine());
                    switch (chonHienThi){
                        case 1:
                            System.out.println("XE TẢI");
                            chucNangXeTai.hienThi();
                            break;
                        case 2:
                            System.out.println("XE Ô TÔ");
                            chucNangXeOTo.hienThi();
                            break;
                        case 3:
                            System.out.println("XE MÁY");
                            chucNangXeMay.hienThi();
                            break;
                        default:
                            System.out.println("LỖI CHỌN");
                            break;
                    }
                    break;
                case 3:
                    System.out.println("XÓA PHƯƠNG TIỆN");
                    XoaPhuongTien xoaPhuongTien = new XoaPhuongTien();
                    xoaPhuongTien.xoa();
                    break;
                case 4:
                    System.err.println("GOODBYE !");
                    System.exit(0);
                default:
                    System.out.println("Lỗi chọn !");
            }
        } while (true);

    }
}
