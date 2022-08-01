package BasicQuestionsUsingFunctions;

import java.util.Scanner;

public class AllFactors {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int num;
        System.out.print("Enter the number: ");
        num = input.nextInt();
        allFactorsOfNum(num);
    }
    static void allFactorsOfNum(int num) {
        for (int i = 1; i <= num; i++) {
            if (num % i == 0)
                System.out.print(i + ", ");
        }
    }
}
