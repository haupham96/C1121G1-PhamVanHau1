package test.c09.service.impl;

import test.c09.model.DienThoai;
import test.c09.service.IDienThoaiService;
import test.c09.util.exception.NotFoundProductException;
import test.c09.util.read_and_write_csv.CSVPath;
import test.c09.util.read_and_write_csv.ReadAndWriteFile;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DienThoaiServiceImpl implements IDienThoaiService {
    Scanner scanner = new Scanner(System.in);
    ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();

    @Override
    public void xoa() {
        List<String> list = readAndWriteFile.readFileCSV(CSVPath.MOBILE);
        List<DienThoai> dienThoaiList = readAndWriteFile.doiSangListDienThoaiVaSetID(list);
        int id ;
        int chon;
        boolean checkXoa = false;
        boolean checkTonTai=false;
        do {
            System.out.println("Nhập ID để xóa");
            id= Integer.parseInt(scanner.nextLine());
            try {
                for (int i = 0; i < dienThoaiList.size(); i++) {
                    if (dienThoaiList.get(i).getID() == id) {
                        checkTonTai = true;
                        System.out.println("đã tìm thấy :");
                        System.out.println(dienThoaiList.get(i));
                        System.out.println("Bạn có thực sự muốn xóa ?");
                        do {
                            System.out.println("1. Yes");
                            System.out.println("2. No");
                            chon = Integer.parseInt(scanner.nextLine());
                            if (chon == 1) {
                                dienThoaiList.remove(i);
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
                    list = readAndWriteFile.changeToStringList(dienThoaiList);
                    dienThoaiList = readAndWriteFile.doiSangListDienThoaiVaSetID(list);
                    list = readAndWriteFile.changeToStringList(dienThoaiList);
                    readAndWriteFile.writeFileCSV(CSVPath.MOBILE, list, false);
                    this.hienThi();
                }
                if (!checkTonTai) {
                    throw new NotFoundProductException("ID dien thoai khong ton tai");
                } else {
                    break;
                }
            } catch (NotFoundProductException e) {
                e.printStackTrace();
            }
        }while (!checkTonTai);


    }

    @Override
    public void hienThi() {
        List<String> list = readAndWriteFile.readFileCSV(CSVPath.MOBILE);
        List<DienThoai> dienThoaiList = readAndWriteFile.doiSangListDienThoaiVaSetID(list);
        for (DienThoai ls : dienThoaiList) {
            System.out.println(ls);
        }
    }

    @Override
    public void timKiem() {
        boolean check = false;
        System.out.println("Nhập tên điện thoại cần tìm");
        String ten = scanner.nextLine();
        List<String> list = readAndWriteFile.readFileCSV(CSVPath.MOBILE);
        List<DienThoai> dienThoaiList = readAndWriteFile.doiSangListDienThoaiVaSetID(list);
        for (int i = 0; i < dienThoaiList.size(); i++) {
            if (dienThoaiList.get(i).getTenDienThoai().contains(ten)) {
                check = true;
                System.out.println(dienThoaiList.get(i));
            }
        }
        if (!check) {
            System.out.println("không tìm thấy điện thoại");
        }
    }
}
