package ru.job4j.condition;

public class TriangleOop {

    private PointOop first;
    private PointOop second;
    private PointOop third;

    public TriangleOop(PointOop ap, PointOop bp, PointOop cp) {
        this.first = ap;
        this.second = bp;
        this.third = cp;
    }

    public double period(double a, double b, double c) {
        return (a + b + c) / 2;
    }

    public double area() {
        double rsl = -1;
        double a = first.distanceOop(second);
        double b = first.distanceOop(third);
        double c = second.distanceOop(third);
        double p = period(a, b, c);
        if (this.exist(a, b, c)) {
            rsl = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        }
        return rsl;
    }

    private boolean exist(double a, double c, double b) {
        return a + b > c && b + c > a && a + c > a;
    }

}