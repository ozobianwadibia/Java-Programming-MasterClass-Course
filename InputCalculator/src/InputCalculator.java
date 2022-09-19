import java.util.ArrayList;
import java.util.Scanner;

/**
 * Write a method called inputThenPrintSumAndAverage that does not have any parameters.
 * The method should not return anything (void) and it needs to keep reading int numbers from the keyboard.
 * When the user enters something that is not an int then it needs to print a message in the format "SUM = XX AVG = YY".
 * XX represents the sum of all entered numbers of type int.
 * YY represents the calculated average of all numbers of type long.
 */

public class InputCalculator {
    /**
     * Prints the sum of and average of numbers entered
     */
    public static void inputThenPrintSumAndAverage() {
        Scanner scn = new Scanner(System.in);
        int sum = 0; // the sum
        int avg = 0; // the average

        // arraylist to hold the integers
        ArrayList<Integer> nums = new ArrayList<>();

        System.out.println("Enter a number: ");
        while (scn.hasNextInt()) {
            nums.add(scn.nextInt());
            System.out.println("Enter a number: ");
        }
        // checking if arraylist is empty
        if (!nums.isEmpty()) {
            for (Integer num : nums) {
                sum += num;
            }
            avg += Math.round((double)(sum) / nums.size());
            System.out.println("SUM = " + sum + " AVG = " + avg);
        }
        else {
            System.out.println("SUM = " + 0 + " AVG = " + 0);
        }
        scn.close();
    }


    public static void main(String[] args) {
        // testing the method above
        inputThenPrintSumAndAverage();
    }
}