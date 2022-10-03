/**
 * 2) Create a class and name it Bed. Five private member variables should be declared: style of type String, and pillows, height, sheets, quilt of type int. A constructor should be coded which accepts these five member variables as parameters. Also, six methods should be defined: make() has no return type and prints a message to the effect that the bed is being made; getStyle() which returns the value of style; getPillows() returns the number of pillows; getHeight() returns the height of the bed; getSheets() returns the number of sheets on the bed; and getQuilt() returns the value of quilt.
 */

public class Bed {

    private String style;
    private int pillows;
    private int height;
    private int sheets;
    private int quilt;

    /**
     * Parametrized Constructor
     * @param style style
     * @param pillows pillows
     * @param height height
     * @param sheets sheets
     * @param quilt quilt
     */
    public Bed(String style, int pillows, int height, int sheets, int quilt) {
        this.style = style;
        this.pillows = pillows;
        this.height = height;
        this.sheets = sheets;
        this.quilt = quilt;
    }

    /**
     * Accessor for style
     * @return style
     */
    public String getStyle() {
        return style;
    }

    /**
     * Accessor for pillows
     * @return pillows
     */
    public int getPillows() {
        return pillows;
    }

    /**
     * Accessor for height
     * @return height
     */
    public int getHeight() {
        return height;
    }

    /**
     * Accessor for sheets
     * @return sheets
     */
    public int getSheets() {
        return sheets;
    }

    /**
     * Accessor for quilt
     * @return quilt
     */
    public int getQuilt() {
        return quilt;
    }

    /**
     * Method for make
     */
    public void make() {
        System.out.println("Bed -> Making | ");
    }
}
