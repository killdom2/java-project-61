package hexlet.code.Games;
import hexlet.code.Engine;
public class Progression {
    public static void progression() {
        System.out.println("What number is missing in the progression?");
        var stepOfProgression = 0;
        var firstNumber = 0;
        var lengthOfProgression = 0;
        var maxLength = 10;
        var difficulty = 30;
        var i = 0;
        var gameNumber = 0;
        var hiddenNumber = 0;
        while (gameNumber < 3) {
            do {
                firstNumber = Engine.randomNumber(difficulty);
                stepOfProgression = Engine.randomNumber(maxLength);
                lengthOfProgression = Engine.randomNumber(maxLength);
                if (correctLengthAndStep(lengthOfProgression, stepOfProgression)) {
                    i = 1;
                } else if (lessThenFive(lengthOfProgression, stepOfProgression)) {
                    lengthOfProgression = 10;
                    i = 1;
                } else {
                    i = 0;
                }
            } while (i == 0);
            hiddenNumber = Engine.randomNumber(lengthOfProgression);
            var progression = new int[lengthOfProgression];
            System.out.print("Question: ");
            progression = makeArray(lengthOfProgression, firstNumber, stepOfProgression);
            printNumbers(progression, lengthOfProgression, hiddenNumber);
            System.out.print("\nYour answer: ");
            var userAnswer = Engine.userInput();
            gameNumber = Engine.correctOrNot(userAnswer, Integer.toString(progression[hiddenNumber]), gameNumber);
        }
        return;
    }
    static boolean correctLengthAndStep(int lengthOfProgression, int stepOfProgression) {
        return lengthOfProgression >= 5 && lengthOfProgression <= 10 && stepOfProgression > 1;
    }
    static boolean lessThenFive(int lengthOfProgression, int stepOfProgression) {
        return lengthOfProgression < 5 && stepOfProgression > 1;
    }
    static void printNumbers(int[] progression, int lengthOfProgression, int hiddenNumber) {
        for (int i = 0; i < lengthOfProgression; i++) {
            if (i == hiddenNumber) {
                System.out.print(".. ");
            } else {
                System.out.print(progression[i] + " ");
            }
        }
        return;
    }
    static int[] makeArray(int lengthOfProgression, int firstNumber, int stepOfProgression) {
        var count = 0;
        var progression = new int[lengthOfProgression];
        while (count < lengthOfProgression) {
            progression[count] = firstNumber;
            firstNumber += stepOfProgression;
            count++;
        }
        return progression;
    }
}
