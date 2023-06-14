package Lesson6.Point2D_3D;

public class Point3D extends Point2D {
    private float z = 0.0f;

    public Point3D() {

    }

    public void Point3D(float z) {
        this.z = z;
    }

    public Point3D(float x, float y, float z) {
        super.setXY(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z) {
        super.setXY(x, y);
        this.z = z;
    }

    public float[] getXYZ() {
        float[] b = {getX(), getZ(), z};
        return b;
    }

    @Override
    public String toString() {
        return "Point3D{" +
                "z=" + z +
                '}';
    }
}
