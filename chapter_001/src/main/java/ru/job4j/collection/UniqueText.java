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

        for (String new_origin : origin) {
            check.add(new_origin);
        }
        for (String new_text : text) {
            check.contains(new_text);
        }
        return rsl;
    }
}
