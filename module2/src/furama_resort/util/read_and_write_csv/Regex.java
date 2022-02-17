package furama_resort.util.read_and_write_csv;

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
