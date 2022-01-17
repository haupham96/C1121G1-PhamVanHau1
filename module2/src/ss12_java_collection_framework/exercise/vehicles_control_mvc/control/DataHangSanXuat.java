package ss12_java_collection_framework.exercise.vehicles_control_mvc.control;

import ss12_java_collection_framework.exercise.vehicles_control_mvc.model.PhuongTien;

import java.util.ArrayList;

public class DataHangSanXuat {
    static ArrayList<PhuongTien.HangSanXuat> hangSanXuat = new ArrayList<>();
    static {
        PhuongTien.HangSanXuat hangSanXuat1 = new PhuongTien.HangSanXuat("HSX-001","Yamaha","Nhật Bản");
        PhuongTien.HangSanXuat hangSanXuat2 = new PhuongTien.HangSanXuat("HSX-002","Honda","Nhật Bản");
        PhuongTien.HangSanXuat hangSanXuat3 = new PhuongTien.HangSanXuat("HSX-003","Dongfeng","Trung Quốc");
        PhuongTien.HangSanXuat hangSanXuat4 = new PhuongTien.HangSanXuat("HSX-004","Huyndai","Hàn Quốc");
        PhuongTien.HangSanXuat hangSanXuat5 = new PhuongTien.HangSanXuat("HSX-005","Ford","Mỹ");
        PhuongTien.HangSanXuat hangSanXuat6 = new PhuongTien.HangSanXuat("HSX-006","Toyota","Nhật Bản");
        PhuongTien.HangSanXuat hangSanXuat7 = new PhuongTien.HangSanXuat("HSX-007","Hino","Nhật Bản");

        hangSanXuat.add(hangSanXuat1);
        hangSanXuat.add(hangSanXuat2);
        hangSanXuat.add(hangSanXuat3);
        hangSanXuat.add(hangSanXuat4);
        hangSanXuat.add(hangSanXuat5);
        hangSanXuat.add(hangSanXuat6);
        hangSanXuat.add(hangSanXuat7);
    }

    public static void hienThiHangSanXuat() {

        for(int i=0;i< hangSanXuat.size();i++){
            System.out.println(hangSanXuat.get(i).getAll());
        }
    }

    public static String chonHangSanXuat(String maHangSanXuat) {
            for (int i = 0; i < hangSanXuat.size(); i++) {
                if (maHangSanXuat.equals(hangSanXuat.get(i).getMaHang())) {
                    return hangSanXuat.get(i).getTenHang();
                }
            }
            return "Mã hãng không đúng xin kiểm tra lại";
    }
}
