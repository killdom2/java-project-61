package hexlet.code.games;
import hexlet.code.Engine;
import hexlet.code.Utils;

public class Prime {

    public static final int DIFFICULTY = 100;
    public static void run() {

        var rules = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        var questions = generateRoundData();

        Engine.run(questions, rules);
    }

    public static String[][] generateRoundData() {

        var rightAnswer = "";
        var questions = new String[Engine.GAME_NUM][2];

        for (var i = 0; i < Engine.GAME_NUM; i++) {
            var number = 0;
            while (number < 2 || number % 2 == 0) {
                number = Utils.generateRandom(DIFFICULTY);
            }
            rightAnswer = isPrime(number);
            questions[i][0] = number + "";
            questions[i][1] = rightAnswer;
        }
        return questions;
    }

    // Алгоритм перебора делителей
    // https://ru.wikipedia.org/wiki/Перебор_делителей#/media/Файл:Trial_division.jpg
    static String isPrime(int num) {

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
