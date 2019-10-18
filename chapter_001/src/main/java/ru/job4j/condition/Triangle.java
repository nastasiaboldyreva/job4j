package ru.job4j.condition;

public class Triangle {

    /**
     * Метод вычисления полупериметра по длинам сторон
     *
     * @param a расстояние между точками a b
     * @param b расстояние между точками a c
     * @param c расстояние между точками b c
     * @return полупериметра
     */

    public double period(double a, double b, double c) {
        double p = (a + b + c) / 2;
        return p;
    }


    /**
     * Метод проверяет, можно ли построить треугольник с такими длинами сторон
     *
     * @param a длина от точки a b
     * @param b длина от точки a c
     * @param c длина от точки b c
     */

    private boolean exist(double a, double b, double c) {
        return a + b > c && b + c > a && a + c > a;
    }


    /**
     * Метод должен вычислять площадь треугольника
     *
     * @return
     */

    public double area(int x1, int y1, int x2, int y2, int x3, int y3) {
        double rsl = -1;
        double a = new Point().distance(x1, y1, x2, y2);
        double b = new Point().distance(x2, y2, x3, y3);
        double c = new Point().distance(x1, y1, x3, y3);
        double p = period(a, b, c);
        if (this.exist(a, b, c)) {
            rsl = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        }
        return rsl;
    }
}









