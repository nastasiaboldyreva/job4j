package ru.job4j.encapsulation;

import java.util.Random;
import java.util.ArrayList;
import java.util.List;


public class Tracker {

    private final List<ItemTracker> items = new ArrayList<>();

    /**
     * добавление заявок
     * */
    public ItemTracker add(ItemTracker itemtracker) {
        itemtracker.setId(this.generateId());
        this.items.add(itemtracker);
        return itemtracker;
    }

    private String generateId() {
        Random rm = new Random();
        return String.valueOf(rm.nextLong() + System.currentTimeMillis());
    }

    /**
     * редактирование заявок
     * */
    public boolean replace(String id, ItemTracker itemtracker) {
        boolean res = false;
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).getId().equals(id)) {
                itemtracker.setId(id);
                this.items.set(i, itemtracker);
                res = true;
                break;
            }
        }
        return res;
    }


    /**
     * удаление заявок
     * должен удалить ячейку в массиве this.items.
     * Для этого необходимо найти ячейку в массиве по id.
     * Далее сместить все значения справа от удаляемого элемента -
     * на одну ячейку влево
     * */
    public boolean delete(String id) {
        boolean res = false;
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).getId().equals(id)) {
                items.remove(i);
                res = true;
                break;
            }
        }
        return res;
    }



    /**
     * получение списка всех заявок
     * */
    public List<ItemTracker> findAll() {
        return items;
    }


    /**
     * получение списка по имени
     * */
    public List<ItemTracker> findByName(String key) {
        List<ItemTracker> findbynameitems = new ArrayList<>();
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).getName().equals(key)) {
                findbynameitems.add(items.get(i));
            }
        }
        return findbynameitems;
    }


    /**
     * получение заявки по id
     * */
    public ItemTracker findById(String id) {
            ItemTracker itemTracker = null;
            for (int i = 0; i < items.size(); i++) {
                if (items.get(i).getId().equals(id)) {
                    itemTracker = items.get(i);
                    break;
                }
            }
            return itemTracker;
    }

}