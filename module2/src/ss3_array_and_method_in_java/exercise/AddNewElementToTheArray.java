package ss3_array_and_method_in_java.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class AddNewElementToTheArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = {10, 4, 6, 7, 8, 0, 0, 0, 0, 0};
        System.out.println("Enter value to add :");
        int addValue = scanner.nextInt();
        System.out.println("Enter index to add :");
        int index = scanner.nextInt();
        if (index <= -1 || index >= array.length - 1) {
            System.out.println("No no no !");
        } else {
            for (int i = array.length - 1; i >= index + 1; i--) {
                for (int j = i - 1; j >= index; j--) {
                    array[i] = array[j];
                    i--;
                }
                array[index] = addValue;
            }
            System.out.println("Array after add new value : " + Arrays.toString(array));
        }

    }
}
