import java.util.ArrayList;

/**
 * Write a method named getEvenDigitSum with one parameter of type int called number.
 *
 * The method should return the sum of the even digits within the number.
 *
 * If the number is negative, the method should return -1 to indicate an invalid value.
 */

public class EvenDigitSum {

    /**
     * Prints the sum of even digits in a number
     * @param number the number under examination
     * @return sum of even numbers
     */
    public static int getEvenDigitSum(int number) {
        if (number < 0) {
            return -1;
        }
        // converting the number to string
        String strNum = Integer.toString(number);

        // an arraylist to hold the digits from the string
        ArrayList<Integer> newStrNum = new ArrayList<>();
        // populating the arraylist with characters converted to digits
        // using for loop
        for (int i = 0; i < strNum.length(); i++) {
            newStrNum.add(Character.getNumericValue(strNum.charAt(i)));
        }
        // sum to be returned
        int sum = 0;
        // computing the sum
        for (Integer integer : newStrNum) {
            if (integer % 2 == 0) {
                sum += integer;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        // testing the method above
        System.out.println(getEvenDigitSum(123456789));
        System.out.println(getEvenDigitSum(252));
        System.out.println(getEvenDigitSum(-22));
        System.out.println(getEvenDigitSum(4621972));
    }
}