package ss7_abstract_class_and_interface.practise.interface_comparator_for_shapes;

public abstract class Circle {
    private double radius = 1.0;
    private String color = "blue";
    private boolean filled = true;

    public Circle() {

    }

    public Circle(double radius, String color, boolean filled) {
        this.radius = radius;
        this.color = color;
        this.filled = filled;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return getRadius() * getRadius() * 3.14;
    }

    @Override
    public String toString() {
        return " A Circle " + "\n"
                + "Color : " + getColor() + "\n"
                + "Radius = " + getRadius() + "\n"
                + "Area = " + getArea()
                + "\n" + "\n";
    }
}

