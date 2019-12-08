package ru.job4j.strategy;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import java.util.StringJoiner;

public class SquareTest {

    private static final String NL = System.lineSeparator();

    @Test
    public void whenDrawSquare() {
        Square square = new Square();
        assertThat(square.draw(), is(
                new StringJoiner(NL, "", NL)
                        .add("++++")
                        .add("++++")
                        .add("++++")
                        .add("++++")
                        .toString()
                )
        );
    }
}
