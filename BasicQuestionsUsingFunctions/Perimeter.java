package BasicQuestionsUsingFunctions;

import java.util.Scanner;

public class Perimeter {
    static final float PI = 3.14159F;
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
//        perimeterOfCircle();
//        perimeterOfEquilateralTriangle();
        perimeterOfParallelogram();
    }
    static void perimeterOfCircle() {
        /* Perimeter of Circle = 2 * PI * radius */
        float radius, perimeter;
        System.out.print("Enter the radius of circle: ");
        radius = input.nextFloat();
        perimeter = 2 * PI * radius;
        System.out.println("Perimeter of Circle(m): " + perimeter + " m");
    }
    static void perimeterOfEquilateralTriangle() {
        /* Perimeter of Equilateral Triangle = 3 * side */
        float side, perimeter;
        System.out.print("Enter the side of equilateral triangle: ");
        side = input.nextFloat();
        perimeter = 3 * side;
        System.out.println("Perimeter of equi. triangle: " + perimeter + " m");
    }
    static void perimeterOfParallelogram() {
        /* Perimeter of Parallelogram = 2 * (a + b) */
        float length, breadth, perimeter;
        System.out.print("Enter the length(m) and breadth(m) of Parallelogram: ");
        length = input.nextFloat();
        breadth = input.nextFloat();
        perimeter = 2 * (length + breadth);
        System.out.println("Perimeter of Parallelogram: " + perimeter + " m");
    }
}
