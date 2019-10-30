package ru.job4j.pojo;

public class Library {

    public static void main(String[] args) {
        Book mastermargarita = new Book("Master & Margarita", 450);
        Book eugineonegin = new Book("Eugine Onegin", 180);
        Book cleancode = new Book("Clean code", 300);
        Book aliceinwonderland = new Book("Alice in Wonderland", 200);


        Book[] stories = new Book[4];

        stories[0] = mastermargarita;
        stories[1] = eugineonegin;
        stories[2] = cleancode;
        stories[3] = aliceinwonderland;

        for (int index = 0; index < stories.length; index++) {
            Book literature = stories[index];
            System.out.println(literature.getName() + " - " + literature.getPages());
        }

        System.out.println("Master & Margarita change place with Alice in Wonderland");
        stories[0] = aliceinwonderland;
        stories[3] = mastermargarita;

        for (int index = 0; index < stories.length; index++) {
            Book literature = stories[index];
            System.out.println(literature.getName() + " - " + literature.getPages());
        }

        System.out.println("Clean code books");
        for (int index = 0; index < stories.length; index++) {
            System.out.println(cleancode.getName() + "-" + cleancode.getPages());
        }
    }
}

