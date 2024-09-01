package hexlet.code;

import java.util.Scanner;

class Cli {
    public static String userName;

    static void greeting() {

        System.out.print("Wellcome to the Brain Games!\nMay I have your name? ");

        Scanner scan = new Scanner(System.in);
        userName = scan.nextLine();
        System.out.println("Hello, " + userName + "!");
        return;
    }
}
