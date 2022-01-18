package algorithms.search;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 3, 6, 9, 10, 22, 30};
        System.out.println(binarySearch(arr,3));
    }

    public static int binarySearch(int[] arr,int value) {
        int first = 0;
        int last = arr.length - 1;
        while (first <= last){
            int mid=(first+last)/2;
            if(arr[mid]==value){
                return mid;
            } else if(arr[mid]>value){
                last = mid-1;
            } else {
                first = mid+1;
            }
        }
        return -1;
    }
}
