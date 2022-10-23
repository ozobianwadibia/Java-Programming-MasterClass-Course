/**
 * In this challenge, you are required to calculate and print the sum of the elements in an array, keeping in mind that some of those integers may be quite large.
 *
 * Function Description
 *
 * Complete the aVeryBigSum function in the editor below. It must return the sum of all array elements.
 *
 * aVeryBigSum has the following parameter(s):
 *
 * int ar[n]: an array of integers .
 * Return
 *
 * long: the sum of all array elements
 * Input Format
 *
 * The first line of the input consists of an integer .
 * The next line contains  space-separated integers contained in the array.
 *
 * Output Format
 *
 * Return the integer sum of the elements in the array.
 */


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AVeryBigSum {

    /**
     * A method for computing sum of large numbers in an array
     * @param ar the list / array
     * @return the sum (Long)
     */
    public static long aVeryBigSum(List<Long> ar) {
        System.out.println("Enter number of items: ");
        int numOfItems; // the array items
        Scanner scn = new Scanner(System.in);
        numOfItems = scn.nextInt();
        scn.nextLine();

        // populating the array / list
        for (int i = 0; i < numOfItems; i++) {
            System.out.println("Enter item " + (i + 1));
            ar.add(scn.nextLong());
        }

        long sum = 0L;
        for (int i = 0; i < ar.size(); i++) {
            sum += ar.get(i);
        }
        return sum;
    }


    // The main method
    public static void main(String[] args) {
        List<Long> test = new ArrayList<>();
        Long printSum = aVeryBigSum(test);
        System.out.println("The total is: " + printSum);
    }
}