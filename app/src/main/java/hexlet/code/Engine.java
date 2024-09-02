package hexlet.code;
import java.util.Scanner;

public class Engine {
    static boolean isItRight(String userAnswer, String rightAnswer) {
        var bool = userAnswer.equals(rightAnswer) ? true : false;
        return bool;
    }

    static void correctAnswer() {
        System.out.println("Correct!");
        return;
    }

    static void wrongAnswer(String userAnswer, String rightAnswer) {
        System.out.print("'" + userAnswer + "'" + " is wrong answer ;(.");
        System.out.println(" Correct answer was " + "'" + rightAnswer + "'.");
        System.out.println("Let's try again, " + Cli.userName + "!");
        return;
    }

    static String userInput() {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        return str;
    }

    static int randomNumber() {
        var number = (int) (Math.random() * 100);
        return number;
    }

    static int conditionIf(String userAnswer, String wrightAnswer, int i) {
        if (isItRight(userAnswer, wrightAnswer)) {
            correctAnswer();
            i++;
            if (i == 3) {
                System.out.println("Congratulations, " + Cli.userName + "!");
            }
        } else {
            wrongAnswer(userAnswer, wrightAnswer);
            return 3;
        }
        return i;
    }
}
