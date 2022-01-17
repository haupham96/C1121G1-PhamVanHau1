package ss13_searching_algorithms.exercise;

import java.util.ArrayList;
import java.util.Scanner;

public class ContinuousStringWithMaxLength {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter String");
        String string = scanner.nextLine();

        ArrayList<Character> maxSize = new ArrayList<>();

        for (int i = 0; i < string.length(); i++) {
            ArrayList<Character> temp = new ArrayList<>();
            temp.add(string.charAt(i));
            for (int j = i + 1; j < string.length(); j++) {
                if (string.charAt(j) > temp.get(temp.size() - 1)) {
                    temp.add(string.charAt(j));
                } else {
                    break;
                }
            }
            if (temp.size() > maxSize.size()) {
                maxSize.clear();
                maxSize.addAll(temp);
            }
            temp.clear();
        }

        for (char list : maxSize) {
            System.out.print(list);
        }

    }
}
