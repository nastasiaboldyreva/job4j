package ru.job4j.loop;

public class PrimeNumber {

    public int calc(int x) {
        int count=0;
        boolean prime = true;
        for (int num = 2; num <= x; num++) {
            for (int i = 2; i < num; i++) {
                if ((num % i) == 0) {
                    prime = false;
                    break;
                }
            }
            count ++;
        }
        return count;
    }
}