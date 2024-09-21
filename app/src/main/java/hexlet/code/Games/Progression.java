package hexlet.code.Games;
import hexlet.code.Engine;

public class Progression {
    static int num;

    public static void progression() {

        var rules = "What number is missing in the progression?";
        int step;
        int firstNumber;
        int length;
        var j = 0;
        var hiddenNum = 0;
        var maxLength = 10;
        var difficulty = 30;
        var questions = new String[3][2];

        for (var i = 0; i < Engine.GAME_NUM; i++) {
            do {
                firstNumber = Engine.randomNumber(difficulty);
                step = Engine.randomNumber(maxLength);
                length = Engine.randomNumber(maxLength);
                if (correctLengthAndStep(length, step)) {
                    j = 1;
                } else if (recommendTen(length, step)) {
                    length = 10;
                    j = 1;
                } else {
                    j = 0;
                }
            } while (j == 0);

            hiddenNum = Engine.randomNumber(length);
            questions[i][0] = progression(length, hiddenNum, firstNumber, step);
            questions[i][1] = num + "";
        }
        Engine.run(questions, rules);
    }

    private static boolean correctLengthAndStep(int length, int step) {
        return length >= 5 && length <= 10 && step > 1;
    }

    private static boolean recommendTen(int length, int step) {
        return length < 5 && step > 1;
    }

    private static String progression(int length, int hiddenNum, int firstNumber, int step) {
        var result = "";
        for (int i = 0; i < length; i++) {
            if (i == hiddenNum) {
                result += ".. ";
                num = firstNumber;
            } else {
                result += firstNumber + " ";
            }
            firstNumber += step;
        }
        return result;
    }
}

