package hexlet.code.Games;
import hexlet.code.Engine;

public class Calc {
    public static void calc() {

        var rules = "What is the result of the expression?";
        int rezult;
        final var difficulty = 25;
        final var numberOfOperators = 3;
        var questions = new String[Engine.GAME_NUM][2];

        for (var i = 0; i < Engine.GAME_NUM; i++) {
            var firstNum = Engine.randomNumber(difficulty);
            var secondNum = Engine.randomNumber(difficulty);
            var operator = Engine.randomNumber(numberOfOperators);
            String question;

            rezult = switch (operator) {
                case 0 -> {
                    question = firstNum + " + " + secondNum;
                    yield firstNum + secondNum;
                }
                case 1 -> {
                    question = firstNum + " - " + secondNum;
                    yield firstNum - secondNum;
                }
                default -> {
                    question = firstNum + " * " + secondNum;
                    yield firstNum * secondNum;
                }
            };
            questions[i][0] = question;
            questions[i][1] = rezult + "";
        }
        Engine.run(questions, rules);
    }
}
