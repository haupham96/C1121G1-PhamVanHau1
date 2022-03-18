public class QuadraticEquation {

    public static double getDiscriminant(int a,int b ,int c) {
        return b * b - 4 * a * c;
    }

    public static double getRoot1(int a,int b,int c) {
        if (getDiscriminant(a,b,c) < 0) {
            return 0;
        } else {
            return (-b + Math.pow(getDiscriminant(a,b,c), 0.5)) / (2 * a);
        }
    }

    public static double getRoot2(int a,int b,int c) {
        if (getDiscriminant(a,b,c) < 0) {
            return 0;
        } else {
            return (-b - Math.pow(getDiscriminant(a,b,c), 0.5)) / (2 * a);
        }
    }

    public static void getResult(int a,int b,int c) {
        if (getDiscriminant(a,b,c) > 0) {
            System.out.println("Phương trình có 2 nghiệm:");
            System.out.println("Nghiệm thứ 1 :" + getRoot1(a,b,c));
            System.out.println("Nghiệm thứ 2 :" + getRoot2(a,b,c));
        } else if (getDiscriminant(a,b,c) == 0) {
            System.out.println("Phương trình có nghiệm kép: " + getRoot1(a,b,c));
        } else {
            System.out.println("Phương trình vô nghiệm");
        }
    }
}