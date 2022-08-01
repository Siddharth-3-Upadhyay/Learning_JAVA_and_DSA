package FunctionProblems;

import java.util.Scanner;

public class MultiplicationTables {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num;
        System.out.print("Enter the num: ");
        num = input.nextInt();
        multiplicationTables(num);

        input.close();
    }
    static void multiplicationTables(int num) {
        for (int i = 1; i <= 12; i++) {
            System.out.println(num + " * " + i + " = " + num * i);
        }
    }
}
