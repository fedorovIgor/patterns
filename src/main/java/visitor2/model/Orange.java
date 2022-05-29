package visitor2.model;

import visitor2.visitor.FoodVisitor;

public class Orange extends Food {

    int weight;
    int price;

    public Orange() {
    }

    public Orange(int weight) {
        this.weight = weight;
    }

    public Orange(int weight, int price) {
        this.weight = weight;
        this.price = price;
    }

    @Override
    public String accept(FoodVisitor visitor) {
        return visitor.orangeVisitor(this);
    }

    @Override
    public Double calculateTaxes() {

        var taxes = (double)(  price * weight * 0.13);

        return taxes;
    }

    @Override
    public Integer calculatePrice() {
        return price * weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
