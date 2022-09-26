/**
 * 1. Write a class with the name Circle. The class needs one field (instance variable) with name radius of type double.
 * The class needs to have one constructor with parameter radius of type double and it needs to initialize the fields.
 * In case the radius parameter is less than 0 it needs to set the radius field value to 0.
 * Write the following methods (instance methods):
 * Method named getRadius without any parameters, it needs to return the value of radius field.
 * Method named getArea without any parameters, it needs to return the calculated area (radius * radius * PI). For PI use Math.PI constant.
 */


public class Circle {

    private double radius;

    public Circle(double radius) {
        this.radius = (radius < 0) ? 0 : radius;
    }

    /**
     * Accessor for radius
     * @return radius
     */
    public double getRadius() {
        return radius;
    }

    /**
     * Method to compute area of circle
     * @return circle area
     */
    public double getArea() {
        return Math.PI * Math.pow(radius, 2.0);
    }
}
