package ru.job4j.collection.banktransfer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BankService {
    /**
     * This field contains all users and their accounts
     */
    private Map<BankUser, List<BankAccount>> users = new HashMap<>();

    /**
     * This method adds users in the system
     * it checks if user is new then add
     * if user is not new - do not add
     */
    public void addBankUser(BankUser bankUser) {
        users.putIfAbsent(bankUser, new ArrayList<>());
        }


    /**
     * This method add new account to user
     */
    public void addBankAccount(String passport, BankAccount bankAccount) {
        BankUser user = findByPassport(passport);
        if (user != null) {
            users.get(user).add(bankAccount);
        }

    }

    /**
     * This method searches user by passport
     */

    public BankUser findByPassport(String passport) {
        BankUser bankUser = null;
        for (BankUser person : users.keySet()) {
            if (person.getPassport().equals(passport)) {
                bankUser = person;
                break;
            }
        }
        return bankUser;
    }


    /**
     * This method should find user by requisites
     * first step - to find user
     * second step - to get users list of accounts
     * then to find account that we need
     */

    public BankAccount findByRequisite(String passport, String requisite) {
        BankAccount result = null;
        BankUser user = findByPassport(passport);
        if (user != null) {
            List<BankAccount> userAccounts = users.get(user);
            for (BankAccount account : userAccounts) {
                if (account.getRequisite().equals(requisite)) {
                    result = account;
                    break;
                }
            }
        }
        return result;
    }


    /**
     * Transfer money method from one account to another
     * */

    public boolean transferMoney(String srcPassport, String srcRequisite,
                                String destPassport, String destRequisite, double amount) {
        boolean rsl = false;
        BankAccount srcAccount = findByRequisite(srcPassport, srcRequisite);
        BankAccount destAccount = findByRequisite(destPassport, destRequisite);
        if (srcAccount != null && destAccount != null) {
            rsl = srcAccount.transfer(destAccount, amount);
        }
        return rsl;
    }

}

