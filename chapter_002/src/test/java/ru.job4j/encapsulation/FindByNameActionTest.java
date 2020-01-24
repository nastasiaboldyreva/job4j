package ru.job4j.encapsulation;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.List;
import java.util.StringJoiner;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class FindByNameActionTest {
    @Test
    public void whenCheckFind() {
        //заменяем вывод на наш буфер
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        PrintStream def = System.out;
        System.setOut(new PrintStream(out));

        //выполняем действие с выводом на консоль
        Tracker tracker = new Tracker();
        ItemTracker itemtracker = new ItemTracker("fix bug");
        tracker.add(itemtracker);
        FindByNameAction act = new FindByNameAction();
        //act.execute(new StubInputStatic(new String[] {"fix bug"}), tracker);
        act.execute(new StubInputStatic(List.of("fix bug")), tracker);

        //проверяем содержимое вывода
        String expect = new StringJoiner(System.lineSeparator(), "", System.lineSeparator())
                .add(itemtracker.getId() + " " + itemtracker.getName())
                .toString();
        assertThat(new String(out.toByteArray()), is(expect));
        System.setOut(def);
    }
}
