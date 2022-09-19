/**
 * Write a class with the name Wall. The class needs two fields (instance variables) with name width and height of type double.
 * The class needs to have two constructors. The first constructor does not have any parameters (no-arg constructor). The second constructor has parameters width and height of type double and it needs to initialize the fields. In case the width is less than 0 it needs to set the width field value to 0, in case the height parameter is less than 0 it needs to set the height field value to 0.
 * Write the following methods (instance methods):
 * Method named getWidth without any parameters, it needs to return the value of width field.
 * Method named getHeight without any parameters, it needs to return the value of height field.
 * Method named setWidth with one parameter of type double, it needs to set the value of the width field. If the parameter is less than 0 it needs to set the width field value to 0.
 * Method named setHeight with one parameter of type double, it needs to set the value of the height field. If the parameter is less than 0 it needs to set the height field value to 0.
 * Method named getArea without any parameters, it needs to return the area of the wall.
 */

/**
 * Class for Wall objects
 */
public class Wall {

    private double width;
    private double height;

    /**
     * Default constructor
     */
    public Wall() {}

    /**
     * Parameterized constructor
     * @param width the width
     * @param height the height
     */
    public Wall(double width, double height) {
      this.width = (width < 0) ? 0 : width;
      this.height = (height < 0) ? 0 : height;
    }

    /**
     * Accessor for width
     * @return width
     */
    public double getWidth() {
        return width;
    }

    /**
     * Accessor for height
     * @return the height
     */
    public double getHeight() {
        return height;
    }

    /**
     * Mutator for width
     * @param width the width
     */
    public void setWidth(double width) {
        this.width = (width < 0) ? 0 : width;
    }

    /**
     * Mutator for height
     * @param height the height
     */
    public void setHeight(double height) {
        this.height = (height < 0) ? 0 : height;
    }

    /**
     * Method to compute area of wall
     * @return the area
     */
    public double getArea() {
        return this.width * this.height;
    }
}
