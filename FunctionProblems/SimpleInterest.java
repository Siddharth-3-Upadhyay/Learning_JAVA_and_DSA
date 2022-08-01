package FunctionProblems;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int principal, time;
        float rate;
        System.out.print("Enter Principal Amount: ");
        principal = input.nextInt();
        System.out.print("Enter Rate(%): ");
        rate = input.nextFloat();
        System.out.print("Enter Time(in Years): ");
        time = input.nextInt();
        calculateSimpleInterest(principal, time, rate);

        input.close();
    }
    static void calculateSimpleInterest(int principal, int time, float rate) {
        /*
         * Formula: SI = PRT / 100; (R in %, time in years)
         * In order to calculate the total amount, the following formula is used: Amount (A) = Principal (P) + Interest (I) OR P(1 + RT)
         * years -> PRT / 100 [T = no.of years.]
         * months -> (PnR) / (12 * 100) [n = no.of months]
         * days -> (P * d * R) / (365 * 100) [d = no.of days (non-leap year)]
         */
        float si,  totalAmount;
        si = (principal * rate * time) / 100;
        totalAmount = principal + si;
        System.out.println("Simple Interest = " + si);
        System.out.println("Therefore, Total Amount to be paid at the end of the year: ₹" + totalAmount);
    }
}
