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
    static FillMachineState thisFillMachineState = FillMachineState.NOTFILLINGMACHINE;

    public static void inputLoop(String outsideInput) {

        if (thisMachineState == CoffeeMachineState.FILLMACHINE)
        {
            switch(thisFillMachineState)
            {
                case NOTFILLINGMACHINE:
                    break;

                case FILLWATER:
                    fillWater(Integer.parseInt(outsideInput));
                    break;

                case FILLMILK:
                    fillMilk(Integer.parseInt(outsideInput));
                    break;

                case FILLBEANS:
                    fillBeans(Integer.parseInt(outsideInput));
                    break;
                
                case FILLCUPS:
                    fillCups(Integer.parseInt(outsideInput));;
                    break;

            }
        }

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
            case "fill":
                thisMachineState = CoffeeMachineState.FILLMACHINE;
                break;


            case "1":
                if (thisMachineState == CoffeeMachineState.BUYITEM) {
                    thisBuyItemState = BuyItemState.BUYESPRESSO;
                    break;
                }
                break;

            case "2":
                if (thisMachineState == CoffeeMachineState.BUYITEM) {
                    thisBuyItemState = BuyItemState.BUYLATTE;
                    break;
                }
                break;

            case "3":
                if (thisMachineState == CoffeeMachineState.BUYITEM) {
                    thisBuyItemState = BuyItemState.BUYCAPPUCINO;
                    break;
                }
                break;

            case "back":
                if (thisMachineState == CoffeeMachineState.BUYITEM) {
                    showActionRequestMessage();
                    thisMachineState = CoffeeMachineState.REQUESTACTION;
                    break;
                }
                break;   




        }

        switch (thisMachineState)
        {
            case BUYITEM:
                if (thisBuyItemState == BuyItemState.NOTBUYINGITEM) {
                    System.out.println("");
                    System.out.println("What do you want to buy? 1 - espresso, 2- latte, 3 - cappuccino, back - to main menu:");
                    break;
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

            case FILLMACHINE:

                switch (thisFillMachineState)
                {
                    case NOTFILLINGMACHINE:
                        thisFillMachineState = FillMachineState.FILLWATER;
                        System.out.println("\nWrite how many ml of water do you want to add:");
                        break;
                    case FILLWATER:
                        thisFillMachineState = FillMachineState.FILLMILK; 
                        System.out.println("\nWrite how many ml of milk do you want to add: (line 137)");
                        break;
                    case FILLMILK:
                        thisFillMachineState = FillMachineState.FILLBEANS;
                        System.out.println("Write how many ml of coffee beans do you want to add:");
                        break;
                    case FILLBEANS:
                        thisFillMachineState = FillMachineState.FILLCUPS;
                        System.out.println("Write how many disposable cups of coffee do you want to add:");
                        break;
                    case FILLCUPS:
                        thisFillMachineState = FillMachineState.NOTFILLINGMACHINE;
                        System.out.println("");
                        thisMachineState = CoffeeMachineState.REQUESTACTION;
                        showActionRequestMessage();
                        break;
                }

                break;
        }

        switch (thisBuyItemState)
        {
            case NOTBUYINGITEM:
                break;
            case BUYESPRESSO:
                buyItem("1");
                thisBuyItemState = BuyItemState.NOTBUYINGITEM;
                thisMachineState = CoffeeMachineState.REQUESTACTION;
                showActionRequestMessage();
                break;
            case BUYLATTE:
                buyItem("2");
                thisBuyItemState = BuyItemState.NOTBUYINGITEM;
                thisMachineState = CoffeeMachineState.REQUESTACTION;
                showActionRequestMessage();
                break;
            case BUYCAPPUCINO:
                buyItem("3");
                thisBuyItemState = BuyItemState.NOTBUYINGITEM;
                thisMachineState = CoffeeMachineState.REQUESTACTION;
                showActionRequestMessage();
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

                    System.out.println("I have enough resources, making you a latte!\n");


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

                    System.out.println("I have enough resources, making you a cappucino!\n");

                    waterInCoffeeMachine -= 200;
                    milkInCoffeeMachine -= 100;
                    beansInCoffeeMachine -= 12;
                    moneyInCoffeeMachine += 6;
                    cupsInCoffeeMachine -= 1;
                    break;

            }
        }
    }

    public static void fillWater(int fillAmount) {
        waterInCoffeeMachine += fillAmount;
    }

    public static void fillMilk(int fillAmount) {
        milkInCoffeeMachine += fillAmount;
    }

    public static void fillBeans(int fillAmount) {
        beansInCoffeeMachine += fillAmount;
    }

    public static void fillCups(int fillAmount) {
        cupsInCoffeeMachine += fillAmount;
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

    public static enum FillMachineState {
        NOTFILLINGMACHINE(),
        FILLWATER(),
        FILLMILK(),
        FILLBEANS(),
        FILLCUPS()
    }

}
