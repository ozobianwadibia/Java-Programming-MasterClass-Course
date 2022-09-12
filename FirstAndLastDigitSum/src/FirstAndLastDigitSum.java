public class FirstAndLastDigitSum {

    /**
     * Prints the sum of number's 1st & last digit
     * @param number the number to be manipulated
     * @return sum of 1st and last digit
     */
    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) {
            return -1;
        }
        //*************************
//        int lastDigit = number % 10;  // another way to get last digit
//        while (number > 9) {
//            firstD = number / 10;      // the loop can extract the first digit
//        }
        //**************************

        String strNumber = Integer.toString(number); // convert the number to string
        int firstDigit = Integer.parseInt(strNumber.substring(0, 1)); // first digit
        int lastDigit = Character.getNumericValue(strNumber.charAt(strNumber.length() - 1)); // last digit
        return firstDigit + lastDigit; // the required sum
    }


    public static void main(String[] args) {
        // testing the method above
        System.out.println(sumFirstAndLastDigit(452));
        System.out.println(sumFirstAndLastDigit(257));
        System.out.println(sumFirstAndLastDigit(0));
        System.out.println(sumFirstAndLastDigit(5));
        System.out.println(sumFirstAndLastDigit(-10));
        System.out.println(sumFirstAndLastDigit(6438));
    }
}