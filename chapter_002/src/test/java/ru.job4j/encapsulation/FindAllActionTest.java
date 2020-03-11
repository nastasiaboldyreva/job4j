package ru.job4j.encapsulation;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.StringJoiner;
import java.util.function.Consumer;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class FindAllActionTest {

    private final ByteArrayOutputStream out = new ByteArrayOutputStream();

    private final Consumer<String> output = new Consumer<>(){

        private final PrintStream stdout = new PrintStream(out);

        @Override
        public void accept(String s) {
            stdout.println(s);
        }
    };

    @Test
    public void whenCheckOutput() {
        /**
         * заменяем вывод на наш буфер
         * */

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        PrintStream def = System.out;
        System.setOut(new PrintStream(out));

        /**
         * выполняем действие с выводом на консоль
         * */
        Tracker tracker = new Tracker();
        ItemTracker itemtracker = new ItemTracker("fix bug");
        tracker.add(itemtracker);
        FindAllAction act = new FindAllAction();
        act.execute(new StubInputStatic(new ArrayList<>()), tracker, output);

        /**
         * проверяем содержимое вывода
         * */
        String expect = new StringJoiner(System.lineSeparator(), "", System.lineSeparator())
                .add(itemtracker.getId() + " " + itemtracker.getName())
                .toString();
        //assertThat(new String(out.toByteArray()), is(expect));
        assertThat(this.output.toString(), is(expect));
        System.setOut(def);
    }
}
