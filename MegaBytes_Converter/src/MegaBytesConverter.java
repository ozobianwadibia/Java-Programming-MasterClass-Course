/**
 * Write a method called printMegaBytesAndKiloBytes that has 1 parameter of type int with the name kiloBytes.
 *
 * The method should not return anything (void) and it needs to calculate the megabytes and remaining kilobytes from the kilobytes parameter.
 *
 * Then it needs to print a message in the format "XX KB = YY MB and ZZ KB".
 */


public class MegaBytesConverter {
    /**
     * Prints the value of MB and any remaining KBs
     * @param kiloBytes
     */
    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        int megaBytes;
        int remKiloBytes;
        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        }
        if ((kiloBytes == 0) || (kiloBytes > 0)) {
            megaBytes = kiloBytes / 1024;
            remKiloBytes = kiloBytes % 1024;
            System.out.println(kiloBytes + " KB = " + megaBytes + " MB and " + remKiloBytes + " KB");
        }
    }


    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(2500);
        printMegaBytesAndKiloBytes(5000);
        printMegaBytesAndKiloBytes(-1024);
    }
}