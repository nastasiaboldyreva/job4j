package ru.job4j.collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

//Cистема для паспортного стола.
//К нам приходят люди и просят выдать им паспорт.
// Нам нужно занести всех пользователей в систему и выдать им уникальный номер.
//В дальнейшем нам бы хотелось быстро находить информацию о пользователе по номеру паспорта.
//По описанию задачи у нас появляется ассоциация - это номер паспорта, который ассоциирован с информацией о пользователе.

//Сервис должен проверять, что гражданина с таким паспортом еще нет,
// а также возможность получить информацию о гражданине по его паспорту.
//Для решения этой задачи Вам потребуются методы Map.containsKey(key) и Map.get(key).

public class PassportOffice {
    private Map<String, Citizen> citizens = new HashMap<>();
    public boolean add(Citizen citizen) {
        boolean rsl = false;
        if (!citizens.containsKey(citizen.getPassport())) {
            citizens.put(citizen.getPassport(), citizen);
            rsl = true;
        }
        return rsl;
    }

    public Citizen get(String passport) {
        for(String information : citizens.keySet()) {
            Citizen citizen = citizens.get(passport);
            System.out.println(information + " " + citizen);
        }
        return null;
    }
}


