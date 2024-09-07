package hexlet.code.Games;
import hexlet.code.Engine;

import java.math.BigInteger;
public class Divisor {
    public static void divisor() {
        System.out.println("Find the greatest common divisor of given numbers.");
        int firstNumber;
        int secondNumber;
        var gameNumber = 0;
        var difficulty = 25;
        int[] numbers;
        String userAnswer;
        while (gameNumber < 3) {
            numbers = randomNumber(difficulty);
            firstNumber = numbers[0];
            secondNumber = numbers[1];
            System.out.println("Question: " + firstNumber + " " + secondNumber);
            System.out.print("Your answer: ");
            userAnswer = Engine.userInput();
            gameNumber = Engine.correctOrNot(userAnswer, String.valueOf(numbers[2]), gameNumber);
        }
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
