package ru.job4j.encapsulation;

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
        for (int i : actions) {
            System.out.println(i + ". " + actions.add(i).name());
        }
    }

    public static void main(String[] args) {
        Input input = new ConsoleInput();
        Input validate = new ValidateInput(input);
        Tracker tracker = new Tracker();
        List<UserAction> actions = {new CreateAction(),
                new DeleteAction(),
                new EditAction(),
                new FindByIdAction(),
                new FindByNameAction(),
                new ShowAction(),
                new FindAllAction()
        };
        new StaticMethod().init(validate, tracker, actions);
    }
}

