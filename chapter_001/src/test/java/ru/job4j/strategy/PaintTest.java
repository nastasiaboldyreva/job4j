//package ru.job4j.strategy;
//
//import org.junit.Test;
//import java.io.ByteArrayOutputStream;
//import java.io.PrintStream;
//import static org.hamcrest.core.Is.is;
//import static org.junit.Assert.assertThat;
//
//public class PaintTest {
//
//    @Test
//    public void whenDrawSquare() {
//        //получаем ссылку на стандартный вывод в консоль
//        PrintStream stdout = System.out;
//        //создаем буфер для хранения вывода
//        ByteArrayOutputStream out = new ByteArrayOutputStream();
//        //заменяем стандартный вывод на вывод в память для тестирования
//        System.setOut(new PrintStream(out));
//        //выполняем действие, которое пишет в консоль
//        new Paint().draw(new Square());
//        //проверяем результат вычисления
//        assertThat(new String(out.toByteArray()), is (
//                new StringBuilder()
//                        .append("++++" + System.lineSeparator())
//                        .append("++++" + System.lineSeparator())
//                        .append("++++" + System.lineSeparator())
//                        .append("++++" + System.lineSeparator())
//                        .toString()));
//        //возвращаем обратно стандартный вывод в консоль
//        System.setOut(stdout);
//    }
//}