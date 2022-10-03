/**
 * 4) Create a class with the name Wall. It contains one member variable, direction, and is of type String. A constructor for Wall should accept one parameter for the member variable direction. A getter should also be defined for the direction field called getDirection().
 */
public class Wall {

    private String direction;

    /**
     * Parametrized Constructor
     * @param direction direction
     */
    public Wall(String direction) {
        this.direction = direction;
    }

    /**
     * Accessor for direction
     * @return direction
     */
    public String getDirection() {
        return direction;
    }
}

