package ru.job4j.collection;

import java.util.HashSet;
import java.util.List;

//нужно убрать дубликаты из списка, полученного от системы.
//FullSearch - класс, который извлечен все номера и уберет дубликаты.
public class FullSearch {
    public static HashSet<String> extractNumber(List<Task> list) {
        HashSet<String> numbers = new HashSet<>();
        for(Task duplicate : list) {
            numbers.add(duplicate.getNumber());
        }

        return numbers;
    }

}
