package state.model;

import state.state.ActiveState;
import state.state.BlockedState;
import state.state.State;

public class Printer {

    private State state;

    public Printer() {
        this.state = new ActiveState(this);
    }

    public void nextState() {
        if (state.getClass().equals(ActiveState.class)) {
            changeStateTo(new BlockedState(this));
        } else {
            changeStateTo(new ActiveState(this));
        }
    }

    private void changeStateTo(State newState) {
        this.state = newState;
    }

    @Override
    public String toString() {
        return "The printer";
    }

    public void observe() {
        this.state.observe();
    }

    public void print(String str) {
        state.print(str);
    }
}
