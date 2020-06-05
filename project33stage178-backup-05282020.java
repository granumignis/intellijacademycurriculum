package machine;

import java.util.Scanner;

public class CoffeeMachine {

    private static String action;
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

        displayStats();

        action = requestAction();

        switch (action) {

            case "buy":
                buyItem();
                break;

            case "fill":
                fillMachine();
                break;

            case "take":
                takeFromMachine();
                break;

        }






/*        System.out.println("Write how many ml of water the coffee machine has:");
        waterInCoffeeMachine = s.nextInt();

        System.out.println("Write how many ml of milk the coffee machine has:");
        milkInCoffeeMachine = s.nextInt();

        System.out.println("Write how many grams of coffee beans the coffee machine has:");
        beansInCoffeeMachine = s.nextInt();

        System.out.println("Write how many cups of coffee you will need:");
        neededCups = s.nextInt(); */


        //s.close();

/*
        waterCups = waterInCoffeeMachine / waterPerCup;
        milkCups = milkInCoffeeMachine /milkPerCup;
        beanCups = beansInCoffeeMachine / beansPerCup;
*/



/*
        if (waterCups <= milkCups && waterCups <= beanCups) {
            makableCups = waterCups;
        } else if (milkCups <= waterCups && milkCups <= beanCups) {
            makableCups = milkCups;
        } else if (beanCups <= waterCups && beanCups <= milkCups) {
            makableCups = beanCups;
        }

*/

/*

        if (neededCups == makableCups) {
            System.out.println("Yes, I can make that amount of coffee");
        } else if (neededCups > makableCups) {
            System.out.println("No, I can make only " + makableCups + " cup(s) of coffee");
        } else if (neededCups < makableCups) {
            System.out.println("Yes, I can make that amount of coffee (and even " + (makableCups - neededCups) + " more than that)");
        }

*/



    }

    public static void displayStats() {
        System.out.println("The coffee machine has:");
        System.out.println(waterInCoffeeMachine + " of water");
        System.out.println(milkInCoffeeMachine + " of milk");
        System.out.println(beansInCoffeeMachine + " of coffee beans");
        System.out.println(cupsInCoffeeMachine + " of disposable cups");
        System.out.println(moneyInCoffeeMachine + " of money");
        System.out.println("");
    }

    public static void buyItem() {

        System.out.println("What do you want to buy? 1 - espresso, 2- latte, 3 - cappuccino:");

        Scanner s = new Scanner(System.in);
        int itemToBuy = s.nextInt();
        s.close();
        System.out.println("");

        switch (itemToBuy) {

            case 1:
                waterInCoffeeMachine -= 250;
                beansInCoffeeMachine -= 16;
                moneyInCoffeeMachine += 4;
                cupsInCoffeeMachine -= 1;
                break;

            case 2:
                waterInCoffeeMachine -= 350;
                milkInCoffeeMachine -= 75;
                beansInCoffeeMachine -= 20;
                moneyInCoffeeMachine += 7;
                cupsInCoffeeMachine -= 1;
                break;

            case 3:
                waterInCoffeeMachine -= 200;
                milkInCoffeeMachine -= 100;
                beansInCoffeeMachine -= 12;
                moneyInCoffeeMachine += 6;
                cupsInCoffeeMachine -= 1;
                break;

        }

        displayStats();

    }

    public static void fillMachine() {

        Scanner s = new Scanner(System.in);

        System.out.println("Write how many ml of water do you want to add:");
        int waterToAdd = s.nextInt();

        System.out.println("Write how many ml of milk do you want to add:");
        int milkToAdd = s.nextInt();

        System.out.println("Write how many ml of coffee beans do you want to add:");
        int beansToAdd = s.nextInt();

        System.out.println("Write how many disposable cups of coffee do you want to add:");
        int cupsToAdd = s.nextInt();

        s.close();

        // next - do logic here to add the items collected above

        displayStats();


    }

    public static void takeFromMachine() {

    }

    public static String requestAction() {

        System.out.println("Write action (buy, fill, take)");
        Scanner s = new Scanner(System.in);

        return s.next();

    }

}

