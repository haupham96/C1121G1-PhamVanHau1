package ss2_java_loop.practise;

import java.util.Scanner;

public class GreatestCommonFactor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a;
        int b;
        System.out.println("Enter a ");
        a = scan.nextInt();
        System.out.println("Enter b ");
        b = scan.nextInt();
        a = Math.abs(a);
        b = Math.abs(b);

        if (a == 0 || b == 0) {
            System.out.println("No greatest common factor ");

        }
        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        System.out.println("Greatest common factor :" + a);


    }
}
