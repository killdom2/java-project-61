package hexlet.code;
import java.util.Random;

public class Utils {

    public static int generateRandom(int max) {
        Random rnd = new Random();
        return rnd.nextInt(max);
    }
    public static int generateRandom(int min, int range) {
        Random rnd = new Random();
        return rnd.nextInt(range) + min;
    }
}
