package ss6_inheritance.exercise.point2d_and_point3d;

import java.util.Arrays;

public class TestPoint2D {
    public static void main(String[] args) {
        Point2D point2D = new Point2D();
        System.out.println(point2D);
        point2D.setXY(5.0f,5.0f);
        System.out.println(Arrays.toString(point2D.getXY()));
        System.out.println("");

        Point2D point2D1=new Point2D(10.0f,20.0f);
        System.out.println(point2D1);
    }
}
