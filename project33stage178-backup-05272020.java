package machine;

import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args)
    {

        int waterPerCup = 200;
        int milkPerCup = 50;
        int beansPerCup = 15;
        int neededCups = 0;

        int waterInCoffeeMachine = 400;
        int milkInCoffeeMachine = 540;
        int beansInCoffeeMachine = 120;
        int moneyInCoffeeMachine = 550;

        int waterCups;
        int milkCups;
        int beanCups;

        String action;
        int itemToBuy;

        int makableCups = 0;

        Scanner s = new Scanner(System.in);

        System.out.println("Write action (buy, fill, take)");
        action = s.next();

        System.out.println("What do you want to buy? 1 - espresso, 2- latte, 3 - cappuccino:");
        itemToBuy = s.nextInt();

        switch (itemToBuy) {

            case 1:
                System.out.println("Case 1 in switch entered.");
                waterInCoffeeMachine -= 250;
                beansInCoffeeMachine -= 16;
                moneyInCoffeeMachine -= 4;
                break;

            case 2:
                System.out.println("Case 2 in switch entered.");
                waterInCoffeeMachine -= 350;
                milkInCoffeeMachine -= 75;
                beansInCoffeeMachine -= 20;
                moneyInCoffeeMachine -= 7;
                break;

            case 3:
                System.out.println("Case 3 in switch entered.");
                waterInCoffeeMachine -= 200;
                milkInCoffeeMachine -= 100;
                beansInCoffeeMachine -= 12;
                moneyInCoffeeMachine -= 6;
                break;

        }

        System.out.println







/*        System.out.println("Write how many ml of water the coffee machine has:");
        waterInCoffeeMachine = s.nextInt();

        System.out.println("Write how many ml of milk the coffee machine has:");
        milkInCoffeeMachine = s.nextInt();

        System.out.println("Write how many grams of coffee beans the coffee machine has:");
        beansInCoffeeMachine = s.nextInt();

        System.out.println("Write how many cups of coffee you will need:");
        neededCups = s.nextInt(); */


        s.close();

        waterCups = waterInCoffeeMachine / waterPerCup;
        milkCups = milkInCoffeeMachine /milkPerCup;
        beanCups = beansInCoffeeMachine / beansPerCup;



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

}
