package state2;

import state2.model.Button;

public class Main {

    public static void main(String[] args) {
        var btn = new Button();

        btn.printInfo();

        btn.nexState();
        btn.printInfo();
    }

}
