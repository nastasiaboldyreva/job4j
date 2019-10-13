package ru.job4j.sort;

import java.util.Arrays;

public class Merge {

    public int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        for (int i=0; i < rsl.length; i++){
            if (left[0] < right[0]) {
                rsl[0] = left[0];
            } else if (right[0] < left[0]){
                rsl[0] = right[0];
            }
            if ((left[i]<rsl[i])&(left[i]<right[i])) {
                rsl[i]=left[i];
            }
            else if ((right[i]<rsl[i])&(right[i]<left[i])) {
                rsl[i]=right[i];
            }
            else if ((rsl[i]<left[i])&(rsl[i]<right[i])) {
                rsl[i]++;
            }
        }return rsl;
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