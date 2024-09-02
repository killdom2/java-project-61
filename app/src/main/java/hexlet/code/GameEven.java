package hexlet.code;

public class GameEven {
    static void game() {

        task();

        String even;

        var i = 0;
        while (i < 3) {
            var hiddenNumber = Engine.randomNumber();
            even = (hiddenNumber % 2 == 0) ? "yes" : "no";
            System.out.print("Question: " + hiddenNumber + "\nYour answer: ");

            var answer = Engine.userInput();

            i = Engine.conditionIf(answer, even, i);
        }
        return;
    }

    static void task() {
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        return;
    }
}
