package FunctionProblems;

import java.util.Scanner;

public class DepreciationValue {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        float v1, r, t;
        System.out.print("Enter Value, Rate and Time: ");
        v1 = input.nextFloat();
        r = input.nextFloat();
        t = input.nextFloat();
        System.out.println("Depreciated Value: " + depreciation(v1, r, t));
    }
    static float depreciation(float v1, float r, float t) {
        /* Depreciation value = v1 * Math.pow((1 - r / 100), t) */
        float depValue;
        depValue = (float)(v1 * Math.pow((1 - r / 100), t));
        return depValue;
    }
}
