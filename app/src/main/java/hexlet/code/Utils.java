package hexlet.code;
import java.util.Random;

public class Utils {
    private static final Random RND = new Random();

    public static int generateRandom(int max) {
        return RND.nextInt(max);
    }
    public static int generateRandom(int min, int range) {
        return RND.nextInt(range) + min;
    }
}
