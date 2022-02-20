package test.c10.util.read_and_write_csv;

import code_for_fun.mvc_csv_vehicles_control.model.PhuongTien;
import test.c10.model.ExportProduct;
import test.c10.model.ImportProduct;
import test.c10.model.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteCSV {
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

    public List<String> changeToStringList(List<Product> list) {

        List<String> stringList = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            stringList.add(list.get(i).getInformation());
        }
        return stringList;
    }

    public List<Product> readListExport() {
        List<String> list = readFileCSV(CSVPath.EX_PRODUCT);
        List<Product> exProductList = new ArrayList<>();
        String[] arr;
        for (int i = 0; i < list.size(); i++) {
            arr = list.get(i).split(",");
            ExportProduct exportProduct = new ExportProduct(Integer.parseInt(arr[0]), arr[1], arr[2], Integer.parseInt(arr[3]), Integer.parseInt(arr[4]), arr[5], Integer.parseInt(arr[6]), arr[7]);
            exProductList.add(exportProduct);
        }

        return exProductList;
    }

    public List<Product> readListImport() {
        List<String> list = readFileCSV(CSVPath.IM_PRODUCT);
        List<Product> imProductList = new ArrayList<>();
        String[] arr;
        for (int i = 0; i < list.size(); i++) {
            arr = list.get(i).split(",");
            ImportProduct importProduct = new ImportProduct(Integer.parseInt(arr[0]), arr[1], arr[2], Integer.parseInt(arr[3]), Integer.parseInt(arr[4]), arr[5], Integer.parseInt(arr[6]), arr[7], Double.parseDouble(arr[8]));
            imProductList.add(importProduct);
        }
        return imProductList;
    }

    public void setID() {
        int id;
        boolean check = false;
        List<Product> productList = readListExport();

        for (int i = 0; i < productList.size(); i++) {
            id = i + 1;
            productList.get(i).setProductID(id);
            check = true;
        }
        if (check) {
            List<String> list = changeToStringList(productList);
            writeFileCSV(CSVPath.EX_PRODUCT, list, false);
        }
    }


}
