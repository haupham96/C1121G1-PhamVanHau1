package ss12_java_collection_framework.exercise.arraylist_mvc.product_control;

import ss12_java_collection_framework.exercise.arraylist_mvc.product.ProductService;

import java.util.Scanner;


public class Controller {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ProductService productService = new ProductService();
        int choice;
        do {
            System.out.println();
            System.out.println("Main Service Board");
            System.out.println("1. Add new Product");
            System.out.println("2. Edit Product By ID ");
            System.out.println("3. Delete Product By ID");
            System.out.println("4. Display Product List");
            System.out.println("5. Search By Product-Name");
            System.out.println("6. Sort by Price increasing ");
            System.out.println("7. Exit !" + "\n");

            System.err.println("Enter your choice ");
            choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    System.out.println("Add new Product");
                    System.out.println();
                    productService.add();
                    break;
                case 2:
                    System.out.println("Edit Product By ID");
                    System.out.println();
                    productService.editByID();
                    break;
                case 3:
                    System.out.println("Delete Product By ID");
                    System.out.println();
                    productService.deleteByID();
                    break;
                case 4:
                    System.out.println("Display Product List");
                    System.out.println();
                    ProductService.display();
                    break;
                case 5:
                    System.out.println("Search By Product-Name");
                    System.out.println();
                    productService.searchByName();
                    break;
                case 6:
                    System.out.println("Sort by Price increasing");
                    System.out.println();
                    break;
                case 7:
                    System.err.println("GOODBYE !");
                    System.exit(0);
                default:
                    System.out.println("Invalid Choice (1 - 7 Only )!");
                    break;
            }
        }
        while (choice != 7);

    }
}
