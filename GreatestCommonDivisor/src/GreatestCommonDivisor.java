import java.util.ArrayList;
import java.util.Collections;

/**
 * Write a method named getGreatestCommonDivisor with two parameters of type int named first and second.
 *
 * If one of the parameters is < 10, the method should return -1 to indicate an invalid value.
 *
 * The method should return the greatest common divisor of the two numbers (int).
 *
 * The greatest common divisor is the largest positive integer that can fully divide each of the integers (i.e. without leaving a remainder).
 */

public class GreatestCommonDivisor {

    /**
     * Produces the Highest common factor of two 2 numbers
     * @param first the first number
     * @param second the second number
     * @return an integer, the H.C.F.
     */
    public static int getGreatestCommonDivisor(int first, int second) {
        if ((first < 10) || (second < 10)) {
            return -1;
        }
        // the base case
        if (first == second) {
            return first;
        }
        // arraylist to hold the factors of 'first'
        ArrayList<Integer> firstNum = new ArrayList<>();
        for (int i = 1; i <= first; i++) {
            if (first % i == 0) {
                firstNum.add(i);
            }
        }
        // arraylist to hold the factors of 'second'
        ArrayList<Integer> secondNum = new ArrayList<>();
        for (int i = 1; i <= second; i++) {
            if (second % i == 0) {
                secondNum.add(i);
            }
        }
        // separating the items that are unique to both arraylists
        if (firstNum.size() > secondNum.size()) {
            firstNum.retainAll(secondNum);
            return Collections.max(firstNum); // return the max item
        }
        else {
            secondNum.retainAll(firstNum);
            return Collections.max(secondNum); // return the max item
        }
    }

    // An Alternative and more efficient method for GCD below!
    public static int getGreatestCmnDiv(int first, int second) {
        int result = Math.min(first, second); // Find Minimum of a nd b
        while (result > 0) {
            if (first % result == 0 && second % result == 0) {
                break;
            }
            result--;
        }
        return result; // return gcd of first and second
    }


    public static void main(String[] args) {
        // testing the 1st method above
        System.out.println(getGreatestCommonDivisor(11, 11)); // 11
        System.out.println(getGreatestCommonDivisor(25, 15)); // 5
        System.out.println(getGreatestCommonDivisor(12, 30)); // 6
        System.out.println(getGreatestCommonDivisor(9, 18));  // -1
        System.out.println(getGreatestCommonDivisor(81, 153)); // 9
        System.out.println(getGreatestCommonDivisor(12, 12)); // 12
        System.out.println();

        System.out.println("Testing the time to execute for both algorithms: ");
        long startTime = System.nanoTime();
        getGreatestCmnDiv(81, 153);
        long endTime = System.nanoTime();
        long duration = (endTime - startTime);
        System.out.println("'getGreatestCommonDivisor' -> " + duration);

        long startTime2 = System.nanoTime();
        getGreatestCommonDivisor(81, 153);
        long endTime2 = System.nanoTime();
        long duration2 = (endTime2 - startTime2);
        System.out.println("'getGreatestCmnDiv' -> " + duration2);

    }
}