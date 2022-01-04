package ss4_class_and_object.exercise.quadratic_equation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input A ");
        double a = scanner.nextDouble();
        System.out.println("Input B ");
        double b = scanner.nextDouble();
        System.out.println("Input C ");
        double c = scanner.nextDouble();
        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);
        double delta = quadraticEquation.getDiscriminant();
        if (delta > 0) {
            System.out.println("equation has 2 roots ");
            System.out.println(" roots 1 = " + quadraticEquation.getRoot1());
            System.out.println(" roots 2 = " + quadraticEquation.getRoot2());
        } else if (delta == 0) {
            System.out.println("equation has root1 = root2 = " + quadraticEquation.getRoot1());
        } else {
            System.out.println("Equation has no roots !");
        }
    }
}
