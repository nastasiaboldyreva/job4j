package ru.job4j.io;

import java.util.Scanner;

public class Matches {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean run = true;
        while (run) {
            System.out.println("Игра 11 спичек. Выигрывает тот, кто заберет последние спички. выберите от 1 до 3 спичек");
            System.out.println("Введите число от 1 до 3");
            int quantity = 11;
            while (quantity > 0) {
                int select = Integer.valueOf(input.nextLine());
                int left = 11 - select;
                if (left > 0) {
                    if (select == 1)  {
                        System.out.println("Игра продолжается. Введите число от 1 до 3");
                    } if (select == 2)  {
                        System.out.println("Игра продолжается. Введите число от 1 до 3");
                    } if (select == 3)  {
                        System.out.println("Игра продолжается. Введите число от 1 до 3");
                    } else if (select > 3) {
                        System.out.println("Вы ввели число больше 3.");
                    }
                }

            }
        }
    }
}


















//            for (int i = 11; i > 0; i++) {
//                int select = Integer.valueOf(input.nextLine());
//                int left = 11 - select*i;
//                if (left > 0) {
//                    if (select <=3) {
//                        System.out.println("Спасибо. Игра продолжается");
//                    } else {
//                        System.out.println(("Вы ввели не то число"));
//                    }
//                }
//                else if (left <= 0 ) {
//                    System.out.println("Вы победили");
//                    break;
//                }
//            }




//            for (int i = 1; i <11; i++) {
//                int select = Integer.valueOf(input.nextLine());
//                int left = 11 - select*i;
//                if (left > 0) {
//                    if (select <=3) {
//                        System.out.println("Спасибо. Игра продолжается");
//                    } else {
//                        System.out.println(("Вы ввели не то число"));
//                    }
//                }





//            System.out.println("Ходит игрок номер 1");
//            System.out.println("выберите от 1 до 3 спичек");
//            int select = Integer.valueOf(input.nextLine());
//            if (select <=3) {
//                System.out.println("Спасибо. Игра продолжается");
//            } else {
//                System.out.println(("Вы ввели не то число"));
//            }
//            if ((11 - select) <= 0){
//                System.out.println(("Вы победили"));
//                break;
//            }

//            System.out.println("Ходит игрок номер 2");
//            System.out.println("выберите от 1 до 3 спичек");
//            int selectTwo = Integer.valueOf(input.nextLine());
//            if (selectTwo <=3) {
//                System.out.println("Спасибо. Игра продолжается");
//            } else {
//                System.out.println(("Вы ввели не то число"));
//            }
//            System.out.println();

