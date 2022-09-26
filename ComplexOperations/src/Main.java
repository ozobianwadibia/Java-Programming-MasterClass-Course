

public class Main {
    public static void main(String[] args) {
        // declaring two instances of ComplexNumber
        ComplexNumber one = new ComplexNumber(1.0, 1.0);
        ComplexNumber number = new ComplexNumber(2.5, -1.5);

        System.out.println("\none = (1.0, 1.0)");
        System.out.println("number = (2.5, -1.5)");

        // add function with variables
        System.out.println("Adding...(1, 1)");
        one.add(1, 1);
        System.out.println("one.real = " + one.getReal());
        System.out.println("one.imaginary = " + one.getImaginary());
        System.out.println();

        // add function with object
        System.out.println("Adding...(one)");
        one.add(one);
        System.out.println("one.real = " + one.getReal());
        System.out.println("one.imaginary = " + one.getImaginary());
        System.out.println();

        // subtract function with variables
        System.out.println("Subtracting...(0.5, 4.0)");
        number.subtract(0.5, 4.0);
        System.out.println("number.real = " + number.getReal());
        System.out.println("number.imaginary = " + number.getImaginary());
        System.out.println();

        // subtract function with object
        System.out.println("Subtracting...(number)");
        one.subtract(number);
        System.out.println("one.real = " + one.getReal());
        System.out.println("one.imaginary = " + one.getImaginary());
        System.out.println();

        // subtract function with object
        System.out.println("Subtracting...(one)");
        number.subtract(one);
        System.out.println("number.real = " + number.getReal());
        System.out.println("number.imaginary = " + number.getImaginary());

    }
}