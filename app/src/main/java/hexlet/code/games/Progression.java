package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Utils;

public class Progression {

    public static final int LENGTH_OF_PROGRESSION = 10;
    public static final int MIN_LENGTH = 5;
    public static final int MAX_LENGTH = 10;
    public static final int MIN_STEP = 2;
    public static final int MAX_STEP = 8;
    public static final int MAX_RANDOM_NUMBER = 30;

    public static void run() {

        var rules = "What number is missing in the progression?";
        int step;
        int firstNumber;
        int length;
        var questions = new String[Engine.MAX_NUMBER_OF_GAMES][2];

        for (var i = 0; i < Engine.MAX_NUMBER_OF_GAMES; i++) {

            firstNumber = Utils.generateRandom(MAX_RANDOM_NUMBER);
            step = Utils.generateRandom(MAX_STEP) + MIN_STEP;
            length = Utils.generateRandom(LENGTH_OF_PROGRESSION);

            if (length < MIN_LENGTH) {  // В задании есть условие: "Рекомендуемая длина 10 чисел"
                length = MAX_LENGTH;
            }

            var question = generateRoundData(length, firstNumber, step);
            questions[i][0] = question[0];
            questions[i][1] = question[1];
        }

        Engine.run(questions, rules);
    }

    public static String[] generateRoundData(int length, int firstNumber, int step) {

        var question = new String[]{"", ""};
        var hiddenNum = Utils.generateRandom(length);

        for (int i = 0; i < length; i++) {
            if (i == hiddenNum) {
                question[0] += ".. ";
                question[1] = firstNumber + "";
            } else {
                question[0] += firstNumber + " ";
            }
            firstNumber += step;
        }
        return question;
    }
}

