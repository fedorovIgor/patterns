package visitor2.visitor;

import visitor2.model.Apple;
import visitor2.model.Orange;

public interface FoodVisitor {

    String orangeVisitor(Orange orange);

    String appleVisitor(Apple apple);
}
