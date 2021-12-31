package ss3_array_and_method_in_java.exercise;

import java.util.Scanner;

public class SumValuesOfRandomRowInMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter rows of matrix ");
        int rows = scanner.nextInt();
        System.out.println("Enter columns of matrix ");
        int columns = scanner.nextInt();
        int[][] matrix = new int[rows][columns];
        String displayMatrix = "";
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.println("Enter value at row : " + i + " columns " + j);
                matrix[i][j]= scanner.nextInt();
            }
        }
        for(int i = 0 ;i< matrix.length;i++){
            for(int j = 0 ; j< matrix[i].length;j++){
                displayMatrix+=matrix[i][j]+" , ";
            }
            displayMatrix+="\n";
        }
        System.out.println("All values of the matrix :");
        System.out.println(displayMatrix);
        int sum = 0;
        System.out.println("Enter row index to sum all the values ");
        int rowSum = scanner.nextInt();
        for (int j = 0; j < matrix[rowSum].length; j++) {
            sum += matrix[rowSum][j];
        }
        System.out.println("Total value of row " + rowSum + " = " + sum);
    }
}
