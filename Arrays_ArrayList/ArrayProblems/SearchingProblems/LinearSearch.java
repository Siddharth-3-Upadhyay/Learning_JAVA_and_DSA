package Arrays_ArrayList.ArrayProblems.SearchingProblems;

import java.util.Arrays;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {18, 12, -7, 3, 14, 28};
        int target = 14;
        System.out.println(searchInRange(arr, target, 1, 4));
        System.out.println(minInArray(arr));
        int[][] arr2D = {
                {23, 4, 1},
                {18, 12, 3, 9},
                {78, 99, 34, 56},
                {18, 12}
        };
        int target2 = 34;
        System.out.println(searchIn2DArray(arr2D, target2));
        int[] answer3 = search2D(arr2D, target2);
        System.out.println(Arrays.toString(answer3));
    }
    static int searchInRange(int[] arr, int target, int start, int end) {
        /* return the index if found, else return -1 */
        for (int i = start; i <= end; i++) {
            if (arr[i] == target) return i;
        }
        return -1;
    }
    static int minInArray(int[] arr) {
        int minElement = arr[0]; // 18.
        for (int i : arr) {
            if (i < minElement) minElement = i;
        }
        return minElement;
    }
    static int searchIn2DArray(int[][] arr, int target) {
        for (int[] i : arr) {
            for (int j : i) {
                if (j == target) return j;
            }
        }
        return -1;
    }
    static int[] search2D(int[][] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == target) return new int[] {i, j};
            }
        }
        return new int[] {-1, -1};
    }
}
