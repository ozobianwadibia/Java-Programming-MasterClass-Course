/**
 *  Write a method called toMilesPerHour that has 1 parameter of type double with the name kilometersPerHour. This method needs to return the rounded value of the calculation of type long.
 *
 * If the parameter kilometersPerHour is less than 0, the method toMilesPerHour needs to return -1 to indicate an invalid value.
 *
 * Otherwise, if it is positive, calculate the value of miles per hour, round it and return it. For conversion and rounding, check the notes in the text below.
 *
 * *************************************************************************************************************
 *
 * . Write another method called printConversion with 1 parameter of type double with the name kilometersPerHour.
 *
 * This method should not return anything (void) and it needs to calculate milesPerHour from the kilometersPerHour parameter.
 *
 * Then it needs to print a message in the format "XX km/h = YY mi/h".
 */
public class SpeedConverter {
    public static void main(String[] args) {

        long mph = toMilesPerHour(75.114);
        System.out.println("MPH: " + mph);

        printConversion(95.75);

    }

    /**
     * Calculates miles per hour
     * @param kilometersPerHour the given variable
     * @return miles per hour
     */
    public static long toMilesPerHour(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            return -1;
        } else if (kilometersPerHour > 0) {
            return (long) Math.round(kilometersPerHour * 0.622);
        }
        return 0;
    }

    /**
     * Prints conversion of KPH to MPH
     * @param kilometersPerHour
     */
    public static void printConversion(double kilometersPerHour) {
        long milesPerHour = 0;
        if (kilometersPerHour < 0) {
            System.out.println("Invalid Value");
        }
        if ((kilometersPerHour > 0) || (kilometersPerHour == 0)) {
            milesPerHour = Math.round(kilometersPerHour * 0.622);
            System.out.println(kilometersPerHour + " km/h = " + milesPerHour + " mi/h");
        }

    }
}
