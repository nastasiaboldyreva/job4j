package ru.job4j.lambda;

import java.util.List;
import java.util.function.Function;

public class Functions {
    List<Double> diapason(int start, int end, Function<Double, Double> func) {
        for (int index = start; index != end; index++) {

            Function linear = (double k1, double x1, double b1) -> {
                        double y1 = k1 * x1 + b1;
                        return y1;
            };
            Function quadratic = (double a2, double x2, double b2, double c2) -> {
                double y2 = a2 * (x2 * x2) + b2 * x2 + c2;
                return y2;
            };

            Function log = (double a3, double x3) -> {
                double y3 = Math.log(x3);
                return y3;
            };
        }

    }



}
