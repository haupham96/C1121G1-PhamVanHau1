package ss13_searching_algorithms.practice.algorithm_complexsity_calculate;

import ss13_searching_algorithms.practice.setting_binary_search.BinarySearch;

import java.util.Scanner;

public class AlgorithmComplexityTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter sting : ");
        String inputString = scanner.nextLine();
        int[] freequenceChar = new int[255];
        for (int i = 0; i < inputString.length(); i++) {
            int ascii = (int) inputString.charAt(i);
            freequenceChar[ascii] += 1;
        }
        int max = 0;
        char character = (char) 255;
        for (int i = 0; i < 255; i++) {
            if (freequenceChar[i] > max) {
                max = freequenceChar[i];
                character =(char) i;
            }
        }
        System.out.println("most appearing : "+character+" , which is "+max+" times ");
    }
}
