import java.util.ArrayList;

/**
 * What is the perfect number?
 * A perfect number is a positive integer which is equal to the sum of its proper positive divisors.
 * Proper positive divisors are positive integers that fully divide the perfect number without leaving a remainder and exclude the perfect number itself.
 * For example, take the number 6:
 * Its proper divisors are 1, 2, and 3 (since 6 is the value of the perfect number, it is excluded), and the sum of its proper divisors is 1 + 2 + 3 = 6.
 *
 * Therefore, 6 is a perfect number (as well as the first perfect number).
 *
 *
 * Write a method named isPerfectNumber with one parameter of type int named number.
 *
 * If number is < 1, the method should return false.
 *
 * The method must calculate if the number is perfect. If the number is perfect, the method should return true; otherwise, it should return false
 */


public class PerfectNumber {

    /**
     * Prints a boolean based on the outcome of the number check
     * @param num the number to be checked
     * @return true or false
     */
    public static boolean isPerfectNumber(int num) {
        if (num <= 0) {
            return false;
        }
        // arraylist to hold the divisors
        ArrayList<Integer> arrayListToHoldDivisors = new ArrayList<>();
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                arrayListToHoldDivisors.add(i);
            }
        }
        int sum = 0; // holds the sum of divisors
        // adding the divisors
        for (Integer arrayListToHoldDivisor : arrayListToHoldDivisors) {
            sum += arrayListToHoldDivisor;
        }
        return sum == num;
    }

    public static void main(String[] args) {
        // testing the method above
        System.out.println(isPerfectNumber(6));  // true
        System.out.println(isPerfectNumber(28));  // true
        System.out.println(isPerfectNumber(5));  // false
        System.out.println(isPerfectNumber(-1));  // false
        System.out.println(isPerfectNumber(0));  // false
    }
}