package model;

import java.io.Serializable;

public class Transaction implements Serializable {

    private long number;

    private double amount;

    private boolean isDeposit;

    public Transaction(double amount, boolean isDeposit) {
        this.amount = amount;
        this.isDeposit = isDeposit;
    }

    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    public double getAmount() {
        return amount;
    }

    public boolean isDeposit() {
        return isDeposit;
    }
}
