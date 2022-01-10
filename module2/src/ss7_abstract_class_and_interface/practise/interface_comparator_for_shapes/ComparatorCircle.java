package ss7_abstract_class_and_interface.practise.interface_comparator_for_shapes;

public class ComparatorCircle extends Circle implements Comparable<ComparatorCircle>{

    public ComparatorCircle() {
    }

    public ComparatorCircle(double radius) {
        super(radius);

    }


    @Override
    public int compareTo(ComparatorCircle o) {
        if (getRadius() > o.getRadius()) return 1;
        else if (getRadius() < o.getRadius()) return -1;
        else return 1;
    }


    public ComparatorCircle(double radius, String color, boolean filled) {
        super(radius, color, filled);
    }

}
