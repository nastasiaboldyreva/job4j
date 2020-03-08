package ru.job4j.lambda;

import org.junit.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class FunctionsTest {

    @Test
    public void whenLinearFunctionThenLinearResults() {
        Functions function = new Functions();
        List<Double> result = function.diapason(5, 8, x -> 2 * x + 1);
        List<Double> expected = Arrays.asList(11D, 13D, 15D);
        assertThat(result, is(expected));
    }

    @Test
    public void whenQuadraticFunction() {
        Functions function = new Functions();
        List<Double> result = function.diapason(5, 8, x -> 3 * x * x + 2 * x + 1);
        List<Double> expected = Arrays.asList(86D, 121D, 162D);
        assertThat(result, is(expected));
    }

    @Test
    public void whenLogarithmicFunction() {
        Functions function = new Functions();
        List<Double> result = function.diapason(5, 8, x -> Math.log(x));
        List<Double> expected = Arrays.asList(1.609D, 1.792D, 1.946D);
        assertThat(result, is(expected));
    }
}
