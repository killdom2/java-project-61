package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Utils;

public class Even {

    public static final int MAX_RANDOM_NUMBER = 100;
    public static final String RULES = "Answer 'yes' if the number is even, otherwise answer 'no'.";

    public static void run() {

        var questions = new String[Engine.MAX_NUMBER_OF_GAMES][2];

        for (var i = 0; i < Engine.MAX_NUMBER_OF_GAMES; i++) {
            questions[i] = generateRoundData();
        }

        Engine.run(questions, RULES);
    }

    public static String[] generateRoundData() {

        var question = new String[2];

        var num = Utils.generateRandom(MAX_RANDOM_NUMBER);
        question[0] = num + "";
        question[1] = isEven(num) ? "yes" : "no";

        return question;
    }

    public static boolean isEven(int num) {
        return num % 2 == 0;
    }
}
