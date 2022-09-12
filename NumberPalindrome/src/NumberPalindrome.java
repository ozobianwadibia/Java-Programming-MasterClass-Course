/**
 * Write a method called isPalindrome with one int parameter called number.
 *
 * The method needs to return a boolean.
 *
 * It should return true if the number is a palindrome number otherwise it should return false.
 */


public class NumberPalindrome {

    /**
     * Prints a boolean after checking for palindrome
     * @param number the number to be checked
     * @return true or false
     */
    public static boolean isPalindrome(int number) {
        String stn = Integer.toString(number); // convert number to string
        // removing the - sign if there is one present
        if (stn.charAt(0) == '-') {
            stn = stn.substring(1); // new string
        }
        String reverse = new StringBuffer(stn).reverse().toString(); // the reversed string
        // comparing strings
        if (stn.equals(reverse)) {
            return true;
        }
        else {
            return false;
        }
    }


    public static void main(String[] args) {
        // testing the method above
        System.out.println(isPalindrome(-1221));
        System.out.println(isPalindrome(707));
        System.out.println(isPalindrome(11212));
        System.out.println(isPalindrome(-2323));
    }
}