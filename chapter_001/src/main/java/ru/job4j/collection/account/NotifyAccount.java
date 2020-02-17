package ru.job4j.collection.account;

import ru.job4j.collection.account.Account;

import java.util.HashSet;
import java.util.List;

public class NotifyAccount {
    public static HashSet<Account> sent(List<Account> accounts) {
        HashSet<Account> rsl = new HashSet<>();
        for (Account modificate : accounts) {
            rsl.add(modificate);
        }
        return rsl;
    }
}
