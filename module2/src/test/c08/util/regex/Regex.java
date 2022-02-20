package test.c08.util.regex;

import java.util.Scanner;

public class Regex {
    public static final String SO_DUONG = "^[1-9][0-9]*$";
    public static final String MA_TK = "^[0-9]+$";
    public static final String STRING = "^[a-zA-Z][\\s]*[a-zA-Z0-9]*$";
    public static final String DATE_LEAP_YEAR = "^(?:(?:31(\\/|-|\\.)(?:0?[13578]|1[02]))\\1|(?:(?:29|30)(\\/|-|\\.)(?:0?[13-9]|1[0-2])\\2))(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$|^(?:29(\\/|-|\\.)0?2\\3(?:(?:(?:1[6-9]|[2-9]\\d)?(?:0[48]|[2468][048]|[13579][26])|(?:(?:16|[2468][048]|[3579][26])00))))$|^(?:0?[1-9]|1\\d|2[0-8])(\\/|-|\\.)(?:(?:0?[1-9])|(?:1[0-2]))\\4(?:(?:1[6-9]|[2-9]\\d)?\\d{4})$";



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
