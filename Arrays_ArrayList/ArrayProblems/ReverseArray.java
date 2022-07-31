package Arrays_ArrayList.ArrayProblems;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        System.out.print("Actual Array: ");
        System.out.println(Arrays.toString(arr));
        reverseArray(arr);
        System.out.print("After Reversing Array: ");
        System.out.println(Arrays.toString(arr));
    }
    static void reverseArray(int[] arr) {
        /* [1, 2, 5, 9, 7, 8]
         * startIndex : 0
         * endIndex : arr.length
         * swap(startIndex, endIndex)
         * startIndex++ and endIndex--
         * if startIndex > endIndex
         * end the program.
         */
        int startIndex = 0;
        int endIndex = arr.length - 1;
        while (startIndex < endIndex) {
            swapArr(arr, startIndex, endIndex);
            startIndex++;
            endIndex--;
        }
    }
    static void swapArr(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
