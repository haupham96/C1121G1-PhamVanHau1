package ss6_inheritance.exercise.design_triangle_class;

public class TestShape {
    public static void main(String[] args) {
        Shape shape1 = new Shape();
        System.out.println(shape1);
        System.out.println("");

        Shape shape2 = new Shape(15,"Red");
        System.out.println(shape2);
    }
}
