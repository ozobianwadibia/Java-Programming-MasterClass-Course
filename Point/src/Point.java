/**
 * You have to represent a point in 2D space. Write a class with the name Point. The class needs two fields (instance variables) with name x and y of type int.
 * The class needs to have two constructors. The first constructor does not have any parameters (no-arg constructor). The second constructor has parameters x and y of type int and it needs to initialize the fields.
 * Write the following methods (instance methods):
 * Method named getX without any parameters, it needs to return the value of x field.
 * Method named getY without any parameters, it needs to return the value of y field.
 * Method named setX with one parameter of type int, it needs to set the value of the x field.
 * Method named setY with one parameter of type int, it needs to set the value of the y field.
 * Method named distance without any parameters, it needs to return the distance between this Point and Point 0,0 as double.
 * Method named distance with two parameters x, y both of type int, it needs to return the distance between this Point and Point x,y as double.
 * Method named distance with parameter another of type Point, it needs to return the distance between this Point and another Point as double.
 */

public class Point {

    private int x;
    private int y;

    /**
     * Default Constructor
     */
    public Point() {}

    /**
     * Parametrized Constructor
     * @param x first coordinate
     * @param y second coordinate
     */
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Accessor for x
     * @return x
     */
    public int getX() {
        return x;
    }

    /**
     * Accessor for y
     * @return y
     */
    public int getY() {
        return y;
    }

    /**
     * Mutator for x
     * @param x x
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     * Mutator for y
     * @param y y
     */
    public void setY(int y) {
        this.y = y;
    }

    /**
     * Method to compute distance from origin
     * @return distance
     */
    public double distance() {
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
    }

    /**
     * Method to compute distance from given coordinate
     * @param x first coordinate
     * @param y second coordinate
     * @return the distance
     */
    public double distance(int x, int y) {
        return Math.sqrt(Math.pow(getX() - x, 2) + Math.pow(getY() - y, 2));
    }

    /**
     * Method to compute the distance between 2 points
     * @param point the point
     * @return the distance
     */
    public double distance(Point point) {
        return Math.sqrt(Math.pow(this.getX() - point.getX(), 2) + Math.pow(this.getY() - point.getY(), 2));
    }
}


