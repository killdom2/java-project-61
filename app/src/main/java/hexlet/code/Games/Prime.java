package hexlet.code.Games;
import hexlet.code.Engine;
public class Prime {
    public static void prime() {
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        var rightAnswer = "";
        var difficulty = 100;
        var gameNumber = 0;
        while (gameNumber < 3) {
            var number = 0;
            while (number < 2 || number % 2 == 0) {
                number = Engine.randomNumber(difficulty);
            }
            System.out.println("Question: " + number);
            System.out.print("Your answer: ");
            rightAnswer = isPrime(number);
            var userAnswer = Engine.userInput();
            gameNumber = Engine.correctOrNot(userAnswer, rightAnswer, gameNumber);
        }
    }
    static String isPrime(int num) {
// Алгоритм перебора делителей
// https://ru.wikipedia.org/wiki/Перебор_делителей#/media/Файл:Trial_division.jpg
        int i = 2;
        int j = 0;
        while (i * i <= num && j != 1) {
            if (num % i == 0) {
                j = 1;
            }
            i++;
        }
        if (j != 1) {
            return "yes";
        }
        return "no";
    }
}
