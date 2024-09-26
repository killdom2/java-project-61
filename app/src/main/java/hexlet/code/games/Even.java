package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Utils;

public class Even {

    public static final int DIFFICULTY = 100;
    public static void run() {

        var rules = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        var questions = generateRoundData();

        Engine.run(questions, rules);
    }

    public static String[][] generateRoundData() {

        var questions = new String[Engine.GAME_NUM][2];

        for (var i = 0; i < Engine.GAME_NUM; i++) {
            var num = Utils.generateRandom(DIFFICULTY);
            questions[i][0] = num + "";
            questions[i][1] = ((num % 2) == 0) ? "yes" : "no";
        }
        return questions;
    }
}
