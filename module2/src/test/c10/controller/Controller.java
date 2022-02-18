package test.c10.controller;

import code_for_fun.mvc_csv_vehicles_control.service.impl.XoaPhuongTien;
import test.c10.model.ImportProduct;
import test.c10.service.impl.ExportProductImpl;
import test.c10.service.impl.ImportProductImpl;

import java.util.Scanner;

public class Controller {
    Scanner scanner = new Scanner(System.in);
    ExportProductImpl exProductImpl = new ExportProductImpl();
    ImportProductImpl imProductImpl = new ImportProductImpl();

    public void displayMainMenu() {
        int chonChucNang;
        do {
            System.out.println();
            System.out.println("CHƯƠNG TRÌNH QUẢN LÝ PHƯƠNG SẢN PHẨM");
            System.out.println("Chọn chức năng theo số ( để tiếp tục: )");
            System.out.println("1. Thêm mới ");
            System.out.println("2. Xóa");
            System.out.println("3. Xem danh sách các sản phẩm");
            System.out.println("4. Tìm kiếm");
            System.out.println("5. Thoát");
            System.out.println("");
            chonChucNang = Integer.parseInt(scanner.nextLine());
            switch (chonChucNang) {
                case 1:

                    int chonThem;
                    do {
                        System.out.println("THÊM MỚI SẢN PHẨM");
                        System.out.println("1. Thêm sản phẩm xuất khẩu");
                        System.out.println("2. Thêm sản phẩm nhập khẩu");
                        System.out.println("3. Trở về menu");
                        chonThem = Integer.parseInt(scanner.nextLine());
                        switch (chonThem) {
                            case 1:
                                System.out.println("Thêm sản phẩm xuất khẩu");
                                exProductImpl.them();
                                break;
                            case 2:
                                System.out.println("Thêm sản phẩm nhập khẩu");
                                imProductImpl.them();
                                break;
                        }
                    } while (chonThem != 3);

                    break;
                case 2:

                    int chonXoa;
                    do {
                        System.out.println("XÓA");
                        System.out.println("1. Xóa sản phẩm xuất khẩu");
                        System.out.println("2. Xóa sản phẩm nhập khẩu");
                        System.out.println("3. Thoát");
                        System.out.println();
                        chonXoa = Integer.parseInt(scanner.nextLine());
                        switch (chonXoa) {
                            case 1:
                                System.out.println("Xóa sản phẩm xuất khẩu");
                                exProductImpl.xoa();
                                break;
                            case 2:
                                System.out.println("Xóa sản phẩm nhập khẩu");
                                imProductImpl.xoa();
                                break;
                        }
                    } while (chonXoa != 3);

                    break;
                case 3:

                    int chonHienThi;
                    do {
                        System.out.println("XEM DANH SÁCH CÁC SẢN PHẨM");
                        System.out.println("1. Xem sản phẩm xuất khẩu");
                        System.out.println("2. Xem sản phẩm nhập khẩu");
                        System.out.println("3. Trở về menu");
                        System.out.println();
                        chonHienThi = Integer.parseInt(scanner.nextLine());
                        switch (chonHienThi) {
                            case 1:
                                System.out.println("Xem sản phẩm xuất khẩu");
                                exProductImpl.hienThi();
                                break;
                            case 2:
                                System.out.println("Xem sản phẩm nhập khẩu");
                                imProductImpl.hienThi();
                                break;
                        }
                    } while (chonHienThi != 3);
                    break;
                case 4:
                    int chonTimKiem;
                    do {
                        System.out.println("TÌM KIẾM");
                        System.out.println("1. Tìm sản phẩm xuất khẩu");
                        System.out.println("2. Tìm sản phẩm nhập khẩu");
                        System.out.println("3. Trở về menu");
                        System.out.println();
                        chonTimKiem = Integer.parseInt(scanner.nextLine());
                        switch (chonTimKiem) {
                            case 1:
                                System.out.println("Tìm sản phẩm xuất khẩu");
                                exProductImpl.timKiem();
                                break;
                            case 2:
                                System.out.println("Tìm sản phẩm nhập khẩu");
                                imProductImpl.timKiem();
                                break;
                        }
                    } while (chonTimKiem != 3);
                    break;
                case 5:
                    System.err.println("THOÁT");
                    System.exit(0);
                    break;
            }
        } while (true);

    }
}
