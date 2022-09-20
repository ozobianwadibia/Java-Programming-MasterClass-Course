/**
 * * 3. Write a class with the name Calculator. The class needs two fields (instance variables) with name floor of type Floor and carpet of type Carpet.
 *  *
 *  * The class needs to have one constructor with parameters floor of type Floor and carpet of type Carpet and it needs to initialize the fields.
 *  *
 *  * Write the following methods (instance methods):
 *  *
 *  * Method named getTotalCost without any parameters, it needs to return the calculated total cost to cover the floor with a carpet.
 *  */

public class Calculator {
    private Floor floor;
    private Carpet carpet;

    /**
     * Parametrized Constructor
     * @param floor floor object
     * @param carpet carpet object
     */
    public Calculator(Floor floor, Carpet carpet) {
        this.floor = floor;
        this.carpet = carpet;
    }

    /**
     * Calculates the total cost
     * @return the product of area and cost
     */
    public double getTotalCost() {
        return floor.getArea() * this.carpet.getCost();
    }
}
