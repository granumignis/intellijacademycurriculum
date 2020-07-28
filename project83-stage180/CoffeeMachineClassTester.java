import java.util.Scanner;

public class CoffeeMachineClassTester {
    static CoffeeMachine testCoffeeMachine = new CoffeeMachine();

    public static void main(String[] args)
    {

        Scanner s = new Scanner(System.in);
        String userInput = "";

        System.out.println("Write action (buy, fill, take, remaining, exit)");

        while (!userInput.equals("exit")) {
            userInput = s.next();
            testCoffeeMachine.inputLoop(userInput);
        }

    }

}