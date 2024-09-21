package hexlet.code.Games;
import hexlet.code.Engine;
import java.math.BigInteger;

public class Divisor {
    public static void divisor() {

        var rules = "Find the greatest common divisor of given numbers.";
        final var DIFFICULTY = 25;
        int[] numbers;
        var questions = new String[Engine.GAME_NUM][2];

        for (var i = 0; i < Engine.GAME_NUM; i++) {
            numbers = randomNumber(DIFFICULTY);
            questions[i][0] = numbers[0] + " " + numbers[1];
            questions[i][1] = maxDivisor(numbers[0], numbers[1]) + "";
        }
        Engine.run(questions, rules);
    }

    static int[] randomNumber(int difficulty) {
        int gcd = 1;
        int firstNumber = 0;
        int secondNumber = 0;
        while (gcd == 1) {
            firstNumber = Engine.randomNumber(difficulty);
            secondNumber = Engine.randomNumber(difficulty);
            if (!lessThenTwo(firstNumber, secondNumber)) {
                gcd = maxDivisor(firstNumber, secondNumber);
            }
        }
        return new int[]{firstNumber, secondNumber, gcd};
    }

    static int maxDivisor(int firstNumber, int secondNumber) {
        BigInteger bg1 = new BigInteger(String.valueOf(firstNumber));
        BigInteger bg2 = new BigInteger(String.valueOf(secondNumber));
        return (bg1.gcd(bg2)).intValue();
    }

    static boolean lessThenTwo(int firstNumber, int secondNumber) {
        return firstNumber < 2 || secondNumber < 2 || firstNumber == secondNumber;
    }
}
