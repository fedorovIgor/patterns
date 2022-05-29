package visitor.modem;

import visitor.visitors.ModemVisitor;
import visitor.visitors.ZuxelVisitor;

public class Zuxel extends Modem{
    @Override
    public void accept(ModemVisitor modemVisitor) {
        if (modemVisitor instanceof ZuxelVisitor) {
            ((ZuxelVisitor) modemVisitor).visit(this);
        } else {
            System.out.println();
        }
    }
}
