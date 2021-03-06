package ss12_java_collection_framework.exercise.vehicles_control_mvc.service.impl;

import ss12_java_collection_framework.exercise.vehicles_control_mvc.control.DataHangSanXuat;
import ss12_java_collection_framework.exercise.vehicles_control_mvc.model.PhuongTien;
import ss12_java_collection_framework.exercise.vehicles_control_mvc.model.XeTai;
import ss12_java_collection_framework.exercise.vehicles_control_mvc.service.IChucNang;

import java.util.ArrayList;
import java.util.Scanner;

public class ChucNangXeTai implements IChucNang {
    Scanner scanner = new Scanner(System.in);
    static ArrayList<PhuongTien> xeTai = new ArrayList<>();

    public static void main(String[] args) {

        DataHangSanXuat.hienThiHangSanXuat();
    }

    @Override
    public void them() {

        System.out.println("Mời nhập biển kiểm soát");
        String bienKiemSoat = scanner.nextLine();
        DataHangSanXuat.hienThiHangSanXuat();
        System.out.println("MỜI NHẬP MÃ HÃNG SẢN XUẤT  ");
        String maHangSanXuat = scanner.nextLine();
        String hangSanXuat = DataHangSanXuat.chonHangSanXuat(maHangSanXuat);
        System.out.println("nhập năm sản xuất");
        int namSanXuat = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập tên người sở hữu");
        String chuSoHuu = scanner.nextLine();
        System.out.println("Nhập tải trọng");
        int taiTrong = Integer.parseInt(scanner.nextLine());

        PhuongTien phuongTien = new XeTai(bienKiemSoat, hangSanXuat, namSanXuat, chuSoHuu, taiTrong);
        xeTai.add(phuongTien);
    }

    @Override
    public void hienThi() {
        boolean check = false;
            for (int i = 0; i < xeTai.size(); i++) {
                System.out.println(xeTai.get(i).toString());
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
        for (int i = 0; i < xeTai.size(); i++) {
            if (bienSo.equals(xeTai.get(i).getBienKiemSoat())) {
                check = true;
                System.out.println("Bạn chắc chắn muốn xóa "+xeTai.get(i).getBienKiemSoat()+" ? ");
                System.out.println("Nhập Yes để xóa hoặc No để hủy xóa ");
                String confirm = scanner.nextLine();
                if(confirm.equals("Yes")){
                    System.out.println(" Đã xóa thành công " + xeTai.get(i).getBienKiemSoat());
                    xeTai.remove(i);
                } else if(confirm.equals("No")){
                    System.out.println("Đã hủy xóa");
                    break;
                } else {
                    System.out.println("Error");
                    break;
                }
            }
        }
        if (!check) {
            System.out.println(" Không tìm thấy biển kiểm soát tương ứng ");
        }
    }
}
