package com.example.java8features.streams;

import com.example.java8features.entity.Employee;
import com.example.java8features.utils.EmployeeBuilder;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Duplicates1 {
    public static void main(String[] args) {
        List<Employee> employees = EmployeeBuilder.buildEmployeeList();

        employees.stream()
                .map(Employee::getName)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .filter(e -> e.getValue() > 1)
                .map(Map.Entry::getKey)
                .forEach(System.out::println);

        List<String> nameList = employees.stream()
                .map(Employee::getName)
                .collect(Collectors.toList());
        nameList.stream().filter(i -> Collections.frequency(nameList, i) > 1)
                .collect(Collectors.toSet())
                .forEach(System.out::println);
    }
}
