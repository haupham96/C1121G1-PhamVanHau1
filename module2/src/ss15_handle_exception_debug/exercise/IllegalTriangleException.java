package ss15_handle_exception_debug.exercise;

import java.util.InputMismatchException;
import java.util.Scanner;

public class IllegalTriangleException {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("side a :");
        int sideA = scanner.nextInt();

        System.out.println("side b :");
        int sideB = scanner.nextInt();

        System.out.println("side c :");
        int sideC = scanner.nextInt();

        if (sideA < 0 || sideB < 0 || sideC < 0 ||
                sideA + sideB < sideC ||
                sideB + sideC < sideA ||
                sideA + sideC < sideB) {

            throw new InputMismatchException("Invalid Input: " + " A= " + sideA + " , B = " + sideB + " , C = " + sideC);
        }
        System.out.println("Triangle");
        System.out.println("A = " + sideA);
        System.out.println("B = " + sideB);
        System.out.println("C = " + sideC);


    }

}
