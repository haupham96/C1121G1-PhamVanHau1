package ss7_abstract_class_and_interface.practise.interface_comparable_for_shapes;

public class ComparableCircle extends Circle implements Comparable<ComparableCircle>{

    public ComparableCircle() {
    }

    public ComparableCircle(double radius) {
        super(radius);

    }


    @Override
    public int compareTo(ComparableCircle o) {
        if (getRadius() > o.getRadius()) return 1;
        else if (getRadius() < o.getRadius()) return -1;
        else return 1;
    }


    public ComparableCircle(double radius, String color, boolean filled) {
        super(radius, color, filled);
    }

}
