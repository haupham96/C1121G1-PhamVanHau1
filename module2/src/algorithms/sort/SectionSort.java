package algorithms.sort;

import java.util.Arrays;

public class SectionSort {
    public static void main(String[] args) {
        int[] list = {2, 3, 2, 5, 6, 1, -2, 3, 14, 12};
        int position;
        int min;
        boolean check;
        for (int i = 0; i < list.length; i++) {
            position = i;
            min = list[i];
            check = false;
            for (int j = i + 1; j < list.length; j++) {
                if (min > list[j]) {
                    position = j;
                    min = list[j];
                    check = true;
                }
            }
            if (check) {
                list[position] = list[i];
                list[i] = min;
            }
        }
        System.out.println(Arrays.toString(list));
    }
}
