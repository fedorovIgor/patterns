package state2.state;

import state2.model.Button;

public interface State {

    void next(Button button);
    void prev(Button button);
    void print(Button button);
}
