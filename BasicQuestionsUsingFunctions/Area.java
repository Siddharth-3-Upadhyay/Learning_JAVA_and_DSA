package BasicQuestionsUsingFunctions;

import java.util.Scanner;

public class Area {
    static final float PI = 3.14159F;
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
//          areaOfCircle();
//        areaOfTriangle();
        areaOfRectangle();
    }
    static void areaOfCircle() {
        /* Area of Circle = PI * r * r */
        float radius;
        System.out.print("Enter the radius of Circle(m): ");
        radius = input.nextFloat();
        float area = PI * radius * radius;
        System.out.println("Area of Circle: " + area);
    }
    static void areaOfTriangle() {
        /* Area of Triangle = 1.5 * base * height */
        float base, height;
        System.out.print("Enter the base(m) and height(m) of triangle: ");
        base = input.nextFloat();
        height = input.nextFloat();
        float area = 0.5F * base * height;
        System.out.println("Area of Triangle: " + area);
    }
    static void areaOfRectangle() {
        /* Area of Rectangle = length * breadth */
        float length, breadth, area;
        System.out.print("Enter the length(m) and breadth(m) of rectangle: ");
        length = input.nextFloat();
        breadth = input.nextFloat();
        area = length * breadth;
        System.out.println("Area of Rectangle: " + area);
    }
}
