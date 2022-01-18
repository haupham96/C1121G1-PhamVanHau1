package ss14_sort_algorithms.practise;

import java.util.Scanner;

public class BubbleSortByStep {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter list size:");
        int size = scanner.nextInt();
        int[] list = new int[size];
        System.out.println("Enter " + list.length + " values:");
        for (int i = 0; i < list.length; i++) {
            list[i] = scanner.nextInt();
        }
        System.out.print("Your input list: ");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + "\t");
        }
        System.out.println("\nBegin sort processing...");

        bubbleSortByStep(list);
    }

    public static void bubbleSortByStep(int[] list) {
        boolean check = true;
        for (int i = 0; i < list.length && check; i++) {
            check = false;
            for (int j = 0; j < list.length - i-1; j++) {
                if (list[j] > list[j + 1]) {
                    int temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;
                    check = true;
                }
            }
            if (!check) {
                System.out.println("no need to sort");
                break;
            }
        }
        for (int element : list) {
            System.out.print(element + " , ");
        }
        System.out.println();
    }
}
