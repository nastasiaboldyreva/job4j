package ru.job4j.array;

public class Square {
    public int[] calculate(int bound) {
        int[] rst = new int[bound];
        rst[0]=1;
        for (int i=1; i<rst.length; i++){
            rst[i] = (i+1)*(i+1);
        }
        return rst;
    }

}
