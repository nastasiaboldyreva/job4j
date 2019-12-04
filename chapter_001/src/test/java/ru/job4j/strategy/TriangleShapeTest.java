package ru.job4j.strategy;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TriangleShapeTest {

    @Test
    public void whenDrawTriangle() {
        TriangleShape triangleShape = new TriangleShape();
        assertThat(triangleShape.draw(), is(
                new StringBuilder()
                        .append("+")
                        .append("++")
                        .append("+++")
                        .append("++++")
                        .toString()
                )
        );
    }
}
