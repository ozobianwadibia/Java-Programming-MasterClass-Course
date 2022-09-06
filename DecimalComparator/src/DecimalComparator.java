/**
 * Write a method areEqualByThreeDecimalPlaces with two parameters of type double.
 *
 * The method should return boolean and it needs to return true if two double numbers are the same up to three decimal places. Otherwise, return false.
 */



public class DecimalComparator {

    /**
     * Prints a boolean after checking for equality
     * of two doubles
     * @param decNumOne the first number
     * @param decNumTwo the second number
     * @return true or false
     */
    public static boolean areEqualByThreeDecimalPlaces(double decNumOne, double decNumTwo) {
        boolean closeEnough = false;
        if (Math.abs(decNumOne - decNumTwo) < 0.0009) { // or 0.001
            closeEnough = true;
        }
        return closeEnough;
    }


    public static void main(String[] args) {
        // testing the method above
        System.out.println(areEqualByThreeDecimalPlaces(-3.1756, -3.175));
        System.out.println(areEqualByThreeDecimalPlaces(3.175, 3.176));
        System.out.println(areEqualByThreeDecimalPlaces(3.0, 3.0));
        System.out.println(areEqualByThreeDecimalPlaces(-3.123, 3.123));
    }
}