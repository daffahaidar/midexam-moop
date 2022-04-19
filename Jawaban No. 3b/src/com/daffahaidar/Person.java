package com.daffahaidar;

import java.util.ArrayList;

class Person {
    // Deklarasi variabel
    /*
     * Saya menggunakan static agar nantinya tidak perlu membuat objek baru untuk
     * mengakses variabel
     */
    public static ArrayList<String> name = new ArrayList<String>();
    public static ArrayList<Integer> age = new ArrayList<Integer>();
    public static ArrayList<Integer> nik = new ArrayList<Integer>();
    public static ArrayList<Integer> nim = new ArrayList<Integer>();

    // constructor
    public Person(String name, int age, int nik, int nim) {
        Person.name.add(name);
        Person.age.add(age);
        Person.nik.add(nik);
        Person.nim.add(nim);
    }

}
