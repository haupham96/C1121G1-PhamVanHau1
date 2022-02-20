package test.c09.util.regex;

import java.util.Scanner;

public class Regex {
    public static final String THOI_GIAN_BAO_HANH = "^[0-9]+$";
    public static final String SO_DUONG = "^[0-9]*$";
    public static final String STRING = "^[a-zA-Z][a-zA-Z0-9]*$";
    public static final String QUOC_GIA_XACH_TAY = "^(^(Viet Nam))[A-Za-z]+$";

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

    public static String regexThoiGianBaoHanh(String string, String regex, String messageError) {
        Scanner scanner = new Scanner(System.in);
        boolean check = true;
        do {
            try{
                if (string.matches(regex) && Integer.parseInt(string) <= 730) {
                    break;
                } else {
                    System.out.println(messageError);
                    string = scanner.nextLine();
                }
            }catch (Exception e){
                System.out.println("vui lòng nhập số");
            }

        } while (check);
        return string;
    }
}
