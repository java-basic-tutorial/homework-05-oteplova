package com.softserveinc.task01;

public class Account {
    private long balance;

    public Account(long balance) {
        this.balance = balance;
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    public void deposit(long amount) throws IllegalArgumentException {
        // TODO: if amount is negative - throw IllegalArgumentException
        if(amount <0){
            throw new IllegalArgumentException ("amount is negative");
        }  balance += amount;
    }

    public void withdraw(long amount) {
        // TODO: if amount is negative - throw IllegalArgumentException
        // TODO: if amount higher than balance - throw NotMoneyEnoughException
        if(amount <0){
            throw new IllegalArgumentException ("amount is negative");
        }
        if(amount > balance){
            throw new NotMoneyEnoughException("amount higher than balance");
        }
        balance -= amount;
    }
}
