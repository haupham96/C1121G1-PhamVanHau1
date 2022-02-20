package test.c08.service.impl;

import test.c08.model.TaiKhoanNganHang;
import test.c08.model.TaiKhoanThanhToan;
import test.c08.model.TaiKhoanTietKiem;
import test.c08.service.IThemTaiKhoanService;
import test.c08.util.read_and_write_csv.CSVPath;
import test.c08.util.read_and_write_csv.ReadWriteFile;
import test.c08.util.regex.Regex;

import java.util.List;
import java.util.Scanner;

public class ThemTaiKhoanTietKiemImpl implements IThemTaiKhoanService {
    ReadWriteFile readWriteFile = new ReadWriteFile();
    Scanner scanner = new Scanner(System.in);
    @Override
    public void them() {
        List<String> list = readWriteFile.readFileCSV(CSVPath.BANK);
        System.out.println("Mã tài khoản");
        String maTK = Regex.regexData(scanner.nextLine(),Regex.MA_TK,"Mã Tài Khoản phải là số");

        System.out.println("Tên chủ Tài khoản");
        String tenChuTK = Regex.regexData(scanner.nextLine(),Regex.STRING,"Tên không hợp lệ");

        System.out.println("Ngày tạo tài khoản");
        String ngayTaoTK = Regex.regexData(scanner.nextLine(),Regex.DATE_LEAP_YEAR,"ngày ko hợp lệ (dd/MM/yyyy)");

        System.out.println("Số tiền gửi tiết kiệm");
        String soTienGuiTietKiem = Regex.regexData(scanner.nextLine(),Regex.SO_DUONG,"số tiền phải là số dương");

        System.out.println("ngày gửi tiết kiệm");
        String ngayGuiTietKiem = Regex.regexData(scanner.nextLine(),Regex.DATE_LEAP_YEAR,"ngày ko hợp lệ (dd/MM/yyyy)");

        System.out.println("Lãi suất");
        String laiSuat = Regex.regexData(scanner.nextLine(),Regex.SO_DUONG,"lãi suất phải là số dương");

        System.out.println("Kỳ hạn");
        String kyHan = Regex.regexData(scanner.nextLine(),Regex.SO_DUONG,"kỳ hạn phải là số dương");

        TaiKhoanTietKiem tietKiem = new TaiKhoanTietKiem(0,maTK,tenChuTK,ngayTaoTK,soTienGuiTietKiem,ngayGuiTietKiem,Double.parseDouble(laiSuat),Integer.parseInt(kyHan));
        list.add(tietKiem.getString());
        List<TaiKhoanNganHang> nganHangList = readWriteFile.doiSangListTaiKhoanVaSetID(list);
        list = readWriteFile.changeToStringList(nganHangList);

        readWriteFile.writeFileCSV(CSVPath.BANK, list, false);
    }
}
