package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Utils;

public class Calc {

    public static final int MAX_RANDOM_NUMBER = 25;
    public static final String RULES = "What is the result of the expression?";

    public static void run() {

        var questions = new String[Engine.MAX_NUMBER_OF_GAMES][2];

        for (var i = 0; i < Engine.MAX_NUMBER_OF_GAMES; i++) {
            questions[i] = generateRoundData();
        }

        Engine.run(questions, RULES);
    }

    public static String[] generateRoundData() {

        var question = new String[2];
        var operators = new char[]{'+', '-', '*'};

        var firstNum = Utils.generateRandom(MAX_RANDOM_NUMBER);
        var secondNum = Utils.generateRandom(MAX_RANDOM_NUMBER);
        var operator = operators[Utils.generateRandom(operators.length)];

        question[0] = firstNum + " " + operator + " " + secondNum;
        question[1] = String.valueOf(calculatingTheValue(firstNum, secondNum, operator));

        return question;
    }

    public static int calculatingTheValue(int firstNum, int secondNum, char operator) {

        return switch (operator) {
            case '+' -> firstNum + secondNum;
            case '-' -> firstNum - secondNum;
            case '*' -> firstNum * secondNum;
            default -> throw new RuntimeException("Неизвестный оператор");
        };
    }
}


