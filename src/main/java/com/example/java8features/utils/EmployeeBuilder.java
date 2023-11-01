package com.example.java8features.utils;

import com.example.java8features.entity.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeBuilder {
    public static List<Employee> buildEmployeeList() {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(Employee.builder().id(1).name("vijay").salary(40000).build());
        employees.add(Employee.builder().id(2).name("gayu").salary(60000).build());
        employees.add(Employee.builder().id(3).name("mano").salary(70000).build());
        employees.add(Employee.builder().id(4).name("siva").salary(200000).build());
        employees.add(Employee.builder().id(5).name("nandu").salary(200000).build());
        return employees;
    }
}
