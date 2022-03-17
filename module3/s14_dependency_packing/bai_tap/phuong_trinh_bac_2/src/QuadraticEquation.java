
public class QuadraticEquation {
    double a;
    double b;
    double c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getDiscriminant() {
        return this.b * this.b - 4 * this.a * this.c;
    }

    public double getRoot1() {
        if (this.getDiscriminant() < 0) {
            return 0;
        } else {
            return (-this.b + Math.pow(this.getDiscriminant(), 0.5)) / (2 * this.a);
        }
    }

    public double getRoot2() {
        if (this.getDiscriminant() < 0) {
            return 0;
        } else {
            return (-this.b - Math.pow(this.getDiscriminant(), 0.5)) / (2 * this.a);
        }
    }

    public void getResult() {
        if (getDiscriminant() > 0) {
            System.out.println("Phương trình có 2 nghiệm:");
            System.out.println("Nghiệm thứ 1 :" + getRoot1());
            System.out.println("Nghiệm thứ 2 :" + getRoot2());
        } else if (getDiscriminant() == 0) {
            System.out.println("Phương trình có nghiệm kép: " + getRoot1());
        } else {
            System.out.println("Phương trình vô nghiệm");
        }
    }
}

