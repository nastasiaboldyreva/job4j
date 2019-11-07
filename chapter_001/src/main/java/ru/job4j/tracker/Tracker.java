package ru.job4j.tracker;

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
        for (int i=0; i < items.length; i++) {
            itemtracker.setId(id);
            this.items[i] = this.items[id];
            if ( ) {
                return true;
            }
        }
        //должен заменить ячейку в массиве this.items.
        // Для этого необходимо найти ячейку в массиве по id.
        // Метод должен вернуть boolean результат - удалось ли провести операцию.


    }
    //        3-удаление заявок - public boolean delete(String id);
    public boolean delete(String id) {
        for (int i=0; i < items.length; i++) {
            ItemTracker deleteitem = new ItemTracker();
            deleteitem.setId(id);
            System.arraycopy(deleteitem, id, copydeleteitem, id-i, id);
            if( ) {
                return true;
            }
        }

        // должен удалить ячейку в массиве this.items. Для этого необходимо найти ячейку в массиве по id.
        // Далее сместить все значения справа от удаляемого элемента -
        // на одну ячейку влево с помощью System.arrayCopy().
        // Метод должен вернуть boolean результат - удалось ли провести операцию.
    };


    //        4-получение списка всех заявок - public Item[] findAll();
    public ItemTracker[] findAll() {
        if (items != null) {
            return ;
            //как выглядит копия?
        }
        // возвращает копию массива this.items без null элементов
    }


    //        5-получение списка по имени - public Item[] findByName(String key);
    public ItemTracker[] findByName(String key) {
        for (int i=0; i < items.length; i++) {
            ItemTracker itembyname = new ItemTracker();
            itembyname.getName();

        }
        // проверяет в цикле все элементы массива this.items,
        // сравнивая name (используя метод getName класса Item) с аргументом метода String key.
        // Элементы, у которых совпадает name, копирует в результирующий массив и возвращает его;
    }
    //        6-получение заявки по id - public Item findById(String id);
    public ItemTracker findById(String id) {
        //проверяет в цикле все элементы массива this.items,
        // сравнивая id с аргументом String id и возвращает найденный Item.
        // Если Item не найден - возвращает null.
    }

}
