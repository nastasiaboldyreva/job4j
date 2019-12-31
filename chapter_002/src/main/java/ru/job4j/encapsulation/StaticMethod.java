package ru.job4j.encapsulation;

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

    private void showMenu(UserAction[] actions) {
        System.out.println("Menu: ");
        for (int index = 0; index < actions.length; index++) {
            System.out.println(index + ". " + actions[index].name());
        }
    }

    public static void main(String[] args) {
        Input input = new ConsoleInput();
        Input validate = new ValidateInput(input);
        Tracker tracker = new Tracker();
        UserAction[] actions = {new CreateAction(),
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

