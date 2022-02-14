package ss19_string_regex;

public class DemoString {
    public static void main(String[] args) {
        String str1 ="abc"; // tạo "abc" lưu trong vùng nhớ string Pool (trong heap)
        String str2 ="abc";
        String str6="abcefg";
        str1 ="abce";
        String str3=str1;
        String str4 = new String("abc");
        String str5 = new String("abc");
        str5+="efg";


        System.out.println(str1==str2);//true
        System.out.println(str3==str2);//  true
        System.out.println(str4==str1);// false
        System.out.println(str4==str5);// false
        System.out.println(str4.equals(str5));// true
        StringBuffer stringBuffer =new StringBuffer("abc");
        stringBuffer.append("efg");
    }
}
