package ss6_inheritance.exercise.point_and_moveable_point;

import java.util.Arrays;

public class TestMoveablePoint {
    public static void main(String[] args) {
        MoveablePoint moveablePoint1 = new MoveablePoint();
        moveablePoint1.setSpeed(10,10);
        System.out.println(moveablePoint1);
        System.out.println("");

        MoveablePoint moveablePoint2 = new MoveablePoint(2,2);
        System.out.println(Arrays.toString(moveablePoint2.getSpeed()));
        System.out.println(moveablePoint2);
        System.out.println("");

        MoveablePoint moveablePoint3 = new MoveablePoint(1,1,2,2);
        System.out.println(Arrays.toString(moveablePoint3.move()));
        System.out.println(moveablePoint3);
    }
}
