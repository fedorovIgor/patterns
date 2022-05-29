package visitor.visitors;

import visitor.modem.Dlinke;
import visitor.modem.Zuxel;

public interface ZuxelVisitor extends ModemVisitor{
    void visit(Zuxel zuxel);
}
