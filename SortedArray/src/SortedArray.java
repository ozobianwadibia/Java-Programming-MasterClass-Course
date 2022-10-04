import java.util.Arrays;
import java.util.Scanner;

/**
 * Create a program using arrays that sorts a list of integers in descending order.
 *
 * Descending order is highest value to lowest.
 *
 * In other words if the array had the values in it [106, 26, 81, 5, 15] your program should ultimately have an array with [106, 81, 26, 15, 5] in it.
 *
 * Set up the program so that the numbers to sort are read in from the keyboard (Scanner).
 *
 *
 *
 * Implement the following methods:
 *
 * getIntegers has one parameter of type int which is the size of the array. It returns an array of entered integers from the keyboard.
 *
 * printArray accepts an array and prints out the contents of the array. It should be printed in the following format:
 *
 * Element 0 contents 106
 * Element 1 contents 81
 * Element 2 contents 26
 * Element 3 contents 15
 * Element 4 contents 5
 * sortIntegers accepts the unsorted array. It should sort the array and return a new array containing the sorted numbers.
 */


public class SortedArray {

    /**
     * Method to get integers into an array
     * @param quantity the size of the array
     * @return the array of ints
     */
    public static int[]getIntegers(int quantity) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter " + quantity + " numbers: ");
        int[] myArray = new int[quantity];
        for (int i = 0; i < quantity; i++) {
            myArray[i] = scn.nextInt();
        }
        scn.close();
        return myArray;
    }


    /**
     * Method to print an array
     * @param myArray the array parameter
     */
    public static void printArray(int[] myArray) {
        System.out.println();
        for (int i = 0; i < myArray.length; i++) {
            System.out.println("Element " + i + " contents " + myArray[i]);
        }
        System.out.println();
    }


    /**
     * Method to sort integers in descending order
     * @param myArray the array parameter
     * @return the reversed array
     */
    public static int[]sortIntegers(int[] myArray) {
        // sort the array - ascending
        Arrays.sort(myArray);
        // temp value
        int tempValue = 0;
        for (int i = 0; i < myArray.length; i++) {
            for (int j = i + 1; j < myArray.length; j++) {
                if (myArray[i] < myArray[j]) {
                    tempValue = myArray[i];
                    myArray[i] = myArray[j];
                    myArray[j] = tempValue;
                }
            }
        }
        return myArray;
    }


    /**
     * The Main Class
     * @param args
     */
    public static void main(String[] args) {
        // testing the methods above
        int[] testArray = getIntegers(20);
        printArray(testArray);
        int[] anotherTestArray = sortIntegers(testArray);
        printArray(anotherTestArray);
    }
}
