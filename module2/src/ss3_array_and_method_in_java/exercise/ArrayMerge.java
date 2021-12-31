package ss3_array_and_method_in_java.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayMerge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       int[] array1={1,2,3,4,5};
       int[] array2={6,7,8,9,10,11};
       int[] array3=new int[(array1.length)+(array2.length)];

            for(int j = 0 ;j< array1.length;j++){
                array3[j]=array1[j];
            }
            int h = array1.length;
            for(int k=0;k< array2.length;k++){
                array3[h+k]=array2[k];
            }
        System.out.println("Array3 = "+Arrays.toString(array3));
    }
}
