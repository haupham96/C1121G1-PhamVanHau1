package ss14_sort_algorithms.exercise;

import java.util.Arrays;

public class UsingInsectionSort {
    static int[] list = {2, 3, 2, 5, 6, 1, -2, 3, 14, 12};

    public static void main(String[] args) {
        int sortValue;
        int position;
        for (int i = 1; i < list.length; i++) {
            position = i;
            sortValue = list[i];
            // nếu phần tử pos-1 > pos
            // dịch chuyển mảng về bên trái và chèn phần tử cần sắp xếp vào
            while (position > 0 && sortValue < list[position - 1]) {
                list[position] = list[position - 1];
                position--;
            }
            list[position]=sortValue;

        }

        System.out.println(Arrays.toString(list));
    }
}
