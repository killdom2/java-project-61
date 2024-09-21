package hexlet.code;

public class Cli {

    private static String userName;

    public static void greeting() {

        System.out.print("Welcome to the Brain Games!\nMay I have your name? ");
        userName = Engine.userInput();
        System.out.println("Hello, " + userName + "!");
    }

    public static String getUserName() {
        return userName;
    }
}
