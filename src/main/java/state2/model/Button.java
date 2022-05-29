package state2.model;

import state2.state.OffState;
import state2.state.State;

public class Button {

    private String color;
    private String text;

    private State state;

    public Button() {
        state = new OffState(this);
    }

    public void nexState() {
        state.next(this);
    }

    public void previousState() {
        state.prev(this);
    }

    public void printInfo() {
        state.print(this);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Button{" +
                "color='" + color + '\'' +
                ", text='" + text + '\'' +
                ", state=" + state +
                '}';
    }
}

