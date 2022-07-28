package BasicQuestionsUsingFunctions;

import java.util.Scanner;

public class Volume {
    static final float PI = 3.14159F;
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        volumeOfCone();
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
}
