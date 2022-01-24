package com.softserveinc.task01;

public class NotMoneyEnoughException extends IllegalArgumentException {
    public NotMoneyEnoughException(String s) {
        super(s);
    }
}
