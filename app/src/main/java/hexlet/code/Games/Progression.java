package hexlet.code.Games;
import hexlet.code.Engine;
public class Progression {
    public static void progression() {
        System.out.println("What number is missing in the progression?");
        int step;
        int firstNumber;
        int length;
        final var minLength = 5;
        final var maxLength = 10;
        final var minStep = 2;
        final var difficulty = 30;
        var i = 0;
        var gameNumber = 0;
        var hiddenNum = 0;
        while (gameNumber < Engine.getMaxGameNum()) {
            do {
                firstNumber = Engine.randomNumber(difficulty);
                step = Engine.randomNumber(maxLength);
                length = Engine.randomNumber(maxLength);
                if (correctLengthAndStep(length, step, minLength, maxLength, minStep)) {
                    i = 1;
                } else if (recommendTen(length, step, minLength, minStep)) {
                    length = maxLength;
                    i = 1;
                } else {
                    i = 0;
                }
            } while (i == 0);

            hiddenNum = Engine.randomNumber(length);
            System.out.print("Question: ");

            hiddenNum = printProgression(length, hiddenNum, firstNumber, step);

            System.out.print("\nYour answer: ");
            var userAnswer = Engine.userInput();
            gameNumber = Engine.correctOrNot(userAnswer, Integer.toString(hiddenNum), gameNumber);
        }
    }

    private static boolean correctLengthAndStep(int length, int step, int minLength, int maxLength, int minStep) {
        return length >= minLength && length <= maxLength && step >= minStep;
    }

    private static boolean recommendTen(int length, int step, int minLength, int minStep) {
        return length < minLength && step >= minStep;
    }

    private static int printProgression(int length, int hiddenNum, int firstNumber, int step) {
        var num = 0;
        for (int i = 0; i < length; i++) {
            if (i == hiddenNum) {
                System.out.print(".. ");
                num = firstNumber;
            } else {
                System.out.print(firstNumber + " ");
            }
            firstNumber += step;
        }
        return num;
    }
}

