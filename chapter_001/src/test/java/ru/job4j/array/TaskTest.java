package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class TaskTest {

    @Test
    public void intersectionOne() {
        Task task = new Task();
        int[] input = new int[]{4, 1, 6, 2};
        int[] result = task.intersection(input);
        int[] expect = new int[]{2, 3};
        assertThat(result, is(expect));
    }
}
