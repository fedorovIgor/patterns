package decorator;

import decorator.product.StockProduct;
import decorator.supplement.AnotherProductDecorator;
import decorator.supplement.OneProductDecorator;

public class Main {
    public static void main(String[] args) {
        var stock = new StockProduct();
        var oneProduct = new OneProductDecorator(stock);

        System.out.println(oneProduct.decorate());

        var anotherProduct = new AnotherProductDecorator(oneProduct);
        System.out.println(anotherProduct.decorate());
    }
}
