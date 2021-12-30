package ss3_array_and_method_in_java.practise;

import java.util.Scanner;

public class ReverseElementsOfTheArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size;
        int[] array;
        do {
            System.out.println("Enter size");
            size = scan.nextInt();
            if (size > 20) {
                System.out.println("Size does not exceed 20");
            }
        } while (size > 20);
        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.println("Enter element " + (i + 1) + " : ");
            array[i] = scan.nextInt();
            i++;
        }
        System.out.printf("%-20s%s", "Elements in array : ", "");
        for (int j = 0; j < array.length; j++) {
            System.out.println(array[j] + "\t");
        }
        for (int j = 0; j < array.length / 2; j++) {
            int temp = array[j];
            array[j] = array[size - 1 - j];
            array[size - 1 - j] = temp;
        }
        System.out.printf("\n%-20s%s", "Reverse the array:", "");
        for (int j = 0; j < array.length; j++) {
            System.out.println(array[j] + "\t");
        }
    }
}
