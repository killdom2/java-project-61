package hexlet.code;

public class GameCalc {
    static void calc() {

        task();

        var rezult = "";
        var i = 0;

        while (i < 3) {
            var firstNum = Engine.randomNumber();
            var secondNum = Engine.randomNumber();
            var operator = Engine.randomNumber() % 3;
            System.out.print("Question: ");

            switch (operator) {
                case 0:
                    rezult = addition(firstNum, secondNum);
                    break;
                case 1:
                    rezult = subtraction(firstNum, secondNum);
                    break;
                case 2:
                    rezult = multiplication(firstNum, secondNum);
                    break;
            }

            rezult += "";
            System.out.print("Your answer: ");
            var userAnswer = Engine.userInput();

            i = Engine.conditionIf(userAnswer, rezult, i);
        }
        return;
    }

    static void task() {
        System.out.println("What is the result of the expression?");
        return;
    }

    static String addition(int a, int b) {
        System.out.println(a + " + " +  b);
        var rezult = a + b;
        var str = rezult + "";
        return str;
    }

    static String subtraction(int a, int b) {
        System.out.println(a + " - " +  b);
        var rezult = a - b;
        var str = rezult + "";
        return str;
    }

    static String multiplication(int a, int b) {
        b = (int) (b / 10);
        System.out.println(a + " * " +  b);
        var rezult = a * b;
        var str = rezult + "";
        return str;
    }
}
