package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Utils;
import java.math.BigInteger;

public class GCD {

    public static final int MAX_RANDOM_NUMBER = 25;
    public static void run() {

        var rules = "Find the greatest common divisor of given numbers.";
        var questions = Utils.getQestions();

        for (var i = 0; i < Engine.MAX_NUMBER_OF_GAMES; i++) {
            questions[i] = generateRoundData();
        }

        Engine.run(questions, rules);
    }

    public static String[] generateRoundData() {

        var question = new String[2];

        int firstNumber = Utils.generateRandom(MAX_RANDOM_NUMBER);
        int secondNumber = Utils.generateRandom(MAX_RANDOM_NUMBER);
        int gcd = findMaxDivisor(firstNumber, secondNumber);

        question[0] = firstNumber + " " + secondNumber;
        question[1] = String.valueOf(gcd);

        return question;
    }

    static int findMaxDivisor(int firstNumber, int secondNumber) {
        BigInteger bg1 = new BigInteger(String.valueOf(firstNumber));
        BigInteger bg2 = new BigInteger(String.valueOf(secondNumber));
        return (bg1.gcd(bg2)).intValue();
    }
}
