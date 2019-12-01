package ru.job4j.encapsulation;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class DataPreparationTest {

    @Test
    public void whenReplaceItem() {
        Tracker tracker = new Tracker();
        ItemTracker itemtracker = new ItemTracker("new item");
        tracker.add(itemtracker);
        String[] answers = {itemtracker.getId(), "replaced item"};
        StaticMethod.editItem(new StubInputStatic(answers), tracker);
        ItemTracker replaced = tracker.findById(itemtracker.getId());
        assertThat(replaced.getName(),is("replaced item"));
    }

    @Test
    public void whenDeleteItem() {
        Tracker tracker = new Tracker();
        ItemTracker itemtracker = new ItemTracker("delete item");
        ItemTracker add = tracker.add(itemtracker);
        String[] answers = {add.getId()};
        StaticMethod.deleteItem(new StubInputStatic(answers), tracker);
        ItemTracker ex = tracker.findById(add.getId());
        assertNull(ex);

    }

    @Test
    public void whenFindItem() {
        Tracker tracker = new Tracker();
        ItemTracker itemtracker = new ItemTracker("find Item");
        tracker.add(itemtracker);
        String[] answers = {itemtracker.getId(), "this item found"};
        StaticMethod.findById(new StubInputStatic(answers), tracker);
        ItemTracker found = tracker.findById(itemtracker.getId());
        assertThat(found.getName(), is("this item found"));

    }



}
