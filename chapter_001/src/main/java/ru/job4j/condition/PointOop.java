package ru.job4j.condition;

import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

public class PointOop {

    /**
     * Это поле объекта. Оно доступно только конкретному объекту.
     */
    private int x;

    /**
     * И это поле объекта. Оно доступно только конкретному объекту.
     */
    private int y;

    public PointOop(int first, int second) {
        this.x = first;
        this.y = second;
    }


    public double distance(PointOop that) {
        return sqrt(pow(this.x - that.x, 2) + pow(this.y - that.y, 2));
    }

    public static void main(String[] args) {
        PointOop a = new PointOop(0, 0);
        PointOop b = new PointOop(0, 2);
        double dist = a.distance(b);
        System.out.println(dist);
    }

}