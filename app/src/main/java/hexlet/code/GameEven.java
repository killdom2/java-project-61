package hexlet.code;

public class GameEven {
    static void game() {

        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        String even;
        var difficulty = 100;

        var i = 0;
        while (i < 3) {
            var hiddenNumber = Engine.randomNumber(difficulty);
            even = (hiddenNumber % 2 == 0) ? "yes" : "no";
            System.out.print("Question: " + hiddenNumber + "\nYour answer: ");

            var answer = Engine.userInput();

            i = Engine.correctOrNot(answer, even, i);
        }
        return;
    }
}
