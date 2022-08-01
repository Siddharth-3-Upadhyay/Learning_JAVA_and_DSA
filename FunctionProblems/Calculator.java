package BasicQuestionsUsingFunctions;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float num1, num2;
        char operator;
        System.out.print("Enter entire expression(x+y): ");
        num1 = input.nextFloat();
        operator = input.next().charAt(0);
        num2 = input.nextFloat();
        simpleCalculator(num1, num2, operator);

        input.close();
    }
    // Q. Take in two numbers and an operator (+, -, *, /) and calculate the value.
    static void simpleCalculator(float num1, float num2, char sign) {
        switch (sign) {
            case '+':
                System.out.println(num1 + num2);
                break;
            case '-':
                System.out.println(num1 - num2);
                break;
            case '*':
                System.out.println(num1 * num2);
                break;
            case '/':
                System.out.println(num1 / num2);
                break;
            case '%':
                System.out.println(num1 % num2);
                break;
            default:
                System.out.println("Wrong operation provided. Operation should be (+, -, *, /, %).");
                break;
        }
    }
}
