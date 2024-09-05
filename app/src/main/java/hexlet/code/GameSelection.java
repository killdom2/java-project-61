package hexlet.code;

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
                GameEven.game();
                break;
            case "3":
                Cli.greeting();
                GameCalc.calc();
                break;
            case "4":
                Cli.greeting();
                GameDivisor.divisor();
                break;
            case "5":
                Cli.greeting();
                GameProgression.progression();
                break;
            default:
                System.out.println("Incorrect input " + "'" + gameChoise + "'" + ". Let's try again");
                userInput();
        }
        return;
    }
}
