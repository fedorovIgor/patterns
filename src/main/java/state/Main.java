package state;

import state.model.Printer;

public class Main {
    public static void main(String[] args) {
        var printer = new Printer();

        printer.print("my first string!");
        printer.nextState();
        printer.print("the second string :] ");

    }
}
