package ru.job4j.collection;

import java.util.HashSet;

public class UniqueText {
    public static boolean isEquals(String originText, String duplicateText) {
        boolean rsl = true;
        //Преобразование строк в массив слов
        String[] origin = originText.split(" ");

        //Преобразование проверяемого текста в массив слов
        String[] text = duplicateText.split(" ");

        HashSet<String> check = new HashSet<>();

        for (String newOrigin : origin) {
            check.add(newOrigin);
        }
        for (String newText : text) {
            if (!check.contains(newText)) {
                rsl = false;
                break;
            }
        }
        return rsl;
    }
}
