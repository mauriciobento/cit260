package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Account extends BaseEntity implements Serializable {

    private long accountNumber;

    private Person person;

    private List<Transaction> transactions = new ArrayList();

    public Account(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(List<Transaction> transaction) {
        this.transactions = transaction;
    }
}
