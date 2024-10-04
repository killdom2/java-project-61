package hexlet.code;
import java.util.Scanner;

public class Engine {

    public static final int MAX_NUMBER_OF_GAMES = 3;

    public static void run(String[][] questions, String rules) {

        String name = Cli.greet();
        System.out.println(rules);
        Scanner scan = new Scanner(System.in);

        for (var i = 0; i < MAX_NUMBER_OF_GAMES; i++) {
            System.out.print("Question: " + questions[i][0] + "\nYour answer: ");
            var answer = scan.nextLine();
            if (answer.equals(questions[i][1])) {
                System.out.println("Correct!");
            } else {
                System.out.print("'" + answer + "'" + " is wrong answer ;(.");
                System.out.println(" Correct answer was " + "'" + questions[i][1] + "'.");
                System.out.println("Let's try again, " + name + "!");
                return;
            }
        }
        System.out.println("Congratulations, " + name + "!");
    }
}
