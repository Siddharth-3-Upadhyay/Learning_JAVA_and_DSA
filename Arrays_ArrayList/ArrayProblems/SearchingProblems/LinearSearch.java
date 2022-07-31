package Arrays_ArrayList.ArrayProblems.SearchingProblems;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {18, 12, -7, 3, 14, 28};
        int target = 14;
        System.out.println(searchInRange(arr, target, 1, 4));
    }
    static int searchInRange(int[] arr, int target, int start, int end) {
        /* return the index if found, else return -1 */
        for (int i = start; i <= end; i++) {
            if (arr[i] == target) return i;
        }
        return -1;
    }
}
