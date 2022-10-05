/**
 * Write a method called reverse() with an int array as a parameter.
 *
 * The method should not return any value. In other words, the method is allowed to modify the array parameter.
 *
 * To reverse the array, you have to swap the elements, so that the first element is swapped with the last element and so on.
 *
 * For example, if the array is [1, 2, 3, 4, 5], then the reversed array is [5, 4, 3, 2, 1].
 *
 * The method should first print out the newly passed in array as Array = [1, 2, 3, 4, 5]
 *
 * and then once it's been reversed, print it out as Reversed array = [5, 4, 3, 2, 1]
 */


public class ReverseArray {

    /**
     * Method for reversing an integer array
     * @param testArray the array to be reversed
     */
    private static void reverse(int[] testArray) {
        System.out.print("Array = ");
        System.out.print("[");
        for (int i = 0; i < testArray.length - 1; i++) {
            System.out.print(testArray[i] + ", ");
        }
        System.out.print(testArray[testArray.length - 1]);
        System.out.print("]");

        System.out.println();

        System.out.print("Reversed Array = ");
        System.out.print("[");
        for (int i = testArray.length - 1; i >= 1; i--) {
            System.out.print(testArray[i] + ", ");
        }
        System.out.print(testArray[0]);
        System.out.print("]");
    }


    /**
     * The main
     * @param args
     */
    public static void main(String[] args) {
        int[] test = {1, 2, 3, 4, 5};
        reverse(test);
    }
}