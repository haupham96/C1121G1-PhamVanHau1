package ss2_java_loop.practise;

import java.util.Scanner;

public class CalculateInterestMoney {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double money = 1.0;
        int month = 1;
        double interestRate = 1.0;
        System.out.println("Enter invesment amount : ");
        money = input.nextDouble();
        System.out.println("Enter month");
        month = input.nextInt();
        System.out.println("Enter interest rate in percentage ");
        interestRate = input.nextDouble();
        double totalInterest = 0;
        for (int i = 0; i < month; i++) {
            totalInterest += money * (interestRate / 100) / 12 * month;
        }
        System.out.println("Total interest = "+totalInterest);
    }
}
