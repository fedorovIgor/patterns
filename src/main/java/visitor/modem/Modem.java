package visitor.modem;

import visitor.visitors.ModemVisitor;

public abstract class Modem {

    public abstract void accept(ModemVisitor modemVisitor);
}
