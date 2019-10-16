package ru.job4j.oop;

public class Jukebox {

    public void music(int position){
        if (position==1) {
            System.out.println("Пусть бегут неуклюже" + position);
        }
        else if (position==2) {
            System.out.println("Спокойной ночи" + position);
        }
        else {
            System.out.println("Песня не найдена" + position);
        }
    }

    public static void main(String[] args) {
        Student petya = new Student();
        petya.music();
    }
}


