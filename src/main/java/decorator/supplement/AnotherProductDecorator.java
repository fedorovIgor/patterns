package decorator.supplement;

import decorator.product.Product;

public class AnotherProductDecorator extends ProductDecorator {

    public AnotherProductDecorator(Product product) {
        super(product);
    }

    public String decorate() {
        return super.decorate() + " AnotherProductDecorator";
    }
}
