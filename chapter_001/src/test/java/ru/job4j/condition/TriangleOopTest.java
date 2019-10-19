package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.number.IsCloseTo.closeTo;
import static org.junit.Assert.assertThat;

public class TriangleOopTest {
    @Test
    public void whenAreaSetThreePointsThenTriangleArea() {
        //Создаем объект треугольник
        TriangleOop triangleoop = new TriangleOop();
        //Вычисляем площадь
        double result = triangleoop.area(0, 0, 0, 2, 2, 0);
        //Задаем ожидаемый результат
        double expected = 2D;
        //Проверяем результат и ожидаемое значение
        assertThat(result, closeTo(expected, 0.1));

    }
}
