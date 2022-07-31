package Basics;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysBasics {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        /* Syntax
         * datatype[] variableName = new datatype[size];
         * datatype[] variableName = { ... };
         */
        int[] arr = new int[5];
        /* Input an Array */
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }
        /* Output using simple for loop. */
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        /* Output using simple for-each loop. */
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
        /* Output using toString method of Array Class. */
        System.out.println(Arrays.toString(arr));
    }
}
