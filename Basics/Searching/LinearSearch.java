package Basics.Searching;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {18, 12, 9, 14, 77, 50};
        int toSearch = 55;
        if (linearSearch(arr, toSearch) == -1)
            System.out.println("Element not found.");
        else
            System.out.println("Element found.");
    }
    /* Search the target element and return the index, if not found return -1. */
    static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) return i;
        }
        return -1;
    }
    /* Search the element and return the element itself. */
    static int linearSearch2(int[] arr, int target) {
        /* If index is not used we can use for-each loop. */
        for (int i : arr) {
            if (i == target) return i;
        }
        return Integer.MAX_VALUE; // bcz "-1" could be the target to value to search in an array. So we return Integer.MAX_VALUE;
    }
    /* Search the element and return true or false. */
    static boolean linearSearch3(int[] arr, int target) {
        for (int i : arr) {
            if (i == target) return true;
        }
        return false;
    }
}
