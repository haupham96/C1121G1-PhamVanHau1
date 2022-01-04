package ss4_class_and_object.exercise.fan;

public class Main {
    public static void main(String[] args) {
        Fan fan1 = new Fan();
        fan1.setSpeed(fan1.FAST);
        fan1.setColor("Yellow");
        fan1.setOnOff(true);
        fan1.setRadius(10);
        System.out.println(fan1);

        System.out.println("");

        Fan fan2 = new Fan();
        fan2.setSpeed(fan2.MEDIUM);
        fan2.setColor("Blue");
        fan2.setOnOff(false);
        fan2.setRadius(5);
        System.out.println(fan2.toString());
    }
}
