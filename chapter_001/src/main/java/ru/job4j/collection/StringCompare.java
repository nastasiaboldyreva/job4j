package ru.job4j.collection;

import java.util.Comparator;


/**
 * Comparator for Strings
 */
public class StringCompare implements Comparator<String> {

    @Override
    public int compare(String left, String right) {
        int minlength = Math.min(left.length(), right.length());
        int result = left.length() - right.length();
        for (int i = 0; i < minlength; i++) {
           int tmpResult = Character.compare(left.charAt(i), right.charAt(i));
           if (tmpResult != 0) {
               result = tmpResult;
               break;
           }
        }
        return result;
    }
}


