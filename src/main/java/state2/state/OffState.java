package state2.state;

import state2.model.Button;

public class OffState implements State{

    public OffState(Button btn) {
        btn.setText("OFF");
        btn.setColor("GRAY");
    }

    @Override
    public void next(Button button) {
        button.setState(new OnState(button));
    }

    @Override
    public void prev(Button button) {
        button.setState(new OnState(button));
    }

    @Override
    public void print(Button button) {
        System.out.println(button);
    }
}
