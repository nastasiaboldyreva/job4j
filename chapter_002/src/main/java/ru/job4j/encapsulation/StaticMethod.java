package ru.job4j.encapsulation;

import java.util.ArrayList;
import java.util.List;

public class StaticMethod {

    public void init(Input input, Tracker tracker, List<UserAction> actions) {
        boolean run = true;
        while (run) {
            this.showMenu(actions);
            int select = Integer.parseInt(input.askStr("Select: "));
            UserAction action = actions.get(select);
            run = action.execute(input, tracker);
        }
    }

    private void showMenu(List<UserAction> actions) {
        System.out.println("Menu: ");
//        for (int index = 0; index < actions.length; index++) {
//            System.out.println(index + ". " + actions[index].name());
//        }
        //System.out.println(i + ". " + actions.add(i).name());
        int number = 0;
        for (UserAction i : actions) {
            System.out.println(number + ". " + i.name());
        }
    }

    public static void main(String[] args) {
        Input input = new ConsoleInput();
        Input validate = new ValidateInput(input);
        Tracker tracker = new Tracker();
        List<UserAction> actions = new ArrayList<>();
        actions.add(new CreateAction());
        actions.add(new DeleteAction());
        actions.add(new EditAction());
        actions.add(new FindByIdAction());
        actions.add(new FindByNameAction());
        actions.add(new ShowAction());
        actions.add(new FindAllAction());
        new StaticMethod().init(validate, tracker, actions);
    }
}

