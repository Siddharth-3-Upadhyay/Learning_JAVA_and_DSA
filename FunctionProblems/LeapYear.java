package FunctionProblems;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int year;
        System.out.print("Enter the Year: ");
        year = sc.nextInt();
        isLeapYear(year);

        sc.close();
    }
    static void isLeapYear(int year) {
        /*
         * 1. If the year is evenly divisible by 4, go to step 2. Otherwise, go to step 5.
         * 2. If the year is evenly divisible by 100, go to step 3. Otherwise, go to step 4.
         * 3. If the year is evenly divisible by 400, go to step 4. Otherwise, go to step 5.
         * 4. The year is a leap year (it has 366 days).
         * 5. The year is not a leap year (it has 365 days).
         */
        if (year % 4 == 0) {
            // If the year is century then only check for divisibility with 400.
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println(year + " is a Leap Year!");
                } else {
                    System.out.println(year + " is a Not a Leap Year.");
                }
            } else {
                System.out.println(year + " is a Leap Year!");
            }
        } else {
            System.out.println(year + " is a Not a Leap Year.");
        }
        /* OR this method.
        if (year % 100 == 0) {
            // this means it is century year. So check with 400
            if (year % 400 == 0) {
                System.out.println(year + " is Leap Year!");
            } else {
                System.out.println(" Not a Leap Year.");
            }
        } else {
            if (year % 4 == 0) {
                System.out.println(year + " is Leap Year!");
            } else {
                System.out.println(year + " Not a Leap Year.");
            }
        }
        */
    }
}
