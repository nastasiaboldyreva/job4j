package ru.job4j.list;

import java.util.ArrayList;
import java.util.List;

public class ConvertList {
    public static List<Integer> convert(List<int[]> list) {
        List<Integer> rsl = new ArrayList<>();
        for(int[] row : list) {
            for(int i : row)  {
                System.out.println(i);
            }
        }

        return rsl;
    }
}
