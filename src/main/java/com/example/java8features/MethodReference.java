package com.example.java8features;

import java.text.MessageFormat;

public class MethodReference {

    public static String process(Integer amount) {
        return MessageFormat.format("{0} is credited to your account", amount);
    }

    public static void main(String[] args) {
        Payment payment = MethodReference::process;
        System.out.println(payment.pay(123));
    }
}
