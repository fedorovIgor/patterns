package visitor2;

import visitor2.model.Apple;
import visitor2.model.Food;
import visitor2.model.Orange;
import visitor2.model.Order;
import visitor2.visitor.XMLExportVisitor;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        var products = List.of(
                new Apple(10, 200),
                new Orange(2, 350));

        var order = new Order(products);

        XMLExportVisitor visitor = new XMLExportVisitor();
        var xmlOrder = visitor
                .export(order.getProducts().toArray(new Food[0]));

        System.out.println(xmlOrder);

    }
}

