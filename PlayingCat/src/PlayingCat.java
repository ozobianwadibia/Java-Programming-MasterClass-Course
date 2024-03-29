/**
 * The cats spend most of the day playing. In particular, they play if the temperature is between 25 and 35 (inclusive). Unless it is summer, then the upper limit is 45 (inclusive) instead of 35.
 *
 *
 * Write a method isCatPlaying that has 2 parameters. Method needs to return true if the cat is playing, otherwise return false
 *
 * 1st parameter should be of type boolean and be named summer it represents if it is summer.
 * 2nd parameter represents the temperature and is of type int with the name temperature.
 */


public class PlayingCat {

    /**
     * Prints a boolean, depending on season and temperature
     * @param summer the season under consideration
     * @param temperature the temperature
     * @return true or false
     */
    public static boolean isCatPlaying(boolean summer, int temperature) {
        boolean playingCat = false;
        if ((summer == false) && ((temperature >= 25) && (temperature <= 35))) {
            playingCat = true;
        }
        else if ((summer == true) && ((temperature >= 25) && (temperature <= 45))) {
            playingCat = true;
        }
        return playingCat;
    }


    public static void main(String[] args) {
        // testing the method above
        System.out.println(isCatPlaying(true, 10)); // false
        System.out.println(isCatPlaying(false, 36)); // false
        System.out.println(isCatPlaying(false, 35)); // true
    }
}