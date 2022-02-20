package test.c08.controller;

import test.c08.service.impl.TaiKhoanNganHangImpl;
import test.c08.service.impl.ThemTaiKhoanThanhToanImpl;
import test.c08.service.impl.ThemTaiKhoanTietKiemImpl;

import java.util.Scanner;

public class Controller {
    Scanner scanner = new Scanner(System.in);
    ThemTaiKhoanTietKiemImpl tietKiem = new ThemTaiKhoanTietKiemImpl();
    ThemTaiKhoanThanhToanImpl thanhToan = new ThemTaiKhoanThanhToanImpl();
    TaiKhoanNganHangImpl taiKhoanNganHang = new TaiKhoanNganHangImpl();

    public void displayMainMenu() {
        int chonChucNang = 0;
        do {
            System.out.println();
            System.out.println("CHƯƠNG TRÌNH QUẢN LÝ TÀI KHOẢN NGÂN HÀNG");
            System.out.println("Chọn chức năng theo số ( để tiếp tục: )");
            System.out.println("1. Thêm mới ");
            System.out.println("2. Xóa");
            System.out.println("3. Xem danh sách Tài khoản ngân hàng");
            System.out.println("4. Tìm kiếm");
            System.out.println("5. Thoát");
            System.out.println("");
            try {
                chonChucNang = Integer.parseInt(scanner.nextLine());
            } catch (Exception e) {
                e.printStackTrace();
            }

            switch (chonChucNang) {
                case 1:
                    int chonThem = 0;
                    do {
                        System.out.println("THÊM MỚI");
                        System.out.println("1. Tài khoản thanh toán");
                        System.out.println("2. Tài khoản tiết kiệm");
                        System.out.println("3. Trở về menu");
                        try {
                            chonThem = Integer.parseInt(scanner.nextLine());
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        switch (chonThem) {
                            case 1:
                                System.out.println("Thêm Tài khoản thanh toán");
                                thanhToan.them();
                                break;
                            case 2:
                                System.out.println("Thêm Tài khoản tiết kiệm");
                                tietKiem.them();
                                break;
                            default:
                                System.out.println("lỗi chọn ( 1-3 )");
                                break;
                        }
                    } while (chonThem != 3);
                    break;
                case 2:
                    System.out.println("XÓA");
                    taiKhoanNganHang.xoa();
                    System.out.println();
                    break;
                case 3:
                    System.out.println("XEM DANH SÁCH CÁC TÀI KHOẢN NGÂN HÀNG");
                    taiKhoanNganHang.hienThi();
                    System.out.println();
                    break;
                case 4:

                    System.out.println("TÌM KIẾM");
                    taiKhoanNganHang.timKiem();
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
