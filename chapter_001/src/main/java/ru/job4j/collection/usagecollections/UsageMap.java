package ru.job4j.collection.usagecollections;


import java.util.HashMap;

public class UsageMap {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        //почта - key, фио - value
        map.put("a93357@gmail.com", "Boldyreva Anastasia Sergeevna");
        for (String key : map.keySet()) {
            String value = map.get(key);
            System.out.println(key + " = " + value);
        }

    }
}
