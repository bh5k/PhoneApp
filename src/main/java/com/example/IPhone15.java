package com.example;

public class IPhone15 implements SimCard {
    @Override
    public void call() {
        System.out.println("Calling from my iPhone 15");
    }

    @Override
    public void browse() {
        System.out.println("Browsing with my iPhone 15");
    }
}
