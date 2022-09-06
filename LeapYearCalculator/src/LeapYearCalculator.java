/**
 * Write a method isLeapYear with a parameter of type int named year.
 *
 * The parameter needs to be greater than or equal to 1 and less than or equal to 9999.
 *
 * If the parameter is not in that range return false.
 *
 * Otherwise, if it is in the valid range, calculate if the year is a leap year and return true if it is a leap year, otherwise return false.
 *
 * To determine whether a year is a leap year, follow these steps:
 * 1. If the year is evenly divisible by 4, go to step 2. Otherwise, go to step 5.
 * 2. If the year is evenly divisible by 100, go to step 3. Otherwise, go to step 4.
 * 3. If the year is evenly divisible by 400, go to step 4. Otherwise, go to step 5.
 * 4. The year is a leap year (it has 366 days). The method isLeapYear needs to return true.
 * 5. The year is not a leap year (it has 365 days). The method isLeapYear needs to return false.
 */



public class LeapYearCalculator {
    /**
     * Prints a boolean after checking for leap year
     * @param year the year that is to be tested
     * @return true or false
     */
    public static boolean isLeapYear(int year) {
        boolean leapYear;
        if ((year >= 1) && (year <= 9999)) {
            if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)){
                leapYear = true;
            }
            else {
                leapYear = false;
            }
        }
        else {
            leapYear = false;
        }
        return leapYear;
    }


    public static void main(String[] args) {
        // testing different values
        System.out.println(isLeapYear(-1600));
        System.out.println(isLeapYear(1600));
        System.out.println(isLeapYear(2017));
        System.out.println(isLeapYear(2000));
        System.out.println();
        System.out.println( isLeapYear(1800));
    }
}