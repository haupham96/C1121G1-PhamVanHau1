package test.c1121g1_pham_van_hau.util.doc_ghi_file;

import test.c1121g1_pham_van_hau.model.BenhAn;
import test.c1121g1_pham_van_hau.model.BenhAnThuong;
import test.c1121g1_pham_van_hau.model.BenhAnVip;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class DocGhiFile {
    public List<String> docFileCSV(String path) {
        List<String> list = new ArrayList<>();

        try {
            File file = new File(path);
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
                list.add(line);
            }
            bufferedReader.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }

    public void ghiFileCSV(String path, List<String> list, boolean append) {

        try {
            File file = new File(path);
            FileWriter fileWriter = new FileWriter(file, append);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            for (String s : list) {
                bufferedWriter.write(s);
                bufferedWriter.newLine();
            }

            bufferedWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<String> chuyenSangListString(List<BenhAn> list) {

        List<String> stringList = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            stringList.add(list.get(i).layThongTin());
        }
        return stringList;
    }

    public List<BenhAn> chuyenSangListBenhAn(List<String> list) {
        List<BenhAn> listBenhAn = new ArrayList<>();
        String[] arr;
        for (int i = 0; i < list.size(); i++) {
            arr = list.get(i).split(",");
            if (arr.length == 8) {
                arr = list.get(i).split(",");
                BenhAnThuong benhAnThuong = new BenhAnThuong(Integer.parseInt(arr[0]), arr[1], arr[2], arr[3], arr[4], arr[5], arr[6],arr[7]);
                listBenhAn.add(benhAnThuong);
            } else {
                arr = list.get(i).split(",");
                BenhAnVip benhAnVip = new BenhAnVip(Integer.parseInt(arr[0]), arr[1], arr[2], arr[3], arr[4], arr[5], arr[6], arr[7],arr[8]);
                listBenhAn.add(benhAnVip);
            }
        }
        return listBenhAn;
    }

    public int layIDCuoiCung() {
        List<BenhAn> listName = this.chuyenSangListBenhAn(this.docFileCSV(PathCSV.BENH_AN));
        int IDCuoi = 0;
        for (BenhAn ls : listName) {
            IDCuoi = ls.getSoThuTu();
        }
        return IDCuoi;
    }
}
