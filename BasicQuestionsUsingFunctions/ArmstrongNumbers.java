package BasicQuestionsUsingFunctions;

import java.util.Scanner;

public class ArmstrongNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num;
        System.out.print("Enter a number: ");
        num = input.nextInt();
        isArmstrongNum(num);

        input.close();
    }
    static void isArmstrongNum(int num) {
        int total_digit = totalDigits(num);
        int temp = num;
        int sum = 0, rem;
        while (temp > 0) {
            rem = temp % 10;
            sum = sum + calculatePower(rem, total_digit);
            temp = temp / 10;
        }
        if (sum == num)
            System.out.println("Yes, " + num + " is an Armstrong number.");
        else
            System.out.println("No, " + num + " is not an Armstrong number.");
    }
    static int totalDigits(int num) {
        int temp = num;
        int counter = 0;
        while (temp != 0) {
            counter++;
            temp = temp / 10;
        }
        return counter;
    }
    static int calculatePower(int num, int power) {
        int pow = 1;
        for (int i = 1; i <= power; i++) {
            pow = pow * num;
        }
        return pow;
    }
}
