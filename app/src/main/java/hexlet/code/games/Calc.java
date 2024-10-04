package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Utils;

public class Calc {

    public static final int MAX_RANDOM_NUMBER = 25;
    public static void run() {

        var rules = "What is the result of the expression?";
        var questions = new String[Engine.MAX_NUMBER_OF_GAMES][2];

        for (var i = 0; i < Engine.MAX_NUMBER_OF_GAMES; i++) {
            questions[i] = generateRoundData();
        }

        Engine.run(questions, rules);
    }

    public static String[] generateRoundData() {

        var question = new String[2];
        var operators = new char[]{'+', '-', '*'};

        var firstNum = Utils.generateRandom(MAX_RANDOM_NUMBER);
        var secondNum = Utils.generateRandom(MAX_RANDOM_NUMBER);
        var operator = operators[Utils.generateRandom(operators.length)];

        question[0] = firstNum + " " + operator + " " + secondNum;

        question[1] = switch (operator) {
            case '+' -> String.valueOf(firstNum + secondNum);
            case '-' -> String.valueOf(firstNum - secondNum);
            default -> String.valueOf(firstNum * secondNum);
        };

        return question;
    }
}
