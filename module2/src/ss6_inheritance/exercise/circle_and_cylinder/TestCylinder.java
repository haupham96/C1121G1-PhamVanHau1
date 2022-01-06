package ss6_inheritance.exercise.circle_and_cylinder;

public class TestCylinder {
    public static void main(String[] args) {
        Cylinder cylinder1 = new Cylinder();
        cylinder1.setHeight(15.0);
        System.out.println(cylinder1);

        Cylinder cylinder2 = new Cylinder(20,"pink",10);
        System.out.println(cylinder2);
    }
}
