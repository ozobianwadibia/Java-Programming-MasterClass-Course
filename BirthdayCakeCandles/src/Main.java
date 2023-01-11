import java.util.*;

public class Main {

    /*
     * Complete the 'birthdayCakeCandles' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY candles as parameter.
     */

    public static int birthdayCakeCandles(List<Integer> candles) {
        // create a new list to avoid modification
        // in the original list
        List<Integer> newList = new ArrayList<>(candles);

        // sorting the new list in natural order
        newList.sort(Comparator.naturalOrder());

        // counter for the number of occurrences of the max value
        int count = 0;

        // max value
        int max = newList.get(newList.size() - 1);

        for (Integer candle : candles) {
            if (candle == max) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {

        // list to hold the candles
        List<Integer> ozzyList = new ArrayList<>();

        // scanner object declaration and initialization
        Scanner scn = new Scanner(System.in);
        System.out.println("Size of the candle list: ");
        int candleListSize = scn.nextInt();
        System.out.println("Enter individual candles: ");

        // populate the List
        for (int i = 0; i < candleListSize; i++) {
            ozzyList.add(scn.nextInt());
        }

        System.out.println("Number of tallest Candles = " + birthdayCakeCandles(ozzyList));

    }
}