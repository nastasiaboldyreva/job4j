package ru.job4j.collection;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;


public class Departments {

    public static List<String> fillGaps(List<String> deps) {
        HashSet<String> tmp = new HashSet<>();
        for (String value : deps) {
            String[] parts = value.split("/");
            String start = parts[0];
            tmp.add(start);
            for (int i = 1; i < parts.length; i++) {
                start += "/" + parts[i];
                tmp.add(start);
            }
        }
        List<String> result = new ArrayList<>(tmp);
        sortAsc(result);
        sortDest(result);
        return result;
    }


    public static void sortAsc(List<String> orgs) {
        orgs.sort(Comparator.naturalOrder());
    }

    public static void sortDest(List<String> orgs) {
        orgs.sort(Comparator.reverseOrder());
    }
}
