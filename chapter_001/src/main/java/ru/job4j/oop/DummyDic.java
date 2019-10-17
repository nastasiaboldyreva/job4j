package ru.job4j.oop;

public class DummyDic {

    public String engToRus() {
        String eng = "awesome";
        return eng;
    }

    public static void main (String[] args) {
        DummyDic oxford = new DummyDic();
        String english = oxford.engToRus();
        System.out.println("Неизвестное слово: " + english);

    }
}