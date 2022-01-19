package ss15_handle_exception_debug.practice;

import java.util.Scanner;

public class NumberFormatException {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hãy nhập x: ");
        int x = scanner.nextInt();
        System.out.println("Hãy nhập y: ");
        int y = scanner.nextInt();

        NumberFormatException calc = new NumberFormatException();
        calc.calculate(x,y);

    }
    public void calculate(int x,int y){
        try {
            int a = x + y;
            int b = x - y;
            int c = x * y;
            int d = x / y;
            System.out.println("Sum x + y = " + a);
            System.out.println("Sub x - y = " + b);
            System.out.println("Multi x * y = " + c);
            System.out.println("Div x / y = " + d);
        }catch (Exception e){
            System.err.println("Exception : "+e.getMessage());
        }

    }
}
