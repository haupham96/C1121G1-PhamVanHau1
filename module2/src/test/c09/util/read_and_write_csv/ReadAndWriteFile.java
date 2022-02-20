package test.c09.util.read_and_write_csv;

import test.c09.model.DienThoai;
import test.c09.model.DienThoaiChinhHang;
import test.c09.model.DienThoaiXachTay;
import test.c09.util.regex.Regex;
import test.c10.model.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFile {
    public List<String> readFileCSV(String path) {
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

    public void writeFileCSV(String path, List<String> list, boolean append) {

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

    public List<String> changeToStringList(List<DienThoai> list) {

        List<String> stringList = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            stringList.add(list.get(i).getString());
        }
        return stringList;
    }

    public List<DienThoai> doiSangListDienThoaiVaSetID(List<String> list) {
        List<DienThoai> listDienThoai = new ArrayList<>();
        String[] arr;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).matches(Regex.THOI_GIAN_BAO_HANH)) {
                arr = list.get(i).split(",");
                DienThoaiChinhHang dienThoaiChinhHang = new DienThoaiChinhHang(Integer.parseInt(arr[0]), arr[1], Integer.parseInt(arr[2]), Integer.parseInt(arr[3]), arr[4], arr[5], arr[6]);
                dienThoaiChinhHang.setID(i + 1);
                listDienThoai.add(dienThoaiChinhHang);
            } else {
                arr = list.get(i).split(",");
                DienThoaiXachTay dienThoaiXachTay = new DienThoaiXachTay(Integer.parseInt(arr[0]), arr[1], Integer.parseInt(arr[2]), Integer.parseInt(arr[3]), arr[4], arr[5], arr[6]);
                dienThoaiXachTay.setID(i + 1);
                listDienThoai.add(dienThoaiXachTay);
            }
        }
        return listDienThoai;
    }
}
