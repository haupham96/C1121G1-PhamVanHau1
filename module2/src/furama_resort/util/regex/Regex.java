package furama_resort.util.regex;

import furama_resort.util.exception.user_input_exception.UserInputException;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Regex {

    public static final String NAME_OF_VILLA = "^SVVL-[0-9]{4}$";
    public static final String NAME_OF_HOUSE = "^SVHO-[0-9]{4}$";
    public static final String NAME_OF_ROOM = "^SVRO-[0-9]{4}$";

    public static final String TYPE_OF_SERVICE = "^[A-Z][a-z]+$";
    public static final String AREA = "^[0-9]*[1-9]+[\\.]?[0-9]*$";
    public static final String MONEY = "^[1-9]+[0-9]*$";
    public static final String NUMBER_OF_PERSON = "^(0[1-9])|(1[0-9]?)|[2-9]$";
    public static final String FLOOR = "^[1-9][0-9]*$";

    public static final String TYPE_OF_RENT_BY_TIME = "^[A-Z][a-z]+$";
    public static final String NAME = "^[A-Z][a-z]+$";
    public static final String DATE = "^(0?[1-9]|[12][0-9]|3[01])[\\/](0?[1-9]|1[012])[\\/][0-9]{4}$";
    public static final String EMAIL = "^[a-z][a-z0-9_\\.]{5,32}@[a-z0-9]{2,}(\\.[a-z0-9]{2,}){1,}$";
    public static final String SDT_VN = "^(0?)(3[2-9]|5[6|8|9]|7[0|6-9]|8[0-6|8|9]|9[0-4|6-9])[0-9]{7}$";
    public static final String DATE_LEAP_YEAR = "^(?:(?:31(\\/|-|\\.)(?:0?[13578]|1[02]))\\1|(?:(?:29|30)(\\/|-|\\.)(?:0?[13-9]|1[0-2])\\2))(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$|^(?:29(\\/|-|\\.)0?2\\3(?:(?:(?:1[6-9]|[2-9]\\d)?(?:0[48]|[2468][048]|[13579][26])|(?:(?:16|[2468][048]|[3579][26])00))))$|^(?:0?[1-9]|1\\d|2[0-8])(\\/|-|\\.)(?:(?:0?[1-9])|(?:1[0-2]))\\4(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$";
    public static final String SO_THE_TIN_DUNG = "^(?:4[0-9]{12}(?:[0-9]{3})?|5[1-5][0-9]{14}|6(?:011|5[0-9][0-9])[0-9]{12}|3[47][0-9]{13}|3(?:0[0-5]|[68][0-9])[0-9]{11}|(?:2131|1800|35\\d{3})\\d{11})$";


    public static boolean validateNameOfVilla(String nameOfSerVice) {
        return nameOfSerVice.matches(NAME_OF_VILLA);
    }

    public static boolean validateNameOfHouse(String nameOfSerVice) {
        return nameOfSerVice.matches(NAME_OF_HOUSE);
    }

    public static boolean validateNameOfRoom(String nameOfSerVice) {
        return nameOfSerVice.matches(NAME_OF_ROOM);
    }

    public static boolean validateStringName(String name) {
        return name.matches(TYPE_OF_SERVICE);
    }

    public static boolean validateDouble(String numberDouble) {
        if (Double.parseDouble(numberDouble) < 30) {
            return false;
        }
        return numberDouble.matches(AREA);
    }

    public static boolean validateMoney(String money) {
        return money.matches(MONEY);
    }

    public static boolean validateNumberPerson(String numberPerson) {
        return numberPerson.matches(NUMBER_OF_PERSON);
    }

    public static boolean validateFloor(String floor) {
        return floor.matches(FLOOR);
    }

    public static boolean validateDate(String date) {
        return date.matches(DATE);
    }

    static Scanner scanner = new Scanner(System.in);

    public static String regexData(String string, String regex, String messageError) {
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

    public static String regexAge(String dayOfBirth, String regex) {
        boolean check = true;
        do {
            try {
                if (dayOfBirth.matches(regex)) {
                    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                    LocalDate now = LocalDate.now();
                    LocalDate birthDay = LocalDate.parse(dayOfBirth,formatter);
                    int age = Period.between(birthDay, now).getYears();
                    if (age < 18 || age > 100) {
                        throw new UserInputException("age must be >=18 and <= 100");
                    } else {
                        break;
                    }
                } else {
                    throw new UserInputException("Format Day Error!");
                }
            } catch (UserInputException e) {
                System.out.println(e.getMessage());
                dayOfBirth = scanner.nextLine();
            } catch (Exception e){
                e.printStackTrace();
            }
        } while (check);

        return dayOfBirth;
    }

}
