package hexlet.code;
import hexlet.code.Games.Calc;
import hexlet.code.Games.Divisor;
import hexlet.code.Games.Even;
import hexlet.code.Games.Prime;
import hexlet.code.Games.Progression;

public class App {
    public static void main(String[] args) {

        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("6 - Prime");
        System.out.println("0 - Exit");
        System.out.print("Your choise: ");

        var gameChoise = Engine.userInput();
        switch (gameChoise) {
            case "0" -> System.out.println("See you");
            case "1" -> Cli.greeting();
            case "2" -> Even.even();
            case "3" -> Calc.calc();
            case "4" -> Divisor.divisor();
            case "5" -> Progression.progression();
            case "6" -> Prime.prime();
            default -> System.out.println("Incorrect input " + "'" + gameChoise + "'" + ". Let's try again");
        }
    }
}
