package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Utils;

public class Prime {

    public static final int MAX_RANDOM_NUMBER = 100;
    public static void run() {

        var rules = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        var questions = Utils.getQestions();

        for (var i = 0; i < Engine.MAX_NUMBER_OF_GAMES; i++) {
            questions[i] = generateRoundData();
        }

        Engine.run(questions, rules);
    }

    public static String[] generateRoundData() {

        var rightAnswer = "";
        var question = new String[2];

        var number = 0;
        while (number < 2 || number % 2 == 0) {
            number = Utils.generateRandom(MAX_RANDOM_NUMBER);
        }
        rightAnswer = isPrime(number) ? "yes" : "no";
        question[0] = number + "";
        question[1] = rightAnswer;

        return question;
    }

    // Алгоритм перебора делителей
    // https://ru.wikipedia.org/wiki/Перебор_делителей#/media/Файл:Trial_division.jpg
    static boolean isPrime(int num) {

        int i = 2;
        int j = 0;
        while (i * i <= num && j != 1) {
            if (num % i == 0) {
                j = 1;
            }
            i++;
        }
        return j != 1;
    }
}
