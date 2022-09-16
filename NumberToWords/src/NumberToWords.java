/**
 * Write a method called numberToWords with one int parameter named number.
 * <p>
 * The method should print out the passed number using words for the digits.
 * <p>
 * If the number is negative, print "Invalid Value".
 */

public class NumberToWords {

    /**
     * Prints word equivalents of number digits
     * @param number the number converted to words
     */
    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
            return;
        }
        // convert number to string
        String strNum = Integer.toString(number);
        // char array to hold values of string
        char[] ch = new char[strNum.length()];
        // string array
        String[] strArr = new String[strNum.length()];
        // populating the character array
        for (int i = 0; i < strNum.length(); i++) {
            ch[i] = strNum.charAt(i);
        }
        // populating the string array
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == '0') {
                strArr[i] = "Zero";
            }
            if (ch[i] == '1') {
                strArr[i] = "One";
            }
            if (ch[i] == '2') {
                strArr[i] = "Two";
            }
            if (ch[i] == '3') {
                strArr[i] = "Three";
            }
            if (ch[i] == '4') {
                strArr[i] = "Four";
            }
            if (ch[i] == '5') {
                strArr[i] = "Five";
            }
            if (ch[i] == '6') {
                strArr[i] = "Six";
            }
            if (ch[i] == '7') {
                strArr[i] = "Seven";
            }
            if (ch[i] == '8') {
                strArr[i] = "Eight";
            }
            if (ch[i] == '9') {
                strArr[i] = "Nine";
            }
            // alternative to the if statements
//            switch(ch[i]) {
//                case '0' -> strArr[i] = "Zero";
//                case '1' -> strArr[i] = "One";
//                case '2' -> strArr[i] = "Two";
//                case '3' -> strArr[i] = "Three";
//                case '4' -> strArr[i] = "Four";
//                case '5' -> strArr[i] = "Five";
//                case '6' -> strArr[i] = "Six";
//                case '7' -> strArr[i] = "Seven";
//                case '8' -> strArr[i] = "Eight";
//                case '9' -> strArr[i] = "Nine";
//                default -> throw new IllegalStateException("Unexpected value: " + ch[i]);
//            }
        }
        // printing the items in the string array
        for (String s : strArr) {
            System.out.print(s + " ");
        }
    }


    /**
     * Produces the reverse of the given number
     * @param someNumber the number to be reversed
     * @return reversed number
     */
    public static int reverse(int someNumber) {
        // stringbuilder object
        StringBuilder numStr = new StringBuilder();
        // convert number to string
        String str = Integer.toString(someNumber);
        // handling the case of negative numbers
        if (str.charAt(0) == '-') {
            str = str.substring(1);
            numStr.append(str).reverse();
            return (Integer.parseInt(numStr.toString()) * -1);
        }
        // handling positive numbers
        else {
            numStr.append(str).reverse();
            return (Integer.parseInt(numStr.toString()));
        }
    }

    /**
     * Counts the number of digits in a number
     * @param num the number whose digits are to be counted
     * @return an integer
     */
    public static int getDigitCount(int num) {
        if (num < 0) {
            return -1;
        }
        String sample = Integer.toString(num);
        return sample.length();
    }


    /**
     * The main method
     * @param args
     */
    public static void main(String[] args) {
        // testing methods above
        numberToWords(55689840);
        System.out.println();
        numberToWords(419);
        System.out.println();
        numberToWords(-5568);
        System.out.println();

        System.out.println(reverse(-121));
        System.out.println(reverse(1212));
        System.out.println(reverse(1234));
        System.out.println(reverse(100));

        System.out.println(getDigitCount(0));
        System.out.println(getDigitCount(123));
        System.out.println(getDigitCount(-12));
        System.out.println(getDigitCount(5200));

    }
}