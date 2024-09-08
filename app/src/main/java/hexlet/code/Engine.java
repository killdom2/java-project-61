package hexlet.code;
import java.util.Scanner;
import java.util.Random;

public class Engine {

    public static int getMaxGameNum() {
        final int maxGameNum = 3;
        return maxGameNum;
    }


    public static String userInput() {
        Scanner scan = new Scanner(System.in);
        return scan.nextLine();
    }

    public static int randomNumber(int val) {
        Random rnd = new Random();
        return rnd.nextInt(val);
    }

    public static int correctOrNot(String userAnswer, String rightAnswer, int i) {
        if (userAnswer.equals(rightAnswer)) {
            System.out.println("Correct!");
            i++;
            if (i == getMaxGameNum()) {
                System.out.println("Congratulations, " + Cli.getUserName() + "!");
            }
        } else {
            System.out.print("'" + userAnswer + "'" + " is wrong answer ;(.");
            System.out.println(" Correct answer was " + "'" + rightAnswer + "'.");
            System.out.println("Let's try again, " + Cli.getUserName() + "!");
            return getMaxGameNum();
        }
        return i;
    }
}
