package ss14_sort_algorithms.practise;

import java.util.Arrays;

public class SelectionSort {
    static double[] list = {1, 9, 4.5, 6.6, 5.7, -4.5};
    public static void main(String[] args) {
//        selectionSort(list);
        Arrays.sort(list);
        for (int i = 0; i < list.length; i++)
            System.out.print(list[i] + " ");
    }
    public static void selectionSort(double[] list){

        for(int i=0;i<list.length-1;i++){
            double currentMin = list[i];
            int currentMinIndex = i;
            boolean check = false ;

            for(int  j=i+1;j< list.length;j++){
                if(currentMin>list[j]){
                    currentMin = list[j];
                    currentMinIndex=j;
                    check=true;
                }
            }
            if(check){
                list[currentMinIndex]=list[i];
                list[i]=currentMin;
            }
        }
    }
}
