/**
 * 1. Write a class with the name Rectangle. The class needs two fields (instance variable) with name width and length both of type double.
 * The class needs to have one constructor with parameters width and length both of type double and it needs to initialize the fields.
 * In case the width parameter is less than 0 it needs to set the width field value to 0.
 * In case the length parameter is less than 0 it needs to set the length field value to 0.
 * Write the following methods (instance methods):
 * Method named getWidth without any parameters, it needs to return the value of width field.
 * Method named getLength without any parameters, it needs to return the value of length field.
 * Method named getArea without any parameters, it needs to return the calculated area (width * length).
 */


public class Rectangle {

    private double width;
    private double length;

    /**
     * Parametrized Constructor
     * @param width width
     * @param length length
     */
    public Rectangle(double width, double length) {
        this.width = width < 0 ? 0 : width;
        this.length = length < 0 ? 0 : length;
    }

    /**
     * Accessor for width
     * @return width
     */
    public double getWidth() {
        return width;
    }

    /**
     * Accessor for length
     * @return length
     */
    public double getLength() {
        return length;
    }

    /**
     * Method to calculate rectangle area
     * @return area
     */
    public double getArea() {
        return width * length;
    }
}
