package com.example;

public class ATT implements SimCard {
    @Override
    public void call() {
        System.out.println("Calling from ATT");
    }

    @Override
    public void browse() {
        System.out.println("Browsing with ATT");
    }
}
