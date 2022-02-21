package c1121g1_pham_van_hau.controller;

import c1121g1_pham_van_hau.model.BenhAn;
import c1121g1_pham_van_hau.service.impl.BenhAnServiceImpl;
import c1121g1_pham_van_hau.service.impl.ThemBenhAnThuongImpl;
import c1121g1_pham_van_hau.service.impl.ThemBenhAnVipImpl;

import java.util.Scanner;

public class Control {
    Scanner scanner = new Scanner(System.in);
    ThemBenhAnThuongImpl themBenhAnThuong = new ThemBenhAnThuongImpl();
    ThemBenhAnVipImpl themBenhAnVip = new ThemBenhAnVipImpl();
    BenhAnServiceImpl benhAnService = new BenhAnServiceImpl();

    public void displayMainMenu() {
        int chonChucNang = 0;
        do {
            System.out.println();
            System.out.println("CHƯƠNG TRÌNH QUẢN LÝ BỆNH ÁN");
            System.out.println("Chọn chức năng theo số ( để tiếp tục: )");
            System.out.println("1. Thêm mới ");
            System.out.println("2. Xóa");
            System.out.println("3. Xem danh sách ");
            System.out.println("4. Thoát");
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
                        System.out.println("1. Bệnh án thường");
                        System.out.println("2. Bệnh án Vip");
                        System.out.println("3. Trở về menu");
                        try {
                            chonThem = Integer.parseInt(scanner.nextLine());
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        switch (chonThem) {
                            case 1:
                                System.out.println("Thêm Bệnh án thường");
                                themBenhAnThuong.them();
                                break;
                            case 2:
                                System.out.println("Thêm Bệnh án Vip");
                                themBenhAnVip.them();
                                break;
                            case 3:
                                break;
                            default:
                                System.out.println("lỗi chọn ( 1-3 )");
                                break;
                        }
                    } while (chonThem != 3);
                    break;
                case 2:
                    System.out.println("XÓA");
                    benhAnService.xoa();
                    System.out.println();
                    break;
                case 3:
                    System.out.println("XEM DANH SÁCH BỆNH ÁN");
                    benhAnService.hienThi();
                    System.out.println();
                    break;
                case 4:
                    System.err.println("THOÁT");
                    System.exit(0);
                    break;
                default:
                    System.out.println("lựa chọn không hợp lệ ( 1- 5 )");
            }
        } while (true);

    }
}
