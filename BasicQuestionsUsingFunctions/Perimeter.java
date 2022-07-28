package BasicQuestionsUsingFunctions;

import java.util.Scanner;

public class Perimeter {
    static final float PI = 3.14159F;
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
//        perimeterOfCircle();
        perimeterOfEquilateralTriangle();
    }
    static void perimeterOfCircle() {
        /* Perimeter of Circle = 2 * PI * radius */
        float radius, perimeter;
        System.out.print("Enter the radius of circle: ");
        radius = input.nextFloat();
        perimeter = 2 * PI * radius;
        System.out.println("Perimeter of Circle(m): " + perimeter);
    }
    static void perimeterOfEquilateralTriangle() {
        /* Perimeter of Equilateral Triangle = 3 * side */
        float side, perimeter;
        System.out.print("Enter the side of equilateral triangle: ");
        side = input.nextFloat();
        perimeter = 3 * side;
        System.out.println("Perimeter of equi. triangle: " + perimeter);
    }
}
