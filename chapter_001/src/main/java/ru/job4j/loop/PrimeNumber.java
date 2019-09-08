package ru.job4j.loop;

public class PrimeNumber {

    public int calc(int x) {
        int count=0;
        for (int num = 2; num <= x; num++) {
            boolean prime = true;
            for (int i = 2; i < num; i++) {
                if ((num % i) == 0) {
                    prime = false;
                    break;
                }
            }
            if (prime==true) {
                count ++;
            }
        }
        return count;
    }
}