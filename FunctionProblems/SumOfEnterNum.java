package FunctionProblems;

import java.util.Scanner;

public class SumOfEnterNum {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        sumOfEnterNum();
    }
    static void sumOfEnterNum() {
        float num, sum = 0;
        do {
            System.out.print("Enter number, press '0' to exit: ");
            num = input.nextFloat();
            sum += num;
        } while (num != 0);
        System.out.println("Sum: " + sum);
    }
}
