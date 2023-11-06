package com.example;

public class IPhone14 implements SimCard {
    @Override
    public void call() {
        System.out.println("Calling from my iPhone 14");
    }

    @Override
    public void browse() {
        System.out.println("Browsing with my iPhone 14");
    }
}
