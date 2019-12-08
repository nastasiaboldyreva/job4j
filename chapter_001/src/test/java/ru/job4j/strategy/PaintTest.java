package ru.job4j.strategy;


//аннотация @After для выполнения метода до запуска теста,
// @Before - после
import org.junit.After;
import org.junit.Before;

import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.StringJoiner;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class PaintTest {

    //поле содержит дефолтный вывод в консоль
    private final PrintStream stdout = System.out;
    //создаем буфер для хранения вывода
    private final ByteArrayOutputStream out = new ByteArrayOutputStream();
    private static final String NL = System.lineSeparator();

    @Before
    public void loadOutput() {
        System.out.println("execute before method");
        System.setOut(new PrintStream(this.out));
    }

    @After
    public void backOutput() {
        System.setOut(this.stdout);
        System.out.println("execute after method");
    }


    @Test
    public void whenDrawSquare() {
        //выполняем действие, которое пишет в консоль
        new Paint().draw(new Square());
        assertThat(this.out.toString(), is(
                new StringJoiner(NL, "", NL)
                        .add("++++")
                        .add("++++")
                        .add("++++")
                        .add("++++")
                        .toString()
        ));
    }

    @Test
    public void whenDrawTriangle() {
        new Paint().draw(new TriangleShape());
        assertThat(out.toString(), is(
                new StringBuilder()
                        .append("+")
                        .append(NL)
                        .append("++")
                        .append(NL)
                        .append("+++")
                        .append(NL)
                        .append("++++")
                        .append(NL)
                        .toString()
                )
                );
    }

}