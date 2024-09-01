package hexlet.code;

import java.util.Scanner;

public class GameEven {
    static void game() {

        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        Scanner scan = new Scanner(System.in);
        String even;

        var i = 0;
        while (i < 3) {
            var hiddenNumber = (int) (Math.random() * 100);
            even = (hiddenNumber % 2 == 0) ? "yes" : "no";
            System.out.print("Question: " + hiddenNumber + "\nYour answer: ");

            var answer = scan.next();

            if (answer.equals(even)) {
                System.out.println("Correct!");
                i++;
            } else {
                System.out.println("'" + answer + "'" + " is wrong answer ;(. Correct answer was " + even + ".\n"
                        + "Let's try again, " + Cli.userName + "!");
                i = 0;
            }
        }
        System.out.println("Congratulations, " + Cli.userName + "!");
        return;
    }
}
