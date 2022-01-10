package ss7_abstract_class_and_interface.exercise.interface_resizeable_for_shapes;



public class Square extends Shapes implements Resizeable {
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
        return "A Square with side="
                + getSide()
                + ", which is a subclass of "
                + super.toString();
    }

    @Override
    public void resize(double percent) {
        this.side += (this.side * percent) / 100;
    }
}

