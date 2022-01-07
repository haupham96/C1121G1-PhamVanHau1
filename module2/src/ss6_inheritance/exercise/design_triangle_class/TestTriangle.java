package ss6_inheritance.exercise.design_triangle_class;

import java.sql.SQLOutput;
import java.util.Scanner;

public class TestTriangle {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter side 1");
        double side1 = scanner.nextDouble();

        System.out.println("Enter side 2");
        double side2 = scanner.nextDouble();

        System.out.println("Enter Triangle Bottom");
        double bottomSide = scanner.nextDouble();

        System.out.println("Enter Color of Triangle ");
        String color = scanner.next();

        System.out.println("");


        Triangle triangle2 = new Triangle(20, color, side1, side2, bottomSide);
        System.out.println(triangle2);


    }
}
