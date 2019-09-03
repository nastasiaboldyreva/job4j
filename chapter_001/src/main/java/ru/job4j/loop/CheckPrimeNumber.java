package ru.job4j.loop;

public class CheckPrimeNumber {
    public boolean check (int num) {
        boolean prime = false;
        for (int i=2; i <= num/i; i++) {
            if ((num % i) == 1) {
                prime = true;
            }
        }
        return prime;
    }
}
