package com.example.java8features;

import java.text.MessageFormat;

public class Gpay implements Payment {

    @Override
    public String pay(Integer a) {
        return MessageFormat.format("Google pay of {0} is done.", a);
    }

    @Override
    public void generate() {
        System.out.println("overridden");
    }
}
