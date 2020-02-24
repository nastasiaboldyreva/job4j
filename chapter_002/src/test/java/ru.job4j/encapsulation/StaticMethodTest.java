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

        List<String> answers = new ArrayList<>();
        answers.add("Fix PC");
        Input input = new StubInputStatic(answers);
        Tracker tracker = new Tracker();
        new CreateAction().execute(input, tracker);
        List<ItemTracker> created = tracker.findAll();
        List<ItemTracker> expected = new ArrayList<>();
        expected.add(new ItemTracker("Fix PC"));
        assertThat(created.get(0).getName(), is(expected.get(0).getName()));

    }


    @Test
    public void whenPrtMenu() {

        private final ByteArrayOutputStream out = new ByteArrayOutputStream();
        private final PrintStream def = System.out;
        System.setOut(new PrintStream(out));
        StubInputStatic input = new StubInputStatic(List.of("0"));
        StubAction action = new StubAction();
        List<UserAction> actions = List.of(action);
        new StaticMethod().init(input, new Tracker(), actions);
        String expect = new StringJoiner(System.lineSeparator(), "", System.lineSeparator())
                .add("Menu: ")
                .add("0. Stub action")
                .toString();
        assertThat(new String(out.toByteArray()), is(expect));
        System.setOut(def);
    }
}
