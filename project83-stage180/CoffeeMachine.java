import java.util.Scanner;

public class CoffeeMachine {

    static String action = "";

    static int waterInCoffeeMachine = 400;
    static int milkInCoffeeMachine = 540;
    static int beansInCoffeeMachine = 120;
    static int moneyInCoffeeMachine = 550;
    static int cupsInCoffeeMachine = 9;

    static CoffeeMachineState thisMachineState = CoffeeMachineState.REQUESTACTION;
    static BuyItemState thisBuyItemState = BuyItemState.NOTBUYINGITEM;

    public static void inputLoop(String outsideInput) {

        switch (outsideInput)
        {
            case "buy":
                thisMachineState = CoffeeMachineState.BUYITEM;
                break;
            case "remaining":
                thisMachineState = CoffeeMachineState.DISPLAYSTATS;
                break;
            case "take":
                thisMachineState = CoffeeMachineState.TAKEFROMMACHINE;
                break;
            case "1":
                if (thisMachineState == CoffeeMachineState.BUYITEM) {
                    System.out.println("Switching thisBuyItem state to BuyItemState.BUYESPRESSO");
                    thisBuyItemState = BuyItemState.BUYESPRESSO;
                }

        }

        switch (thisMachineState)
        {
            case BUYITEM:
                if (thisBuyItemState == BuyItemState.NOTBUYINGITEM) {
                    System.out.println("");
                    System.out.println("What do you want to buy? 1 - espresso, 2- latte, 3 - cappuccino, back - to main menu:");
                }
                break;

            case DISPLAYSTATS:
                displayStats();
                showActionRequestMessage();
                thisMachineState = CoffeeMachineState.REQUESTACTION;
                break;

            case TAKEFROMMACHINE:
                takeFromMachine();
                showActionRequestMessage();
                thisMachineState = CoffeeMachineState.REQUESTACTION;
                break;
        }

        switch (thisBuyItemState)
        {
            case NOTBUYINGITEM:
                break;
            case BUYESPRESSO:
                System.out.println("Entered BUYESPRESSO STATE");
                buyItem("1");
                thisBuyItemState = BuyItemState.NOTBUYINGITEM;
                break;
        }




    }

    public static void displayStats() {
        System.out.println("");
        System.out.println("The coffee machine has:");
        System.out.println(waterInCoffeeMachine + " of water");
        System.out.println(milkInCoffeeMachine + " of milk");
        System.out.println(beansInCoffeeMachine + " of coffee beans");
        System.out.println(cupsInCoffeeMachine + " of disposable cups");
        System.out.println(moneyInCoffeeMachine + " of money");
        System.out.println("");
    }

    public static void buyItem(String s) {

        String menuChoice = s;

        if (menuChoice.equals("1") || menuChoice.equals("2") || menuChoice.equals("3"))
        {
            int itemToBuy = Integer.parseInt(menuChoice);

            switch (itemToBuy) {

                case 1:

                    if (waterInCoffeeMachine < 250) {
                        System.out.println("Sorry, not enough water!\n");
                        break;
                    }

                    if (beansInCoffeeMachine < 16) {
                        System.out.println("Sorry, not enough beans!\n");
                        break;
                    }

                    if (cupsInCoffeeMachine < 1) {
                        System.out.println("Sorry, not enough cups!\n");
                        break;
                    }

                    System.out.println("I have enough resources, making you an espresso!\n");

                    waterInCoffeeMachine -= 250;
                    beansInCoffeeMachine -= 16;
                    moneyInCoffeeMachine += 4;
                    cupsInCoffeeMachine -= 1;
                    break;

                case 2:

                    if (waterInCoffeeMachine < 250) {
                        System.out.println("Sorry, not enough water!\n");
                        break;
                    }

                    if (milkInCoffeeMachine < 75) {
                        System.out.println("Sorry, not enough milk!\n");
                        break;
                    }

                    if (beansInCoffeeMachine < 20) {
                        System.out.println("Sorry, not enough beans!\n");
                        break;
                    }

                    if (cupsInCoffeeMachine < 1) {
                        System.out.println("Sorry, not enough cups!\n");
                        break;
                    }

                    System.out.println("I have enough resources, making you a coffee!\n");


                    waterInCoffeeMachine -= 350;
                    milkInCoffeeMachine -= 75;
                    beansInCoffeeMachine -= 20;
                    moneyInCoffeeMachine += 7;
                    cupsInCoffeeMachine -= 1;
                    break;

                case 3:

                    if (waterInCoffeeMachine < 200) {
                        System.out.println("Sorry, not enough water!\n");
                        break;
                    }

                    if (milkInCoffeeMachine < 100) {
                        System.out.println("Sorry, not enough milk!\n");
                        break;
                    }

                    if (beansInCoffeeMachine < 12) {
                        System.out.println("Sorry, not enough beans!\n");
                        break;
                    }

                    if (cupsInCoffeeMachine < 1) {
                        System.out.println("Sorry, not enough cups!\n");
                        break;
                    }


                    waterInCoffeeMachine -= 200;
                    milkInCoffeeMachine -= 100;
                    beansInCoffeeMachine -= 12;
                    moneyInCoffeeMachine += 6;
                    cupsInCoffeeMachine -= 1;
                    break;

            }
        }
    }

    public static void takeFromMachine() {

        int tempMoney = moneyInCoffeeMachine;
        moneyInCoffeeMachine = 0;
        System.out.println("I gave you $" + tempMoney + "\n");

    }

    public static void showActionRequestMessage() {
        System.out.println("Write action (buy, fill, take, remaining, exit)");
    }

    public static enum CoffeeMachineState {
        BUYITEM(),
        FILLMACHINE(),
        DISPLAYSTATS(),
        TAKEFROMMACHINE(),
        REQUESTACTION();
    }

    public static enum BuyItemState {
        NOTBUYINGITEM(),
        BUYESPRESSO(),
        BUYLATTE(),
        BUYCAPPUCINO(),
        BACKTOMAINMENU(),
    }

}
