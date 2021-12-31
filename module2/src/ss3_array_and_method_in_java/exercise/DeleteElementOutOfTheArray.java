package ss3_array_and_method_in_java.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class DeleteElementOutOfTheArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = {10, 4, 6, 6, 6, 6, 7, 0, 0};
        System.out.println("enter value to delete");
        int deleteValue = scanner.nextInt();
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] == deleteValue) {
                for (int j = i; j < array.length - 1; j++) {
                    array[j] = array[j + 1];
                }
                i--;
            }
        }
        System.out.println("Array after delete  " + Arrays.toString(array));
    }
}
