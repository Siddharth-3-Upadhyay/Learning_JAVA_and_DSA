package Basics.Searching;

public class BinarySearch {
    /*
    Binary Search is used when the array is sorted (either in ascending or descending order).
     */
    public static void main(String[] args) {
        int[] arrAsc = {-18, -12, -4, 0, 2, 3, 5, 15, 16, 18, 22, 45, 89};
        int target = 111;
        System.out.println(binarySearchAscending(arrAsc, target));
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
}
