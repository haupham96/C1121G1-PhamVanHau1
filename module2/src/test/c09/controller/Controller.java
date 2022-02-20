package test.c09.controller;

import test.c09.model.DienThoai;
import test.c09.service.impl.DienThoaiChinhHangThemImpl;
import test.c09.service.impl.DienThoaiServiceImpl;
import test.c09.service.impl.DienThoaiXachTayThemImpl;

import java.util.Scanner;

public class Controller {
    Scanner scanner = new Scanner(System.in);
    DienThoaiServiceImpl dienThoaiService = new DienThoaiServiceImpl();
    DienThoaiChinhHangThemImpl dienThoaiChinhHangThem = new DienThoaiChinhHangThemImpl();
    DienThoaiXachTayThemImpl dienThoaiXachTayThem = new DienThoaiXachTayThemImpl();

    public void displayMainMenu() {
        int chonChucNang;
        do {
            System.out.println();
            System.out.println("CHƯƠNG TRÌNH QUẢN LÝ ĐIỆN THOẠI");
            System.out.println("Chọn chức năng theo số ( để tiếp tục: )");
            System.out.println("1. Thêm mới ");
            System.out.println("2. Xóa");
            System.out.println("3. Xem danh sách điện thoại");
            System.out.println("4. Tìm kiếm");
            System.out.println("5. Thoát");
            System.out.println("");
            chonChucNang = Integer.parseInt(scanner.nextLine());
            switch (chonChucNang) {
                case 1:
                    int chonThem;
                    do {
                        System.out.println("THÊM MỚI ĐIỆN THOẠI");
                        System.out.println("1. Điện thoại chính hãng");
                        System.out.println("2. Điện thoại xách tay");
                        System.out.println("3. Trở về menu");
                        chonThem = Integer.parseInt(scanner.nextLine());
                        switch (chonThem) {
                            case 1:
                                System.out.println("Thêm Điện thoại chính hãng");
                                dienThoaiChinhHangThem.them();
                                break;
                            case 2:
                                System.out.println("Điện thoại xách tay");
                                dienThoaiXachTayThem.them();
                                break;
                            default:
                                System.out.println("lỗi chọn ( 1-3 )");
                                break;
                        }
                    } while (chonThem != 3);
                    break;
                case 2:
                    System.out.println("XÓA");
                    dienThoaiService.xoa();
                    System.out.println();
                    break;
                case 3:
                    System.out.println("XEM DANH SÁCH CÁC SẢN PHẨM");
                    dienThoaiService.hienThi();
                    System.out.println();
                    break;
                case 4:

                    System.out.println("TÌM KIẾM");
                    dienThoaiService.timKiem();
                    System.out.println();
                    break;
                case 5:
                    System.err.println("THOÁT");
                    System.exit(0);
                    break;
                default:
                    System.out.println("lựa chọn không hợp lệ ( 1- 5 )");
            }
        } while (true);

    }
}

