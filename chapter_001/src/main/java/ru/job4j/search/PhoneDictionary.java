package ru.job4j.search;

import java.util.ArrayList;

public class PhoneDictionary {
    private ArrayList<Person> persons = new ArrayList<Person>();

    public void add(Person person) {
        this.persons.add(person);
        persons.add("Petr");
        persons.add("Arsentev");
        persons.add("12345");
        persons.add("Bryansk");
        boolean rst = persons.contains("nsk");
        boolean rst = persons.contains("234");
        boolean rst = persons.contains("Ars");
    }


    /**
     * Вернуть список всех пользователей, который содержат key в любых полях.
     * @param key Ключ поиска.
     * @return Список подощедщих пользователей.
     */
    public ArrayList<Person> find(String key) {
        ArrayList<Person> result = new ArrayList<>();
        return result;
    }

}
