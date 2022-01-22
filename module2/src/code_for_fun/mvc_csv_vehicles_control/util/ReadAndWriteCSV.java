package code_for_fun.mvc_csv_vehicles_control.util;

import code_for_fun.mvc_csv_vehicles_control.model.PhuongTien;
import code_for_fun.mvc_csv_vehicles_control.model.XeOTo;
import code_for_fun.mvc_csv_vehicles_control.model.XeTai;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteCSV {

    public List<String> readCSV(String path) {
        List<String> listHSX = new ArrayList<>();
        try {
            File file = new File(path);
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
                listHSX.add(line);
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return listHSX;
    }

    public void writeCSV(String path, List<String> list, boolean append) {
        try {
            File file = new File(path);
            FileWriter fileWriter = new FileWriter(file, append);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (int i = 0; i < list.size(); i++) {
                bufferedWriter.write(list.get(i));
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<String> changeIntoStringList(List<PhuongTien> list) {

        List<String> stringList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            stringList.add(list.get(i).getInFor());
        }
        return stringList;
    }

}
