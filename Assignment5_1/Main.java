package Assignment5_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Circle c = new Circle();
        Scanner sc = new Scanner(System.in);
        System.out.println("==============Circle===============");
        System.out.println("Enter the value of radius: ");
        c.setRadius(sc.nextDouble());
        double ac = c.area();
        double pc = c.perimeter();
        System.out.print("Area: " + String.format("%.2f", ac) + " " + "Circumference: " + String.format("%.2f", pc));
        System.out.println();
        Rectangle r = new Rectangle();
        System.out.println("==============Rectangle===============");
        System.out.println("Enter the value of length and breadth: ");
        r.setSize(sc.nextDouble(), sc.nextDouble());
        double ar = r.area();
        double pr = r.perimeter();
        System.out.print("Area: " + String.format("%.2f", ar) + " " + "Perimeter: " + String.format("%.2f", pr));
        System.out.println();
        Triangle t = new Triangle();
        System.out.println("==============Triangle===============");
        System.out.println("Enter the (valid) value of all three sides: ");
        t.setSide(sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
        System.out.print("Area: " + String.format("%.2f", t.area()) + " Perimeter: " + String.format("%.2f", t.perimeter()));
        System.out.println();
    }
}
