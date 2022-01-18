package ss14_sort_algorithms.exercise;

public class InsectionSort {
    static int[] list = {2, 3, 2, 5, 6, 1, -2, 3, 14, 12};

    public static void main(String[] args) {
        insectionSort(list);
        for (int sort : list) {
            System.out.print(sort + " ");
        }
    }

    public static void insectionSort(int[] array) {
        int position;
        int x;
        for (int i = 1; i < array.length; i++) {
            x = array[i];
            position = i;

            while (position > 0 && x < array[position - 1]) {
                array[position] = array[position - 1];
                position--;
            }

            array[position] = x;
        }

    }
}
