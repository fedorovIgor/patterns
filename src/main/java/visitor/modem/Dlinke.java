package visitor.modem;

import visitor.visitors.DlinkeVisitor;
import visitor.visitors.ModemVisitor;

public class Dlinke extends Modem {

    @Override
    public void accept(ModemVisitor modemVisitor) {
        if (modemVisitor instanceof DlinkeVisitor) {
            ((DlinkeVisitor) modemVisitor).visit(this);
        } else {
            System.out.println();
        }
    }
}
