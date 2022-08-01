package FunctionProblems;

import java.util.Scanner;

public class PatternQuestions {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num;
        System.out.print("Enter the number: ");
        num = input.nextInt();

        pattern1(num);
        pattern2(num);
        pattern3(num);
        pattern4(num);
        pattern5(num);
        pattern6(num);
        pattern7(num);
        pattern8(num);
        pattern9(num);
        pattern10(num);
        pattern11(num);
        pattern12(num);
        pattern13(num);
        pattern14(num);
        pattern15(num);
        pattern16(num);
        pattern17(num);
        pattern18(num);
        pattern19(num);
        pattern20(num);
        pattern21(num);
        pattern22(num);
        pattern23(num);
        pattern24(num);
        pattern25(num);
        pattern26(num);
        pattern27(num);
        pattern28(num);
        pattern29(num);
        pattern30(num);
        pattern31(num);
        pattern32(num);
        pattern33(num);
        pattern34(num);
        pattern35(num);

        input.close();
    }
    static void pattern1(int num) {
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
    static void pattern2(int num) {
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
    static void pattern3(int num) {
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
    static void pattern4(int num) {
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
    static void pattern5(int num) {
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
    static void pattern6(int num) {
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
    static void pattern7(int num) {
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
    static void pattern8(int num) {
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
    static void pattern9(int num) {
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
    static void pattern10(int num) {
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
    static void pattern11(int num) {
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
    static void pattern12(int num) {
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
    static void pattern13(int num) {
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
    static void pattern14(int num) {
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
    static void pattern15(int num) {
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
    static void pattern16(int num) {
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
    static void pattern17(int num) { // ?? partially completed.
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
    static void pattern18(int num) {
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
    static void pattern19(int num) {
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
    static void pattern20(int num) {
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
    static void pattern21(int num) {
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
    static void pattern22(int num) {
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
    static void pattern23(int num) {
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
    static void pattern24(int num) {
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
    static void pattern25(int num) {
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
    static void pattern26(int num) {
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
    static void pattern27(int num) {
        // 1 2 3 4  17 18 19 20
        //   5 6 7  14 15 16
        //     8 9  12 13
        //       10 11
        System.out.println("Solution : 27 -------------------------------------------");
    }
    static void pattern28(int num) {
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
    static void pattern29(int num) {
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
    static void pattern30(int num) {
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
    static void pattern31(int num) {
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
    static void pattern32(int num) {
        // E
        // D E
        // C D E
        // B C D E
        // A B C D E
        System.out.println("Solution : 32 -------------------------------------------");
    }
    static void pattern33(int num) {
        // a
        // B c
        // D e F
        // g H i J
        // k L m N o
        System.out.println("Solution : 33 -------------------------------------------");
    }
    static void pattern34(int num) {
        // E D C B A
        // D C B A
        // C B A
        // B A
        // A
        System.out.println("Solution : 34 -------------------------------------------");
    }
    static void pattern35(int num) {
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
