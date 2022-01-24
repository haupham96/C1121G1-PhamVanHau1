package ss17_io_binary_file_and_serialization.exercise.product_management_binary_file.util;

import ss17_io_binary_file_and_serialization.exercise.product_management_binary_file.model.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteBinaryFile {
    final String PRODUCT_PATH = "src/ss17_io_binary_file_and_serialization/exercise/product_management_binary_file/data/Product.csv";

    public static List<Product> readBinaryFile(String path) {
        List<Product> productList = new ArrayList<>();
        File file = new File(path);
        FileInputStream fileInputStream = null;
        ObjectInputStream objectInputStream = null;

        try {
            if (file.exists() && file.length() > 0) {
                fileInputStream = new FileInputStream(file);
                objectInputStream = new ObjectInputStream(fileInputStream);
                productList = (List<Product>) objectInputStream.readObject();

                objectInputStream.close();
                fileInputStream.close();
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return productList;
    }

    public static void writeBinaryFile(String path, List<Product> list) {
        File file = new File(path);
        FileOutputStream fileOutputStream;
        ObjectOutputStream objectOutputStream;

        try {
            if (file.exists()) {
                fileOutputStream = new FileOutputStream(file);
                objectOutputStream = new ObjectOutputStream(fileOutputStream);
                objectOutputStream.writeObject(list);

                objectOutputStream.close();
                fileOutputStream.close();
            } else {
                throw new FileNotFoundException("File does not Exist");
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
