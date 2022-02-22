package c1121g1_pham_van_hau.service.impl;

import c1121g1_pham_van_hau.model.BenhAnVip;
import c1121g1_pham_van_hau.service.IThemBenhAnService;
import c1121g1_pham_van_hau.util.doc_ghi_file.DocGhiFile;
import c1121g1_pham_van_hau.util.doc_ghi_file.PathCSV;
import c1121g1_pham_van_hau.util.regex.Regex;

import java.util.List;
import java.util.Scanner;

public class ThemBenhAnVipImpl implements IThemBenhAnService {
    Scanner scanner = new Scanner(System.in);
    DocGhiFile docGhiFile = new DocGhiFile();

    @Override
    public void them() {
        System.out.println("nhập mã bệnh án");
        String maBenhAn = Regex.regexDuLieu(scanner.nextLine(),Regex.MA_BENH_AN,"Mã bệnh án không hợp lệ (VD : BA-000)");
        System.out.println("nhập mã bệnh nhân");
        String maBenhNhan = Regex.regexDuLieu(scanner.nextLine(),Regex.MA_BENH_NHAN,"Mã bệnh nhân không hợp lệ (VD : BN-000)");

        System.out.println("nhập tên bệnh nhân");
        String tenBenhNhan = Regex.regexDuLieu(scanner.nextLine(),Regex.TEN,"Tên không hợp lệ (VD : Pham Van Hau)");

        System.out.println("ngày nhập viện");
        String ngayNhapVien = Regex.regexDuLieu(scanner.nextLine(),Regex.NGAY_THANG,"Ngày không hợp lệ (VD : dd-MM-yyyy)");

        System.out.println("ngày ra viện");
        String ngayRaVien = Regex.regexDuLieu(scanner.nextLine(),Regex.NGAY_THANG,"Ngày không hợp lệ  (VD : dd-MM-yyyy)");

        System.out.println("lí do nhập viện");
        String lyDoNhapVien = scanner.nextLine();

        System.out.println("loại Vip");
        String loaiVip = chonLoaiVip();

        System.out.println("thời hạn");
        String thoiHan = Regex.regexDuLieu(scanner.nextLine(),Regex.NGAY_THANG,"Thời hạn không hợp lệ (VD : dd-MM-yyyy)");

        int soThuTu = docGhiFile.layIDCuoiCung() + 1;

        BenhAnVip benhAnVip = new BenhAnVip(soThuTu, maBenhAn, maBenhNhan, tenBenhNhan, ngayNhapVien, ngayRaVien, lyDoNhapVien, loaiVip, thoiHan);
        List<String> list = docGhiFile.docFileCSV(PathCSV.BENH_AN);
        list.add(benhAnVip.layThongTin());

        docGhiFile.ghiFileCSV(PathCSV.BENH_AN, list, false);
    }

    public String chonLoaiVip() {
        String loaiVip = null;
        int chon = 0;
        boolean kiemTra = false;
        do {
            System.out.println("Mời chọn loại Vip");
            System.out.println("1. VIP I");
            System.out.println("2. VIP II");
            System.out.println("3. VIP III");
            try {
                chon = Integer.parseInt(scanner.nextLine());
            } catch (Exception e) {
                e.printStackTrace();
            }
            switch (chon) {
                case 1:
                    loaiVip = "VIP I";
                    kiemTra = true;
                    break;
                case 2:
                    loaiVip = "VIP II";
                    kiemTra = true;
                    break;
                case 3:
                    loaiVip = "VIP III";
                    kiemTra = true;
                    break;
                default:
                    System.out.println("chỉ chọn từ 1 đến 3");
                    break;
            }
        } while (!kiemTra);

        return loaiVip;
    }

}
