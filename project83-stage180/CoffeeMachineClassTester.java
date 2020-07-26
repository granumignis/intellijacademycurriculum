import java.util.Scanner;

public class CoffeeMachineClassTester {
    static CoffeeMachine testCoffeeMachine = new CoffeeMachine();

    public static void main(String[] args)
    {

        Scanner s = new Scanner(System.in);
        testCoffeeMachine.inputLoop(s.next());

    }

}