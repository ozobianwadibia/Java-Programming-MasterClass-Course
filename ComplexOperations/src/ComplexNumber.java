/**
 * A complex number is a number that can be expressed in the form a + bi, where a and b are real numbers, and i is a solution of the equation x2 = −1. Because no real number satisfies this equation, i is called an imaginary number. For the complex number a + bi, a is called the real part, and b is called the imaginary part. To add or subtract two complex numbers, just add or subtract the corresponding real and imaginary parts. For instance, the sum of 5 + 3i and 4 + 2i is 9 + 5i. For another, the sum of 3 + i and –1 + 2i is 2 + 3i.
 *
 * Write a class with the name ComplexNumber. The class needs two fields (instance variables) with name real and imaginary of type double. It represents the Complex Number.
 *
 * The class needs to have one constructor. The constructor has parameters real and imaginary of type double and it needs to initialize the fields.
 *
 * Write the following methods (instance methods):
 *
 * Method named getReal without any parameters, it needs to return the value of real field.
 *
 * Method named getImaginary without any parameters, it needs to return the value of imaginary field.
 *
 * Method named add with two parameters real and imaginary of type double, it needs to add parameters to fields. In other words, it needs to do a complex number add operation as described above.
 *
 * Method named add with one parameter of type ComplexNumber. It needs to add the ComplexNumber parameter to the corresponding instance variables.
 *
 * Method named subtract with two parameters real and imaginary of type double, it needs to subtract parameters from fields, in other words, it needs to do a complex number subtract operation as described above.
 *
 * Method named subtract with one parameter other of type ComplexNumber. It needs to subtract the other parameter from this complex number.
 */

public class ComplexNumber {

    private double real;
    private double imaginary;


    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    /**
     * Accessor for real
     * @return real
     */
    public double getReal() {
        return real;
    }

    /**
     * Accessor for imaginary
     * @return imaginary
     */
    public double getImaginary() {
        return imaginary;
    }

    /**
     * Method to add parameters to instance variables
     * @param r real number
     * @param i imaginary number
     */
    public void add(double r, double i) {
        this.real = this.real + r;
        this.imaginary = this.imaginary + i;
    }

    /**
     * Method to add Complex number to instance variables
     * @param A complex number
     */
    public void add(ComplexNumber A) {
        this.real = this.real + A.real;
        this.imaginary = this.imaginary + A.imaginary;
    }

    /**
     * Method to subtract parameters from instance variables
     * @param r real number
     * @param i imaginary number
     */
    public void subtract(double r, double i) {
        this.real = this.real - r;
        this.imaginary = this.imaginary - i;
    }

    /**
     * Method to subtract complex number from instance variables
     * @param B the complex number
     */
    public void subtract(ComplexNumber B) {
        this.real = this.real - B.real;
        this.imaginary = this.imaginary - B.imaginary;
    }

}
