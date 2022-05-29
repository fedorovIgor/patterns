package state.state;

import state.model.Printer;

public class BlockedState implements State{

    private final Printer printer;


    public BlockedState(Printer printer) {
        this.printer = printer;
    }


    @Override
    public void print(String str) {
        System.out.println( "printer " + printer + " is blocked "
                + "cant print this message: " + str);
    }

    @Override
    public void observe() {
        System.out.println("something wrong");
    }
}
