import java.util.ArrayList;
import java.util.Collections;

/**
 * Write a method named getLargestPrime with one parameter of type int named number.
 * <p>
 * If the number is negative or does not have any prime numbers, the method should return -1 to indicate an invalid value.
 * <p>
 * The method should calculate the largest prime factor of a given number and return it.
 */


public class LargestPrime {

    /**
     * Computes the largest prime factor of given number
     *
     * @param number the number under examination
     * @return an int, largest prime factor
     */
    public static int getLargestPrime(int number) {

        class InnerLocal {
            boolean isPrime(int num) {
                for (int i = 2; i < num; i++) {
                    if (num % i == 0) {
                        return false; // non prime
                    }
                }
                return true; // prime
            }
        }
        // validation
        if ((number <= 0) || (number == 1)) {
            return -1;
        }
        // arraylist to hold all the factors of 'number'
        ArrayList<Integer> numFactors = new ArrayList<>();
        // instance of the nested class
        InnerLocal il = new InnerLocal();
        for (int i = 2; i < number; i++) {
            // factors of the number && those that are primes
            if ((number % i == 0) && (il.isPrime(i))) {
                numFactors.add(i); // populate the arraylist
            }
        }
        return Collections.max(numFactors); // return the largest prime factor
    }


    public static void main(String[] args) {
        // testing the method above
        System.out.println(getLargestPrime(21));  // 7
        System.out.println(getLargestPrime(217));  // 31
        System.out.println(getLargestPrime(0));  // -1
        System.out.println(getLargestPrime(45));  // 5
        System.out.println(getLargestPrime(-1));  // -1
        System.out.println(getLargestPrime(100));  // 23
    }
}