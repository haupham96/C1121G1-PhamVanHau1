package ss11_stack_queue.exercise.palindrome_queue;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        String string = "Able was I ere I saw Elba";
        string = string.toLowerCase(Locale.ROOT);
        String[] array = string.split("");

        Stack<String> stack = new Stack<>();
        Queue<String> queue = new LinkedList<>();

        for (int i = 0; i < array.length; i++) {
            stack.push(array[i]);
            queue.add(array[i]);
        }

        boolean check = true;
        for (int i = 0; i < array.length; i++) {
            if (!stack.pop().equals(queue.remove())) {
                check = false;
                break;
            }
        }
        if(check){
            System.out.println("is palindrome");
        } else {
            System.out.println("Not a palindrome");
        }

    }
}
