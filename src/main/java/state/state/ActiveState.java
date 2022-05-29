package state.state;

import state.model.Printer;

public class ActiveState implements State{

    private final Printer printer;

    public ActiveState(Printer printer) {
        this.printer = printer;
    }

    @Override
    public void print(String str) {
        System.out.println(str);
    }

    @Override
    public void observe() {
        System.out.println("printer " + printer + " work correctly");
    }
}
