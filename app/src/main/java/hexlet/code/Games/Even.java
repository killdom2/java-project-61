package hexlet.code.Games;
import hexlet.code.Engine;

public class Even {
    public static void even() {

        var rules = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        final var difficulty = 100;
        var questions = new String[Engine.GAME_NUM][2];

        for (var i = 0; i < Engine.GAME_NUM; i++) {
            var num = Engine.randomNumber(difficulty);
            questions[i][0] = num + "";
            questions[i][1] = ((num % 2) == 0) ? "yes" : "no";
        }
        Engine.run(questions, rules);
    }
}
