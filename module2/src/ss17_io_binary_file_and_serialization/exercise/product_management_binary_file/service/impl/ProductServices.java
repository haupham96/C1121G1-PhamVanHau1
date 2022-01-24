package ss17_io_binary_file_and_serialization.exercise.product_management_binary_file.service.impl;

import ss17_io_binary_file_and_serialization.exercise.product_management_binary_file.model.Product;
import ss17_io_binary_file_and_serialization.exercise.product_management_binary_file.service.IProductServices;
import ss17_io_binary_file_and_serialization.exercise.product_management_binary_file.util.ReadAndWriteBinaryFile;

import java.util.List;
import java.util.Scanner;

public class ProductServices implements IProductServices {
    Scanner scanner = new Scanner(System.in);
    final String PRODUCT_PATH = "src/ss17_io_binary_file_and_serialization/exercise/product_management_binary_file/data/Product.csv";
    @Override
    public void addProduct() {
        System.out.println("Input Product ID");
        String ID = scanner.nextLine();
        System.out.println("Input Product Name");
        String name = scanner.nextLine();
        System.out.println("Input Manufacturer");
        String manufacturer = scanner.nextLine();
        System.out.println("Input Price");
        int price = Integer.parseInt(scanner.nextLine());

        Product product = new Product(ID,name,manufacturer,price);
        List<Product> productList = ReadAndWriteBinaryFile.readBinaryFile(PRODUCT_PATH);
        productList.add(product);
        ReadAndWriteBinaryFile.writeBinaryFile(PRODUCT_PATH,productList);
    }

    @Override
    public void displayProductList() {
        List<Product> productList = ReadAndWriteBinaryFile.readBinaryFile(PRODUCT_PATH);
        for(Product list : productList){
            System.out.println(list);
        }
    }

    @Override
    public void findProduct() {
        List<Product> productList = ReadAndWriteBinaryFile.readBinaryFile(PRODUCT_PATH);
        System.out.println("Enter product Name to Find");
        String product = scanner.nextLine();
        for(int i=0;i< productList.size();i++){
            if(productList.get(i).getName().contains(product)){
                System.out.println(productList.get(i));
            }

        }
    }
}
