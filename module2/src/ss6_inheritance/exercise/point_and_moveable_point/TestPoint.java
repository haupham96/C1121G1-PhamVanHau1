package ss6_inheritance.exercise.point_and_moveable_point;

import java.util.Arrays;

public class TestPoint {
    public static void main(String[] args) {
        Point point1=new Point();
        point1.setXY(11,11);
        System.out.println(point1);
        System.out.println("");

        Point point2=new Point(1,1);
        System.out.println(Arrays.toString(point2.getXY()));
        System.out.println(point2);
    }
}
