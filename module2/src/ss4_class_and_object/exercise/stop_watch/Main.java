package ss4_class_and_object.exercise.stop_watch;

public class Main {
    public static void main(String[] args) {

        int[] array = new int[100000];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 1000);
        }
        System.out.println(selctionSort(array));
    }

    public static long selctionSort(int[] array) {
        StopWatch stopWatch = new StopWatch();
        long starTime = stopWatch.start();
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 1 + i; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        long endTime = stopWatch.stop();
        return stopWatch.getElapsedTime();
    }
}
