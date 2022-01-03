package ss3_array_and_method_in_java.exercise;

import java.util.Scanner;

public class ArrayDiagonalSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of rows ");
        int rows = scanner.nextInt();
        System.out.println("Enter number of columns ");
        int columns = scanner.nextInt();
        int[][] matrix = new int[rows][columns];
        int sumDiagonal = 0;
        String displayMatrix = "";
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.println("Enter matrix rows " + i + " And columns " + j);
                matrix[i][j] = scanner.nextInt();
                displayMatrix += matrix[i][j] + " , ";
            }
            displayMatrix += "\n";
        }
        System.out.println(displayMatrix);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i == j) {
                    sumDiagonal += matrix[i][j];
                }
                if (i == matrix.length - (j + 1)) {
                    sumDiagonal += matrix[i][j];
                }
            }
        }
        System.out.println("Values of the Diagonal :" + sumDiagonal);
    }
}
