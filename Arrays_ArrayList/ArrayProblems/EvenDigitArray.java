/*
 * Author: Siddharth Upadhyay
 * Question: 1295. Find Numbers with Even Number of Digits
 * Link: https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
 */

package Arrays_ArrayList.ArrayProblems;

public class EvenDigitArray {
    public static void main(String[] args) {
        int[] nums = {555, 901, 482, 1771, -677291};
        System.out.println(findNumbers(nums));
    }
    static int findNumbers(int[] nums) {
        int count = 0;
        for (int i : nums) {
            if (evenDigits(i)) count++;
        }
        return count;
    }
    static boolean evenDigits(int num) {
        int count = 0;
        /* since 0 is also a digit, therefore return false (bcz 1 is odd digit) */
        if (num == 0) {
            return false;
        }
        /* If num is -ve, convert it to +ve */
        if (num < 0) {
            num *= -1;
        }
        while (num > 0) {
            count++;
            num /= 10;
        }
        return (count % 2 == 0);
    }
}
