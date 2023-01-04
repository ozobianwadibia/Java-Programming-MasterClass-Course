
public class Driver {
    public static void main(String[] args) {

        Customer cust1 = new Customer("Ozobia Nwadibia", 2500, "ozzy@gmail.com");

        System.out.println(cust1.getName());
        System.out.println(cust1.getCreditlimit());
        System.out.println(cust1.getEmailaddress());
        System.out.println();

        Customer cust2 = new Customer();

        System.out.println(cust2.getName());
        System.out.println(cust2.getCreditlimit());
        System.out.println(cust2.getEmailaddress());
        System.out.println();

        Customer cust3 = new Customer("Amy", "amy@gmail.com");

        System.out.println(cust3.getName());
        System.out.println(cust3.getCreditlimit());
        System.out.println(cust3.getEmailaddress());
    }
}