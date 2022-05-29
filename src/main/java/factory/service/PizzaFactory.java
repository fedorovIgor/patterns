package factory.service;

import factory.model.GreekPizza;
import factory.model.PepperoniPizza;
import factory.model.Pizza;

public class PizzaFactory {

    public Pizza createPizza(String pizzaName) {
        if (pizzaName == null || pizzaName.isEmpty())
            return null;

        return switch (pizzaName) {
            case "GREEK" -> new GreekPizza();
            case "PEPPERONI" -> new PepperoniPizza();

            default -> throw new IllegalArgumentException("Unknown channel " + pizzaName);
        };
    }

}
