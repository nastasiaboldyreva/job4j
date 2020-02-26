package ru.job4j.encapsulation;

public interface Input {

    String askStr(String question);
    int askInt(String question);

    /**
     * метод будет запрашивать ввод данных от пользователя пока пользователь не введет число от 0 до max.
     * */
    int askInt(String question, int max);
}
