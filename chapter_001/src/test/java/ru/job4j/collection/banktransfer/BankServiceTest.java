package ru.job4j.collection.banktransfer;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class BankServiceTest {

    @Test
    public void addUser() {
        BankUser bankUser = new BankUser("3434", "Petr Arsentev");
        BankService bank = new BankService();
        bank.addBankUser(bankUser);
        assertThat(bank.findByPassport("3434"), is(bankUser));
    }

    @Test
    public void addAccount() {
        BankUser bankUser = new BankUser("3434", "Petr Arsentev");
        BankService bank = new BankService();
        bank.addBankUser(bankUser);
        bank.addBankAccount(bankUser.getPassport(), new BankAccount("5546", 150.0));
        assertThat(bank.findByRequisite("3434", "5546").getBalance(), is(150.0));
    }

    @Test
    public void transferMoney() {
        BankUser bankUser = new BankUser("3434", "Petr Arsentev");
        BankService bank = new BankService();
        bank.addBankUser(bankUser);
        bank.addBankAccount(bankUser.getPassport(), new BankAccount("5546", 150.0));
        bank.addBankAccount(bankUser.getPassport(), new BankAccount("113", 50.0));
        bank.transferMoney(bankUser.getPassport(), "5546", bankUser.getPassport(), "113", 150);
        assertThat(bank.findByRequisite("3434", "113").getBalance(), is(200.0));
    }
}
