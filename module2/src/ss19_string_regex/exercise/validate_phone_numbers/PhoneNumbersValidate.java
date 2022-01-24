package ss19_string_regex.exercise.validate_phone_numbers;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumbersValidate {
    private static final String PHONE_NUMBER_REGEX ="^([(][0-9]{2}[)])[-]([(][0-9]{10}[)])$";

    public PhoneNumbersValidate(){}

    public boolean checkPhoneNumber(String phoneNumber){
        Pattern pattern = Pattern.compile(PHONE_NUMBER_REGEX);
        Matcher matcher = pattern.matcher(phoneNumber);
        return matcher.matches();
    }

    public static void main(String[] args) {
        PhoneNumbersValidate phoneNumbersValidate = new PhoneNumbersValidate();
        String[] phoneNumbers = {"(84)-(0978489648)","(a8)-(22222222)"};
        System.out.println(phoneNumbersValidate.checkPhoneNumber(phoneNumbers[0]));
        System.out.println(phoneNumbersValidate.checkPhoneNumber(phoneNumbers[1]));
    }
}
