package hexlet.code;

import java.util.Scanner;

class GameSelection {
    static void userInput() {

        System.out.print("Your choise: ");

        Scanner scan = new Scanner(System.in);
        var gameChoise = scan.next();

        switch (gameChoise) {
            case "0":
                System.out.println("See you ;)");
                break;
            case "1":
                Cli.greeting();
                break;
            case "2":
                Cli.greeting();
                GameEven.game();
                break;
            default:
                System.out.println("Incorrect number " + gameChoise + ". Let's try again");
                userInput();
        }
        return;
    }
}
