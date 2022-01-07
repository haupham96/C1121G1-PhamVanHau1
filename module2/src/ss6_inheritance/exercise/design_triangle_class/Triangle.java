package ss6_inheritance.exercise.design_triangle_class;

public class Triangle extends Shape {
    private double side1 = 1.0d;
    private double side2 = 1.0d;
    private double side3 = 1.0d;

    public Triangle() {
    }

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public Triangle(double height, String color, double side1, double side2, double side3) {
        super(height, color);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    public double getArea() {
        return (this.side3 * this.height) / 2;
    }

    public double getPerimeter() {
        return this.side1 + this.side2 + this.side3;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "Color = " + this.getColor() +
                ", Area = " + this.getArea() +
                ", Perimeter = " + this.getPerimeter() +
                '}';
    }
}
