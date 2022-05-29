package decorator.supplement;

import decorator.product.Product;
import decorator.product.StockProduct;

public abstract class ProductDecorator implements Product {
    private Product product;

    public ProductDecorator(Product product) {
        this.product = product;
    }

    @Override
    public String decorate() {
        return product.decorate();
    }
}
