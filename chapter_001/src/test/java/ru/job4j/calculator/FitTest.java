package ru.job4j.calculator;

import org.junit.Assert;
import org.junit.Test;


public class FitTest {

    @Test
    public void manWeight() {
        double in = 190;
        double expected = 103.49999999999999;
        double out = Fit.manWeight(in);
        Assert.assertEquals(expected, out,0.0001);
    }
}
