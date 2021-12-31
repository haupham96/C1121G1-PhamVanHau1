package ss3_array_and_method_in_java.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class FindMaxValueOfMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of rows :");
        int rows = scanner.nextInt();
        System.out.println("Enter number of columns :");
        int columns = scanner.nextInt();
        int[][] matrix = new int[rows][columns];
        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[r].length; c++) {
                System.out.println("Enter matrix at row :" + r + " Columns : " + c);
                matrix[r][c] = scanner.nextInt();
            }
        }

        String displayMatrix = "";
        for (int h = 0; h < matrix.length; h++) {
            for (int k = 0; k < matrix.length; k++) {
                displayMatrix += matrix[h][k] + " , ";
            }
            displayMatrix+="\n";
        }
        System.out.print("All value of the Matrix : " + "\n" + displayMatrix + "\n");

        int max = matrix[0][0];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                }
            }
        }
        System.out.println("Maxvalue of the Matrix = " + max);
    }
}
