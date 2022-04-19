package com.daffahaidar;

public class Kubus extends Shape {
    // instansiasi variables
    private double sisi;
    private int rusuk = 12;
    private int jumlahsisi = 6;

    // constructor
    public Kubus(double sisi) {
        this.sisi = sisi;
    }

    public double luas() {
        return jumlahsisi * Math.pow(sisi, 2);
    }

    public double volume() {
        return Math.pow(sisi, 3);
    }

    public double keliling() {
        return rusuk * sisi;
    }
}
