package visitor2.model;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private final List<Food> products;

    public Order() {
        products = new ArrayList<>();
    }

    public Order(List<Food> products) {
        this.products = products;
    }

    public List<Food> getProducts() {
        return products;
    }

    public void addFood(Food food) {
        products.add(food);
    }

    public void removeFood(Food food) {
        products.remove(food);
    }
}
