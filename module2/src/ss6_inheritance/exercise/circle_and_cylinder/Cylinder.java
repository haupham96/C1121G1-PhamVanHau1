package ss6_inheritance.exercise.circle_and_cylinder;

public class Cylinder extends Circle {
    private double height = 1.0;

    public Cylinder() {

    }

    public Cylinder(double height, String color, double radius) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return this.getArea() * this.height;
    }

    @Override
    public String toString() {
        return "A Cylinder " + "\n"
                + "Height = " + getHeight() + "\n"
                +"Volume = "+getVolume()+"\n"
                + "Which is a subclass of"
                + super.toString()
                +"\n"+"\n";
    }
}
