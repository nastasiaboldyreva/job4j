package ru.job4j.converter;

public class Converter {
    public static int rubleToEuro (int value) {
        return value / 70;
    }

    public static int rubleToDollar (int value) {
        return value / 60;
    }

    public static int euroToRuble (int value){
        return value * 70;
    }

    public static int dollarToRuble (int value) {
        return value * 60;
    }

    public static void main (String[] args) {
        int euro = rubleToEuro(140);
        int dollar = rubleToDollar (120);
        int ruble1 = euroToRuble (5);
        int ruble2 = dollarToRuble (4);
        System.out.println("140 rubles are " + euro + " euro.");
        System.out.println("120 rubles are " + dollar + " dollar." );
        System.out.println("5 euro are " + ruble1 + "ruble.");
        System.out.println("4 dollar are " + ruble2 + "ruble.");

        int in = 140;
        int expected = 2;
        int out = rubleToEuro (in);
        boolean passed = expected == out;
        System.out.println("140 rubles are 2euro. Test result : " + passed);

        int in2 = 120;
        int expected2 = 2;
        int out2 = rubleToDollar (in2);
        boolean passed2 = expected2 == out2;
        System.out.println("120 rubles are 2dollars. Test result: " + passed2);

        int in3 = 5;
        int expected3 = 350;
        int out3 = euroToRuble (in3);
        boolean passed3 = expected3 == out3;
        System.out.println("5 euro are 350 rubles. Test result:" + passed3);

        int in4 = 4;
        int expected4 = 240;
        int out4 = dollarToRuble (in4);
        boolean passed4 = expected4 == out4;
        System.out.println("4 dollars are 240 rubles. Test result:" + passed4);

    }
}
