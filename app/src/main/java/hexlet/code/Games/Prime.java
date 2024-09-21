package hexlet.code.Games;
import hexlet.code.Engine;

public class Prime {
    public static void prime() {

        var rules = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        var rightAnswer = "";
        final var difficulty = 100;
        var questions = new String[Engine.GAME_NUM][2];

        for (var i = 0; i < Engine.GAME_NUM; i++) {
            var number = 0;
            while (number < 2 || number % 2 == 0) {
                number = Engine.randomNumber(difficulty);
            }
            rightAnswer = isPrime(number);
            questions[i][0] = number + "";
            questions[i][1] = rightAnswer;
        }
        Engine.run(questions, rules);
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
