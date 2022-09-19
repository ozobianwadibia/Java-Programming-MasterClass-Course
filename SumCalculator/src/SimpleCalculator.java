/**
 * Write a class with the name SimpleCalculator. The class needs two fields (instance variables) with names firstNumber and secondNumber both of type double.
 *
 * Write the following methods (instance methods):
 *
 * Method named getFirstNumber without any parameters, it needs to return the value of firstNumber field.
 *
 * Method named getSecondNumber without any parameters, it needs to return the value of secondNumber field.
 *
 * Method named setFirstNumber with one parameter of type double, it needs to set the value of the firstNumber field.
 *
 * Method named setSecondNumber with one parameter of type double, it needs to set the value of the secondNumberfield.
 *
 * Method named getAdditionResult without any parameters, it needs to return the result of adding the field values of firstNumber and secondNumber.
 *
 * Method named getSubtractionResult without any parameters, it needs to return the result of subtracting the field values of secondNumber from the firstNumber.
 *
 * Method named getMultiplicationResult without any parameters, it needs to return the result of multiplying the field values of firstNumber and secondNumber.
 *
 * Method named getDivisionResult without any parameters it needs to return the result of dividing the field values of firstNumber by the secondNumber. In case the value of secondNumber is 0 then return 0.
 */
public class SimpleCalculator {
    private double firstNumber;
    private double secondNumber;

    /**
     * Accessor for firstNumber
     * @return the firstNumber
     */
    public double getFirstNumber() {
        return firstNumber;
    }

    /**
     * Mutator for firstNumber
     * @param firstNumber the firstNumber
     */
    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    /**
     * Accessor for secondNumber
     * @return the secondNumber
     */
    public double getSecondNumber() {
        return secondNumber;
    }

    /**
     * Mutator for secondNumber
     * @param secondNumber the secondNumber
     */
    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }

    /**
     * Computes the addition of 2 numbers
     * @return the sum
     */
    public double getAdditionResult() {
        return firstNumber + secondNumber;
    }

    /**
     * Computes the subtraction of second num from first num
     * @return the result of the above
     */
    public double getSubtractionResult() {
        return firstNumber - secondNumber;
    }

    /**
     * Computes the multiplication of 2 numbers
     * @return the product of the numbers
     */
    public double getMultiplicationResult() {
        return firstNumber * secondNumber;
    }

    /**
     * Computes the division of 2 numbers
     * @return the result of the division
     */
    public double getDivisionResult() {
        if (secondNumber == 0) {
            return 0;
        }
        return firstNumber / secondNumber;
    }
}