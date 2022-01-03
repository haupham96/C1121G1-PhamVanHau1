package ss3_array_and_method_in_java.exercise;

import java.util.Scanner;

public class CountOccurrencesOfChar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = "abcdaefab";
        char input = 'a';
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == input) {
                count += 1;
            }
        }
        System.out.println(input + " has appeared " + count + " times ");
    }
}
