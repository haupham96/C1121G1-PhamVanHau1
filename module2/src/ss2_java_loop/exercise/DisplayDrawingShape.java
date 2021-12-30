package ss2_java_loop.exercise;

import java.util.Scanner;

public class DisplayDrawingShape {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1. Print Rectangle");
        System.out.println("2.Print the square triangle ");
        System.out.println("3.Print the isosceles triangle ");
        System.out.println("4.Exit");
        int choice;
        System.out.println("Enter your choice ");
        choice = scan.nextInt();
        while (choice != 4) {
            switch (choice) {
                case 1:
                    System.out.println("1. Print Rectangle");
                    for (int i = 1; i <= 3; i++) {
                        System.out.println("* * * * * *");
                    }
                    System.out.println("Enter your choice ");
                    choice = scan.nextInt();
                    break;
                case 2:
                    System.out.println("2.Print the square triangle ");
                    int choice2;
                    System.out.println("Enter angles:");
                    System.out.println("1. top - left");
                    System.out.println("2. top - right");
                    System.out.println("3. bottom - left");
                    System.out.println("4. bottom - right");
                    choice2 = scan.nextInt();
                    switch (choice2) {
                        case 1:
                            System.out.println("1. top - left");
                            for (int i = 0; i < 5; i++) {
                                for (int j = 5; j > i; j--) {
                                    System.out.print(" * ");
                                }
                                System.out.print("\n");
                            }
                            break;
                        case 2:
                            System.out.println("2. top - right");
                            for (int i = 0; i < 5; i++) {
                                for (int j = 0; j < i; j++) {
                                    System.out.print(" ");
                                }
                                for (int k = 5; k > i; k--) {
                                    System.out.print("*");
                                }
                                System.out.print("\n");
                            }
                            break;
                        case 3:
                            System.out.println("3. bottom - left");
                            for (int i = 5; i > 0; i--) {
                                for (int j = 5; j >= i; j--) {
                                    System.out.print("*");
                                }
                                System.out.print("\n");
                            }
                            break;
                        case 4:
                            System.out.println("4. bottom - right");
                            for (int i = 0; i < 5; i++) {
                                for (int j = 5; j > i; j--) {
                                    System.out.print(" ");
                                }
                                for (int k = 0; k <= i; k++) {
                                    System.out.print("*");
                                }
                                System.out.print("\n");
                            }
                            break;
                    }
                    System.out.println("Enter your choice ");
                    choice = scan.nextInt();
                case 3:
                    System.out.println("3.Print the isosceles triangle ");
                    for (int i = 1; i <= 5; i++) {
                        for (int j = 5; j >= i; j--) {
                            System.out.print(" ");
                        }
                        for (int k = 0; k < i * 2 - 1; k++) {
                            System.out.print("*");
                        }
                        System.out.print("\n");
                    }
                    System.out.println("Enter your choice ");
                    choice = scan.nextInt();

            }
        }
    }

}
