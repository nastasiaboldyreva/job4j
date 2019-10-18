package ru.job4j.oop;

public class Battery {

    private int load;

    public Battery(int percent) {
        this.load = percent;
    }

    public void exchange(Battery another){
        this.load = this.load + another.load;
        another.load = 0;
    }

    public static void main (String[] args) {
        Battery first = new Battery(80);
        Battery second = new Battery(20);
        System.out.println("first: " + first.load + " . second: " + second.load);
        first.exchange(second);
        System.out.println("first: " + first.load + " . second: " + second.load);
    }

}
