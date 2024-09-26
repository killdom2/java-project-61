package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Utils;

public class Progression {

    public static final int LENGTH_OF_PROGRESSION = 10;
    public static final int MIN_LENGTH = 5;
    public static final int MAX_LENGTH = 10;
    public static final int MIN_STEP = 2;
    public static final int MAX_STEP = 8;
    public static final int DIFFICULTY = 30;

    public static void run() {

        var rules = "What number is missing in the progression?";
        var questions = generateRoundData();

        Engine.run(questions, rules);
    }

    public static String[][] generateRoundData() {

        int step;
        int firstNumber;
        int length;
        var hiddenNum = 0;
        var questions = new String[Engine.GAME_NUM][2];

        for (var i = 0; i < Engine.GAME_NUM; i++) {

            firstNumber = Utils.generateRandom(DIFFICULTY);
            step = Utils.generateRandom(MAX_STEP) + MIN_STEP;
            length = Utils.generateRandom(LENGTH_OF_PROGRESSION);

            if (length < MIN_LENGTH) {
                length = MAX_LENGTH;
            }

            hiddenNum = Utils.generateRandom(length);

            var question = generateProgression(length, hiddenNum, firstNumber, step);
            questions[i][0] = question[0];
            questions[i][1] = question[1];
        }
        return questions;
    }

    private static String[] generateProgression(int length, int hiddenNum, int firstNumber, int step) {
        var question = new String[]{"", ""};

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

