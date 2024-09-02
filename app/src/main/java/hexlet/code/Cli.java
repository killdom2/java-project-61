package hexlet.code;

class Cli {
    public static String userName;

    static void greeting() {

        System.out.print("Wellcome to the Brain Games!\nMay I have your name? ");
        userName = Engine.userInput();
        System.out.println("Hello, " + userName + "!");
        return;
    }
}
