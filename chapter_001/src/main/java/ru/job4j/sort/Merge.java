package ru.job4j.sort;

import java.util.Arrays;

public class Merge {

    public int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        for (int i=0; i < rsl.length; i++) {
            for (int j=0; j < left.length; j++) {
                for (int k=0; k < right.length; k++) {
                    if (left[k] <= right[k]) {
                        rsl[k] = left[k];
                    } else if (right[k] < left[k]){
                        rsl[k] = right[k];
                    }
                    while (right[k] > left[left.length-1]) {
                        right[k]++;
                        rsl[k]=right[k];
                    }
                    while (left[k] > right[right.length-1]) {
                        left[k]++;
                        rsl[k]=left[k];
                    }
                }
            }
        }
        return rsl;
    }

    public static void main(String[] args) {
        Merge process = new Merge();
        int[] rsl = process.merge(
                new int[] {1, 3, 5},
                new int[] {2, 4}
        );
        System.out.println(Arrays.toString(rsl));
    }
}