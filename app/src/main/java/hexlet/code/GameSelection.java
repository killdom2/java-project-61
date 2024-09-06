package hexlet.code;
import hexlet.code.Games.Calc;
import hexlet.code.Games.Divisor;
import hexlet.code.Games.Even;
import hexlet.code.Games.Prime;
import hexlet.code.Games.Progression;

class GameSelection {
    static void userInput() {
        System.out.print("Your choise: ");
        var gameChoise = Engine.userInput();
        switch (gameChoise) {
            case "0":
                System.out.println("See you ;)");
                break;
            case "1":
                Cli.greeting();
                break;
            case "2":
                Cli.greeting();
                Even.even();
                break;
            case "3":
                Cli.greeting();
                Calc.calc();
                break;
            case "4":
                Cli.greeting();
                Divisor.divisor();
                break;
            case "5":
                Cli.greeting();
                Progression.progression();
                break;
            case "6":
                Cli.greeting();
                Prime.prime();
                break;
            default:
                System.out.println("Incorrect input " + "'" + gameChoise + "'" + ". Let's try again");
                userInput();
        }
        return;
    }
}
