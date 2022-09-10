/**
 * Write a method isLeapYear with a parameter of type int named year.
 *
 * The parameter needs to be greater than or equal to 1 and less than or equal to 9999.
 *
 * If the parameter is not in that range return false.
 *
 * Otherwise, if it is in the valid range, calculate if the year is a leap year and return true if it is, otherwise return false.
 *
 * A year is a leap year if it is divisible by 4 but not by 100, or it is divisible by 400.
 */

public class NumberOfDaysInMonth {
    /**
     * Prints a boolean for the year under testing
     * @param year the year that is checked
     * @return true or false
     */
    public static boolean isLeapYear(int year) {
        boolean checkYear;
        if ((year >= 1) && (year <= 9999)) {
            if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
                checkYear = true;
            }
            else {
                checkYear = false;
            }
        }
        else {
            checkYear = false;
        }
            return checkYear;
    }


    /**
     * Prints the number of days in a given month
     * @param month the month of the year
     * @param year year - leap year or not
     * @return an int representing days in given month
     */
    public static int getDaysInMonth(int month, int year) {
        if ((month < 1) || (month > 12) || (year < 1) || (year > 9999)) {
            return -1;
        }
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            case 2:
                return isLeapYear(year) ? 29 : 28;
        }
        return month;
    }


    public static void main(String[] args) {
        // testing the methods above
        System.out.println(isLeapYear(-1600)); // false
        System.out.println(isLeapYear(1600)); // true
        System.out.println(isLeapYear(2017)); // false
        System.out.println(isLeapYear(2000)); // true

        System.out.println();

        System.out.println(getDaysInMonth(1, 2020)); // 31
        System.out.println(getDaysInMonth(2, 2020)); // 29
        System.out.println(getDaysInMonth(2, 2018)); // 28
        System.out.println(getDaysInMonth(-1, 2020)); // -1
        System.out.println(getDaysInMonth(1, -2020)); // -1
    }
}