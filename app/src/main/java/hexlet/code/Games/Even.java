package hexlet.code.Games;
import hexlet.code.Engine;

public class Even {
    public static void even() {

        var rules = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        final var DIFFICULTY = 100;
        var questions = new String[Engine.GAME_NUM][2];

        for (var i = 0; i < Engine.GAME_NUM; i++) {
            var num = Engine.randomNumber(DIFFICULTY);
            questions[i][0] = num + "";
            questions[i][1] = ((num % 2) == 0) ? "yes" : "no";
        }
        Engine.run(questions, rules);
    }
}
