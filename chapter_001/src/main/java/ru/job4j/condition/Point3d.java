package ru.job4j.condition;

import static java.lang.Math.sqrt;
import static java.lang.Math.pow;


public class Point3d {

    private int x;
    private int y;
    private int z;

    public Point3d(int first, int second, int third) {
        this.x = first;
        this.y = second;
        this.z = third;
    }

    public double distance3d(Point3d that) {
        return sqrt(pow(this.x - that.x, 2) + pow(this.y - that.y, 2) + pow(this.z - that.z, 2));
    }

    public static void main(String[] args) {
        Point3d a = new Point3d(0, 0, 0);
        Point3d b = new Point3d(0, 2, 0);
        double dist3d = a.distance3d(b);
        System.out.println(dist3d);
    }

    public void info() {
        System.out.println(String.format("Point[%s, %s, %s]", this.x, this.y, this.z));
    }

}
