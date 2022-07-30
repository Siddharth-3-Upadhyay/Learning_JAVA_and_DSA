package BasicQuestionsUsingFunctions;

import java.util.Scanner;

public class AverageOfNNumbers {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        averageOfNNums();
    }
    static void averageOfNNums() {
        int count = -1;
        float num, sum = 0;
        float average;
        do {
            System.out.print("Enter number, press '0' to exit: ");
            num = input.nextInt();
            sum += num;
            count++;
        } while (num != 0);
        average = sum / count;
        System.out.println("Average: " + average);
    }
}
