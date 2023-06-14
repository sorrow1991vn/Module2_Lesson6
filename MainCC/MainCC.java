package Lesson6.MainCC;

public class MainCC {
    public static void main(String[] args) {
            Circle circle = new Circle();
        System.out.println(circle);
        circle = new Circle(5.0,"Green");
        System.out.println(circle);


        Cylinder cylinder = new Cylinder();
        System.out.println(cylinder);
        cylinder = new Cylinder(10.0);
        System.out.println(cylinder);
    }
}
