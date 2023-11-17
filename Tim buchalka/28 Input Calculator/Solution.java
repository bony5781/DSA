import java.util.Scanner;
import java.lang.Math;

public class Solution {
    // write code here
    public static void inputThenPrintSumAndAverage() {

        Scanner scanner = new Scanner(System.in);
        double sum = 0;
        int loopCount = 0;
        long avg = 0;

        while (true) {
            System.out.print("Enter a number : ");
            String nextEntry = scanner.nextLine();
            try {
                int validNum = Integer.parseInt(nextEntry);
                sum += validNum;
                loopCount++;
            } catch (NumberFormatException nfe) {
                break;
            }
        }
        avg = Math.round((double)sum/loopCount);
        System.out.println("SUM = " + Math.floor(sum)  + " AVG = " + avg);
    }

    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }

}