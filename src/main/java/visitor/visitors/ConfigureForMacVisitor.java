package visitor.visitors;

import visitor.modem.Dlinke;
import visitor.modem.Zuxel;

public class ConfigureForMacVisitor implements DlinkeVisitor {
    @Override
    public void visit(Dlinke dlinke) {
        System.out.println(dlinke + " in Mac");
    }

}
