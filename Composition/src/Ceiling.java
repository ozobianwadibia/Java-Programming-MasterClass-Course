/**
 * 3) Create a class with the name Ceiling. There are two member variables for this one, height and paintedColor, both of type int. There should also be a constructor which accepts both member variables as parameters. There are also two additional methods which should be defined: getHeight() shall return the value of height and getPaintedColor() should return the value of paintedColor.
 */

public class Ceiling {

    private int height;
    private int paintedColor;

    /**
     * Parametrized Constructor
     * @param height height
     * @param paintedColor paintedColor
     */
    public Ceiling(int height, int paintedColor) {
        this.height = height;
        this.paintedColor = paintedColor;
    }

    /**
     * Accessor for height
     * @return height
     */
    public int getHeight() {
        return height;
    }

    /**
     * Accessor for paintedColor
     * @return paintedColor
     */
    public int getPaintedColor() {
        return paintedColor;
    }
}
