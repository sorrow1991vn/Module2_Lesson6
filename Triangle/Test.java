package Lesson6.Triangle;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        double a,b,c;
        String color;

        Scanner scanner = new Scanner(System.in);

        System.out.print("input color: ");
        color = scanner.nextLine();
        System.out.print("input side1: ");
        a = scanner.nextDouble();
        System.out.print("input side2: ");
        b = scanner.nextDouble();
        System.out.print("input side3: ");
        c = scanner.nextDouble();
        Triangle tg = new Triangle(color,a,b,c);
        System.out.println(tg);

    }
}
