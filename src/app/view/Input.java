package app.view;

import app.items.Cappuccino;
import app.items.Espresso;
import app.items.Latte;
import app.model.Coffee;

import java.util.Scanner;

public class Input {
    private Scanner scanner;
    private final Coffee coffee = new Coffee();

    public void chooseCoffee() throws RuntimeException {
        scanner = new Scanner(System.in);
        showMenu();
        try {
            int option = scanner.nextInt();
            switch (option) {
                case 1 -> coffee.setDrink(new Espresso());
                case 2 -> coffee.setDrink(new Cappuccino());
                case 3 -> coffee.setDrink(new Latte());
            }
            coffee.drinkCoffee();
        } catch (RuntimeException e) {
            getOutput();
        }
    }

    private void showMenu() {
        System.out.println("Choose a drink:\n" +
                           "     1 - Espresso\n" +
                           "     2 - Cappuccino\n" +
                           "     3 - Latte");
    }

    private void getOutput() {
        System.out.println("Incorrect value!");
        scanner.close();
    }
}

