package Arrays_ArrayList.ArrayProblems.SearchingProblems;

public class FloorInArray {
    public static void main(String[] args) {
        int[] arrAsc = {-18, -12, -4, 0, 2, 3, 5, 15, 16, 18, 22, 45, 89};
        int[] arrDes = {99, 88, 79, 62, 46, 20, 15, 7, 5, 1, 0, - 8, -12, -29};
        int target = 90;
        System.out.println(floorInArray(arrAsc, target));
        System.out.println(floorInArray(arrDes, target));
    }
    static int floorInArray(int[] arr, int target) {
        int startIndex = 0;
        int endIndex = arr.length - 1;
        boolean isAscending = arr[startIndex] < arr[endIndex];
        while (startIndex <= endIndex) {
            int midIndex = startIndex + (endIndex - startIndex) / 2;
            if (target == arr[midIndex]) return midIndex;
            if (isAscending && target > arr[arr.length - 1]) return endIndex;
            if (target < arr[midIndex]) {
                if (isAscending) endIndex = midIndex - 1;
                else startIndex = midIndex + 1;
            } else {
                if (isAscending) startIndex = midIndex + 1;
                else endIndex = midIndex - 1;
            }
        }
        if (isAscending) return endIndex;
        else return startIndex;
    }
}
