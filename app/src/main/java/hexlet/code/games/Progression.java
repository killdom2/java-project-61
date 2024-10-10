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
    public static final String RULES = "What number is missing in the progression?";

    public static void run() {

        var questions = new String[Engine.MAX_NUMBER_OF_GAMES][2];

        for (var i = 0; i < Engine.MAX_NUMBER_OF_GAMES; i++) {
            var question = generateRoundData();
            questions[i][0] = question[0];
            questions[i][1] = question[1];
        }

        Engine.run(questions, RULES);
    }

    public static String[] generateRoundData() {

        int step = Utils.generateRandom(MAX_STEP) + MIN_STEP;
        int firstNumber = Utils.generateRandom(MAX_RANDOM_NUMBER);
        int length = Utils.generateRandom(LENGTH_OF_PROGRESSION);

        if (length < MIN_LENGTH) {
            length = MAX_LENGTH;
        }

        var hiddenNum = Utils.generateRandom(length);

        var progression = generateProgression(length, step, firstNumber);
        var question = new String[]{"", ""};

        for (int i = 0; i < progression.length; i++) {

            if (i == hiddenNum) {
                question[0] += ".. ";
                question[1] = String.valueOf(firstNumber);
            } else {
                question[0] += firstNumber + " ";
            }
            firstNumber += step;
        }
        return question;
    }

    public static String[] generateProgression(int length, int step, int firstNumber) {

        var progression = new String[length];

        for (int i = 0; i < length; i++) {
            progression[i] = String.valueOf(firstNumber);
            firstNumber += step;
        }
        return progression;
    }
}

