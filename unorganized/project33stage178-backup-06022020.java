package machine;

import java.util.Scanner;

public class CoffeeMachine {

    static String action = "";
    int waterPerCup = 200;
    int milkPerCup = 50;
    int beansPerCup = 15;
    int neededCups = 0;

    static int waterInCoffeeMachine = 400;
    static int milkInCoffeeMachine = 540;
    static int beansInCoffeeMachine = 120;
    static int moneyInCoffeeMachine = 550;
    static int cupsInCoffeeMachine = 9;

    int waterCups;
    int milkCups;
    int beanCups;

    int itemToBuy;

    int makableCups = 0;


    public static void main(String[] args)
    {

        Scanner s = new Scanner(System.in);
        inputLoop(s);

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

    public static void buyItem() {

        System.out.println("");
        System.out.println("What do you want to buy? 1 - espresso, 2- latte, 3 - cappuccino:");

        Scanner s = new Scanner(System.in);
        int itemToBuy = s.nextInt();

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

    public static void fillMachine() {

        Scanner s = new Scanner(System.in);

        System.out.println("\nWrite how many ml of water do you want to add:");
        int waterToAdd = s.nextInt();

        System.out.println("Write how many ml of milk do you want to add:");
        int milkToAdd = s.nextInt();

        System.out.println("Write how many ml of coffee beans do you want to add:");
        int beansToAdd = s.nextInt();

        System.out.println("Write how many disposable cups of coffee do you want to add:");
        int cupsToAdd = s.nextInt();

        waterInCoffeeMachine += waterToAdd;
        milkInCoffeeMachine += milkToAdd;
        beansInCoffeeMachine += beansToAdd;
        cupsInCoffeeMachine += cupsToAdd;

        System.out.println("");

    }

    public static void takeFromMachine() {

        int tempMoney = moneyInCoffeeMachine;
        moneyInCoffeeMachine = 0;
        System.out.println("I gave you $" + tempMoney + "\n");

    }

    public static String requestAction(Scanner scanner) {

        System.out.println("Write action (buy, fill, take, remaining, exit)");
        return scanner.next();

    }

    public static void inputLoop(Scanner scanner) {

        while (action != "exit")
        {
            action = requestAction(scanner);
            switch (action)
            {

                case "buy":
                    buyItem();
                    break;

                case "fill":
                    fillMachine();
                    break;

                case "remaining":
                    displayStats();
                    break;

                case "take":
                    takeFromMachine();
                    break;
            }
        }

    }

}

