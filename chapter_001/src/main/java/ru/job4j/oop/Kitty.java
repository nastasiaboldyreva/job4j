package ru.job4j.oop;

public class Kitty {

    private String food;

    public void eat(String meat) {
        this.food = meat;
    }

    private String name;

    public void giveNick(String nick) {
        this.name = nick;
    }

    public void show() {
        System.out.println(this.food);
        System.out.println(this.name);
    }

    public static void main(String[] args) {
        System.out.println("There are gav's food.");
        Kitty gav = new Kitty();
        gav.eat("kotleta");
        gav.giveNick("Gavkitten");
        gav.show();
        System.out.println("There are black's food.");
        Kitty black = new Kitty();
        black.eat("fish");
        black.giveNick("Bigblackcat");
        black.show();

    }

}
