/*
Author: Siddharth Upadhyay
Question: 34. Find First and Last Position of Element in Sorted Array
Link: https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
 */

package Arrays_ArrayList.ArrayProblems.SearchingProblems;

import java.util.Arrays;

public class FirstLastPositionInArray {
    public static void main(String[] args) {
        int[] arrAsc = {7, 7, 7, 7, 7, 8, 8, 8};
        int target = 8;
        System.out.println(Arrays.toString(searchRange(arrAsc, target)));
    }
    static int[] searchRange(int[] nums, int target) {
        int[] ans = {-1, -1};
        ans[0] = firstLastOccurrence(nums, target, true);
        if (ans[0] != -1) {
            ans[1] = firstLastOccurrence(nums, target, false);
        }
        return ans;
    }
    static int firstLastOccurrence(int[] arr, int target, boolean isFirstIndex) {
        int ans = -1;
        int startIndex = 0;
        int endIndex = arr.length - 1;
        while (startIndex <= endIndex) {
            int midIndex = startIndex + (endIndex - startIndex) / 2;
            if (target == arr[midIndex]) {
                // this might be the answer, but have to check further.
                ans = midIndex;
                /* If we want to find the first occurrence we will search in LHS
                * else search in RHS.
                 */
                if (isFirstIndex) endIndex = midIndex - 1;
                else startIndex = midIndex + 1;
            } else if (target < arr[midIndex]) endIndex = midIndex - 1;
            else startIndex = midIndex + 1;
        }
        return ans;
    }
}
