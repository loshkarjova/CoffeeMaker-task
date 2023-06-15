package app.model;

import app.intefaces.Drink;

public class Coffee {

    private Drink drink;

    public void setDrink(Drink drink) {
        this.drink = drink;
    }

    public void drinkCoffee() {
        drink.drink();
    }
}
