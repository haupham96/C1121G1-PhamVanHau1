package test.c09.service.impl;

import test.c09.model.DienThoai;
import test.c09.model.DienThoaiChinhHang;
import test.c09.model.DienThoaiXachTay;
import test.c09.service.IThemService;
import test.c09.util.read_and_write_csv.CSVPath;
import test.c09.util.read_and_write_csv.ReadAndWriteFile;
import test.c09.util.regex.Regex;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DienThoaiXachTayThemImpl implements IThemService {
    Scanner scanner = new Scanner(System.in);
    ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();

    @Override
    public void them() {
        List<String> list = readAndWriteFile.readFileCSV(CSVPath.MOBILE);
        List<DienThoai> dienThoaiList = new ArrayList<>();

        System.out.println("Tên Điện thoại");
        String tenDienThoai = Regex.regexData(scanner.nextLine(),Regex.STRING,"sai định dạng (Aaaaaaa123)");

        System.out.println("Giá bán");
        String giaBan = Regex.regexData(scanner.nextLine(),Regex.SO_DUONG,"sai định dạng (số dương)");

        System.out.println("Số lượng");
        String soLuong = Regex.regexData(scanner.nextLine(),Regex.SO_DUONG,"sai định dạng (số dương)");

        System.out.println("Nhà sản xuất");
        String nhaSanXuat = Regex.regexData(scanner.nextLine(),Regex.STRING,"sai định dạng (Aaaaaaa123)");

        System.out.println("Quốc gia xách tay");
        String quocGia = Regex.regexData(scanner.nextLine(),Regex.QUOC_GIA_XACH_TAY,"sai định dạng hoặc Quốc gia xách tay: không được là “Viet Nam”");

        System.out.println("Trạng thái");
        String trangThai;
        int chon;
        do {
            System.out.println("Chọn Phạm vi bảo hành");
            System.out.println("1. Đã sữa chữa");
            System.out.println("2. Chưa sữa chữa");
            chon = Integer.parseInt(scanner.nextLine());
            if (chon == 1) {
                trangThai = "Da sua chua";
                break;
            } else if (chon == 2) {
                trangThai = "Chua sua chua";
                break;
            } else {
                System.out.println("chọn 1 hoặc 2");
            }
        }
        while (true);

        DienThoaiXachTay dienThoaiXachTay = new DienThoaiXachTay(0, tenDienThoai, Integer.parseInt(giaBan), Integer.parseInt(soLuong), nhaSanXuat, quocGia, trangThai);
        list.add(dienThoaiXachTay.getString());

        dienThoaiList = readAndWriteFile.doiSangListDienThoaiVaSetID(list);
        list = readAndWriteFile.changeToStringList(dienThoaiList);

        readAndWriteFile.writeFileCSV(CSVPath.MOBILE, list, false);
    }
}
