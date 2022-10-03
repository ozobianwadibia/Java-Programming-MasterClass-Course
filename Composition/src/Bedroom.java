/**
 * 5) Create a class with the name Bedroom. This class contains eight member variables:
 *
 * name of type String; wall1, wall2, wall3, wall4 of type Wall; ceiling of type Ceiling; bed of type Bed, and lamp of type Lamp. The class constructor should accept all eight of the member variables as parameters, and there should also be two additional methods:
 *
 * getLamp() which returns an object of type Lamp, and makeBed() which prints a message that the bed is being made and also calls the make() method in the Bed class.
 */

public class Bedroom {

    private String name;
    private Wall wall1;
    private Wall wall2;
    private Wall wall3;
    private Wall wall4;
    private Ceiling ceiling;
    private Bed bed;
    private Lamp lamp;

    /**
     * Parametrized Constructor
     * @param name name
     * @param wall1 wall1
     * @param wall2 wall2
     * @param wall3 wall3
     * @param wall4 wall4
     * @param ceiling ceiling object
     * @param bed bed object
     * @param lamp lamp object
     */
    public Bedroom(String name, Wall wall1, Wall wall2, Wall wall3, Wall wall4, Ceiling ceiling, Bed bed, Lamp lamp) {
        this.name = name;
        this.wall1 = wall1;
        this.wall2 = wall2;
        this.wall3 = wall3;
        this.wall4 = wall4;
        this.ceiling = ceiling;
        this.bed = bed;
        this.lamp = lamp;
    }

    /**
     * Accessor for lamp object
     * @return lamp object
     */
    public Lamp getLamp() {
        return lamp;
    }

    /**
     * Method for making bed
     */
    public void makeBed() {
        System.out.println("Bedroom -> Making Bed | ");
    }
}
