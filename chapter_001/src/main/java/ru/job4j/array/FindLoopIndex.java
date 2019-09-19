package ru.job4j.array;

public class FindLoopIndex {
    public static int indexOf(int[] data, int el) {
        int rst = -1;
        for (int i=0; i<data.length; i++) {
            if(data[i]==el) {
                rst = i;
                break;
            }
        }
        return rst;
    }

    public static int indexOf(int[] data, int el, int start, int finish) {
        int rst = -1;
        for (int i=0; i<data.length; i++) {
            data[0] = start;
            data[data.length-1]=finish;
            if (data[i]==el) {
                rst = i;
            }
        }
        return rst;
    }
}