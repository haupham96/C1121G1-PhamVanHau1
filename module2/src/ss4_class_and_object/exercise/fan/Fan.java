package ss4_class_and_object.exercise.fan;

public class Fan {
    final int SLOW = 1;
    final int MEDIUM = 2;
    final int FAST = 3;
    private int speed = SLOW;
    private boolean onOff = false;
    private double radius = 5;
    private String color = "blue";


    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOnOff() {
        return onOff;
    }

    public void setOnOff(boolean onOff) {
        this.onOff = onOff;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString() {
        if (this.isOnOff()) {
            return "This fan Speed is " + this.getSpeed() + "\n"
                    + "This fan color is : " + this.getColor() + "\n"
                    + "This fan Radius is : " + this.getRadius()+"\n"
                    +"Fan is On";
        } else {
            return "This fan color is : " + this.getColor() + "\n"
                    + "This fan Radius is : " + this.getRadius()+"\n"
                    +"Fan is Off";
        }
    }
}
