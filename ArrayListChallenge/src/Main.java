import java.util.*;

/*
Create methods to work with a menu that can accomplish the following:

Available actions:
0 - to shutdown
1 - to add item(s) to list (comma delimited list)
2 - to remove any items (comma delimited list)
Enter a number for which action you want to do:
No duplicates are allowed in the list at any time.
 */
public class Main {

    // scanner object declaration and initialization
    private final static Scanner scanner = new Scanner(System.in);
    // the arraylist for grocery items
    private static final ArrayList<String> groceries = new ArrayList<>();

    /**
     * Method to add item(s) to arraylist
     * @param groceries the arraylist
     */
    private static void addItems(ArrayList<String> groceries) {
        System.out.println("Add item(s) [separate items by comma]: ");
        String[] items = scanner.nextLine().split(",");
        for (String i: items) {
            String trimmed = i.trim();
            if (!groceries.contains(trimmed)) {
                groceries.add(trimmed);
            }
        }
    }

    /**
     * Method to remove item(s) from arraylist
     * @param groceries the arraylist
     */
    private static void removeItems(ArrayList<String> groceries) {
        System.out.println("Remove item(s) [separate items by comma]: ");
        String[] items = scanner.nextLine().split(",");
        for (String i: items) {
            String trimmed = i.trim();
            groceries.remove(trimmed);
        }
    }

    /**
     * Method to print the menu for the user input.
     */
    private static void printActions() {
        String textBlock = """
        Available actions:
        0 - to shutdown
        1 - to add item(s) to list (comma delimited list)
        2 - to remove any item(s) (comma delimited list)
        Enter a number for which action you want to do:""";
        System.out.println(textBlock + " ");
    }

    /**
     * The main method
     * @param args
     */
    public static void main(String[] args) {
        boolean flag = true;
        while (flag) {
            printActions();
            switch(Integer.parseInt(scanner.nextLine())) {
                case 1 -> addItems(groceries);
                case 2 -> removeItems(groceries);
                default-> flag = false;
            }
            // sorting the arraylist items
            groceries.sort(Comparator.naturalOrder());
            System.out.println(groceries);
            System.out.println();
        }
    }
}