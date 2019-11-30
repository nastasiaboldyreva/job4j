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
        String[] answers = { itemtracker.getId(), "replaced item"};
        StaticMethod.editItem(new StubInputStatic(answers), tracker);
        ItemTracker replaced = tracker.findById(itemtracker.getId());
        assertThat(replaced.getName(),is("replaced item"));
    }

    @Test
    public void whenDeleteItem() {
        Tracker tracker = new Tracker();
        //ItemTracker itemtracker = new ItemTracker("delete item");
        tracker.delete(itemtracker);
        String[] answers = {itemtracker.getId(), "null"};
        StaticMethod.deleteItem(new StubInputStatic(answers), tracker);
        ItemTracker deleted = tracker.delete(itemtracker.getId());
        assertThat(deleted.getName(), is("null"));

    }



}
