package test.c1121g1_pham_van_hau.service.impl;

import test.c1121g1_pham_van_hau.model.BenhAn;
import test.c1121g1_pham_van_hau.service.IBenhAnService;
import test.c1121g1_pham_van_hau.util.doc_ghi_file.DocGhiFile;
import test.c1121g1_pham_van_hau.util.doc_ghi_file.PathCSV;
import test.c1121g1_pham_van_hau.util.exception.NotFoundMedicalRecordException;

import java.util.List;
import java.util.Scanner;

public class BenhAnServiceImpl implements IBenhAnService {
    DocGhiFile docGhiFile = new DocGhiFile();
    Scanner scanner = new Scanner(System.in);

    @Override
    public void xoa() {
        List<String> list = docGhiFile.docFileCSV(PathCSV.BENH_AN);
        List<BenhAn> benhAnList = docGhiFile.chuyenSangListBenhAn(list);
        String maBenhAn;
        int chon = 0;
        boolean checkXoa = false;
        boolean checkTonTai = false;
        do {
            System.out.println("Nhập Mã Bệnh Án để xóa");
            maBenhAn = scanner.nextLine();
            try {
                for (int i = 0; i < benhAnList.size(); i++) {
                    if (benhAnList.get(i).getMaBenhAn().equals(maBenhAn)) {
                        checkTonTai = true;
                        System.out.println("đã tìm thấy :");
                        System.out.println(benhAnList.get(i));
                        System.out.println("Bạn có thực sự muốn xóa ?");
                        do {
                            System.out.println("1. Yes");
                            System.out.println("2. No");
                            try {
                                chon = Integer.parseInt(scanner.nextLine());
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                            if (chon == 1) {
                                benhAnList.remove(i);
                                System.out.println("Đã xóa thành công");
                                checkXoa = true;
                                break;
                            } else if (chon == 2) {
                                System.out.println("Đã hủy xóa");
                                break;
                            } else {
                                System.out.println("chọn 1 hoặc 2");
                            }
                        }
                        while (true);
                    }
                }
                if (checkXoa) {
                    list = docGhiFile.chuyenSangListString(benhAnList);
                    docGhiFile.ghiFileCSV(PathCSV.BENH_AN, list, false);
                    this.hienThi();
                }
                if (!checkTonTai) {
                    throw new NotFoundMedicalRecordException("mã bệnh án không tồn tại");
                } else {
                    break;
                }
            } catch (NotFoundMedicalRecordException e) {
                e.printStackTrace();
            }
        } while (!checkTonTai);

    }


    @Override
    public void hienThi() {
        List<String> list = docGhiFile.docFileCSV(PathCSV.BENH_AN);
        List<BenhAn> benhAn = docGhiFile.chuyenSangListBenhAn(list);
        for (BenhAn ls : benhAn) {
            System.out.println(ls);
        }
    }

}
