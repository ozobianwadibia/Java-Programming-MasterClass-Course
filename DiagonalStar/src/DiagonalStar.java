/**
 * Write a method named printSquareStar with one parameter of type int named number. 
 * If number is < 5, the method should print "Invalid Value".
 * The method should print diagonals to generate a rectangular pattern composed of stars (*). This should be accomplished by using loops (see examples below).
 * EXAMPLE INPUT/OUTPUT:
 * EXAMPLE 1
 * printSquareStar(5); should print the following:
 *     *****
 *     ** **
 *     * * *
 *     ** **
 *     *****
 *
 * Explanation:
 *
 *     *****   5 stars
 *     ** **   2 stars space 2 stars
 *     * * *   1 star space 1 star space 1 star
 *     ** **   2 stars space 2 stars
 *     *****   5 stars
 *
 *
 * EXAMPLE 2
 *
 * printSquareStar(8); should print the following:
 *
 *     ********
 *     **    **
 *     * *  * *
 *     *  **  *
 *     *  **  *
 *     * *  * *
 *     **    **
 *     ********
 *
 *
 * The patterns above consist of a number of rows and columns (where number is the number of rows to print). For each row or column, stars are printed based on four conditions (Read them carefully):
 *
 *     In the first or last row
 *
 *     In the first or last column
 *
 *     When the row number equals the column number
 *
 *     When the column number equals rowCount - currentRow + 1 (where currentRow is current row number)
 */


public class DiagonalStar {

    /**
     * A method to print asterisks in diagonal based on input
     * @param side the length of the square
     */
    public static void printSquareStar(int side) {

        int row; // the row
        int col; // the column
        if (side < 5) {
            System.out.println("Invalid Value");
        }
        else {
            for (row = 1; row <= side; row++) {
                for (col = 1; col <= side; col++) {
                    if ((row == 1) || (row == side) || (col == 1) || (col == side) || (row == col) || (col == (side - row + 1))) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
    }

    // The main method
    public static void main(String[] args) {
        // calling the method above
        printSquareStar(4);
        System.out.println();
        printSquareStar(13);
    }
}
