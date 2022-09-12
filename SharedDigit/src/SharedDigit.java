/**
 * Write a method named hasSharedDigit with two parameters of type int.
 *
 * Each number should be within the range of 10 (inclusive) - 99 (inclusive). If one of the numbers is not within the range, the method should return false.
 *
 * The method should return true if there is a digit that appears in both numbers, such as 2 in 12 and 23; otherwise, the method should return false.
 */


public class SharedDigit {

    /**
     * Prints a boolean after comparing two numbers for similar digits
     * @param numA first number
     * @param numB second number
     * @return true or false
     */
    public static boolean hasSharedDigit(int numA, int numB) {
        if ((numA < 10) || (numA > 99) || (numB < 10) || (numB > 99)) {
            return false;
        }
        int numALastDigit = numA % 10; // last digit of first number
        int numAFirstDigit = numA / 10; // first digit of first number

        int numBLastDigit = numB % 10; // last digit of second number
        int numBFirstDigit = numB / 10; // first digit of second number

        if ((numAFirstDigit == numBFirstDigit) || (numAFirstDigit == numBLastDigit) || (numALastDigit == numBFirstDigit) || (numALastDigit == numBLastDigit)) {
            return true;
        }
        return false;
    }


    public static void main(String[] args) {
        // testing the method above
        System.out.println(hasSharedDigit(12, 23)); // true
        System.out.println(hasSharedDigit(9, 99));  // false
        System.out.println(hasSharedDigit(15, 55)); // true
        System.out.println(hasSharedDigit(12, 43)); // false
    }
}