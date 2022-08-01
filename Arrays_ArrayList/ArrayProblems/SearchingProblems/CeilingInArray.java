package Arrays_ArrayList.ArrayProblems.SearchingProblems;

public class CeilingInArray {
    public static void main(String[] args) {
        int[] arrAsc = {-18, -12, -4, 0, 2, 3, 5, 15, 16, 18, 22, 45, 89};
        int[] arrDes = {99, 88, 79, 62, 46, 20, 15, 7, 5, 1, 0, - 8, -12, -29};
        int target = 90;
        System.out.println(ceilingInArray(arrAsc, target));
        System.out.println(ceilingInArray(arrDes, target));
    }
    /*
    Ceiling of a number is the smallest number greater or equal to target number.
    i.e., ceilingNumb >= target
     */
    static int ceilingInArray(int[] numbs, int target) {
        int startIndex = 0;
        int endIndex = numbs.length - 1;
        boolean isAscending = numbs[startIndex] < numbs[endIndex];
        while (startIndex <= endIndex) {
            int midIndex = startIndex + (endIndex - startIndex) / 2;
            if (target == numbs[midIndex]) return midIndex;
            if (isAscending && target > numbs[numbs.length - 1]) return -1;
            if (target < numbs[midIndex]) {
                if (isAscending) endIndex = midIndex - 1;
                else startIndex = midIndex + 1;
            } else {
                if (isAscending) startIndex = midIndex + 1;
                else endIndex = midIndex - 1;
            }
        }
        if (isAscending) return startIndex;
        else return endIndex;
    }
}
