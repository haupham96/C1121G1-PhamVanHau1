package ss12_java_collection_framework.exercise.vehicles_control_mvc.service.impl;

import ss12_java_collection_framework.exercise.vehicles_control_mvc.control.DataHangSanXuat;
import ss12_java_collection_framework.exercise.vehicles_control_mvc.model.OTo;
import ss12_java_collection_framework.exercise.vehicles_control_mvc.model.PhuongTien;
import ss12_java_collection_framework.exercise.vehicles_control_mvc.service.IChucNang;

import java.util.ArrayList;
import java.util.Scanner;

public class ChucNangXeOTo implements IChucNang {
    Scanner scanner=new Scanner(System.in);
    static ArrayList<PhuongTien> xeOTo = new ArrayList<>();
    @Override
    public void them() {
        System.out.println("Mời nhập biển kiểm soát");
        String bienKiemSoat = scanner.nextLine();
        System.out.println("Mời chọn hãng sản xuất theo Mã ");
        DataHangSanXuat.hienThiHangSanXuat();
        String maHangSanXuat = scanner.nextLine();
        String hangSanXuat = DataHangSanXuat.chonHangSanXuat(maHangSanXuat);
        System.out.println("nhập năm sản xuất");
        int namSanXuat = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập tên người sở hữu");
        String chuSoHuu = scanner.nextLine();
        System.out.println("Nhập số chỗ ngồi");
        int soCho = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập kiểu xe");
        String kieuXe = scanner.nextLine();

        PhuongTien phuongTien = new OTo(bienKiemSoat, hangSanXuat, namSanXuat, chuSoHuu,soCho,kieuXe);
        xeOTo.add(phuongTien);
    }

    @Override
    public void hienThi() {
        boolean check = false;
        for (int i = 0; i < xeOTo.size(); i++) {
            System.out.println(xeOTo.get(i).toString());
            check=true;
        }
        if(!check){
            System.out.println("Danh sách hiện đang trống");
        }
    }

    @Override
    public void xoa() {
        this.hienThi();
        boolean check = false;
        System.out.println("Nhập biển số xe cần xóa");
        String bienSo = scanner.nextLine();
        for (int i = 0; i < xeOTo.size(); i++) {
            if (bienSo.equals(xeOTo.get(i).getBienKiemSoat())) {
                System.out.println(" Đã xóa thành công " + xeOTo.get(i).getBienKiemSoat());
                xeOTo.remove(i);
                check = true;
            }
        }
        if (!check) {
            System.out.println(" Không tìm thấy biển kiểm soát tương ứng ");
        }
    }

}
