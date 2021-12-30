package ss2_java_loop.exercise;

import java.util.Scanner;

public class DisplayPrimeNumberLessThan100 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number;
        boolean check;
        int primeNumber = 2;
        String displayPrimeNumber = "";
        while (primeNumber < 100) {
            check = true;
            for (int i = 2; i <= Math.sqrt(primeNumber); i++) {
                if (primeNumber % i == 0) {
                    check = false;
                    break;
                }
            }
            if (check) {
                displayPrimeNumber += primeNumber + " , ";
            }
            primeNumber++;
        }
        System.out.println("Prime number less than 100 :");
        System.out.println(" ");
        System.out.print(displayPrimeNumber);
        System.out.println(" ");
    }
}
