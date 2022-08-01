package FunctionProblems;

import java.util.Scanner;

public class Area {
    static final float PI = 3.14159F;
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        areaOfCircle();
        areaOfTriangle();
        areaOfIsoscelesTriangle();
        areaOfEquilateralTriangle();
        areaOfRectangle();
        areaOfParallelogram();
        areaOfRhombus();
    }
    static void areaOfCircle() {
        /* Area of Circle = PI * r * r */
        float radius;
        System.out.print("Enter the radius of Circle(m): ");
        radius = input.nextFloat();
        float area = PI * radius * radius;
        System.out.println("Area of Circle: " + area + " sq.m");
    }
    static void areaOfTriangle() {
        /* Area of Triangle = 1.5 * base * height */
        float base, height;
        System.out.print("Enter the base(m) and height(m) of triangle: ");
        base = input.nextFloat();
        height = input.nextFloat();
        float area = 0.5F * base * height;
        System.out.println("Area of Triangle: " + area + " sq.m");
    }
    static void areaOfIsoscelesTriangle() {
        /* Area of Isosceles Triangle = 0.5 * base * height */
        float base, height, area;
        System.out.print("Enter the base(m) and height(m) of Isosceles Triangle: ");
        base = input.nextFloat();
        height = input.nextFloat();
        area = 0.5F * base * height;
        System.out.println("Area of Isosceles Triangle: " + area + " sq.m");
    }
    static void areaOfEquilateralTriangle() {
        /* Area of Equilateral Triangle = (√3/4) * a^2 */
        float length, area;
        System.out.print("Enter the length of equilateral triangle: ");
        length = input.nextFloat();
        area = (1.732050F / 4) * (length * length);
        System.out.println("Area of Equilateral Triangle: " + area + " sq.m");
    }
    static void areaOfRectangle() {
        /* Area of Rectangle = length * breadth */
        float length, breadth, area;
        System.out.print("Enter the length(m) and breadth(m) of rectangle: ");
        length = input.nextFloat();
        breadth = input.nextFloat();
        area = length * breadth;
        System.out.println("Area of Rectangle: " + area + " sq.m");
    }
    static void areaOfParallelogram() {
        /* 1. When base and height of parallelogram are given.
        *       Area = base * height
        * 2. When height is not given
        *       Area = a * b * sin(x)
        *       where a, b are the length of parallel sides.
        *           and x is the angle between them.*/
        // for the simplicity we will go with 1st case.
        float base, height, area;
        System.out.print("Enter the base(m) and height(m) of parallelogram: ");
        base = input.nextFloat();
        height = input.nextFloat();
        area = base * height;
        System.out.println("Area of Parallelogram: " + area + " sq.m");
    }
    static void areaOfRhombus() {
        /* Area of Rhombus = base * height */
        float base, height, area;
        System.out.print("Enter the base(m) and height(m) of Rhombus: ");
        base = input.nextFloat();
        height = input.nextFloat();
        area = base * height;
        System.out.println("Area of Rhombus: " + area + " sq.m");

    }
}
