package com.daffahaidar;

import java.util.ArrayList;

public class Employee extends Person {

    public static ArrayList<String> departement = new ArrayList<String>();
    public static ArrayList<Integer> salary = new ArrayList<Integer>();

    // constructor
    public Employee(String name, int age, int nik, int nim, String departement, int salary) {
        super(name, age, nik, nim);
        Employee.departement.add(departement);
        Employee.salary.add(salary);
    }

    // Overloading constructor
    public Employee(String name, int age, int nik, int nim, int salary) {
        super(name, age, nik, nim);
        Employee.salary.add(salary);
        Employee.departement.add("-");
    }

}
