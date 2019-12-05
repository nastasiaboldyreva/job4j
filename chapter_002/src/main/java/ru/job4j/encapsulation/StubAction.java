package ru.job4j.encapsulation;

public class StubAction implements UserAction {

    //создаем поле call
    private boolean call = false;

    @Override
    public String name() {
        return "Stub action";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        call = true;
        return false;
    }

    public boolean isCall() {
        return call;
    }

}
