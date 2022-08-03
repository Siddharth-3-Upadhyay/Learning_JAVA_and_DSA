/*
* Author: Siddharth Upadhyay
* Date: 03.August.2022
* Question: 1095. Find in Mountain Array
* Tag: HARD
* Link: https://leetcode.com/problems/find-in-mountain-array/
*/

package Arrays_ArrayList.ArrayProblems.SearchingProblems;

public class MinimumIndexInMountainArray {
    public static void main(String[] args) {
        int[] arr = {0, 10, 7, 6, 5, 4, 1};
        int target = 12;
        System.out.println(findInMountainArray(arr, target));
    }
    /* STEPS: To find the target element's starting index in Mountain Array.
    * 1. Find the peak element
    * 2, Search the target element in the Ascending part of an array (i.e., 0 till peakElementIndex).
    * 3. If not found then search in Descending part of an array (i.e., peakElementIndex + 1till arr.length - 1).
    */
    static int findInMountainArray(int[] arr, int target) {
        int peakElementIndex = findPeakInMountainArray(arr);
        int peakElement = arr[peakElementIndex];
        if (target > peakElement) return -1;
        if (target == peakElement) return peakElementIndex;
        int findInAscendingPart = orderAgnosticBinarySearch(arr, target, true, 0, peakElementIndex);
        if (findInAscendingPart == -1) {
            return  orderAgnosticBinarySearch(arr, target, false, peakElementIndex + 1,
                    arr.length - 1);
        }
        return findInAscendingPart;
    }
    static int findPeakInMountainArray(int[] arr) {
        int startIndex = 0;
        int endIndex = arr.length - 1;
        while (startIndex < endIndex) {
            int midIndex = startIndex + (endIndex - startIndex) / 2;
            if (arr[midIndex] > arr[midIndex + 1]) {
                /* This means that we are descending part of array, but it might be the possible answer. */
                endIndex = midIndex;
            } else {
                /* This means that greater element lies ahead. Therefore, search in RHS. */
                startIndex = midIndex + 1;
            }
        }
        return startIndex;
    }
    static int orderAgnosticBinarySearch(int[] arr, int target, boolean isAscending, int startIndex, int endIndex) {
        while (startIndex <= endIndex) {
            int midIndex = startIndex + (endIndex - startIndex) / 2;
            if (target == arr[midIndex]) {
                return midIndex;
            }
            if (target < arr[midIndex]) {
                if (isAscending) {
                    /* Search in LHS. */
                    endIndex = midIndex - 1;
                } else {
                    /* Search in RHS. */
                    startIndex = midIndex + 1;
                }
            } else {
                if(isAscending) {
                    /* Search in RHS. */
                    startIndex = midIndex + 1;
                } else {
                    /* Search in LHS. */
                    endIndex = midIndex - 1;
                }
            }
        }
        return -1;
    }
    /* This is the exact solution require to submit on LeetCode.
    * The solution uses MountainArray's interface.
    */
//
//    public int findInMountainArray(int target, MountainArray mountainArr) {
//        int peakElementIndex = findPeakInMountainArray(mountainArr);
//        int peakElement = mountainArr.get(peakElementIndex);
//        if (target > peakElement) return -1;
//        if (target == peakElement) return peakElementIndex;
//        int findInAscendingPart = orderAgnosticBinarySearch(mountainArr, target, true, 0,
//                peakElementIndex);
//        if (findInAscendingPart == -1) {
//            return orderAgnosticBinarySearch(mountainArr, target, false,
//                    peakElementIndex + 1,
//                    mountainArr.length() - 1);
//        }
//        return findInAscendingPart;
//    }
//    public int findPeakInMountainArray(MountainArray arr) {
//        int startIndex = 0;
//        int endIndex = arr.length() - 1;
//        while (startIndex < endIndex) {
//            int midIndex = startIndex + (endIndex - startIndex) / 2;
//            if (arr.get(midIndex) > arr.get(midIndex + 1)) {
//                /* This means that we are descending part of array, but it might be the
//                possible answer. */
//                endIndex = midIndex;
//            } else {
//                /* This means that greater element lies ahead. Therefore, search in RHS. */
//                startIndex = midIndex + 1;
//            }
//        }
//        return startIndex;
//    }
//    public int orderAgnosticBinarySearch(MountainArray arr, int target,
//                                         boolean isAscending,
//                                         int startIndex, int endIndex) {
//        while (startIndex <= endIndex) {
//            int midIndex = startIndex + (endIndex - startIndex) / 2;
//            if (target == arr.get(midIndex)) {
//                return midIndex;
//            }
//            if (target < arr.get(midIndex)) {
//                if (isAscending) {
//                    /* Search in LHS. */
//                    endIndex = midIndex - 1;
//                } else {
//                    /* Search in RHS. */
//                    startIndex = midIndex + 1;
//                }
//            } else {
//                if(isAscending) {
//                    /* Search in RHS. */
//                    startIndex = midIndex + 1;
//                } else {
//                    /* Search in LHS. */
//                    endIndex = midIndex - 1;
//                }
//            }
//        }
//        return -1;
//    }
}
