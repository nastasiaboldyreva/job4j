package ru.job4j.io;

import java.util.Scanner;
import java.util.Random;

public class MagicBall {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Я великий Оракул. Что ты хочешь узнать?");
        String question = input.nextLine();
        System.out.println("выберите число от 0 до 3");
        int answer = new Random().nextInt(3);
        if (answer == 0) {
            System.out.println(answer + "да");
        } else if (answer == 1) {
            System.out.println(answer + "нет");
        } else if (answer > 1) {
            System.out.println(answer + "Может быть.");
        }
    }
}
