package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Utils;
import java.math.BigInteger;

public class GCD {

    public static final int DIFFICULTY = 25;
    public static void run() {

        var rules = "Find the greatest common divisor of given numbers.";
        var questions = generateRoundData();

        Engine.run(questions, rules);
    }

    public static String[][] generateRoundData() {

        int[] numbers;
        var questions = new String[Engine.GAME_NUM][2];

        for (var i = 0; i < Engine.GAME_NUM; i++) {
            numbers = generateRandom();
            questions[i][0] = numbers[0] + " " + numbers[1];
            questions[i][1] = findMaxDivisor(numbers[0], numbers[1]) + "";
        }
        return questions;
    }

    static int[] generateRandom() {
        int gcd = 1;
        int firstNumber = 0;
        int secondNumber = 0;
        while (gcd == 1) {
            firstNumber = Utils.generateRandom(DIFFICULTY);
            secondNumber = Utils.generateRandom(DIFFICULTY);
            if (!isLessThenTwo(firstNumber, secondNumber)) {
                gcd = findMaxDivisor(firstNumber, secondNumber);
            }
        }
        return new int[]{firstNumber, secondNumber, gcd};
    }

    static int findMaxDivisor(int firstNumber, int secondNumber) {
        BigInteger bg1 = new BigInteger(String.valueOf(firstNumber));
        BigInteger bg2 = new BigInteger(String.valueOf(secondNumber));
        return (bg1.gcd(bg2)).intValue();
    }

    static boolean isLessThenTwo(int firstNumber, int secondNumber) {
        return firstNumber < 2 || secondNumber < 2 || firstNumber == secondNumber;
    }
}
