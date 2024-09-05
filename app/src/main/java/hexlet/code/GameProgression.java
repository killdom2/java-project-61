package hexlet.code;

public class GameProgression {
    public static void progression() {

        System.out.println("What number is missing in the progression?");
        var stepOfProgression = 0;
        var firstNumber = 0;
        var lengthOfProgression = 0;
        var hiddenNumber = 0;
        var maxLength = 10;
        var difficulty = 30;
        var i = 0;
        var gameNum = 0;

        while (gameNum < 3) {
            do {
                firstNumber = Engine.randomNumber(difficulty);
                stepOfProgression = Engine.randomNumber(maxLength);
                lengthOfProgression = Engine.randomNumber(maxLength);

                if (lengthOfProgression >=5 && lengthOfProgression <=10 && stepOfProgression > 1) {
                    i = 1;
                } else if (lengthOfProgression < 5 && stepOfProgression > 1) {
                    lengthOfProgression = 10;
                    i = 1;
                }
                else {
                    i = 0;
                }
            } while (i == 0);

            hiddenNumber = Engine.randomNumber(lengthOfProgression);
            var progression = new int[lengthOfProgression];

            System.out.print("Question: ");

            var count = 0;
            while (count < lengthOfProgression) {
                progression[count] = firstNumber;
                firstNumber += stepOfProgression;
                count++;
            }

            for (int j = 0; j < lengthOfProgression; j++) {
                if (j == hiddenNumber) {
                    System.out.print(".. ");
                } else {
                    System.out.print(progression[j] + " ");
                }
            }
            System.out.print("\nYour answer: ");
            var userAnswer = Engine.userInput();

            gameNum = Engine.correctOrNot(userAnswer, Integer.toString(progression[hiddenNumber]), gameNum);
        }
        return;
    }
}
