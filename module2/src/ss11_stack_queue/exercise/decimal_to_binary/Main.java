package ss11_stack_queue.exercise.decimal_to_binary;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        int binary = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Binary number");
        int decimal = Integer.parseInt(scanner.nextLine());

        do {
            stack.push(decimal%2);
            decimal = decimal / 2;

        } while (decimal > 0);

        System.out.print("Binary code = ");
        while (!stack.isEmpty()) {
            System.out.print(stack.pop());
        }

    }
}
