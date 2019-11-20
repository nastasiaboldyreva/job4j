package ru.job4j.Encapsulation;

import ru.job4j.tracker.Item;

import java.util.Random;

public class Tracker {

    private final ItemTracker[] items = new ItemTracker[100];
    private int position = 0;

    //        1-добавление заявок - public Item add(Item item);
    public ItemTracker add(ItemTracker itemtracker) {
        itemtracker.setId(this.generateId());
        this.items[this.position++] = itemtracker;
        return itemtracker;
    }

    private String generateId() {
        Random rm = new Random();
        return String.valueOf(rm.nextLong() + System.currentTimeMillis());
    }
    //        2-редактирование заявок - public boolean replace(String id, Item item);
    public boolean replace(String id, ItemTracker itemtracker) {
        boolean res = false;
        for (int i=0; i < position; i++) {
            if (items[i].getId().equals(id)) {
                itemtracker.setId(id);
                this.items[i] = itemtracker;
                res = true;
                break;
            }
        }
        return res;
        // должен заменить ячейку в массиве this.items.
        // Для этого необходимо найти ячейку в массиве по id.
        // Метод должен вернуть boolean результат - удалось ли провести операцию.
    }


    //        3-удаление заявок - public boolean delete(String id);
    public boolean delete(String id) {
        boolean res = false;
        for (int i = 0; i < position; i++) {
            ItemTracker[] newitem = new ItemTracker[i];
            if (items[i].getId().equals(id)) {
                newitem.setId(id);
                System.arraycopy(items, 0, newitem, position-1, items.length);
                res = true;
                break;
            }
        }
        return res;
    }
    // должен удалить ячейку в массиве this.items.
    // Для этого необходимо найти ячейку в массиве по id.
    // Далее сместить все значения справа от удаляемого элемента -
    // на одну ячейку влево с помощью System.arrayCopy().
    // Метод должен вернуть boolean результат - удалось ли провести операцию.


    //        4-получение списка всех заявок - public Item[] findAll();
    public ItemTracker[] findAll () {
        ItemTracker[] findallitems = new ItemTracker[100];
        for (int i = 0; i < position; i++) {
            for (int j = 0; j < position; j++) {
                if (findallitems != null) {
                    findallitems[j++] = items[i];
                    System.arraycopy(items, 0, findallitems, j, items.length);
                }
            } return findallitems;
        }
    }
    // возвращает копию массива this.items без null элементов



    //        5-получение списка по имени - public Item[] findByName(String key);
    public ItemTracker[] findByName(String key) {
        ItemTracker[] findbynameitems = new ItemTracker[100];
        for (int i=0; i < position; i++) {
            for (int j = 0; j < position; j++) {
                if (findbynameitems[j].getName().equals(key)) {
                    this.items[j++] = findbynameitems[i];
                    return findbynameitems;
                }
            }
            // проверяет в цикле все элементы массива this.items,
            // сравнивая name (используя метод getName класса Item) с аргументом метода String key.
            // Элементы, у которых совпадает name, копирует в результирующий массив и возвращает его;
        }


        //        6-получение заявки по id - public Item findById(String id);
        public ItemTracker findById (String id) {
            for (int i=0; i < position; i++) {
                if(items[i].getId().equals(id)) {

                }
            }
        }
        //проверяет в цикле все элементы массива this.items,
        // сравнивая id с аргументом String id и возвращает найденный Item.
        // Если Item не найден - возвращает null.
    }

}