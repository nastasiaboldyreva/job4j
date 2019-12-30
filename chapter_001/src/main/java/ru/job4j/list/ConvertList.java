package ru.job4j.list;

import java.util.ArrayList;
import java.util.List;

public class ConvertList {
    public static List<Integer> convert(List<int[]> list) {
        List<Integer> rsl = new ArrayList<>();
        for(List[] row : rsl) {
            for(List[] cell : row)  {
                System.out.println(cell);
            }
        }

        return rsl;
    }
}
