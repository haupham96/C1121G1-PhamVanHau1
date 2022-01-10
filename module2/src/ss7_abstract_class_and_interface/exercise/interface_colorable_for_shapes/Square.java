package ss7_abstract_class_and_interface.exercise.interface_colorable_for_shapes;

public class Square extends Shape implements IColorable {
    private double side;

    public Square() {
    }

    public Square(double side) {
        this.side = side;
    }

    public double getSide() {
        return this.side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                '}';
    }

    @Override
    public String howToColor() {
        return "Color all 4 sides ";
    }
}
