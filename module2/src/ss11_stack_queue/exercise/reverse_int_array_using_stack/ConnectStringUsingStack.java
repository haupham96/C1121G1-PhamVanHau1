package ss11_stack_queue.exercise.reverse_int_array_using_stack;

import java.util.Scanner;
import java.util.Stack;

public class ConnectStringUsingStack {
    public static void main(String[] args) {
        Stack<String> wStack = new Stack<>();
        Scanner scanner = new Scanner(System.in);

        String mWord;
        do {
            System.out.println("Enter String");
            mWord = scanner.nextLine();
            wStack.push(mWord);

        } while (!mWord.equals("Stop"));
        wStack.pop();


        String output = "";

        for (String element : wStack) {
            System.out.print("Stack : ");
            System.out.print(element+"\n");
            output += element + " ";
        }
        System.out.println("Output : "+output);


    }
}
