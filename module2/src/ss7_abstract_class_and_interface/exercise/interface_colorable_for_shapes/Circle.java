package ss7_abstract_class_and_interface.exercise.interface_colorable_for_shapes;

public class Circle extends Shape{
    double radius = 1.0d;

    public Circle(){

    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
