/**
 * Write a method called isOdd with an int parameter and call it number. The method needs to return a boolean.
 *
 * Check that number is > 0, if it is not return false.
 *
 * If number is odd return true, otherwise return false.
 *
 * Write a second method called sumOdd that has 2 int parameters start and end, which represent a range of numbers.
 *
 * The method should use a for loop to sum all odd numbers in that range including the end and return the sum.
 *
 * It should call the method isOdd to check if each number is odd.
 *
 * The parameter end needs to be greater than or equal to start and both start and end parameters have to be greater than 0.
 *
 * If those conditions are not satisfied return -1 from the method to indicate invalid input.
 */

public class SumOdd {
    /**
     * Prints a boolean after checking oddity of number
     * @param numberToBeChecked the number to be checked
     * @return true or false
     */
    public static boolean isOdd(int numberToBeChecked) {
        boolean correct = false;
        if (numberToBeChecked < 0) {
            return false;
        }
        if (numberToBeChecked % 2 == 1) {
            correct = true;
        }
        return correct;
    }

    /**
     * Prints the sum of odd numbers in a range
     * @param start the start point
     * @param end the end point
     * @return the sum of odd numbers
     */
    public static int sumOdd(int start, int end) {
        int sum;
        if (end >= start && start > 0) {
            sum = 0;
            for (int i = start; i <= end; ++i) {
                if (isOdd(i)) {
                    sum += i;
                }
            }
        } else {
            return -1;
        }
        return sum;
    }


    public static void main(String[] args) {
        // testing the methods above
        System.out.println(sumOdd(1, 100)); // 2500
        System.out.println(sumOdd(-1, 100)); // -1
        System.out.println(sumOdd(100, 100)); // 0
        System.out.println(sumOdd(13, 13)); // 13
        System.out.println(sumOdd(100, -100)); // -1
        System.out.println(sumOdd(100, 1000)); // 247500
    }
}