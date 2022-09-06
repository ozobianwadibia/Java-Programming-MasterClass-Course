/**
 * We have a dog that likes to bark.  We need to wake up if the dog is barking at night!
 *
 * Write a method shouldWakeUp that has 2 parameters.
 *
 * 1st parameter should be of type boolean and be named barking it represents if our dog is currently barking.
 * 2nd parameter represents the hour of the day and is of type int with the name hourOfDay and has a valid range of 0-23.
 *
 * We have to wake up if the dog is barking before 8 or after 22 hours so in that case return true.
 *
 * In all other cases return false.
 *
 * If the hourOfDay parameter is less than 0 or greater than 23 return false.
 */

public class BarkingDog {

    /**
     * Prints true of false depending on time of day
     * when dog is barking
     * @param isBarking status of dog at given time
     * @param hourOfDay time of the day
     * @return a boolean
     */
    public static boolean shouldWakeUp(boolean isBarking, int hourOfDay) {
        if ((hourOfDay < 0) || (hourOfDay > 23) && (isBarking == true) || (isBarking == false)) {
            return false;
        }
        if ((hourOfDay < 8) || (hourOfDay > 22) && (isBarking == true) || (isBarking == false)) {
            return true;
        }
        else {
            return  false;
        }
    }

    public static void main(String[] args) {

       boolean a = shouldWakeUp(true, 1);
       boolean b =shouldWakeUp(false, 2);
       boolean c = shouldWakeUp(true, 8);
       boolean d =shouldWakeUp(true, -1);

       System.out.println(a);
       System.out.println(b);
       System.out.println(c);
       System.out.println(d);
    }
}