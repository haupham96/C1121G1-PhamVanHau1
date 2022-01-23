package code_for_fun.mvc_csv_vehicles_control.service.impl;

import code_for_fun.mvc_csv_vehicles_control.model.PhuongTien;
import code_for_fun.mvc_csv_vehicles_control.model.XeMay;
import code_for_fun.mvc_csv_vehicles_control.service.IChucNangPhuongTien;
import code_for_fun.mvc_csv_vehicles_control.util.ReadAndWriteCSV;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ChucNangXeMay implements IChucNangPhuongTien {
    Scanner scanner = new Scanner(System.in);
    List<PhuongTien> listXeMay = new ArrayList<>();
    final String PATH_HSX = "src/code_for_fun/mvc_csv_vehicles_control/data/HangSanXuat.csv";
    final String XEMAY_PATH = "src/code_for_fun/mvc_csv_vehicles_control/data/XeMay.csv";
    @Override
    public void them() {
        ReadAndWriteCSV readAndWriteCSV = new ReadAndWriteCSV();
        List<String> hangSanXuat = readAndWriteCSV.readCSV(PATH_HSX);
        String[] array;

        System.out.println("Nhập biển kiểm soát");
        String bienKiemSoat = scanner.nextLine();

        System.out.println("Chọn hãng sản xuất ");
        for (int i = 0; i < hangSanXuat.size(); i++) {
            System.out.println(i + 1 + ". " + hangSanXuat.get(i));
        }
        int maHSX = Integer.parseInt(scanner.nextLine());
        array = hangSanXuat.get(maHSX - 1).split(",");
        String hangSX = array[1];

        System.out.println("Nhập năm Sản xuất");
        int namSX = Integer.parseInt(scanner.nextLine());

        System.out.println("Chủ sở hữu");
        String chuSoHuu = scanner.nextLine();

        System.out.println("Nhập công suất");
        int congSuat = Integer.parseInt(scanner.nextLine());

        XeMay xeMay = new XeMay(bienKiemSoat,hangSX,namSX,chuSoHuu,congSuat);
        listXeMay.add(xeMay);
        List<String> stringListXeMay = readAndWriteCSV.changeIntoStringList(listXeMay);

        readAndWriteCSV.writeCSV(XEMAY_PATH,stringListXeMay,true);

    }

    @Override
    public void hienThi() {
        ReadAndWriteCSV readAndWriteCSV = new ReadAndWriteCSV();
        List<String> xeMay = readAndWriteCSV.readCSV(XEMAY_PATH);

        for (String s : xeMay) {
            System.out.println(s);
        }
    }

    @Override
    public void xoa() {

    }
}
