package ru.job4j.collection;

import org.jetbrains.annotations.NotNull;

public class Job implements Comparable<Job> {
    //два поля: имя работы и приоритет исполнения.
    //задача написать для него сортировку по возрастанию по полю priority,
    // а так же сделать сортировку по имени по возрастанию.
    private String name;
    private int priority;

    public Job(String name, int priority) {
        this.name = name;
        this.priority = priority;
    }

    public String getName() { return name; }
    public int getPriority() { return priority; }

    @Override
    public String toString() {
        return "Job{" +
                "name='" + name + '\'' +
                ", priority=" + priority +
                '}';
    }

    @Override
    public int compareTo(@NotNull Job another) {
        return Integer.compare(priority, another.priority);
    }

}


