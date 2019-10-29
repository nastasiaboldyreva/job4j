package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class Point3dTest {

    @Test
    public void distance3d() {
        int x1 = 0;
        int x2 = 0;
        int y1 = 2;
        int y2 = 0;
        int z1 = 0;
        int z2 = 0;
        int expected = 2;
        Point3d first = new Point3d(x1, y1, z1);
        Point3d second = new Point3d(x2, y2, z2);
        double out = first.distance3d(second);
        Assert.assertEquals(expected, out, 0.0001);
    }

}