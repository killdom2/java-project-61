package hexlet.code;
import java.math.BigInteger;

public class GameDivisor {
    static void divisor() {

        System.out.println("Find the greatest common divisor of given numbers.");
        int firstNumber;
        int secondNumber;
        var i = 0;
        var difficulty = 25;
        int[] numbers = new int[3];
        String userAnswer;

        while (i < 3) {
            numbers = randomNumber(difficulty);
            firstNumber = numbers[0];
            secondNumber = numbers[1];
            System.out.print("Question: " + firstNumber + " " + secondNumber + "\t");
            userAnswer = Engine.userInput();
            i = Engine.correctOrNot(userAnswer, String.valueOf(numbers[2]), i);
        }
        return;
    }

    static int[] randomNumber(int difficulty) {
        int gcd = 1;
        int firstNumber = 0;
        int secondNumber = 0;
        while (gcd == 1) {
            firstNumber = Engine.randomNumber(difficulty);
            secondNumber = Engine.randomNumber(difficulty);
            if (firstNumber < 2 || secondNumber < 2 || firstNumber == secondNumber) {
                gcd = 1;
            } else {
                gcd = maxDivisor(firstNumber, secondNumber);
            }
        }
        int[] numbers = {firstNumber, secondNumber, gcd};
        return numbers;
    }

    static int maxDivisor(int firstNumber, int secondNumber) {
        BigInteger bg1 = new BigInteger(String.valueOf(firstNumber));
        BigInteger bg2 = new BigInteger(String.valueOf(secondNumber));
        var gcd = (bg1.gcd(bg2)).intValue();
        return gcd;
    }
}
