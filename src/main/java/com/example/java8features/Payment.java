package com.example.java8features;

@FunctionalInterface
public interface Payment {
    String pay(Integer a);

    default void generate() {
        System.out.println("generate");
    }
}
