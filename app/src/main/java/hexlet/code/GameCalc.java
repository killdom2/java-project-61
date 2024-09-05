package hexlet.code;

public class GameCalc {
    static void calc() {

        System.out.println("What is the result of the expression?");

        var rezult = 0;
        var gameNum = 0;
        var difficulty = 25;
        var numberOfOperators = 3;

        while (gameNum < 3) {
            var firstNum = Engine.randomNumber(difficulty);
            var secondNum = Engine.randomNumber(difficulty);
            var operator = Engine.randomNumber(numberOfOperators);
            System.out.print("Question: ");

            switch (operator) {
                case 0:
                    System.out.println(firstNum + " + " +  secondNum);
                    rezult = firstNum + secondNum;
                    break;
                case 1:
                    System.out.println(firstNum + " - " +  secondNum);
                    rezult = firstNum - secondNum;
                    break;
                default:
                    System.out.println(firstNum + " * " +  secondNum);
                    rezult = firstNum * secondNum;
                    break;
            }

            System.out.print("Your answer: ");
            var userAnswer = Engine.userInput();

            gameNum = Engine.correctOrNot(userAnswer, String.valueOf(rezult), gameNum);
        }
        return;
    }
}
