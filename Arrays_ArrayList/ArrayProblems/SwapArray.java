package Arrays_ArrayList.ArrayProblems;

import java.util.Arrays;

public class SwapArray {
    public static void main(String[] args) {
        int[] arr = {23, 3432, 135, 12, 6987, 889};
        System.out.println("Original Array: " + Arrays.toString(arr));
        swapArr(arr, 0, arr.length - 1);
        System.out.println("After Swapping: " + Arrays.toString(arr));

    }
    static void swapArr(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
