package FunctionProblems;

import java.util.Scanner;

public class BattingAverage {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Batting Average: " + battingAverage());
    }
    static double battingAverage() {
        float runs, innings, notOut;
        System.out.print("Enter the number of innings batted: ");
        innings = input.nextFloat();
        System.out.print("Enter the number of times not-out: ");
        notOut = input.nextFloat();
        System.out.print("Enter runs scored: ");
        runs = input.nextFloat();

        if (innings == notOut)
            return runs;
        else
            return runs / (innings - notOut);
    }
}
