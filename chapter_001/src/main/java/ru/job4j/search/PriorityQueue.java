package ru.job4j.search;

import java.util.LinkedList;

public class PriorityQueue {
    private LinkedList<Task> tasks = new LinkedList<>();

    /**
     * Метод должен вставлять в нужную позицию элемент.
     * Позиция определять по полю приоритет.
     * Для вставки использовать add(int index, E value)
     * @param task задача
     */
    public void put(Task task) {
        int index = 0;
        for(Task element : tasks) {
            if(task.getPriority() > tasks.add(index, element)) {
               index++;
            } else {
                break;
            }

//            element = tasks.get(index);
//            tasks.set(index, element);
        } this.tasks.add(index, task);

    }

    /**
     * Метод take возвращает первый элемент из списка и удаляет его.
     */

    public Task take() {
        return tasks.remove(0);
    }
}
