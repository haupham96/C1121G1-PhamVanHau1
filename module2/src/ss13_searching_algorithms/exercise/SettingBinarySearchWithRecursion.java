package ss13_searching_algorithms.exercise;

import algorithms.search.BinarySearch;

public class SettingBinarySearchWithRecursion {
    public static void main(String[] args) {
        int[] arr = {1, 3, 6, 9, 10, 22, 30};
        System.out.println(binarySearch(arr,0, arr.length-1,6 ));
    }
    public static int binarySearch(int[] array, int left, int right, int value) {
        for (int i = 0; i < array.length; i++) {
            int mid = (right + left) / 2;
            if (array[mid] == value) {
                return mid;
            } else if (array[mid] > value) {
                right = mid - 1;
                binarySearch(array, left, right, value);
            } else {
                left = mid + 1;
                binarySearch(array, left, right, value);
            }
        }
        return -1;
    }
}
