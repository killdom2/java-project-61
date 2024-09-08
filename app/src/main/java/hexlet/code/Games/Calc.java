package hexlet.code.Games;
import hexlet.code.Engine;
public class Calc {
    public static void calc() {
        System.out.println("What is the result of the expression?");
        int result;
        var gameNumber = 0;
        final var difficulty = 25;
        final var numberOfOperators = 3;
        while (gameNumber < Engine.getMaxGameNum()) {
            var firstNum = Engine.randomNumber(difficulty);
            var secondNum = Engine.randomNumber(difficulty);
            var operator = Engine.randomNumber(numberOfOperators);
            System.out.print("Question: ");
            result = switch (operator) {
                case 0 -> {
                    System.out.println(firstNum + " + " + secondNum);
                    yield firstNum + secondNum;
                }
                case 1 -> {
                    System.out.println(firstNum + " - " + secondNum);
                    yield firstNum - secondNum;
                }
                default -> {
                    System.out.println(firstNum + " * " + secondNum);
                    yield firstNum * secondNum;
                }
            };
            System.out.print("Your answer: ");
            var userAnswer = Engine.userInput();
            gameNumber = Engine.correctOrNot(userAnswer, String.valueOf(result), gameNumber);
        }
    }
}
