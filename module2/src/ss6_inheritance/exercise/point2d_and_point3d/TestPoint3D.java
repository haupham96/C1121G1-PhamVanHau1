package ss6_inheritance.exercise.point2d_and_point3d;

import java.util.Arrays;

public class TestPoint3D {
    public static void main(String[] args) {
        Point3D point3D = new Point3D();
        point3D.setXYZ(5,5,5);
        System.out.println(point3D);
        System.out.println("");

        Point3D point3D1 = new Point3D(1,1,1);
        System.out.println(Arrays.toString(point3D1.getXYZ()));
        System.out.println(point3D1);
    }
}
