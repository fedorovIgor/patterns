package visitor2.visitor;

import visitor2.model.Apple;
import visitor2.model.Food;
import visitor2.model.Orange;

public class XMLExportVisitor implements FoodVisitor{

    public String export(Food... args) {
        StringBuilder sb = new StringBuilder();
        sb.append("<?xml version=\"1.0\" encoding=\"utf-8\"?>" + "\n");
        for (Food food : args) {
            sb.append(food.accept(this)).append("\n");
        }
        return sb.toString();
    }

    @Override
    public String orangeVisitor(Orange orange) {
        var s = """ 
            <orange> 
                <weight> %s </weight>
                <price> %s </price>
            </orange> 
        """.formatted(
                orange.getWeight(),
                orange.getPrice());

        return s;
    }

    @Override
    public String appleVisitor(Apple apple) {
        var s = """ 
            <apple> 
                <weight> %s </weight>
                <price> %s </price>
            </apple>
        """.formatted(
                apple.getWeight(),
                apple.getPrice());

        return s;
    }
}
