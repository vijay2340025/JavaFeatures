package com.example.java8features;

import java.util.function.BiFunction;

public class LambdaExpression {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> add = (a, b) -> a * 2 + b;
        System.out.println(add.apply(12, 5));
    }
}
