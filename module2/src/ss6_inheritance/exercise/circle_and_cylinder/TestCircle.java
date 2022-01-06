package ss6_inheritance.exercise.circle_and_cylinder;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        System.out.println(circle1);

        Circle circle2 = new Circle(2.0,"red");
        circle2.setColor("white");
        circle2.setRadius(100);
        System.out.println(circle2);
    }
}
