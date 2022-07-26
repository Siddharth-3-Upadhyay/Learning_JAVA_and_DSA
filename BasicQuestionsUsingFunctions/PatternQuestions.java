package BasicQuestionsUsingFunctions;

import java.util.Scanner;

class Solution {
    int num;
    void pattern1() {
        // *****
        // *****
        // *****
        // *****
        // *****
        System.out.println("Solution : 1 -------------------------------------------");
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    // all triangle type patterns.
    void pattern2() {
        // *
        // **
        // ***
        // ****
        // *****
        System.out.println("Solution : 2 -------------------------------------------");
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    void pattern3() {
        // *****
        // ****
        // ***
        // **
        // *
        System.out.println("Solution : 3 -------------------------------------------");
        for (int i = num; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    void pattern4() {
        // 1
        // 12
        // 123
        // 1234
        // 12345
        System.out.println("Solution : 4 -------------------------------------------");
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    void pattern5() {
        // *
        // **
        // ***
        // ****
        // *****
        // ****
        // ***
        // **
        // *
        System.out.println("Solution : 5 -------------------------------------------");
        for (int i = 1; i <= 2 * num - 1; i++) {
            int totalColumn = i <= num ? i : 2 * num - i;
            for (int j = 1; j <= totalColumn; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    void pattern6() {
        //     *
        //    **
        //   ***
        //  ****
        // *****
        System.out.println("Solution : 6 -------------------------------------------");
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num; j++) {
                if (j >= num - i + 1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
    void pattern7() {
        // *****
        //  ****
        //   ***
        //    **
        //     *
        System.out.println("Solution : 7 -------------------------------------------");
        for (int i = num; i >= 1; i--) {
            for (int j = 1; j <= num; j++) {
                if (j <= num - i)
                    System.out.print(" ");
                else
                    System.out.print("*");
            }
            System.out.println();
        }
    }
    void pattern8() {
        //     *
        //    ***
        //   *****
        //  *******
        // *********
        System.out.println("Solution : 8 -------------------------------------------");
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num + i - 1; j++) {
                if (j > num - i)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
    void pattern9() {
        // *********
        //  *******
        //   *****
        //    ***
        //     *
        System.out.println("Solution : 9 -------------------------------------------");
        for (int i = 1; i <= num; i++) {
            // 9 8 7 6 5
            for (int j = 1; j <= 2 * num - i; j++) {
                if (j < i)
                    System.out.print(" ");
                else
                    System.out.print("*");
            }
            System.out.println();
        }
    }
    void pattern10() {
        //     *
        //    * *
        //   * * *
        //  * * * *
        // * * * * *
        System.out.println("Solution : 10 -------------------------------------------");
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num; j++) {
                if (j >= num - i + 1)
                    System.out.print("* ");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
    void pattern11() {
        // * * * * *
        //  * * * *
        //   * * *
        //    * *
        //     *
        System.out.println("Solution : 11 -------------------------------------------");
        for (int i = num; i >= 1; i--) {
            for (int j = 1; j <= num; j++) {
                if (j <= num - i)
                    System.out.print(" ");
                else
                    System.out.print("* ");
            }
            System.out.println();
        }
    }
    void pattern12() {
        // * * * * *
        //  * * * *
        //   * * *
        //    * *
        //     *
        //     *
        //    * *
        //   * * *
        //  * * * *
        // * * * * *
        System.out.println("Solution : 12 -------------------------------------------");
        for (int i = 1; i <= 2 * num; i++) {
            int totalSpaces = i <= num ? i - 1 : 2 * num - i;
            for (int j = 1; j <= num; j++) {
                if (j <= totalSpaces)
                    System.out.print(" ");
                else
                    System.out.print("* ");
            }
            System.out.println();
        }
    }
    void pattern13() {
        //     *
        //    * *
        //   *   *
        //  *     *
        // *********
        System.out.println("Solution : 13 -------------------------------------------");
        for (int i = 1; i <= num; i++) {
            int lastColumn = num + i - 1;
            for (int j = 1; j <= lastColumn; j++) {
                if (i == num || j == lastColumn || j == num - i + 1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
    void pattern14() {
        // *********
        //  *     *
        //   *   *
        //    * *
        //     *
        System.out.println("Solution : 14 -------------------------------------------");
        for (int i = 1; i <= num; i++) {
            int lastColumn = 2 * num - i;
            for (int j = 1; j <= lastColumn; j++) {
                if (i == 1 || j == i || j == lastColumn)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
    void pattern15() {
        //     *
        //    * *
        //   *   *
        //  *     *
        // *       *
        //  *     *
        //   *   *
        //    * *
        //     *
        System.out.println("Solution : 15 -------------------------------------------");
        for (int i = 1; i <= 2 * num - 1; i++) {
            int totalColumn = i <= num ? num + i - 1 : 2 * num - i + 4;
            int totalSpaces = i <= num ? num - i + 1 : i - num + 1;
            for (int j = 1; j <= totalColumn; j++) {
                if (j == totalColumn || j == totalSpaces)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
    void pattern16() {
        //           1
        //         1   1
        //       1   2   1
        //     1   3   3   1
        //   1   4   6   4   1
        System.out.println("Solution : 16 -------------------------------------------");
        for (int i = 1; i <= num; i++) {
            // for loop to print spaces
            for (int j = 1; j <= num - i; j++) {
                System.out.print(" ");
            }
            // for loop to print the number
            for (int j = 1; j <= 2 * i - 1; j++) {
                if (j % 2 != 0) System.out.print(j);
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
    void pattern17() { // ?? partially completed.
        //      1
        //     212
        //    32123
        //   4321234
        //    32123
        //     212
        //      1
        System.out.println("Solution : 17 -------------------------------------------");
        for (int i = 1; i <= 2 * num - 1; i++) {
            int totalColumn = i <= num ? num + i - 1 : 2 * num - i + 4;
            int totalStars = i <= num ? num - i + 1: i - num + 1;
            for (int j = 1; j <= totalColumn; j++) {
                if (j >= totalStars)
                    System.out.print(i);
                else System.out.print(" ");
            }
            System.out.println();
        }

    }
    void pattern18() {
        //   **********
        //   ****  ****
        //   ***    ***
        //   **      **
        //   *        *
        //   *        *
        //   **      **
        //   ***    ***
        //   ****  ****
        //   **********
        System.out.println("Solution : 18 -------------------------------------------");
        for (int i = 1; i <= 2 * num; i++) {
            if (i <= num) {
                for (int j = 1; j <= 2 * num; j++) {
                    if (j <= num - i + 1 || j >= num + i) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            } else {
                for (int j = 1; j <= 2 * num; j++) {
                    if (j <= i - num || j >= 2 * num - i + num + 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
    void pattern19() {
        // *        *
        // **      **
        // ***    ***
        // ****  ****
        // **********
        // ****  ****
        // ***    ***
        // **      **
        // *        *
        System.out.println("Solution : 19 -------------------------------------------");
        for (int i = 1; i <= 2 * num - 1; i++) {
            int minStars = i <= num ? i : 2 * num - i;
            int maxStars = i <= num ? 2 * num - i + 1 : i + 1;
            for (int j = 1; j <= 2 * num; j++) {
                if (j <= minStars || j >= maxStars)
                    System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }

    }
    void pattern20() {
        // ****
        // *  *
        // *  *
        // *  *
        // ****
        System.out.println("Solution : 20 -------------------------------------------");
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num - 1; j++) {
                if (i == 1 || i == num || j == 1 || j == num - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    void pattern21() {
        // 1
        // 2  3
        // 4  5  6
        // 7  8  9  10
        // 11 12 13 14 15
        System.out.println("Solution : 21 -------------------------------------------");
        short toPrint = 1;
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(toPrint + " ");
                toPrint++;
            }
            System.out.println();
        }
    }
    void pattern22() {
        // 1
        // 0 1
        // 1 0 1
        // 0 1 0 1
        // 1 0 1 0 1
        // Idea: Solve using matrix pattern (i,j)
        System.out.println("Solution : 22 -------------------------------------------");
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0) { // for even matrix.
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
    void pattern23() {
        //       *      *
        //     *   *  *   *
        //   *       *      *
        System.out.println("Solution : 23 -------------------------------------------");
        /*
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= 5 * num; j++) {

            }
        }
         */
    }
    void pattern24() {
        // *        *
        // **      **
        // * *    * *
        // *  *  *  *
        // *   **   *
        // *   **   *
        // *  *  *  *
        // * *    * *
        // **      **
        // *        *
        System.out.println("Solution : 24 -------------------------------------------");
        for (int i = 1; i <= 2 * num; i++) {
            if (i <= num) {
                for (int j = 1; j <= 2 * num; j++) {
                    if (j == 1 || j == 2 * num || j == i || j == 2 * num - i + 1)
                        System.out.print("*");
                    else System.out.print(" ");
                }
            } else {
                for (int j = 1; j <= 2 * num; j++) {
                    if (j == 1 || j == 2 * num || j == 2 * num - i + 1|| j == i)
                        System.out.print("*");
                    else System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    void pattern25() {
        //       *****
        //      *   *
        //     *   *
        //    *   *
        //   *****
        System.out.println("Solution : 25 -------------------------------------------");
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= 2 * num - i; j++) {
                if ((i == 1 && j >= num) || i == num ||j == num - i + 1 || j == 2 * num - i)
                    System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
    void pattern26() {
        // 1 1 1 1 1 1
        // 2 2 2 2 2
        // 3 3 3 3
        // 4 4 4
        // 5 5
        // 6
        System.out.println("Solution : 26 -------------------------------------------");
        for (int i = num; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num - i + 1);
            }
            System.out.println();
        }
    }
    void pattern27() {
        // 1 2 3 4  17 18 19 20
        //   5 6 7  14 15 16
        //     8 9  12 13
        //       10 11
        System.out.println("Solution : 27 -------------------------------------------");
    }
    void pattern28() {
        //      *
        //     * *
        //    * * *
        //   * * * *
        //  * * * * *
        //   * * * *
        //    * * *
        //     * *
        //      *
        System.out.println("Solution : 28 -------------------------------------------");
        for (int i = 1; i <= 2 * num - 1; i++) {
            int totalStars = i <= num ? num - i + 1 : i - num + 1;
            for (int j = 1; j <= num; j++) {
                if (j >= totalStars) System.out.print("* ");
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
    void pattern29() {
        //    *        *
        //    **      **
        //    ***    ***
        //    ****  ****
        //    **********
        //    ****  ****
        //    ***    ***
        //    **      **
        //    *        *
        System.out.println("Solution : 29 -------------------------------------------");
        for (int i = 1; i <= 2 * num - 1; i++) {
            if (i <= num) {
                for (int j = 1; j <= 2 * num; j++) {
                    if (j <= i || j >= 2 * num - i + 1)
                        System.out.print("*");
                    else System.out.print(" ");
                }
            } else {
                for (int j = 1; j <= 2 * num; j++) {
                    if (j <= 2 * num - i || j >= i + 1)
                        System.out.print("*");
                    else System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    void pattern30() {
        //         1
        //       2 1 2
        //     3 2 1 2 3
        //   4 3 2 1 2 3 4
        // 5 4 3 2 1 2 3 4 5
        System.out.println("Solution : 30 -------------------------------------------");
        for (int i = 1; i <= num; i++) {
            int toPrint = i;
            for (int j = 1; j <= num; j++) {
                if (j >= num - i + 1) {
                    System.out.print(toPrint + " ");
                    toPrint--;
                }
                else System.out.print("  ");
            }
            for (int j = 2; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    void pattern31() {
        // 4 4 4 4 4 4 4
        // 4 3 3 3 3 3 4
        // 4 3 2 2 2 3 4
        // 4 3 2 1 2 3 4
        // 4 3 2 2 2 3 4
        // 4 3 3 3 3 3 4
        // 4 4 4 4 4 4 4
        System.out.println("Solution : 31 -------------------------------------------");
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    void pattern32() {
        // E
        // D E
        // C D E
        // B C D E
        // A B C D E
        System.out.println("Solution : 32 -------------------------------------------");
    }
    void pattern33() {
        // a
        // B c
        // D e F
        // g H i J
        // k L m N o
        System.out.println("Solution : 33 -------------------------------------------");
    }
    void pattern34() {
        // E D C B A
        // D C B A
        // C B A
        // B A
        // A
        System.out.println("Solution : 34 -------------------------------------------");
    }
    void pattern35() {
        // 1      1
        // 12    21
        // 123  321
        // 12344321
        System.out.println("Solution : 35 -------------------------------------------");
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= 2 * num; j++) {
                if (j <= i || j >= 2 * num - i + 1)
                    System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }
    }

}

public class PatternQuestions {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Solution sol = new Solution();
        System.out.print("Enter the number: ");
        sol.num = input.nextInt();
        sol.pattern1();
        sol.pattern2();
        sol.pattern3();
        sol.pattern4();
        sol.pattern5();
        sol.pattern6();
        sol.pattern7();
        sol.pattern8();
        sol.pattern9();
        sol.pattern10();
        sol.pattern11();
        sol.pattern12();
        sol.pattern13();
        sol.pattern14();
        sol.pattern15();
        sol.pattern16();
        sol.pattern17();
        sol.pattern18();
        sol.pattern19();
        sol.pattern20();
        sol.pattern21();
        sol.pattern22();
        sol.pattern23();
        sol.pattern24();
        sol.pattern25();
        sol.pattern26();
        sol.pattern27();
        sol.pattern28();
        sol.pattern29();
        sol.pattern30();
        sol.pattern31();
        sol.pattern32();
        sol.pattern33();
        sol.pattern34();
        sol.pattern35();

        input.close();
    }
}
