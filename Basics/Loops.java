package Basics;

public class Loops {
    public static void main(String[] args) {
        /*
         * Three loops in JAVA
         * 1. while loop -> If you don't know how many times the loop is going to run use while loop.
         * 2. for loop -> If you know how many times the loop is going to run use for loop.
         * 3. do while loop -> If you have to run the loop atleast one time use do while loop.
         */

        // while loop
        /*
        * Syntax:
        * while (condition) {
        *   body...
        * }*/
        int a = 1;
        while (a <= 10) {
            System.out.println("Hello World!!");
            a++;
        }

        // for loop
        /*
        * Syntax:
        * for (initialization; condition; increment/decrement) {
        *   body ...
        * }*/
        for (int i = 1; i != 6; i++) {
            System.out.println("Hello World!!");
        }

        // do while loop
        /*
        * Syntax:
        * do {
        *   body ...
        * } while (condition);*/
        do {
            System.out.println("Hello World!!");
        } while (a <= 20);
    }
}
