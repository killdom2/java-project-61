package hexlet.code;
import java.util.Scanner;
import java.util.Random;

public class Engine {

    public static final int GAME_NUM = 3;

    public static void run(String[][] questions, String rules) {

        Cli.greeting();
        System.out.println(rules);

        for (var i = 0; i < GAME_NUM; i++) {
            System.out.print("Question: " + questions[i][0] + "\nYour answer: ");
            var answer = Engine.userInput();
            if (answer.equals(questions[i][1])) {
                System.out.println("Correct!");
                if (i == 2) {
                    System.out.println("Congratulations, " + Cli.getUserName() + "!");
                }
            } else {
                System.out.print("'" + answer + "'" + " is wrong answer ;(.");
                System.out.println(" Correct answer was " + "'" + questions[i][1] + "'.");
                System.out.println("Let's try again, " + Cli.getUserName() + "!");
                i = 3;
            }
        }
    }

    public static String userInput() {
        Scanner scan = new Scanner(System.in);
        return scan.nextLine();
    }

    public static int randomNumber(int val) {
        Random rnd = new Random();
        return rnd.nextInt(val);
    }

}
