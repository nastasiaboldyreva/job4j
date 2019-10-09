package ru.job4j.array;

public class ArrayChar {

    public static boolean startsW(char[] word, char[] pref) {
        boolean result = true;
        for (int i = 0; i < word.length; i++) {
            for (int j = 0; j < pref.length; j++) {
                if (word[j] != pref[j]) {
                    result = false;
                    break;
                }
            }
        }

        return result;
    }
}
