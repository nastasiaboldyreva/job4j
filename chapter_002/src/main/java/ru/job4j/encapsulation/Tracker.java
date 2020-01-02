package ru.job4j.encapsulation;

import java.util.Arrays;
import java.util.Random;
import java.util.ArrayList;
import java.util.List;


public class Tracker {

    private final List<ItemTracker> items = new ArrayList<>();
    //private int position = 0;

    // 1-добавление заявок - public Item add(Item item);
    public ItemTracker add(ItemTracker itemtracker) {
        itemtracker.setId(this.generateId());
        //this.items[this.position++] = itemtracker;
        this.items.add(itemtracker);
        return itemtracker;
    }

    private String generateId() {
        Random rm = new Random();
        return String.valueOf(rm.nextLong() + System.currentTimeMillis());
    }

    // 2-редактирование заявок - public boolean replace(String id, Item item);
    // должен заменить ячейку в массиве this.items.
    // Для этого необходимо найти ячейку в массиве по id.
    // Метод должен вернуть boolean результат - удалось ли провести операцию.

    public boolean replace(String id, ItemTracker itemtracker) {
        boolean res = false;
        for (int i = 0; i < items.size(); i++) {
            //if (items[i].getId().equals(id))
            if (items.get(i).getId().equals(id)) {
                itemtracker.setId(id);
                //this.items[i] = itemtracker;
                this.items.set(i, itemtracker);
                res = true;
                break;
            }
        }
        return res;
    }


    // 3-удаление заявок - public boolean delete(String id);
    // должен удалить ячейку в массиве this.items.
    // Для этого необходимо найти ячейку в массиве по id.
    // Далее сместить все значения справа от удаляемого элемента -
    // на одну ячейку влево с помощью System.arrayCopy().
    // Метод должен вернуть boolean результат - удалось ли провести операцию.

    public boolean delete(String id) {
        boolean res = false;
        for (int i = 0; i < items.size(); i++) {
            //if (items[i].getId().equals(id))
            if (items.get(i).getId().equals(id)) {
                //System.arraycopy(items, i + 1, items, i, items.size() - i - 1);
                items.remove(i);
                position--;
                res = true;
                break;
            }
        }
        return res;
    }




    // 4-получение списка всех заявок - public Item[] findAll();
    // возвращает копию массива this.items без null элементов

    public List<ItemTracker> findAll() {
        return Arrays.copyOf(items, items.size());
    }



    // 5-получение списка по имени - public Item[] findByName(String key);
    // проверяет в цикле все элементы массива this.items,
    // сравнивая name (используя метод getName класса Item) с аргументом метода String key.
    // Элементы, у которых совпадает name, копирует в результирующий массив и возвращает его;

    public List<ItemTracker> findByName(String key) {
        //ItemTracker[] findbynameitems = new ItemTracker[position];
        List<ItemTracker> findbynameitems = new ArrayList<>();
        int count = 0;
        for (int i = 0; i < items.size(); i++) {
            //if (items[i].getName().equals(key))
            if (items.get(i).getName().equals(key)) {
                //findbynameitems[count++] = items[i];
                findbynameitems.add(items.get(i));
            }
        }
        return Arrays.copyOf(findbynameitems, count);
    }



    // 6-получение заявки по id - public Item findById(String id);
    // проверяет в цикле все элементы массива this.items,
    // сравнивая id с аргументом String id и возвращает найденный Item.
    // Если Item не найден - возвращает null.

    public ItemTracker findById(String id) {
            ItemTracker itemTracker = null;
            for (int i = 0; i < items.size(); i++) {
                if (items.get(i).getId().equals(id)) {
                    //itemTracker = items[i];
                    itemTracker = items.get(i);
                    break;
                }
            }
            return itemTracker;
    }

}