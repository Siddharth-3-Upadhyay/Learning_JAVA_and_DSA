package Basics.Searching;

public class BinarySearch {
    /*
    Binary Search is used when the array is sorted (either in ascending or descending order).
     */
    public static void main(String[] args) {
        int[] arrAsc = {-18, -12, -4, 0, 2, 3, 5, 15, 16, 18, 22, 45, 89};
        int[] arrDes = {88, 79, 62, 46, 20, 7, 5, 1, 0, - 8, -12, -29};
        int target = -12;
        System.out.println(binarySearchAscending(arrAsc, target));
        System.out.println(binarySearchDescending(arrDes, target));
    }
    static int binarySearchAscending(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int midIndex = start + (end - start) / 2;
            if (arr[midIndex] == target) return midIndex;
            if (target < arr[midIndex]) {
                // Search in LHS.
                end = midIndex - 1;
            } else {
                // Search in RHS.
                start = midIndex + 1;
            }
        }
        return -1;
    }
    static int binarySearchDescending(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int midIndex = start + (end - start) / 2;
            if (target == arr[midIndex]) return midIndex;
            if (target < arr[midIndex]) {
                // Search in RHS.
                start = midIndex + 1;
            } else {
                // Search in LHS.
                end = midIndex - 1;
            }
        }
        return -1;
    }
}
