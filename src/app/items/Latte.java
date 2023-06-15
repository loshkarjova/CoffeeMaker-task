package app.items;

import app.intefaces.Drink;

public class Latte implements Drink {
    @Override
    public void drink() {
        System.out.println("Your Latte. Enjoy :)");
    }
}
