//package ru.job4j.collection;
//
//import java.util.Comparator;
//import java.util.Set;
//import java.util.TreeSet;
//
//public class StringCompare implements Comparator<String>{
//
//    @Override
//    public int compare(String left, String right) {
//        Set<Character> comparing = new TreeSet<>();
//        int min = comparing.size();
//        int result = 0;
//        for (int i = 0; i < min; i++) {
//           char a = left.charAt(i);
//           char b = right.charAt(i);
//           int abcompare = Character.compare(a, b);
//           if(abcompare != 0) { break; }
//
//        }
//
//        if(result != 0) {
//            result = a - b;
//        }
//
//        return result;
//    }
//}
//
//
