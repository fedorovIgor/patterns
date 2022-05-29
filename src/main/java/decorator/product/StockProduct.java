package decorator.product;

public class StockProduct implements Product{

    @Override
    public String decorate() {
        return "default product";
    }
}
