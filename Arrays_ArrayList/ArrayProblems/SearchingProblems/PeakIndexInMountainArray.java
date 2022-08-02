/*
Author: Siddharth Upadhyay
Question: 852. Peak Index in a Mountain Array
Link: https://leetcode.com/problems/peak-index-in-a-mountain-array/
 */

package Arrays_ArrayList.ArrayProblems.SearchingProblems;

public class PeakIndexInMountainArray {
    public static void main(String[] args) {
        int[] arr = {0, 10, 2, 1, 0};
        System.out.println(peakIndexInMountainArray(arr));
    }
    static int peakIndexInMountainArray(int[] arr) {
        int startIndex = 0;
        int endIndex = arr.length - 1;
        while (startIndex < endIndex) {
            int midIndex = startIndex + (endIndex - startIndex) / 2;
            if (arr[midIndex] > arr[midIndex + 1]) {
                // search in LHS.
                // This means that we are in Descending part of an array and the largest element is present on LHS.
                endIndex = midIndex;
            } else {
                // search in RHS.
                // This means that we are in Ascending part on an array and the largest element is present on RHS.
                startIndex = midIndex + 1;
            }
        }
        /*
         * In the end, startIndex == endIndex and pointing to the largest element.
         * startIndex and endIndex always trying to find max element in the above 2 checks.
         * hence, when they are pointing to the one element, that is the max element.
         */
        return startIndex; // or return endIndex as both are equal.
    }
}
