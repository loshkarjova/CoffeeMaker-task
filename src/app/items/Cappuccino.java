package app.items;

import app.intefaces.Drink;

public class Cappuccino implements Drink {
    @Override
    public void drink() {
        System.out.println("Your Cappuccino. Enjoy :)");
    }
}
