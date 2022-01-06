package ss5_access_modifier_static_method_static_property.exercise.access_modifier;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle.getRadius());
        System.out.println(circle.getArea());

        Circle circle1 = new Circle(4.0);
        System.out.println(circle1.getRadius());
        System.out.println(circle1.getArea());
    }
}
