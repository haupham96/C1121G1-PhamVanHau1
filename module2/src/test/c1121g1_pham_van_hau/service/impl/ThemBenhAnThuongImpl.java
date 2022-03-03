//package test.c1121g1_pham_van_hau.service.impl;
//
//import test.c1121g1_pham_van_hau.model.BenhAnThuong;
//import test.c1121g1_pham_van_hau.service.IThemBenhAnService;
//import test.c1121g1_pham_van_hau.util.doc_ghi_file.DocGhiFile;
//import test.c1121g1_pham_van_hau.util.doc_ghi_file.PathCSV;
//import test.c1121g1_pham_van_hau.util.regex.Regex;
//
//import java.util.List;
//import java.util.Scanner;
//
//public class ThemBenhAnThuongImpl implements IThemBenhAnService {
//    Scanner scanner = new Scanner(System.in);
//    DocGhiFile docGhiFile = new DocGhiFile();
//
//    @Override
//    public void them() {
//        System.out.println("nhập mã bệnh án");
//        String maBenhAn = Regex.regexDuLieu(scanner.nextLine(),Regex.MA_BENH_AN,"Mã bệnh án không hợp lệ (VD : BA-000)");
//        System.out.println("nhập mã bệnh nhân");
//        String maBenhNhan = Regex.regexDuLieu(scanner.nextLine(),Regex.MA_BENH_NHAN,"Mã bệnh nhân không hợp lệ (VD : BN-000)");
//
//        System.out.println("nhập tên bệnh nhân");
//        String tenBenhNhan = Regex.regexDuLieu(scanner.nextLine(),Regex.TEN,"Tên không hợp lệ (VD : Pham Van Hau)");
//
//        System.out.println("ngày nhập viện");
//        String ngayNhapVien = Regex.regexDuLieu(scanner.nextLine(),Regex.NGAY_THANG,"Ngày không hợp lệ (VD : dd-MM-yyyy)");
//
//        System.out.println("ngày ra viện");
//        String ngayRaVien = Regex.regexDuLieu(scanner.nextLine(),Regex.NGAY_THANG,"Ngày không hợp lệ (VD : dd-MM-yyyy)");
//
//        System.out.println("lí do nhập viện");
//        String lyDoNhapVien = scanner.nextLine();
//
//        System.out.println("phí nằm viện");
//        String phiNamVien = Regex.regexDuLieu(scanner.nextLine(),Regex.SO_DUONG,"Phải là số dương");
//
//        int soThuTu = docGhiFile.layIDCuoiCung() + 1;
//
//        BenhAnThuong benhAnThuong = new BenhAnThuong(soThuTu, maBenhAn, maBenhNhan, tenBenhNhan, ngayNhapVien, ngayRaVien, lyDoNhapVien, phiNamVien);
//
//        List<String> list = docGhiFile.docFileCSV(PathCSV.BENH_AN);
//        list.add(benhAnThuong.layThongTin());
//
//        docGhiFile.ghiFileCSV(PathCSV.BENH_AN,list,false);
//
//    }
//}
