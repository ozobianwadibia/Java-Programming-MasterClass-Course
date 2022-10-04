/**
 * For this exercise you will create four classes of vehicles. The first class should be named Car. This will be the base class for three other classes, Mitsubishi, Holden, and Ford.
 * The first class contains four member variables, or fields, with these names and conditions:
 * engine of type boolean
 * cylinders of type int
 * name of type String
 * wheels of type int
 * All four member variables should have private access.
 * The constructor should accept two parameters, cylinders and name. Also, all of these cars have an engine and four wheels. So the other two fields should be set to default values.
 * In addition, there are five other methods These methods should be defined as described below:
 * startEngine accepts no parameters and returns a message which says that the car's engine is starting.
 * accelerate accepts no parameters and returns a message that says the car is accelerating.
 * brake accepts no parameters and returns a message stating the car is braking.
 * The messages these methods return should somewhere contain the name of the class, Car.
 * Two getter methods should also be defined here for the member variables cylinders and name. All methods have public access.
 * The other three classes mentioned above are sub-classes of Car. These classes have no member variables and the constructor for each will call the parent constructor for object instantiation. Each of these classes will override the three parent methods startEngine, accelerate, and brake. The return messages for these methods should somewhere contain the name of the class to which the methods belong.
 */

public class Car {

    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;


    /**
     * Parametrized Constructor
     * @param cylinders the cylinders
     * @param name the name
     */
    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.engine = true;
        this.wheels = 4;
    }

    /**
     * Method to start the car engine
     * @return class name with function
     */
    public String startEngine() {
        return this.getClass().getName() + " -> " + "startEngine()";
    }

    /**
     * Method to start accelerate the car
     * @return class name with function
     */
    public String accelerate() {
        return this.getClass().getName() + " -> " + "accelerate()";
    }

    /**
     * Method to stop the car
     * @return class name with function
     */
    public String brake() {
        return this.getClass().getName() + " -> " + "brake()";
    }

    /**
     * Accessor for cylinders
     * @return cylinder number
     */
    public int getCylinders() {
        return cylinders;
    }

    /**
     * Accessor for name
     * @return name
     */
    public String getName() {
        return name;
    }
}
