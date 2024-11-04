package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Utils;

public class Progression {

    public static final int MIN_PROGRESSION_LENGTH = 5;
    public static final int MAX_PROGRESSION_RANGE = 6;
    public static final int MIN_STEP = 2;
    public static final int MAX_STEP_RANGE = 8;
    public static final int MAX_RANDOM_NUMBER = 30;
    public static final String RULES = "What number is missing in the progression?";

    public static void run() {

        var questions = new String[Engine.MAX_NUMBER_OF_GAMES][2];

        for (var i = 0; i < Engine.MAX_NUMBER_OF_GAMES; i++) {
            questions[i] = generateRoundData();
        }

        Engine.run(questions, RULES);
    }

    public static String[] generateRoundData() {

        int step = Utils.generateRandom(MIN_STEP, MAX_STEP_RANGE);
        int firstNumber = Utils.generateRandom(MAX_RANDOM_NUMBER);
        int length = Utils.generateRandom(MIN_PROGRESSION_LENGTH, MAX_PROGRESSION_RANGE);

        var hiddenNum = Utils.generateRandom(length);

        var progression = generateProgression(length, step, firstNumber);
        var question = new String[]{"", ""};

        question[1] = progression[hiddenNum];
        progression[hiddenNum] = "..";

        for (String number : progression) {
            question[0] = String.join(" ", question[0], number);
        }

        question[0] = question[0].trim();
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

