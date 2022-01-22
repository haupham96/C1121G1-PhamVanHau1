package code_for_fun.mvc_csv_vehicles_control.service.impl;

import code_for_fun.mvc_csv_vehicles_control.model.PhuongTien;
import code_for_fun.mvc_csv_vehicles_control.model.XeTai;
import code_for_fun.mvc_csv_vehicles_control.service.IChucNangPhuongTien;
import code_for_fun.mvc_csv_vehicles_control.util.ReadAndWriteCSV;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ChucNangXeTai implements IChucNangPhuongTien {
    Scanner scanner=new Scanner(System.in);
    List<PhuongTien> listXeTai = new ArrayList<>();
    final String XETAI_PATH = "src/code_for_fun/mvc_csv_vehicles_control/data/XeTai.csv";
    final String PATH_HSX = "src/code_for_fun/mvc_csv_vehicles_control/data/HangSanXuat.csv";
    @Override
    public void them() {
        ReadAndWriteCSV readAndWriteCSV = new ReadAndWriteCSV();
        List<String> hangSanXuat = readAndWriteCSV.readCSV(PATH_HSX);
        String[] array;

        System.out.println("Nhập biển kiểm soát");
        String bienKiemSoat = scanner.nextLine();

        System.out.println("Chọn hãng sản xuất ");
        for(int i=0;i< hangSanXuat.size();i++){
            System.out.println(i+1+". "+hangSanXuat.get(i));
        }
        int maHSX = Integer.parseInt(scanner.nextLine());
        array = hangSanXuat.get(maHSX-1).split(",");
        String hangSX = array[1];

        System.out.println("Nhập năm Sản xuất");
        int namSX = Integer.parseInt(scanner.nextLine());

        System.out.println("Chủ sở hữu");
        String chuSoHuu = scanner.nextLine();

        System.out.println("Nhập tải trọng ( tấn ) :");
        int taiTrong = Integer.parseInt(scanner.nextLine());

        XeTai xeTai = new XeTai(bienKiemSoat,hangSX,namSX,chuSoHuu,taiTrong);
        listXeTai.add(xeTai);
        List<String> stringListXeTai = readAndWriteCSV.changeIntoStringList(listXeTai);

        readAndWriteCSV.writeCSV(XETAI_PATH,stringListXeTai,true);

    }

    @Override
    public void hienThi() {
        ReadAndWriteCSV readAndWriteCSV = new ReadAndWriteCSV();
        List<String> xeTai = readAndWriteCSV.readCSV(XETAI_PATH);

        for (String s : xeTai) {
            System.out.println(s);
        }
    }

    @Override
    public void xoa() {

    }
}
