/**
 * Write a method printEqual with 3 parameters of type int. The method should not return anything (void).
 *
 * If one of the parameters is less than 0, print text "Invalid Value".
 *
 * If all numbers are equal print text "All numbers are equal"
 *
 * If all numbers are different print text "All numbers are different".
 *
 * Otherwise, print "Neither all are equal or different".
 */

public class EqualityPrinter {
    /**
     * Displays a message when three numbers are compared
     * @param numOne the first number
     * @param numTwo the second number
     * @param numThree the third number
     */
    public static void printEqual(int numOne, int numTwo, int numThree) {
        if (numOne < 0 || numTwo < 0 || numThree < 0) {
            System.out.println("Invalid Value");
        }
        else if ((numOne == numTwo) && (numOne == numThree)) {
            System.out.println("All numbers are equal");
        }
        else if ((numOne != numTwo) && (numOne != numThree) && (numTwo != numThree)) {
            System.out.println("All numbers are different");
        }
        else {
            System.out.println("Neither all are equal or different");
        }
    }


    public static void main(String[] args) {
        // testing the method above
        printEqual(1,1,1);
        printEqual(1,1,2);
        printEqual(-1,-1,-1);
        printEqual(1,2,3);
    }
}