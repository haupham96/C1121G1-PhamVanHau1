package test.c08.service.impl;

import test.c08.model.TaiKhoanNganHang;
import test.c08.service.ITaiKhoanNganHangService;
import test.c08.util.exception.NotFoundBankException;
import test.c08.util.read_and_write_csv.CSVPath;
import test.c08.util.read_and_write_csv.ReadWriteFile;
import test.c09.model.DienThoai;
import test.c09.util.exception.NotFoundProductException;

import java.util.List;
import java.util.Scanner;

public class TaiKhoanNganHangImpl implements ITaiKhoanNganHangService {
    ReadWriteFile readWriteFile = new ReadWriteFile();
    Scanner scanner = new Scanner(System.in);
    @Override
    public void xoa() {
        List<String> list = readWriteFile.readFileCSV(CSVPath.BANK);
        List<TaiKhoanNganHang> nganHangList = readWriteFile.doiSangListTaiKhoanVaSetID(list);
        String maTK ;
        int chon;
        boolean checkXoa = false;
        boolean checkTonTai=false;
        do {
            System.out.println("Nhập Mã Tài Khoản để xóa");
            maTK= scanner.nextLine();
            try {
                for (int i = 0; i < nganHangList.size(); i++) {
                    if (nganHangList.get(i).getMaTaiKhoan().equals(maTK)) {
                        checkTonTai = true;
                        System.out.println("đã tìm thấy :");
                        System.out.println(nganHangList.get(i));
                        System.out.println("Bạn có thực sự muốn xóa ?");
                        do {
                            System.out.println("1. Yes");
                            System.out.println("2. No");
                            chon = Integer.parseInt(scanner.nextLine());
                            if (chon == 1) {
                                nganHangList.remove(i);
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
                    list = readWriteFile.changeToStringList(nganHangList);
                    nganHangList = readWriteFile.doiSangListTaiKhoanVaSetID(list);
                    list = readWriteFile.changeToStringList(nganHangList);
                    readWriteFile.writeFileCSV(CSVPath.BANK, list, false);
                    this.hienThi();
                }
                if (!checkTonTai) {
                    throw new NotFoundBankException("Tài khoản không tồn tại");
                } else {
                    break;
                }
            } catch (NotFoundBankException e) {
                e.printStackTrace();
            }
        }while (!checkTonTai);
    }

    @Override
    public void hienThi() {
        List<String> list = readWriteFile.readFileCSV(CSVPath.BANK);
        List<TaiKhoanNganHang> taiKhoanNganHangList = readWriteFile.doiSangListTaiKhoanVaSetID(list);
        for(TaiKhoanNganHang ls:taiKhoanNganHangList){
            System.out.println(ls);
        }
    }

    @Override
    public void timKiem() {
        boolean check = false;
        System.out.println("Nhập tên chủ tài khoản cần tìm");
        String ten = scanner.nextLine();
        List<String> list = readWriteFile.readFileCSV(CSVPath.BANK);
        List<TaiKhoanNganHang> taiKhoanNganHangList = readWriteFile.doiSangListTaiKhoanVaSetID(list);
        for (int i = 0; i < taiKhoanNganHangList.size(); i++) {
            if (taiKhoanNganHangList.get(i).getTenChuTaiKhoan().contains(ten)) {
                check = true;
                System.out.println(taiKhoanNganHangList.get(i));
            }
        }
        if (!check) {
            System.out.println("không tìm thấy");
        }
    }
}
