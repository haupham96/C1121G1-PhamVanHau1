package ss17_io_binary_file_and_serialization.exercise.product_management_binary_file.controller;

import ss17_io_binary_file_and_serialization.exercise.product_management_binary_file.service.impl.ProductServices;

import java.util.Scanner;

public class MainMenu {
    Scanner scanner = new Scanner(System.in);
    ProductServices productServices = new ProductServices();

    public void displayMainMenu() {
        int choice;
        do {
            System.out.println("");
            System.out.println("PRODUCT CONTROL SYSTEM");
            System.out.println("1. Add new Product");
            System.out.println("2. Display Product list");
            System.out.println("3. find Product in list");
            System.out.println("4. Exit");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("ADD NEW PRODUCT");
                    productServices.addProduct();
                    break;

                case 2:
                    System.out.println("DISPLAY PRODUCT LIST");
                    productServices.displayProductList();
                    break;
                case 3:
                    System.out.println("FIND PRODUCT");
                    productServices.findProduct();
                    break;
                case 4:
                    System.exit(0);
            }
        } while (true);

    }
}
