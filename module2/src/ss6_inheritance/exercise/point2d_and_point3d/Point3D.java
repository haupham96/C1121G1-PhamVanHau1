package ss6_inheritance.exercise.point2d_and_point3d;

public class Point3D extends Point2D {
    float z = 0.0f;

    public Point3D() {
    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public float[] getXYZ() {
        float[] arrayXYZ = {this.x, this.y, this.z};
        return arrayXYZ;
    }

    @Override
    public String toString() {
        return super.toString() + "\n"
                + " This Z = " + z;
    }
}
