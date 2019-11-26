package ru.job4j.io;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Игра 11 спичек. Выигрывает тот, кто заберет последние спички. выберите от 1 до 3 спичек");
        System.out.println("Введите число от 1 до 3");
        int quantity = 11;
        boolean gamer = false;
        while (quantity > 0) {
            //устанавливаем очеедь, с которой ходят игроки
            if (gamer) {
                System.out.println("Ходит игрок номер 2");
            } else {
                System.out.println("Ходит игрок номер 1");
            }
            //игроки вытаскивают по 1-3 спички
            int select = Integer.parseInt(input.nextLine());
            if (select > 0 && select < 4) {
                quantity = quantity - select;
                System.out.println("осталось" + quantity + "спичек");
                gamer = ! gamer;
            } else {
                System.out.println("Введите верное количество от 1 до 3");
            }
        }

        // условие выигрыша
        if (gamer) {
            System.out.println("Победил игрок номер 1");
        } else {
            System.out.println("Победил игрок номер 2");
        }



    }
}
