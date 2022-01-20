package ss15_handle_exception_debug.exercise.illegal_triangle_exception;

public class Triangle {
    int sideA;
    int sideB;
    int sideC;

    public Triangle() {
    }

    public Triangle(int sideA, int sideB, int sideC) throws IllegalTriangleException {
        if (sideA < 0 || sideB < 0 || sideC < 0) {
            throw new IllegalTriangleException("Invalid Input < 0 ");
        } else if (sideA + sideB < sideC || sideA + sideC < sideB || sideB + sideC < sideA) {
            throw new IllegalTriangleException("Error 2 side < 1 side ");
        } else {
            this.sideA = sideA;
            this.sideB = sideB;
            this.sideC = sideC;
        }
    }

    public int getSideA() {
        return sideA;
    }

    public void setSideA(int sideA) throws IllegalTriangleException {
        if (sideA < 0) {
            throw new IllegalTriangleException("Invalid Input : < 0 ");
        } else {
            this.sideA = sideA;
        }

    }

    public int getSideB() {
        return sideB;
    }

    public void setSideB(int sideB) throws IllegalTriangleException {
        if (sideB< 0) {
            throw new IllegalTriangleException("Invalid Input : < 0 ");
        } else {
            this.sideB = sideB;
        }
    }

    public int getSideC() {
        return sideC;
    }

    public void setSideC(int sideC) throws IllegalTriangleException {
        if (sideC < 0) {
            throw new IllegalTriangleException("Invalid Input : < 0 ");
        } else {
            this.sideC = sideC;
        }
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "sideA=" + sideA +
                ", sideB=" + sideB +
                ", sideC=" + sideC +
                '}';
    }
}
