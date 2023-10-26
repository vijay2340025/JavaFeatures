package com.example.java8features;

import java.text.MessageFormat;
import java.util.function.BiFunction;

public class LambdaExpression {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> add = (a, b) -> a * 2 + b;
        System.out.println(add.apply(12, 5));

        Payment payment = (a) -> MessageFormat.format("{0} is processed successfully", a);
        System.out.println(payment.pay(12));
    }
}
