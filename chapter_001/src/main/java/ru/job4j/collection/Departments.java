//package ru.job4j.collection;
//
//import java.util.ArrayList;
//import java.util.HashSet;
//import java.util.List;
//
//public class Departments {
//
//    public static List<String> fillGaps(List<String> deps) {
//        List<String> rsl = new ArrayList<>();
//        return rsl;
//
///**
// * HashSet allows to eliminate duplicates
// * which may be result of sequent individual departments summing
// */
//    //Чтобы реализовать метод fillGaps, нужно определить,
//    // какие элементы отсутствуют в системе.
//    // Для этого каждую входящую строку нужно разбить на одиночные элементы.
//    // Для этого можно использовать метод String.split("/").
//    // Этот метод вернет массив одиночных элементов.
//    // Далее нужно через цикл последовательно складывать элементы и добавлять из в множество.
//    // Используйте в качестве промежуточного хранения HashSet.
//
//    HashSet<String> tmp = new HashSet<>();
//    for (String value : deps) {
//        String start = " ";
//        for (String el : value.split("/")) {
//            // tmp.add start + "/" + el
//        }
//    } return new ArrayList<>(tmp);
//    }
//
//
//    public static void sortAsc(List<String> orgs) {
//
//    }
//
//    public static void sortDest(List<String> orgs) {
//
//    }
//}
