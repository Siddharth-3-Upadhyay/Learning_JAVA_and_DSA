package BasicQuestionsUsingFunctions;

import java.util.Scanner;

public class Volume {
    static final float PI = 3.14159F;
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
//        volumeOfCone();
//        volumeOfCylinder();
        volumeOfSphere();
    }
    static void volumeOfCone() {
        /* Volume of Cone = (PI * radius * radius * height) / 3 */
        float radius, height, volume;
        System.out.print("Enter the radius(m) and height(m) of Cone: ");
        radius = input.nextFloat();
        height = input.nextFloat();
        volume = (PI * (radius * radius) * height) / 3;
        System.out.println("Volume of Cone: " + volume + " cubic m");
    }
    static void volumeOfCylinder() {
        /* Volume of Cylinder = PI * radius * radius * height */
        float radius, height, volume;
        System.out.print("Enter radius(m) and height(m) of Cylinder: ");
        radius = input.nextFloat();
        height = input.nextFloat();
        volume = PI * (radius * radius) * height;
        System.out.println("Volume of Cylinder: " + volume + " cubic m");
    }
    static void volumeOfSphere() {
        /* Volume of Sphere = 4/3 (PI * radius * radius * radius) */
        float radius, volume;
        System.out.print("Enter the radius(m) of Sphere: ");
        radius = input.nextFloat();
        volume = 4 * (PI * radius * radius * radius) / 3;
        System.out.println("Volume of Sphere: " + volume + " cubic m");
    }
}
