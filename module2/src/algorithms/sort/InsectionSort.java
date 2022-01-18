package algorithms.sort;

import java.util.Arrays;

public class InsectionSort {
    public static void main(String[] args) {
        int[] list = {2, 3, 2, 5, 6, 1, -2, 3, 14, 12};
        int position;
        int x;
        for (int i = 1; i < list.length; i++) {
            x = list[i];
            position = i;
            while (position > 0 && x < list[position - 1]) {
                list[position] = list[position - 1];
                position--;
            }
            list[position] = x;
        }
        System.out.println(Arrays.toString(list));
    }

}
