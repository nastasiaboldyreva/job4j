package ru.job4j.encapsulation;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.StringJoiner;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class FindAllActionTest {

    @Test
    public void whenCheckOutput() {
        //заменяем вывод на наш буфер
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        PrintStream def = System.out;
        System.setOut(new PrintStream(out));

        //выполняем действие с выводом на консоль
        Tracker tracker = new Tracker();
        ItemTracker itemtracker = new ItemTracker("fix bug");
        tracker.add(itemtracker);
        FindAllAction act = new FindAllAction();
        act.execute(new StubInputStatic(new String[] {}), tracker);

        //проверяем содержимое вывода
        String expect = new StringJoiner(System.lineSeparator(), "", System.lineSeparator())
                .add(itemtracker.getId() + " " + itemtracker.getName())
                .toString();
        assertThat(new String(out.toByteArray()), is(expect));
        System.setOut(def);
    }
}
