package ru.job4j.strategy;

public class Paint{
    //переопределить метод draw() для каждой фигуры
    public void draw(Shape shape) {

    }
    //В классе Paint реализовать метод public void draw(Shape shape).
    // Метод draw() должен печатать псевдокартинку на консоль через метод System.out.println(shape.draw())

    //Класс Paint и метод draw() нужен только для прорисовки сформированной строки,
    // формированием строки должен заниматься метод draw() для всех фигур, реализующих интерфейс Shape

    public static void main(String[] args) {
        //Который будет выводить на экран треугольник и квадрат.
    }


}
