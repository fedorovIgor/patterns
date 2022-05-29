package visitor.visitors;

import visitor.modem.Dlinke;

public interface DlinkeVisitor extends ModemVisitor{

    void visit(Dlinke dlinke);
}
