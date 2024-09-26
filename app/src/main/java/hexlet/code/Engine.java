package hexlet.code;
import java.util.Scanner;

public class Engine {

    public static final int GAME_NUM = 3;

    public static void run(String[][] questions, String rules) {

        String name = Cli.greeting();
        System.out.println(rules);
        Scanner scan = new Scanner(System.in);

        for (var i = 0; i < GAME_NUM; i++) {
            System.out.print("Question: " + questions[i][0] + "\nYour answer: ");
            var answer = scan.nextLine();
            if (answer.equals(questions[i][1])) {
                System.out.println("Correct!");
                if (i == 2) {
                    System.out.println("Congratulations, " + name + "!");
                }
            } else {
                System.out.print("'" + answer + "'" + " is wrong answer ;(.");
                System.out.println(" Correct answer was " + "'" + questions[i][1] + "'.");
                System.out.println("Let's try again, " + name + "!");
                i = GAME_NUM;
            }
        }
    }
}
