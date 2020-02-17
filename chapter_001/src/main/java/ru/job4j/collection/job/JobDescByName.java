package ru.job4j.collection.job;

import ru.job4j.collection.job.Job;

import java.util.Comparator;

public class JobDescByName implements Comparator<Job> {

    /**сортировка по убыванию
     * @param o1
     * @param o2
     */
    @Override
    public int compare(Job o1, Job o2) {
        return o2.getName().compareTo(o1.getName());
    }
}
