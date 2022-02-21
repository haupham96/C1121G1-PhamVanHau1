package test.c08.service.impl;

import test.c08.model.TaiKhoanNganHang;
import test.c08.model.TaiKhoanThanhToan;
import test.c08.service.IThemTaiKhoanService;
import test.c08.util.read_and_write_csv.CSVPath;
import test.c08.util.read_and_write_csv.ReadWriteFile;
import test.c08.util.regex.Regex;

import java.util.List;
import java.util.Scanner;

public class ThemTaiKhoanThanhToanImpl implements IThemTaiKhoanService {
    Scanner scanner = new Scanner(System.in);
    ReadWriteFile readWriteFile = new ReadWriteFile();

    @Override
    public void them() {
        List<String> list = readWriteFile.readFileCSV(CSVPath.BANK);
        System.out.println("Mã tài khoản");
        String maTK = Regex.regexData(scanner.nextLine(), Regex.MA_TK, "Mã Tài Khoản phải là số");

        System.out.println("Tên chủ Tài khoản");
        String tenChuTK = Regex.regexData(scanner.nextLine(), Regex.STRING, "Tên không hợp lệ");

        System.out.println("Ngày tạo tài khoản");
        String ngayTaoTK = Regex.regexData(scanner.nextLine(), Regex.DATE_LEAP_YEAR, "ngày ko hợp lệ (dd/MM/yyyy)");

        System.out.println("Số thẻ");
        String soThe = Regex.regexData(scanner.nextLine(), Regex.MA_TK, "Số thẻ Khoản phải là số");

        System.out.println("Số tiền trong tài khoản");
        String soTienTrongTK = Regex.regexData(scanner.nextLine(), Regex.SO_DUONG, "Số tiền phải là số dương");

        TaiKhoanThanhToan thanhToan = new TaiKhoanThanhToan(0, maTK, tenChuTK, ngayTaoTK, soThe, soTienTrongTK);
        thanhToan.setID(readWriteFile.getLastID()+1);
        list.add(thanhToan.getString());
        readWriteFile.writeFileCSV(CSVPath.BANK, list, false);
    }
}
