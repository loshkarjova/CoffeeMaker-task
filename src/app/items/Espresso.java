package app.items;

import app.intefaces.Drink;

public class Espresso implements Drink {
    @Override
    public void drink() {
        System.out.println("Your Espresso. Enjoy :)");
    }
}
