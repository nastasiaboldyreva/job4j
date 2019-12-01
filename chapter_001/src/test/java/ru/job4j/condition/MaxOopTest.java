package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxOopTest {

    @Test
    public void whenMax1To4Then4() {
        MaxOop max = new MaxOop();
        int result = max.max(1, 2, 3, 4);
        assertThat(result, is(4));
    }

}
