package ss3_array_and_method_in_java.practise;

import java.util.Scanner;

public class CountNumberOfQualifiedStudents {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;
        do {
            System.out.println("Enter size ");
            size = scanner.nextInt();
            if (size > 30) {
                System.out.println("Size is not exceed 30");
            }
        } while (size > 30);
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter mark of student" + (i + 1));
            array[i]=scanner.nextInt();
        }
        int count = 0;
        for(int i=0;i< array.length;i++){
            if(array[i]>=5 && array[i]<=10){
                count+=1;
            }
        }
        System.out.println("Number of passed student : "+count);
    }
}
