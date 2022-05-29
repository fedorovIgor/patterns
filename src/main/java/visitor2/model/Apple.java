package visitor2.model;

import visitor2.visitor.FoodVisitor;

public class Apple extends Food{

    int weight;
    int price;

    public Apple() {
    }

    public Apple(int weight) {
        this.weight = weight;
    }

    public Apple(int weight, int price) {
        this.weight = weight;
        this.price = price;
    }

    @Override
    public String accept(FoodVisitor visitor) {
        return visitor.appleVisitor(this);
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
