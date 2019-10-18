package ru.job4j.oop;

public class Story {

    public static void main(String[] args) {
        Pioneer pioneer = new Pioneer();
        Girl girl = new Girl();
        Wolf wolf = new Wolf();

        girl.help(pioneer);
        wolf.eat(girl);
        pioneer.kill(wolf);
    }


}
