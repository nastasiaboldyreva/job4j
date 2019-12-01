package java.encapsulation;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class StaticMethodTest {

    @Test
    public void whenAddItem() {
        String[] answers = {"Fix PC"};
        Input input = new StubInputStatic(answers);
        Tracker tracker = new Tracker();
        StaticMethod.createItem(input,tracker);
        ItemTracker created = tracker.findAll()[0];
        ItemTracker expected = new ItemTracker("Fix PC");
        assertThat(created.getName(), is(expected.getName()));
     }
}
