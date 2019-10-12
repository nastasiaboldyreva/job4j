package ru.job4j.array;

public class Task {

    public int intersection (int[] data) {
        int array1[]={1,2,3};
        int array2[]={2,3,4};
        int result;
        for (int i=0; i<data.length; i++) {
            for (int j=0; j<data.length; j++) {
                if (array1[i]==array2[j]) {
                    array1[i]=result;
                }
            }
        }
        return result;
    }
}