package code_for_fun.mvc_csv_vehicles_control.service.impl;

import code_for_fun.mvc_csv_vehicles_control.service.IChucNangPhuongTien;
import code_for_fun.mvc_csv_vehicles_control.util.ReadAndWriteCSV;

import java.util.List;
import java.util.Scanner;

public class XoaPhuongTien implements IChucNangPhuongTien {
    Scanner scanner = new Scanner(System.in);
    final String XETAI_PATH = "src/code_for_fun/mvc_csv_vehicles_control/data/XeTai.csv";
    final String XEOTO_PATH = "src/code_for_fun/mvc_csv_vehicles_control/data/XeOTo.csv";
    final String XEMAY_PATH = "src/code_for_fun/mvc_csv_vehicles_control/data/XeMay.csv";
    @Override
    public void them() {

    }

    @Override
    public void hienThi() {
    }

    @Override
    public void xoa() {
        ReadAndWriteCSV readAndWriteCSV = new ReadAndWriteCSV();
        List<String> listXeTai= readAndWriteCSV.readCSV(XETAI_PATH);
        List<String> listXeOTO= readAndWriteCSV.readCSV(XEOTO_PATH);
        List<String> listXeMay= readAndWriteCSV.readCSV(XEMAY_PATH);
        System.out.println("nhập biển kiểm soát để xóa :");
        String bienKiemSoat = scanner.nextLine();

        for(int i=0;i<listXeTai.size();i++){
            if(listXeTai.get(i).contains(bienKiemSoat)){
                System.out.println("Tìm thấy phương tiện "+bienKiemSoat+" ở list Xe Tải");
                System.out.println("Nhập YES để xóa "+"\n"+"Nhập NO để hủy xóa");
                String xacNhan = scanner.nextLine();
                if(xacNhan.equals("YES")){
                    listXeTai.remove(i);
                    System.out.println("Xóa phương tiện thành công");
                    System.out.println("Nhấn Enter để quay trở lại menu chính");
                    String enter = scanner.nextLine();
                    if(enter.equals("\n")){
                        break;
                    }
                } else if (xacNhan.equals("NO")) {
                    System.out.println("ĐÃ HỦY XÓA");
                    break;
                }
            }
        }
        readAndWriteCSV.writeCSV(XETAI_PATH,listXeTai,false);

        for(int i=0;i<listXeOTO.size();i++){
            if(listXeOTO.get(i).contains(bienKiemSoat)){
                System.out.println("Tìm thấy phương tiện "+bienKiemSoat+" ở list Xe Ô Tô");
                System.out.println("Nhập YES để xóa "+"\n"+"Nhập NO để hủy xóa");
                String xacNhan = scanner.nextLine();
                if(xacNhan.equals("YES")){
                    listXeOTO.remove(i);
                    System.out.println("Xóa phương tiện thành công");
                    System.out.println("Nhấn Enter để quay trở lại menu chính");
                    String enter = scanner.nextLine();
                    if(enter.equals("\n")){
                        break;
                    }
                } else if (xacNhan.equals("NO")) {
                    System.out.println("ĐÃ HỦY XÓA");
                    break;
                }
            }
        }
        readAndWriteCSV.writeCSV(XEOTO_PATH,listXeOTO,false);

        for(int i=0;i<listXeMay.size();i++){
            if(listXeMay.get(i).contains(bienKiemSoat)){
                System.out.println("Tìm thấy phương tiện "+bienKiemSoat+" ở list Xe Máy");
                System.out.println("Nhập YES để xóa "+"\n"+"Nhập NO để hủy xóa");
                String xacNhan = scanner.nextLine();
                if(xacNhan.equals("YES")){
                    listXeMay.remove(i);
                    System.out.println("Xóa phương tiện thành công");
                    System.out.println("Nhấn Enter để quay trở lại menu chính");
                    String enter = scanner.nextLine();
                    if(enter.equals("\n")){
                        break;
                    }
                } else if (xacNhan.equals("NO")) {
                    System.out.println("ĐÃ HỦY XÓA");
                    break;
                }
            }
        }
        readAndWriteCSV.writeCSV(XEMAY_PATH,listXeMay,false);

    }
}
