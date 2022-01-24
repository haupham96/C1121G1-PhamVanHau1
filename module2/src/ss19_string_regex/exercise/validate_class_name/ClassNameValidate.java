package ss19_string_regex.exercise.validate_class_name;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClassNameValidate {
    private final String CLASS_NAME_REGEX = "^([C|A|P])[0-9]{4}([G|H|I|K|L|M])$";

    public ClassNameValidate(){};

    public boolean checkClassNameValidate(String className){
        Pattern pattern = Pattern.compile(CLASS_NAME_REGEX);
        Matcher matcher = pattern.matcher(className);
        return matcher.matches();
    }
    public static void main(String[] args) {
        ClassNameValidate classNameValidate = new ClassNameValidate();
        Scanner scanner = new Scanner(System.in);
        String[] className = {"C0318G", "M0318G", "P0323A"};

        for (String c : className) {
            boolean check = classNameValidate.checkClassNameValidate(c);
            System.out.println("Class : " + c + " is " + check);
        }

    }

}
