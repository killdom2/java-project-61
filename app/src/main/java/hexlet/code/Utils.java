package hexlet.code;
import java.util.Random;

public class Utils {

    public static int generateRandom(int val) {
        Random rnd = new Random();
        return rnd.nextInt(val);
    }
}
