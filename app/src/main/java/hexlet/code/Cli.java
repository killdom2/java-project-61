package hexlet.code;
import java.util.Scanner;

public class Cli {
    public static String greet() {

        System.out.print("Welcome to the Brain Games!\nMay I have your name? ");
        Scanner scan = new Scanner(System.in);
        String userName = scan.nextLine();
        System.out.println("Hello, " + userName + "!");
        return userName;
    }
}
