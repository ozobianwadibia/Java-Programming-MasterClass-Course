public class SpeedConverter {
    public static void main(String[] args) {

        long mph = toMilesPerHour(75.114);
        System.out.println("MPH: " + mph);

        printConversion(95.75);

    }

    public static long toMilesPerHour(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            return -1;
        } else if (kilometersPerHour > 0) {
            return (long) Math.round(kilometersPerHour * 0.622);
        }
        return 0;
    }

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
