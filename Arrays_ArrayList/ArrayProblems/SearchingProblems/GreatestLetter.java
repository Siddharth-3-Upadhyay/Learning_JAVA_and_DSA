/*
Author: Siddharth Upadhyay
Question: 744. Find the smallest Letter greater than target.
Link: https://leetcode.com/problems/find-smallest-letter-greater-than-target/
 */

package Arrays_ArrayList.ArrayProblems.SearchingProblems;

public class GreatestLetter {
    public static void main(String[] args) {
        char[] arr = {'c', 'f', 'j'};
        System.out.println(nextGreatestLetter(arr, 'j'));
    }
    static char nextGreatestLetter(char[] letters, char target) {
        int startIndex = 0;
        int endIndex = letters.length - 1;
        while (startIndex <= endIndex) {
            int midIndex = startIndex + (endIndex - startIndex) / 2;
            if (target >= letters[letters.length - 1]) return letters[0];
            if (target < letters[midIndex]) endIndex = midIndex - 1;
            else startIndex = midIndex + 1;
        }
        return letters[startIndex];
    }
}
