package ss1_introduction_to_java.thuc_hanh;

import java.util.Scanner;

public class GiaiPhuongTrinhBacNhat {
    public static void main(String[] args) {
        System.out.println("Giải PT bậc nhất");
        Scanner scanner = new Scanner(System.in);
        System.out.print("a : ");
        double a = scanner.nextDouble();
        System.out.print("b : ");
        double b = scanner.nextDouble();
        System.out.println("c : ");
        double c = scanner.nextDouble();
        if (a != 0) {
            double result = (c - b) / a;
            System.out.printf("PT có nghiệm x=%f!\n", result);
        } else {
            if (b == c) {
                System.out.println("phương trình có vô số nghiệm");
            } else {
                System.out.println("phương trình vô nghiệm");
            }
        }


    }
}
