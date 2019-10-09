package ru.job4j.condition;

public class Point {

    public static double distance(int x1, int y1, int x2, int y2) {
        double a = x2 - x1;
        double b = y2 - y1;
        double first = Math.pow(a, 2);
        double second = Math.pow(b, 2);
        return Math.sqrt(first + second);
    }

    public static void main(String[] args) {
        double result1 = distance(0, 0, 2, 0);
        double result2 = distance(0, 0, 5, 2);
        System.out.println("result(0,0) to(2,0)" + result1);
        System.out.println("result(0,0) to(5,2)" + result2);
    }

}
