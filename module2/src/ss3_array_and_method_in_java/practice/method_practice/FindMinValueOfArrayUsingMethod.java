package ss3_array_and_method_in_java.practice.method_practice;

import java.util.Scanner;

public class FindMinValueOfArrayUsingMethod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = {1,5,3,4,7};
        int index = minValue(array) ;
        System.out.println("Min value is "+array[index]);
    }
    public static int minValue(int[] array){
        int index =0 ;
        for(int i=0;i<array.length;i++){
            if(array[i]<array[index]){
                index = i ;
            }
        }
        return index ;
    }
}
