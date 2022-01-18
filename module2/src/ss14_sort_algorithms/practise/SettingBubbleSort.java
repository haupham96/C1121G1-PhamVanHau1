package ss14_sort_algorithms.practise;

public class SettingBubbleSort {
    static int[] list = {2, 3, 2, 5, 6, 1, -2, 3, 14, 12};

    public static void bubbleSort(int[] list) {
        boolean check = true;
        for (int i = 0; i < list.length && check; i++) {
            check = false;
            for (int j = 0; j < list.length - i-1; j++) {
                if (list[j] > list[j + 1]) {
                    int temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;
                    check = true;
                }
            }
        }
    }

    public static void main(String[] args) {
        bubbleSort(list);
        for(int element:list){
            System.out.print(element+" , ");
        }
    }
}
