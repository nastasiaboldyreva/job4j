package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class SqMaxTest {

    @Test
    public void whenfirst4() {
        int result = SqMax.max(4,3,2,1);
        assertThat (result, is(4));
    }

    @Test
    public void whenthird8() {
        int result = SqMax.max(4, 3, 8, 1);
        assertThat (result, is(8));
    }


}
