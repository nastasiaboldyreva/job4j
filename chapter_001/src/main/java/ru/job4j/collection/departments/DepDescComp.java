package ru.job4j.collection.departments;

import java.util.Comparator;

public class DepDescComp implements Comparator<String> {

    @Override
    public int compare(String a, String b) {
        int result = a.length() - b.length();

        /**
         * we define minimum length
         */
        int minLength = Math.min(a.length(), b.length());

        /**
         * sort Strings in reverse order
         */
        for (int i = 0; i < minLength; i++) {
            int tempResult = Character.compare(b.charAt(i), a.charAt(i));
            if (tempResult != 0) {
                result = tempResult;
                break;
            }
        }
        return result;
    }
}