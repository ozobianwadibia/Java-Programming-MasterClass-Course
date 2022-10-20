/**
 * Alice and Bob each created one problem for HackerRank. A reviewer rates the two challenges, awarding points on a scale from 1 to 100 for three categories: problem clarity, originality, and difficulty.
 *
 * The rating for Alice's challenge is the triplet a = (a[0], a[1], a[2]), and the rating for Bob's challenge is the triplet b = (b[0], b[1], b[2]).
 *
 * The task is to find their comparison points by comparing a[0] with b[0], a[1] with b[1], and a[2] with b[2].
 *
 * If a[i] > b[i], then Alice is awarded 1 point.
 * If a[i] < b[i], then Bob is awarded 1 point.
 * If a[i] = b[i], then neither person receives a point.
 * Comparison points is the total points a person earned.
 *
 * Given a and b, determine their respective comparison points.
 */


import java.util.ArrayList;
import java.util.List;


public class Main {

    /**
     * The function is expected to return an INTEGER_ARRAY.
     *  The function accepts following parameters:
     *   1. INTEGER_ARRAY a
     *   2. INTEGER_ARRAY b
     * @param a the first list
     * @param b the second list
     * @return an integer array
     */
    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        // integer array to contain the points
        List<Integer> myPoints = new ArrayList<>();

        int alice = 0; // initial points for alice
        int bob = 0; // initial points for bob

        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) > b.get(i)) {
                alice = alice + 1;
            }
            if (a.get(i) < b.get(i)) {
                bob = bob + 1;
            }
        }
        // adding the points to the list
        myPoints.add(alice);
        myPoints.add(bob);
        return myPoints;
    }


    public static void main(String[] args) {
        List<Integer> alpha = new ArrayList<>();
        alpha.add(17);
        alpha.add(28);
        alpha.add(30);

        List<Integer> beta = new ArrayList<>();
        beta.add(99);
        beta.add(16);
        beta.add(8);

        // calling the method above
        List<Integer> test = compareTriplets(alpha, beta);
        for (int i = 0; i < test.size() ; i++) {
            System.out.print(test.get(i) + " ");
        }
    }
}