package visitor2.model;

import visitor2.visitor.FoodVisitor;

public abstract class Food {

    public abstract String accept(FoodVisitor visitor);
    public abstract Double calculateTaxes();
    public abstract Integer calculatePrice();

}
