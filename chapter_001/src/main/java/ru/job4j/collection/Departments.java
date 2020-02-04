package ru.job4j.collection;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

public class Departments {

    public static List<String> fillGaps(List<String> deps) {
        TreeSet<String> tmp = new TreeSet<>();
        for (String value : deps) {
            String[] parts = value.split("/");
            String start = parts[0];
            tmp.add(start);
            for (int i = 1; i < parts.length; i++) {
                start += "/" + parts[i];
                tmp.add(start);
            }

        } return new ArrayList<>(tmp);
    }


//
//
//    public static void sortAsc(List<String> orgs) {
//
//    }
//
//    public static void sortDest(List<String> orgs) {
//
//    }
}
