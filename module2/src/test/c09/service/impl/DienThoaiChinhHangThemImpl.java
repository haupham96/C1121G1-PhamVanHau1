package test.c09.service.impl;

import test.c09.model.DienThoai;
import test.c09.model.DienThoaiChinhHang;
import test.c09.service.IThemService;
import test.c09.util.read_and_write_csv.CSVPath;
import test.c09.util.read_and_write_csv.ReadAndWriteFile;
import test.c09.util.regex.Regex;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DienThoaiChinhHangThemImpl implements IThemService {
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

        System.out.println("Thời gian bảo hành");
        String thoiGianBaoHanh= Regex.regexThoiGianBaoHanh(scanner.nextLine(),Regex.THOI_GIAN_BAO_HANH,"phải là số và không quá 730 ");

        System.out.println("Phạm vi bảo hành");
        String phamViBaoHanh;
        int chon;
        do {
            System.out.println("Chọn Phạm vi bảo hành");
            System.out.println("1. Toàn Quốc");
            System.out.println("2. Quốc Tế");
            chon = Integer.parseInt(scanner.nextLine());
            if (chon == 1) {
                phamViBaoHanh = "ToanQuoc";
                break;
            } else if (chon == 2) {
                phamViBaoHanh = "QuocTe";
                break;
            } else {
                System.out.println("chọn 1 hoặc 2");
            }
        }
        while (true);

        DienThoaiChinhHang dienThoaiChinhHang = new DienThoaiChinhHang(0,tenDienThoai, Integer.parseInt(giaBan), Integer.parseInt(soLuong), nhaSanXuat, thoiGianBaoHanh, phamViBaoHanh);
        list.add(dienThoaiChinhHang.getString());

        dienThoaiList = readAndWriteFile.doiSangListDienThoaiVaSetID(list);
        list = readAndWriteFile.changeToStringList(dienThoaiList);

        readAndWriteFile.writeFileCSV(CSVPath.MOBILE, list, false);

    }
}
