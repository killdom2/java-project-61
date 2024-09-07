package hexlet.code.Games;
import hexlet.code.Engine;
public class Calc {
    public static void calc() {
        System.out.println("What is the result of the expression?");
        int rezult;
        var gameNumber = 0;
        var difficulty = 25;
        var numberOfOperators = 3;
        while (gameNumber < 3) {
            var firstNum = Engine.randomNumber(difficulty);
            var secondNum = Engine.randomNumber(difficulty);
            var operator = Engine.randomNumber(numberOfOperators);
            System.out.print("Question: ");
            rezult = switch (operator) {
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
            gameNumber = Engine.correctOrNot(userAnswer, String.valueOf(rezult), gameNumber);
        }
    }
}
