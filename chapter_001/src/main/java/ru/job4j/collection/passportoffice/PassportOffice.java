package ru.job4j.collection.passportoffice;

import java.util.HashMap;
import java.util.Map;

/** passport office system
 * people come and request their passports
 **/


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

        return citizens.get(passport);
    }
}


