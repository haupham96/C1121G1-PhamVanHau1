package ss7_abstract_class_and_interface.practise.interface_comparator_for_shapes;

import java.util.Arrays;
import java.util.Comparator;

public class ComparatorCircleTest {
    public static void main(String[] args) {
        ComparatorCircle[] circles = new ComparatorCircle[3];
        circles[0] = new ComparatorCircle(3.6);
        circles[1] = new ComparatorCircle();
        circles[2] = new ComparatorCircle(3.5, "indigo", false);



        System.out.println("Pre-sorted:");
        for (ComparatorCircle circle : circles) {
            System.out.println(circle);
        }

        Comparator circleComparator = new CircleComparator();
        Arrays.sort(circles,circleComparator);

        System.out.println("After-sorted:");
        for (ComparatorCircle circle : circles) {
            System.out.println(circle);
        }
    }
}
