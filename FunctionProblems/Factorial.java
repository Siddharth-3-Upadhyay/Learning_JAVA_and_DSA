package FunctionProblems;

import java.util.Scanner;

public class Factorial {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int num;
        System.out.print("Enter a number: ");
        num = input.nextInt();
        factorialNum(num);
    }
    static void factorialNum(int num) {
        int fact = 1;
        for (int i = num; i > 1; i--) {
            fact *= i;
        }
        System.out.println("Factorial: " + fact);
    }
}
