package BasicQuestionsUsingFunctions;

import java.util.Scanner;

public class DistanceBtwTwoPoints {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int x1, x2, y1, y2;
        System.out.print("Enter x1 and x2 coordinate: ");
        x1 = input.nextInt();
        x2 = input.nextInt();
        System.out.print("Enter y1 and y2 coordinate: ");
        y1 = input.nextInt();
        y2 = input.nextInt();
        System.out.println("Distance: " + distanceBtwTwoPoints(x1, x2, y1, y2));
    }
    static float distanceBtwTwoPoints(int x1, int x2, int y1, int y2) {
        /* Pythagoras theorem = under_root (x2-x1)^2 + (y2-y1)^2 */
        float firstPower = powerOfNum(x2 - x1, 2);
        float secondPower = powerOfNum(y2 - y1, 2);
        return (float)(Math.sqrt(firstPower + secondPower));
    }
    static float powerOfNum(float num, float power) {
        float calPower = 1;
        for (int i = 1; i <= power; i++) {
            calPower *= num;
        }
        return calPower;
    }
}
