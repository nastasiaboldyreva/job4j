package ru.job4j.encapsulation;

import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.StringJoiner;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;
import java.util.List;

public class StaticMethodTest {

    @Test
    public void whenAddItem() {
        String[] answers = {"Fix PC"};
        Input input = new StubInputStatic(answers);
        Tracker tracker = new Tracker();
        new CreateAction().execute(input, tracker);

        //ItemTracker created = tracker.findAll()[0];
        //ItemTracker expected = new ItemTracker("Fix PC");
        List<ItemTracker> created = tracker.findAll();
        List<ItemTracker> expected = new ArrayList<>();

        //assertThat(created.getName(), is(expected.getName()));
        assertThat(created.get(name), is(expected.get(name));

    }

    //задание Полиморфизм 9. Написать тесты на StartUI. [#785]
//    @Test
//    public void whenExit() {
//        StubInput input = new StubInput( new String[] {"0"} );
//        StubAction action = new StubAction();
//        new StaticMethod().init(input, new Tracker(), new UserAction[] { action });
//        assertThat(action.isCall(), is(true));
//    }


    @Test
    public void whenPrtMenu() {
        //заменяем вывод на наш буфер
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        PrintStream def = System.out;
        System.setOut(new PrintStream(out));

        //выполняем действие с выводом на консоль
        StubInputStatic input = new StubInputStatic(new String[] {"0"});
        StubAction action = new StubAction();
        //new StaticMethod().init(input, new Tracker(), new UserAction[] {action});
        new StaticMethod().init(input, new Tracker(), new List<UserAction> actions);

        //проверяем содержимое вывода
        String expect = new StringJoiner(System.lineSeparator(), "", System.lineSeparator())
                .add("Menu: ")
                .add("0. Stub action")
                .toString();
        assertThat(new String(out.toByteArray()), is(expect));

        //возвращаем системный вывод
        System.setOut(def);
    }
}
