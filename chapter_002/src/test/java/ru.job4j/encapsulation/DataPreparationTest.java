package ru.job4j.encapsulation;

import org.junit.Test;

import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class DataPreparationTest {

    @Test
    public void whenReplaceItem() {
        Tracker tracker = new Tracker();
        ItemTracker itemtracker = new ItemTracker("new item");
        tracker.add(itemtracker);
        String[] answers = {itemtracker.getId(), "replaced item"};
        //замена статического метода на использование класса
        new EditAction().execute(new StubInputStatic(answers), tracker);
        ItemTracker replaced = tracker.findById(itemtracker.getId());
        assertThat(replaced.getName(), is("replaced item"));
    }

    @Test
    public void whenDeleteItem() {
        Tracker tracker = new Tracker();
        ItemTracker itemtracker = new ItemTracker("delete item");
        ItemTracker add = tracker.add(itemtracker);
        String[] answers = {add.getId()};
        new DeleteAction().execute(new StubInputStatic(answers), tracker);
        ItemTracker ex = tracker.findById(add.getId());
        assertNull(ex);

    }

    @Test
    public void whenFindByName() {
        Tracker tracker = new Tracker();
        ItemTracker itemtracker = new ItemTracker("find by name");
        tracker.add(itemtracker);

        String[] answers = {itemtracker.getName()};
        new FindByNameAction().execute(new StubInputStatic(answers), tracker);

        //ItemTracker[] found = tracker.findByName(itemtracker.getName());
        List<ItemTracker> found = tracker.findByName(itemtracker.getName());
        assertThat(found[0].getName(), is("find by name"));
    }

}
