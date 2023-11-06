package com.example;

public class Verizon implements SimCard {

    private int rate;

    public void setRate(int rate) {
        this.rate = rate;
    }

    @Override
    public void call() {
        System.out.println("Calling from Verizon with rate: " + rate);
    }

    @Override
    public void browse() {
        System.out.println("Browsing with Verizon with " + rate);
    }
}
