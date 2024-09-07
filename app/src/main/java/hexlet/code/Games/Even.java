package hexlet.code.Games;
import hexlet.code.Engine;
public class Even {
    public static void even() {
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        String even;
        var difficulty = 100;
        var gameNumber = 0;
        while (gameNumber < 3) {
            var hiddenNumber = Engine.randomNumber(difficulty);
            even = (hiddenNumber % 2 == 0) ? "yes" : "no";
            System.out.print("Question: " + hiddenNumber + "\nYour answer: ");
            var answer = Engine.userInput();
            gameNumber = Engine.correctOrNot(answer, even, gameNumber);
        }
        return;
    }
}
