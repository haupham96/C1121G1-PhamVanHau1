package ss6_inheritance.exercise.design_triangle_class;

public class Shape {

    protected double height = 10.0d;
    protected String color = "White";

    public Shape() {
    }

    public Shape( double height, String color) {

        this.height = height;
        this.color = color;
    }


    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Shape{" +
                ", height=" + height +
                ", color='" + color + '\'' +
                '}';
    }
}
