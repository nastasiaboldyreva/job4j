package ru.job4j.array;

public class Check {
    public boolean mono(boolean[] data) {
        boolean result = false;
        for(int i=0; i!=data.length; i++) {
            data = new boolean[3];
            if ((data[i] = true) || (data[i] = false)){
                result = true;
            }
        }
        return result;
    }
}
