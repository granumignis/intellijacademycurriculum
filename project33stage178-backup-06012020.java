package machine;

import java.util.Scanner;

public class CoffeeMachine {

    String action = "";
    int waterPerCup = 200;
    int milkPerCup = 50;
    int beansPerCup = 15;
    int neededCups = 0;

    int waterInCoffeeMachine = 400;
    int milkInCoffeeMachine = 540;
    int beansInCoffeeMachine = 120;
    int moneyInCoffeeMachine = 550;
    int cupsInCoffeeMachine = 9;

    int waterCups;
    int milkCups;
    int beanCups;

    int itemToBuy;

    int makableCups = 0;


    public void main(String[] args)
    {

        System.out.println("Started Main Function");
        Scanner s = new Scanner(System.in);
        inputLoop(s);

    }

    public void displayStats() {
        System.out.println("The coffee machine has:");
        System.out.println(waterInCoffeeMachine + " of water");
        System.out.println(milkInCoffeeMachine + " of milk");
        System.out.println(beansInCoffeeMachine + " of coffee beans");
        System.out.println(cupsInCoffeeMachine + " of disposable cups");
        System.out.println(moneyInCoffeeMachine + " of money");
        System.out.println("");
    }

    public void buyItem() {

        System.out.println("What do you want to buy? 1 - espresso, 2- latte, 3 - cappuccino:");

        Scanner s = new Scanner(System.in);
        int itemToBuy = s.nextInt();
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

    }

    public void fillMachine() {

        Scanner s = new Scanner(System.in);

        System.out.println("Write how many ml of water do you want to add:");
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

    public void takeFromMachine() {

        int tempMoney = moneyInCoffeeMachine;
        moneyInCoffeeMachine = 0;
        System.out.println("I gave you $" + tempMoney + "\n");

    }

    public String requestAction(Scanner scanner) {

        System.out.println("Write action (buy, fill, take, remaining, exit)");
        return scanner.next();

    }

    public void inputLoop(Scanner scanner) {

        while (action != "exit")
        {
            System.out.println("Action: " + action);
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
            System.out.println("Exited Switch");
        }
    }

}

