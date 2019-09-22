package ru.job4j.array;

public class MinDiapason {
    public static int findMin(int[] array, int start, int finish) {
        int min = array[start];
        for (int i=0; i<array.length; i++) {
            array[array.length-1]=finish;
            if(array[i]<min) {
                array[0]=start;
                min=array[i];
            }
        }return min;
    }

}
