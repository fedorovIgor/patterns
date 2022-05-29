package decorator.supplement;

import decorator.product.Product;
import decorator.product.StockProduct;

public class OneProductDecorator  extends ProductDecorator {

    public OneProductDecorator(Product product) {
        super(product);
    }

    public String decorate() {
        return super.decorate() + " OneProductDecorator";
    }
}
