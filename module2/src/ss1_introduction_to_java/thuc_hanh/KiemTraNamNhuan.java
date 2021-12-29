package ss1_introduction_to_java.thuc_hanh;

import java.util.Arrays;
import java.util.Scanner;

public class KiemTraNamNhuan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year;
        System.out.println("Enter year : ");
        year = scanner.nextInt();

        boolean isLeapYear = false;

        boolean divisionBy4 = year % 4 == 0;
        if (divisionBy4) {
            boolean divisionBy100 = year % 100 == 0;
            if (divisionBy100) {
                boolean divisionBy400 = year % 400 == 0;
                if (divisionBy400) {
                    isLeapYear = true;
                }
            } else {
                isLeapYear = true;
            }
        }

        if (isLeapYear) {
            System.out.printf("%d is a Leap year ", year);
        } else {
            System.out.printf("%d is NOT a Leap year ", year);
        }
    }
}
