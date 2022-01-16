package ss12_java_collection_framework.exercise.vehicles_control_mvc.control;

import java.util.ArrayList;

public class DataHangSanXuat {
    static ArrayList<String[]> hangSanXuat = new ArrayList<>();
    static {
        String[] hangSanXuat1 = {"HSX-001", "Yamaha", "Nhật Bản"};
        String[] hangSanXuat2 = {"HSX-002", "Honda", "Nhật Bản"};
        String[] hangSanXuat3 = {"HSX-003", "Dongfeng", "Trung Quốc"};
        String[] hangSanXuat4 = {"HSX-004", "Huyndai", "Hàn Quốc"};
        String[] hangSanXuat5 = {"HSX-005", "Ford", "Mỹ"};
        String[] hangSanXuat6 = {"HSX-006", "Toyota", "Nhật Bản"};
        String[] hangSanXuat7 = {"HSX-007", "Hino", "Nhật Bản"};

        hangSanXuat.add(hangSanXuat1);
        hangSanXuat.add(hangSanXuat2);
        hangSanXuat.add(hangSanXuat3);
        hangSanXuat.add(hangSanXuat4);
        hangSanXuat.add(hangSanXuat5);
        hangSanXuat.add(hangSanXuat6);
        hangSanXuat.add(hangSanXuat7);

    }
    public static void hienThiHangSanXuat() {
        for (String[] element : hangSanXuat) {
            System.out.println(element[0] + " " + element[1] + " " + element[2]);
        }
    }

    public static String chonHangSanXuat(String maHangSanXuat) {
            for (int i = 0; i < hangSanXuat.size(); i++) {
                if (maHangSanXuat.equals(hangSanXuat.get(i)[0])) {
                    return hangSanXuat.get(i)[1];
                }
            }
            return "Mã hãng không đúng xin kiểm tra lại";
    }
}
