package ru.job4j.strategy;

public class Paint{
    public void draw(Shape shape) {
        System.out.println(shape.draw());
    }

    // Для загрузки нового объекта в памяь для управлении выводом нужно использовать метод System.setOut
    public static void main(String[] args) {
        Paint paint = new Paint();
        paint.draw(new TriangleShape());
        paint.draw(new Square());
    }


}
