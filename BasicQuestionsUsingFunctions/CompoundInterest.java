package BasicQuestionsUsingFunctions;

import java.util.Scanner;

public class CompoundInterest {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Compound Interest: " + compoundInterest());
    }
    static double compoundInterest() {
        /* CompoundInterest = p (1 + R / 100)^T */
        float p, r, t;
        System.out.print("Enter principle amount: ");
        p = input.nextFloat();
        System.out.print("Enter rate: ");
        r = input.nextFloat();
        System.out.print("Enter time: ");
        t = input.nextInt();
        double amount = p * (Math.pow((1 + (r / 100)), t));
        return amount - p;
    }
}
