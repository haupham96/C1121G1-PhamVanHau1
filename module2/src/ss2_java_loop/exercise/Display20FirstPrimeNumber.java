package ss2_java_loop.exercise;

import java.util.Scanner;

public class Display20FirstPrimeNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number;
        System.out.println("Enter number of Prime numbers to print :");
        number = scan.nextInt();
        boolean check;
        int count = 0;
        int primeNumber = 2;
        String displayPrimeNumber = "";
        while (count < number) {
            check = true;
            for (int i = 2; i <= Math.sqrt(primeNumber); i++) {
                if (primeNumber % i == 0) {
                    check = false;
                    break;
                }
            }
            if (check) {
                displayPrimeNumber += primeNumber + " , ";
                count++;
            }
            primeNumber++;
        }
        System.out.print(displayPrimeNumber);
    }
}
