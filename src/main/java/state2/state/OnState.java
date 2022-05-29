package state2.state;

import state2.model.Button;

public class OnState implements State {

    public OnState(Button btn) {
        btn.setColor("GREEN");
        btn.setText("ON");
    }

    @Override
    public void next(Button button) {
        button.setState(new OffState(button));
    }

    @Override
    public void prev(Button button) {
        button.setState(new OffState(button));
    }

    @Override
    public void print(Button button) {
        System.out.println(button);
    }
}
