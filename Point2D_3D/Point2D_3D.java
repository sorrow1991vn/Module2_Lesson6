package Lesson6.Point2D_3D;

public class Point2D_3D {
    public static void main(String[] args) {
        Point2D point2D = new Point2D();
        System.out.println(point2D);

        point2D = new Point2D(10, 10);
        System.out.println(point2D);


        Point3D point3D = new Point3D();
        System.out.println(point3D);

        point3D = new Point3D(10,10,14);
        System.out.println(point3D);
    }
}
