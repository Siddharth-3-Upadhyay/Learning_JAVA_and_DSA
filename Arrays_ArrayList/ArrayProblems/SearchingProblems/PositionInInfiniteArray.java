/*
Author: Siddharth Upadhyay
Question: Find position of an element in a sorted array of infinite numbers (GeeksForGeeks)
Link: https://www.geeksforgeeks.org/find-position-element-sorted-array-infinite-numbers/
 */
package Arrays_ArrayList.ArrayProblems.SearchingProblems;

public class PositionInInfiniteArray {
    public static void main(String[] args) {
        int[] arr = {-18, -12, -4, 0, 2, 3, 5, 15, 16, 18, 22, 45, 89};
        int target = 45;
        int ans = finalAnswer(arr, target);
        System.out.println(ans);
    }
    static int finalAnswer(int[] arr, int target) {
        int startIndex = 0;
        int endIndex = 2;
        while (target > arr[endIndex]) {
            int temp = endIndex + 1; // this is my new start.
            // newEnd = previousEnd + sizeOfBox * 2;
            endIndex = endIndex + (endIndex - startIndex + 1) * 2;
            startIndex = temp;
        }
        return positionInInfiniteArray(arr, target, startIndex, endIndex);
    }
    static int positionInInfiniteArray(int[] arr, int target, int startIndex, int endIndex) {
        while (startIndex <= endIndex) {
            int midIndex = startIndex + (endIndex - startIndex) / 2;
            if (target == arr[midIndex]) return midIndex;
            else if (target < arr[midIndex]) endIndex = midIndex - 1;
            else startIndex = midIndex + 1;
        }
        return -1;
    }
}
