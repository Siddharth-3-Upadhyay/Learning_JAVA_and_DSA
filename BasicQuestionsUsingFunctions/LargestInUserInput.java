package BasicQuestionsUsingFunctions;

import java.util.Scanner;

public class LargestInUserInput {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        largestInUserInput();
    }
    static void largestInUserInput() {
        int num, largest = Integer.MIN_VALUE;
        do {
            System.out.print("Enter a number: ");
            num = input.nextInt();
            if (num > largest)
                largest = num;
        } while (num != 0);
        System.out.println("Largest number is: " + largest);
    }
}
