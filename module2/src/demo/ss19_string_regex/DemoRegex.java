package ss19_string_regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DemoRegex {
    public static void main(String[] args) {
        //C0120G1 // C10
        // kiểm tra teen lớp học  ởowrcodegym
        // bắt đầu bằng chữ C hoặc A
        // Tiếp theo là 4 chữ số
        // tiếp theo là chữ G /I
         // tiếp theo là 1 chữ số
        // cách 1

        // validate email :
        // bắt đầu phải là 1 ký tự in thường
        // email chỉ chứa chữa và ố
        // độ dài email ít nhất 8 ký tự
        // chữ @
        // sau @ chuỗi có ít nhất 3 ký tự chữ in thường
        // dấu .
        // chuỗi ít nhất 2 ký tự
        String regex ="^[CA][0-9]{4}[GI][\\d]$";
        String className ="C1121G1";
        boolean check = className.matches(regex);
        System.out.println(check);
         // cách 2
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(className);
        boolean check2 = matcher.matches();
        System.out.println(check2);
        // cách 3
        boolean check3 = Pattern.matches(regex,className);
        System.out.println(check3);
    }
}
