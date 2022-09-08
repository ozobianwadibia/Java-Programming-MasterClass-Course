/**
 * Write a method printYearsAndDays with parameter of type long named minutes.
 *
 * The method should not return anything (void) and it needs to calculate the years and days from the minutes parameter.
 *
 * If the parameter is less than 0, print text "Invalid Value".
 *
 * Otherwise, if the parameter is valid then it needs to print a message in the format "XX min = YY y and ZZ d".
 *
 * XX represents the original value minutes.
 * YY represents the calculated years.
 * ZZ represents the calculated days.
 */


public class MinutesToYearsAndDays {
    /**
     * Prints the year and days from given parameter
     * @param minutes the given minutes
     */
    public static void printYearsAndDays(long minutes) {
        long years = 0; // years
        long days = 0;  // days
        if (minutes < 0) {
            System.out.println("Invalid Value");
            return;
        }
        if (minutes >= 525600) {
            years += minutes / 525600;
            days += ((minutes % 525600) / 1440);
        }
        else {
            days += (minutes / 1440);
        }
        System.out.println(minutes + " min = " + years + " y and " + days + " d");
    }


    public static void main(String[] args) {
        // testing the method above
        printYearsAndDays(525600);
        printYearsAndDays(1051200);
        printYearsAndDays(561600);
        printYearsAndDays(-1);
        System.out.println();
        printYearsAndDays(1440);
    }
}