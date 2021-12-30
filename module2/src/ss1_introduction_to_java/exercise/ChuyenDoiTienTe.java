package ss1_introduction_to_java.exercise;
import java.util.Scanner;
public class ChuyenDoiTienTe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter USD ");
       int dollar = scanner.nextInt();
       int rate = dollar * 23000 ;
        System.out.println("USD to VND = "+rate+" VND");
    }
}
