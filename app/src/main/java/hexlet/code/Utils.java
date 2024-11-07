package hexlet.code;
import java.util.Random;

public class Utils {
    public static Random rnd = new Random();

    public static int generateRandom(int max) {
        return rnd.nextInt(max);
    }
    public static int generateRandom(int min, int range) {
        return rnd.nextInt(range) + min;
    }
}
