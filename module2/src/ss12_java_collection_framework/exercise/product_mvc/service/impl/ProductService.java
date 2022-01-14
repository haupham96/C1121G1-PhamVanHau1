package ss12_java_collection_framework.exercise.product_mvc.service.impl;

import ss12_java_collection_framework.exercise.product_mvc.product.Product;
import ss12_java_collection_framework.exercise.product_mvc.service.IProductService;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ProductService implements IProductService {
    Scanner scanner = new Scanner(System.in);
    public static ArrayList<Product> listProducts = new ArrayList<>();

    static {
        Product product1 = new Product(1, "Apple", 30000);
        Product product2 = new Product(2, "Mango", 21000);
        Product product3 = new Product(3, "Banana", 15000);
        Product product4 = new Product(4, "Orange", 13000);
        Product product5 = new Product(5, "Potato", 20000);
        listProducts.add(product1);
        listProducts.add(product2);
        listProducts.add(product3);
        listProducts.add(product4);
        listProducts.add(product5);
    }
    @Override
    public void add() {
        boolean check = true;
        System.out.println("Enter Product ID ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter product Name");
        String name = scanner.nextLine();
        System.out.println("Enter Product Price");
        int price = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < listProducts.size(); i++) {
            if (id == listProducts.get(i).getId()) {
                check = false;
                break;
            }
        }
        if (check) {
            Product product = new Product(id, name, price);
            listProducts.add(product);
            System.out.println("Adding Successful");
        } else {
            System.out.println("ID Already Exist ! ");
        }
    }

    @Override
    public void editByID() {
        System.out.println("Enter ID to Edit ");
        int id = Integer.parseInt(scanner.nextLine());
        boolean checkEdit = false;
        for (int i = 0; i < listProducts.size(); i++) {
            if (id == listProducts.get(i).getId()) {
                checkEdit = true;
                System.out.println("Enter Name to edit");
                String editName = (scanner.nextLine());
                System.out.println("Enter Price to edit");
                int editPrice = Integer.parseInt(scanner.nextLine());
                listProducts.get(i).setName(editName);
                listProducts.get(i).setPrice(editPrice);
                System.out.println("Edit Successful");
                break;
            }
        }
        if (!checkEdit) {
            System.out.println("INVALID ID");
        }
    }


    @Override
    public void display() {
        for (Product product : listProducts) {
            System.out.println(product);
        }
    }

    @Override
    public void searchByName() {
        boolean checkSearch = false;
        System.out.println("Enter Product Name ");
        String name = scanner.nextLine();
        for (int i = 0; i < listProducts.size(); i++) {
            if (listProducts.get(i).getName().equals(name)) {
                System.out.println(listProducts.get(i));
                checkSearch = true;
                break;
            }

        }
        if (!checkSearch) {
            System.out.println("INVALID Product Name ");
        }
    }

    @Override
    public void deleteByID() {
        System.out.println("Enter ID to Edit ");
        int id = Integer.parseInt(scanner.nextLine());
        boolean checkDeleteID = false;
        for (int i = 0; i < listProducts.size(); i++) {
            if (listProducts.get(i).getId() == id) {
                System.out.println(" Delete Successful " + listProducts.get(i).getName());
                listProducts.remove(i);
                checkDeleteID = true;
                break;
            }
        }
        if (!checkDeleteID) {
            System.out.println("INVALID ID");
        }
    }

    @Override
    public void sortByPriceIncrease(){
        Collections.sort(listProducts);
        display();
    }


}
