import java.util.Scanner;

/**
 * Write a method called readInteger() that has no parameters and returns an int.
 *
 * It needs to read in an integer from the user - this represents how many elements the user needs to enter.
 *
 *
 * Write another method called readElements() that has one parameter of type int
 *
 * The method needs to read from the console until all the elements are entered, and then return an array containing the elements entered.
 *
 * And finally, write a method called findMin() with one parameter of type int[]. The method needs to return the minimum value in the array.
 */


public class MinimumElement {
    /**
     * Method that reads an integer
     * @return an integer
     */
    private static int readInteger() {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number of integers: ");
        return scn.nextInt();
    }

    /**
     * Method that reads a number of integers into an array
     * @param numberOfElements the array size
     * @return the array
     */
    private static int[] readElements (int numberOfElements) {
        Scanner scn = new Scanner(System.in);
        int[] arrayOfInts = new int [numberOfElements];
        for (int i = 0; i < arrayOfInts.length; i++) {
            System.out.println("Enter #" + (i + 1));
            arrayOfInts[i] = scn.nextInt();
        }
        scn.close();
        return arrayOfInts;
    }

    /**
     * Method to find the minimum value in an array
     * @param myArray the array
     * @return the minimum value
     */
   private static int findMin(int[] myArray) {
        int tempMin = myArray[0];
       for (int i = 1; i < myArray.length; i++) {
           if (tempMin > myArray[i]) {
               tempMin = myArray[i];
           }
       }
       return tempMin;
   }


    /**
     * The main section
     * @param args
     */
    public static void main(String[] args) {
        // the min value
        int minValue =  findMin(readElements(readInteger()));
        System.out.println("The min is " + minValue);
    }
}