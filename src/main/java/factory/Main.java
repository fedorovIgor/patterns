package factory;

import factory.service.PizzaFactory;

import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        PizzaFactory pizzaFactory = new PizzaFactory();

        List<String> order = List.of("PEPPERONI", "PEPPERONI", "GREEK");

        var pizzaOrder = order.stream()
                .map(pizzaFactory::createPizza)
                .collect(Collectors.toList());

        pizzaOrder.stream().forEach(System.out::println);
    }


}
