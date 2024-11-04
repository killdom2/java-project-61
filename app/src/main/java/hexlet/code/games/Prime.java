package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Utils;

public class Prime {

    public static final int MIN_RANDOM_NUMBER = 2;
    public static final int MAX_RANDOM_RANGE = 98;
    public static final String RULES = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

    public static void run() {

        var questions = new String[Engine.MAX_NUMBER_OF_GAMES][2];

        for (var i = 0; i < Engine.MAX_NUMBER_OF_GAMES; i++) {
            questions[i] = generateRoundData();
        }

        Engine.run(questions, RULES);
    }

    public static String[] generateRoundData() {

        var rightAnswer = "";
        var question = new String[2];

        var number = Utils.generateRandom(MIN_RANDOM_NUMBER, MAX_RANDOM_RANGE + 1);

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
