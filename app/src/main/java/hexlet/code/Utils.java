package hexlet.code;
import java.util.Random;

public class Utils {

    private static String[][] questions = new String[Engine.MAX_NUMBER_OF_GAMES][2];

    public static String[][] getQestions() {
        return questions;
    }

    public static int generateRandom(int val) {
        Random rnd = new Random();
        return rnd.nextInt(val);
    }
}
