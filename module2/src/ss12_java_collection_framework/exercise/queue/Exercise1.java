package ss12_java_collection_framework.exercise.queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        int firstNumber = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many times you wanna play ?");
        int times = scanner.nextInt();
        for (int i = 0; i < times; i++) {
            firstNumber = queue.remove();
            queue.add(firstNumber);
            queue.add(firstNumber);
        }
        if (times == 0) {
            firstNumber = queue.peek();
        }
        System.out.println(firstNumber);
    }
}
