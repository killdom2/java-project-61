package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Utils;

public class Calc {

    public static final int DIFFICULTY = 25;
    public static final int NUMBER_OF_OPERATORS = 3;
    public static void run() {

        var rules = "What is the result of the expression?";
        var questions = generateRoundData();

        Engine.run(questions, rules);
    }

    public static String[][] generateRoundData() {

        int rezult;
        var questions = new String[Engine.GAME_NUM][2];

        for (var i = 0; i < Engine.GAME_NUM; i++) {
            var firstNum = Utils.generateRandom(DIFFICULTY);
            var secondNum = Utils.generateRandom(DIFFICULTY);
            var operator = Utils.generateRandom(NUMBER_OF_OPERATORS);
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
        return questions;
    }
}
