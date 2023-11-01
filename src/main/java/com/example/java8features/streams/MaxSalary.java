package com.example.java8features.streams;

import com.example.java8features.entity.Employee;
import com.example.java8features.utils.EmployeeBuilder;

import java.util.Comparator;
import java.util.List;

public class MaxSalary {
    public static void main(String[] args) {
        List<Employee> employees = EmployeeBuilder.buildEmployeeList();
        employees.stream()
                .sorted(Comparator.comparing(Employee::getSalary).reversed()
                        .thenComparing(Employee::getName))
                .limit(1)
                .forEach(System.out::println);


        employees.stream()
                .max(Comparator.comparing(Employee::getSalary).thenComparing(Employee::getName))
                .ifPresent(System.out::println);

    }
}
