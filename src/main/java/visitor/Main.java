package visitor;

import visitor.modem.Dlinke;
import visitor.modem.Zuxel;
import visitor.visitors.ConfigureForMacVisitor;
import visitor.visitors.ConfigureForUnixVisitor;

public class Main {

    public static void main(String[] args) {

        var conUnix = new ConfigureForUnixVisitor();
        var conMac = new ConfigureForMacVisitor();

        var zuxel = new Zuxel();
        var dlink = new Dlinke();

        zuxel.accept(conMac);
        dlink.accept(conMac);

        zuxel.accept(conUnix);
        dlink.accept(conUnix);
    }
}
