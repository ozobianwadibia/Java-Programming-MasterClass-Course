/**
 * We'll say that a number is "teen" if it is in the range 13 -19 (inclusive).
 *
 * Write a method named hasTeen with 3 parameters of type int.
 *
 * The method should return boolean and it needs to return true if one of the parameters is in range 13(inclusive) - 19 (inclusive). Otherwise return false.
 */


public class TeenNumberChecker {

    /**
     * Prints a boolean after checking three age numbers
     * @param ageOne first given age
     * @param ageTwo second given age
     * @param ageThree third given age
     * @return true or false
     */
    public static boolean hasTeen(int ageOne, int ageTwo, int ageThree) {
        boolean correctValue = false;
        if ((ageOne >= 13 && ageOne <= 19) || (ageTwo >= 13 && ageTwo <= 19)  || (ageThree >= 13 && ageThree <= 19)) {
            correctValue = true;
        }
        return correctValue;
    }


    /**
     * Prints a boolean after checking an age number
     * @param ageOfTeen the given age
     * @return true or false
     */
    public static boolean isTeen(int ageOfTeen) {
        boolean correctValue = false;
        if (ageOfTeen >= 13 && ageOfTeen <= 19) {
            correctValue = true;
        }
        return correctValue;
    }


    public static void main(String[] args) {
        // testing the 1st method above
        System.out.println(hasTeen(9,99,19));
        System.out.println(hasTeen(25,15,42));
        System.out.println(hasTeen(22,23,34));
        System.out.println();
        // testing the 2nd method above
        System.out.println(isTeen(9));
        System.out.println(isTeen(13));
    }
}