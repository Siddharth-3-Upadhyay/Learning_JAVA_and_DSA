package FunctionProblems;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int lastNum;
        System.out.print("Enter the last number upto which you want your fibonacci series: ");
        lastNum = input.nextInt();
        fiboNum(lastNum);

        input.close();
    }
    static void fiboNum(int lastNum) {
        int firstNum = 0;
        int secondNum = 1;
        int nextNum;
        System.out.print(firstNum + ", ");
        System.out.print(secondNum + ", ");
        for (int i = 3; i <= lastNum; i++) {
            nextNum = firstNum + secondNum;
            firstNum = secondNum;
            secondNum = nextNum;
            System.out.print(nextNum);
            if (i != lastNum)
                System.out.print(", ");
        }
        System.out.println();
    }
}
