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
    public void whenFindByName() {
        Tracker tracker = new Tracker();
        ItemTracker itemtracker = new ItemTracker("find by name");
        tracker.add(itemtracker);
        String[] answers = {itemtracker.getName(), "this item found"};
        StaticMethod.findByName(new StubInputStatic(answers), tracker);
        ItemTracker[] found = new ItemTracker[];
        // ItemTracker[] found = tracker.findByName(itemtracker.getName());
        assertThat(found.getName(), is("this item found"));

    }



}
