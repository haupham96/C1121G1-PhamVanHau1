package ss15_handle_exception_debug.practice;

import java.util.Random;
import java.util.Scanner;

public class ArrayIndexOutOfBoundsException {
    public Integer[] createRandom(){
        Random rd = new Random();
        Integer[] arr = new Integer[100];
        System.out.println("Array elements :");
        for(int i=0;i<100;i++){
            arr[i]= rd.nextInt(100);
            System.out.println(arr[i]+" ");
        }
        return arr;
    }

    public static void main(String[] args) {
        ArrayIndexOutOfBoundsException arrExample = new ArrayIndexOutOfBoundsException();
        Integer[] arr = arrExample.createRandom();

        Scanner scanner = new Scanner(System.in);
        System.out.println("\nInput index off random element: ");
        int x = scanner.nextInt();

        try{
            System.out.println("value of element index : " + x + " is " + arr[x]);
        }catch (IndexOutOfBoundsException e){
            System.err.println("Out Of Array Bounds");
        }


    }
}
