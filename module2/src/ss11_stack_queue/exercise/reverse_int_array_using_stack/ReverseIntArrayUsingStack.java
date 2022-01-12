package ss11_stack_queue.exercise.reverse_int_array_using_stack;

import java.util.Stack;

public class ReverseIntArrayUsingStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        int[] array = {1,2,3,4,5};

        for(int i=0;i<array.length;i++){
            stack.push(array[i]);
            array[i]=0;
        }
        System.out.println("before stack");
        for(Integer element : stack){
            System.out.print(element+"\t");
        }
        System.out.println();

        System.out.println("before array");
        for(Integer arr : array){
            System.out.print(arr+"\t");
        }

        System.out.println();
        int stackSize = stack.size();
        for(int i=0;i< stackSize;i++){
            array[i]=stack.pop();
        }
        System.out.println();
        System.out.println("after stack");
        for(Integer element : stack){
            System.out.print(element+"\t");
        }
        System.out.println();
        System.out.println("after array");
        for(Integer arr : array){
            System.out.print(arr+"\t");
        }




    }

}
