/**
 * A class to demonstrate constructor chaining
 */

public class Customer {

    private String name;
    private double creditlimit;
    private String emailaddress;

    // 1st constructor
    public Customer(String name, double creditlimit, String emailaddress) {
        this.name = name;
        this.creditlimit = creditlimit;
        this.emailaddress = emailaddress;
    }

    // 2nd constructor
    public Customer() {
        this("Mr. Nobody", "Nobody@gmail.com");
    }

    // 3rd constructor
    public Customer(String name, String emailaddress) {
        this(name, 5000, emailaddress);
    }

    // the accessor method for name
    public String getName() {
        return name;
    }

    // the accessor method for creditlimit
    public double getCreditlimit() {
        return creditlimit;
    }

    // the accessor method for emailaddress
    public String getEmailaddress() {
        return emailaddress;
    }
}
