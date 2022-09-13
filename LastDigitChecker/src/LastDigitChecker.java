/**
 * Write a method named hasSameLastDigit with three parameters of type int.
 *
 * Each number should be within the range of 10 (inclusive) - 1000 (inclusive). If one of the numbers is not within the range, the method should return false.
 *
 * The method should return true if at least two of the numbers share the same rightmost digit; otherwise, it should return false.
 */


public class LastDigitChecker {

    /**
     * Prints a boolean after comparing last digits of 3 numbers
     * @param num1 the first number
     * @param num2 the second number
     * @param num3 the third number
     * @return true or false
     */
    public static boolean hasSameLastDigit(int num1, int num2, int num3) {
        if (!isValid(num1) || !isValid(num2) || !isValid(num3)) {
            return false;
        }
        // extracting the rightmost digits
        // of the three numbers
        int num1RightmostDigit = num1 % 10;
        int num2RightmostDigit = num2 % 10;
        int num3RightmostDigit = num3 % 10;

        return (num1RightmostDigit == num2RightmostDigit) || (num1RightmostDigit == num3RightmostDigit) || (num2RightmostDigit == num3RightmostDigit);
    }

    /**
     * Prints a boolean after checking a number against certain constraints
     * @param someNumber the number to be checked
     * @return true or false
     */
    public static boolean isValid(int someNumber) {
        return ((someNumber >= 10) && (someNumber <= 1000));
    }


    public static void main(String[] args) {
        // testing the method above
        System.out.println(hasSameLastDigit(41, 22, 71)); // true
        System.out.println(hasSameLastDigit(23, 32, 42)); // true
        System.out.println(hasSameLastDigit(9, 99, 999)); // false
        System.out.println();
        System.out.println(isValid(1057)); // false
        System.out.println(isValid(10)); // true
        System.out.println(isValid(468)); // true
    }
}