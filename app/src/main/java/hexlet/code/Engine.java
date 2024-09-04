package hexlet.code;
import java.util.Scanner;
import java.util.Random;

public class Engine {

    static String userInput() {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        return str;
    }

    static int randomNumber(int val) {
        Random rnd = new Random();
        var number = rnd.nextInt(val);
        return number;
    }

    static int correctOrNot(String userAnswer, String rightAnswer, int i) {
        if (userAnswer.equals(rightAnswer)) {
            System.out.println("Correct!");
            i++;
            if (i == 3) {
                System.out.println("Congratulations, " + Cli.userName + "!");
            }
        } else {
            System.out.print("'" + userAnswer + "'" + " is wrong answer ;(.");
            System.out.println(" Correct answer was " + "'" + rightAnswer + "'.");
            System.out.println("Let's try again, " + Cli.userName + "!");
            return 3;
        }
        return i;
    }
}
