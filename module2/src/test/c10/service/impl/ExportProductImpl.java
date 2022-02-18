package test.c10.service.impl;


import test.c10.model.ExportProduct;
import test.c10.model.Product;
import test.c10.service.IProductService;
import test.c10.util.exception.NotFoundProductException;
import test.c10.util.read_and_write_csv.CSVPath;
import test.c10.util.read_and_write_csv.ReadAndWriteCSV;
import test.c10.util.regex.Regex;


import java.util.List;
import java.util.Scanner;

public class ExportProductImpl implements IProductService {
    ReadAndWriteCSV readAndWriteCSV = new ReadAndWriteCSV();
    Scanner scanner = new Scanner(System.in);

    @Override
    public void them() {
        List<String> list = readAndWriteCSV.readFileCSV(CSVPath.EX_PRODUCT);

//        System.out.println("nhập ID sản phẩm");
//        String ID = Regex.regexData(scanner.nextLine(), Regex.SO_DUONG, "Error Input");

        System.out.println("nhập mã sản phẩm");
        String maSP = Regex.regexData(scanner.nextLine(), Regex.STRING, "Error Input");

        System.out.println("nhập tên sản phẩm");
        String tenSP = Regex.regexData(scanner.nextLine(), Regex.STRING, "Error Input");

        System.out.println("nhập giá bán");
        String giaBan = Regex.regexData(scanner.nextLine(), Regex.SO_DUONG, "Error Input");

        System.out.println("nhập số lượng");
        String soLuong = Regex.regexData(scanner.nextLine(), Regex.SO_DUONG, "Error Input");

        System.out.println("nhập nhà sản xuất");
        String nhaSanXuat = Regex.regexData(scanner.nextLine(), Regex.STRING, "Error Input");

        System.out.println("nhập giá xuất khẩu");
        String giaXuatkhau = Regex.regexData(scanner.nextLine(), Regex.SO_DUONG, "Error Input");

        System.out.println("Tên quốc gia nhập khẩu");
        String tenQuocGiaNhap = Regex.regexData(scanner.nextLine(), Regex.STRING, "Error Input");

        ExportProduct exProduct = new ExportProduct(0, maSP, tenSP, Integer.parseInt(giaBan), Integer.parseInt(soLuong), nhaSanXuat, Integer.parseInt(giaXuatkhau), tenQuocGiaNhap);
        list.add(exProduct.getInformation());

        readAndWriteCSV.writeFileCSV(CSVPath.EX_PRODUCT, list, false);

        readAndWriteCSV.setID();
    }

    @Override
    public void xoa() {
        System.out.println("nhập mã sản phẩm muốn xóa");
        String ten = scanner.nextLine();
        String yesNo;
        boolean check = false;
        List<Product> list = readAndWriteCSV.readListExport();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getProductCode().equals(ten)) {
                System.out.println("BẠN CÓ CHẮC MUỐN XÓA SẢN PHẨM : ");
                System.out.println(list.get(i));
                System.out.println("Nhập Yes để Xóa");
                System.out.println("Nhập No để Hủy");
                yesNo = scanner.nextLine();
                if (yesNo.equals("Yes")) {
                    list.remove(i);
                    check = true;
                    System.out.println("đã xóa thành công");
                } else if (yesNo.equals("No")) {
                    System.out.println("Hủy Xóa");
                    break;
                } else {
                    System.out.println("nhập sai định dạng");
                    break;
                }

            }
        }
        if (!check) {
            try {
                throw new NotFoundProductException("not found product");
            } catch (NotFoundProductException e) {
                e.printStackTrace();
            }
        } else {
            List<String> string = readAndWriteCSV.changeToStringList(list);
            readAndWriteCSV.writeFileCSV(CSVPath.EX_PRODUCT, string, false);
        }
        readAndWriteCSV.setID();
    }

    @Override
    public void hienThi() {
        List<Product> list = readAndWriteCSV.readListExport();
        for (Product lists : list) {
            System.out.println(lists);
        }
    }

    @Override
    public void timKiem() {
        System.out.println("nhập tên sản phẩm muốn tìm kiếm");
        String ten = scanner.nextLine();
        boolean check = false;
        List<Product> list = readAndWriteCSV.readListExport();
        for (Product ls : list) {
            if (ls.getProductName().contains(ten)) {
                System.out.println(ls);
                check = true;
            }
        }
        if (!check) {
            System.out.println("không tìm thấy sản phẩm");
        }
    }
}
