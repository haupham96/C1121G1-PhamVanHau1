package ss4_class_and_object.practice.rectangle;

import java.util.Scanner;

public class MainRectangle {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter width ");
        double width = scanner.nextDouble();
        System.out.println("Enter height ");
        double height = scanner.nextDouble();
        Rectangle rectangle = new Rectangle(width, height);
        System.out.println("Your Rectangle : " + rectangle.display());
        System.out.println("Area of Rectangle : " + rectangle.getArea());
        System.out.println("Perimeter of Rectangle : " + rectangle.getPerimeter());

    }
}
