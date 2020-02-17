package ru.job4j.collection.banktransfer;

import java.util.Objects;

public class BankAccount {

    private String requisite;
    private double balance;

    public BankAccount(String requisite, double balance) {
        this.requisite = requisite;
        this.balance = balance;
    }

    public String getRequisite() {
        return requisite;
    }

    public void setRequisite(String requisite) {
        this.requisite = requisite;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public boolean transfer(BankAccount destination, double amount) {
        boolean result = false;
        if (balance - amount >= 0) {
            destination.balance += amount;
            balance -= amount;
            result = true;
        }
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BankAccount account = (BankAccount) o;
        return Objects.equals(requisite, account.requisite);
    }

    @Override
    public int hashCode() {
        return Objects.hash(requisite);
    }
}
