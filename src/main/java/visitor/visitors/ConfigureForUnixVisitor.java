package visitor.visitors;

import visitor.modem.Dlinke;
import visitor.modem.Zuxel;

public class ConfigureForUnixVisitor implements AllModemVisitor{
    @Override
    public void visit(Dlinke dlinke) {
        System.out.println(dlinke + " good with Unix");
    }

    @Override
    public void visit(Zuxel zuxel) {
        System.out.println(zuxel + " good Unix");
    }
}
