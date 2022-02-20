package test.c08.util.read_and_write_csv;

import test.c08.model.TaiKhoanNganHang;
import test.c08.model.TaiKhoanThanhToan;
import test.c08.model.TaiKhoanTietKiem;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadWriteFile {
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

    public List<String> changeToStringList(List<TaiKhoanNganHang> list) {

        List<String> stringList = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            stringList.add(list.get(i).getString());
        }
        return stringList;
    }

    public List<TaiKhoanNganHang> doiSangListTaiKhoanVaSetID(List<String> list) {
        List<TaiKhoanNganHang> listTaiKhoan = new ArrayList<>();
        String[] arr;
        for (int i = 0; i < list.size(); i++) {
            arr = list.get(i).split(",");
            if (arr.length == 6) {
                arr = list.get(i).split(",");
                TaiKhoanThanhToan thanhToan = new TaiKhoanThanhToan(Integer.parseInt(arr[0]),arr[1],arr[2],arr[3],arr[4],arr[5] );
                thanhToan.setID(i + 1);
                listTaiKhoan.add(thanhToan);
            } else {
                arr = list.get(i).split(",");
                TaiKhoanTietKiem tietKiem = new TaiKhoanTietKiem(Integer.parseInt(arr[0]),arr[1],arr[2],arr[3],arr[4],arr[5],Double.parseDouble(arr[6]),Integer.parseInt(arr[7]) );
                tietKiem.setID(i + 1);
                listTaiKhoan.add(tietKiem);
            }
        }
        return listTaiKhoan;
    }
}
