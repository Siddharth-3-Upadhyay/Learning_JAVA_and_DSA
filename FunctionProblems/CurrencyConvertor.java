package FunctionProblems;

import java.util.Scanner;

public class CurrencyConvertor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int rupee;
        System.out.print("Enter Currency(₹): ");
        rupee = input.nextInt();
        rupeeToUSD(rupee);

        input.close();
    }
    static void rupeeToUSD(int rupee) {
        // currently(27 July 2022): Rs 80 = $1
        float usd = rupee * 0.01F;
        System.out.println("₹" + rupee + " is $" + usd);
    }
}
