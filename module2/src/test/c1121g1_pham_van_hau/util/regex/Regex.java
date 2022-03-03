//package test.c1121g1_pham_van_hau.util.regex;
//
//import java.time.LocalDate;
//import java.time.format.DateTimeFormatter;
//import java.util.Scanner;
//import java.util.regex.Pattern;
//
//public class Regex {
//    Scanner scanner = new Scanner(System.in);
//    public static final String SO_DUONG = "^[1-9][0-9]*$";
//    public static final String NUMBER = "^[0-9]+$";
//
//    public static final String DATE_LEAP_YEAR = "^(?:(?:31(\\/|-|\\.)(?:0?[13578]|1[02]))\\1|(?:(?:29|30)(\\/|-|\\.)(?:0?[13-9]|1[0-2])\\2))(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$|^(?:29(\\/|-|\\.)0?2\\3(?:(?:(?:1[6-9]|[2-9]\\d)?(?:0[48]|[2468][048]|[13579][26])|(?:(?:16|[2468][048]|[3579][26])00))))$|^(?:0?[1-9]|1\\d|2[0-8])(\\/|-|\\.)(?:(?:0?[1-9])|(?:1[0-2]))\\4(?:(?:1[6-9]|[2-9]\\d)?\\d{4})$";
//    public static final String SO_THUC = "^[0-9]*[1-9]+([\\.][0-9]*)?$";
//
//    public static final String NGAY_THANG = "^(?:(?:31(\\-)(?:0?[13578]|1[02]))\\1|(?:(?:29|30)(\\-)(?:0?[13-9]|1[0-2])\\2))(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$|^(?:29(\\-)0?2\\3(?:(?:(?:1[6-9]|[2-9]\\d)?(?:0[48]|[2468][048]|[13579][26])|(?:(?:16|[2468][048]|[3579][26])00))))$|^(?:0?[1-9]|1\\d|2[0-8])(\\-)(?:(?:0?[1-9])|(?:1[0-2]))\\4(?:(?:1[6-9]|[2-9]\\d)?\\d{4})$";
//    public static final String MA_BENH_AN = "^(BA\\-)[0-9]{3}$";
//    public static final String MA_BENH_NHAN = "^(BN\\-)[0-9]{3}$";
//    public static final String TEN = "^([A-Z][a-z]*[a-zA-Z]*[\\s]*)+$";
//
//
//    public static String regexDuLieu(String string, String regex, String thongBaoLoi) {
//        Scanner scanner = new Scanner(System.in);
//        boolean check = true;
//        do {
//            if (string.matches(regex)) {
//                break;
//            } else {
//                System.out.println(thongBaoLoi);
//                string = scanner.nextLine();
//            }
//        } while (check);
//        return string;
//    }
//        public static String regexDateOfDischarge(String temp, String dateOfAdmission, String regex) {
//            boolean check = true;
//            while (check) {
//                try {
//                    if (Pattern.matches(regex, temp)) {
//                        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
//                        LocalDate endDay = LocalDate.parse(temp, formatter);
//                        LocalDate startDay = LocalDate.parse(dateOfAdmission, formatter);
//                        if (endDay.isAfter(startDay)) {
//                            check = false;
//                        } else {
//                            throw new Exception("Date of discharge must after date of admission");
//                        }
//                    } else {
//                        throw new Exception("Wrong format of date");
//                    }
//                } catch (Exception e) {
//                    e.printStackTrace();
//                    temp = scanner.nextLine();
//                }
//            }
//            return temp;
//        }
//
//}
