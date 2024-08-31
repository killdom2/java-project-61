package hexlet.code;

import java.util.Scanner;

public class Cli {
    static void greeting() {
        Scanner scan = new Scanner(System.in);
        var userName = scan.next();
        scan.close();
        System.out.println("Hello, " + userName + "!");
    }
}
