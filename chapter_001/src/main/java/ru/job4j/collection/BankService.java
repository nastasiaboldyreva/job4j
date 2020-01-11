//package ru.job4j.collection;
//
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//import java.util.Set;
//
//public class BankService {
//    //Это поле содержит всех пользователей системы с привязанными к ним счетами.
//    private Map<BankUser, List<BankAccount>> users = new HashMap<>();
//
//    //Это метод должен добавить пользователя в систему.
//    //Чтобы добавить пользователя в систему нужно использовать метод Map.put.
//    //Этот метод принимает два параметра: пользователя и список счетов.
//    //По умолчанию нужно добавить пустой список - new ArrayList<Account>().
//    //В методе должна быть проверка, что такого пользователя еще нет в системе.
//    // Если он есть, то нового добавлять не надо.
//    public void addBankUser(BankUser bankUser) {
//        List<BankAccount> accounts = new ArrayList<>();
//        for(BankAccount check : accounts) {
//            users.putIfAbsent(bankUser, check);
////            if(!users.containsKey(bankUser.getUsername())) {
////                users.put(bankUser.getUsername(), )
////            }
//        }
//
//    }
//
//// Должен добавить новый счет к пользователю.
//// сперва пользователя нужно найти по паспорту. Для этого нужно использовать метод findByPassport.
//// После этого мы получим список всех счетов пользователя и добавим новый счет к ним.
//// В этом методе должна быть проверка, что такого счета у пользователя еще нет.
//    public void addBankAccount(String passport, BankAccount bankAccount) {
//        List<BankUser> accounts = new ArrayList<>();
//        findByPassport(passport);
//        users.putIfAbsent(bankAccount.getRequisite(), );
//
//    }
//
//    //Это метод ищет пользователя по номеру паспорта.
//    // Здесь нужно использовать перебор всех элементов через цикл for-each и метод Map.keySet.
//    public BankUser findByPassport(String passport) {
//        for(BankUser xx.getUsername : users.keySet()) {
//            BankUser xx.getPassport = users.get(xx.getUsername);
//            System.out.println(xx.getUsername + " =" + xx.getPassport);
//        }
//        return null;
//    }
//
//    //Этот метод ищет счет пользователя по реквизитам.
//    // Сначала нужно найти пользователя.
//    // Потом получить список счетов этого пользователя и в нем найти нужный счет.
//    public BankAccount findByRequisite(String passport, String requisite) {
//
//        return null;
//    }
//
//    //Метод для перечисления денег с одного счёта на другой счёт.
//    //Если счёт не найден или не хватает денег на счёте srcAccount (с которого переводят),
//    // то метод должен вернуть false.
//    public boolean tranferMoner(String srcPassport, String srcRequisite,
//                                String destPassport, String destRequisite, double amount) {
//        boolean rsl = false;
//        return rsl;
//    }
//}
//