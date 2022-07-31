/*
 * Author: Siddharth Upadhyay
 * Question: 1672. Richest Customer Wealth
 * Link: https://leetcode.com/problems/richest-customer-wealth/
 */

package Arrays_ArrayList.ArrayProblems;

public class RichestWealth {
    public static void main(String[] args) {
        int[][] accounts = {
                {1, 5},
                {7, 3},
                {1, 100}
        };
        int answer = maximumWealth(accounts);
        System.out.println(answer);
    }
    static int maximumWealth(int[][] accounts) {
        int richestWealth = Integer.MIN_VALUE;
        for (int[] i : accounts) {
            int individualsWealth = 0;
            for (int j : i) {
                individualsWealth += j;
            }
            if (individualsWealth > richestWealth) richestWealth = individualsWealth;
        }
        return richestWealth;
    }
}
