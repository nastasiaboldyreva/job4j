package ru.job4j.search;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.function.Predicate;

public class PhoneDictionary {
    private ArrayList<Person> persons = new ArrayList<>();

    public void add(Person person) {
        this.persons.add(person);

    }


    /**
     * Вернуть список всех пользователей, который содержат key в любых полях.
     * @param key Ключ поиска.
     * @return Список подощедщих пользователей.
     */
//    public ArrayList<Person> find(String key) {
//        ArrayList<Person> result = new ArrayList<>();
//        for (Person person : persons) {
//            if (person.getSurname().contains(key)
//                    || person.getName().contains(key)
//                    || person.getAddress().contains(key)
//                    || person.getPhone().contains(key)) {
//                result.add(person);
//            }
//        }
//        return result;
//    }

    public ArrayList<Person> find(String key) {
        Predicate<Person> findSurname = s -> s.getAddress().equals(key);
        Predicate<Person> findName = s -> s.getName().equals(key);
        Predicate<Person> findAddress = s -> s.getAddress().equals(key);
        Predicate<Person> findPhone = s -> s.getPhone().equals(key);
        Predicate<Person> combine =  findSurname.or(findName).or(findAddress).or(findPhone);
        ArrayList<Person> result = new ArrayList<>();
        for (Person person : persons) {
            if (combine.test(person)) {
                result.add(person);
            }
        }
        return result;
    }
}
