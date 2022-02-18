package test.c10.util.regex;

import java.util.Scanner;

public class Regex {

    public static final String SO_DUONG = "^[0-9]*(\\.[0-9]+)?$";
    public static final String STRING = "^[a-zA-Z][a-zA-Z0-9]*$";

    public static String regexData(String string, String regex, String messageError) {
        Scanner scanner = new Scanner(System.in);
        boolean check = true;
        do {
            if (string.matches(regex)) {
                break;
            } else {
                System.out.println(messageError);
                string = scanner.nextLine();
            }
        } while (check);
        return string;
    }
}
