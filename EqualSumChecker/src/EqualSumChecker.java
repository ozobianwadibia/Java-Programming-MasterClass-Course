/**
 * Write a method hasEqualSum with 3 parameters of type int.
 *
 * The method should return boolean and it needs to return true if the sum of the first and second parameter is equal to the third parameter. Otherwise, return false.
 */


public class EqualSumChecker {
    /**
     * Prints a boolean for the 'equals' calculation
     * @param numOne first operand
     * @param numTwo second operand
     * @param numThree the intended result
     * @return true or false
     */
    public static boolean hasEqualSum(int numOne, int numTwo, int numThree) {
    boolean eq = false;
    if (numOne + numTwo == numThree) {
        eq = true;
    }
    return eq;
}


public static void main(String[] args) {
    // testing the method above
    System.out.println(hasEqualSum(1, 3, 4));
    System.out.println(hasEqualSum(1, 1, 1));
    System.out.println(hasEqualSum(1, -1, 0));
    }
}