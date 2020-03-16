package ru.job4j.encapsulation;

import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.StringJoiner;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;
import java.util.List;
import java.util.function.Consumer;

public class StaticMethodTest {

    private final ByteArrayOutputStream out = new ByteArrayOutputStream();
    private final Consumer<String> output = new Consumer<>(){

        private final PrintStream stdout = new PrintStream(out);

        @Override
        public void accept(String s) {
            stdout.println(s);
        }

        @Override
        public String toString() {
            return out.toString();
        }
    };

    @Test
    public void whenAddItem() {

        List<String> answers = new ArrayList<>();
        answers.add("Fix PC");
        Input input = new StubInputStatic(answers);
        Tracker tracker = new Tracker();
        new CreateAction().execute(input, tracker, output);
        //CreateAction::execute;
        List<ItemTracker> created = tracker.findAll();
        List<ItemTracker> expected = new ArrayList<>();
        expected.add(new ItemTracker("Fix PC"));
        assertThat(created.get(0).getName(), is(expected.get(0).getName()));
    }


    @Test
    public void whenPrtMenu() {
        //private final ByteArrayOutputStream out = new ByteArrayOutputStream();
        final PrintStream def = System.out;
        System.setOut(new PrintStream(out));
        StubInputStatic input = new StubInputStatic(List.of("0"));
        StubAction action = new StubAction();
        List<UserAction> actions = List.of(action);
        //new StaticMethod().init(input, new Tracker(), actions);
        new StaticMethod(System.out::println).init(input, new Tracker(), actions);
        String expect = new StringJoiner(System.lineSeparator(), "", System.lineSeparator())
                .add("Menu: ")
                .add("0. Stub action")
                .toString();
        //assertThat(new String(out.toByteArray()), is(expect));
        assertThat(this.output.toString(), is(expect));
        System.setOut(def);
    }
}
