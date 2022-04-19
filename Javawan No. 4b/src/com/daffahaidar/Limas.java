package com.daffahaidar;

public class Limas extends Shape {
    // instansiasi variables
    private double alas;
    private double tinggi;

    // constructor
    public Limas(double alas, double tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    public double luas() {
        return (Math.sqrt(2) / 2) * alas * tinggi + alas * alas;
    }

    public double volume() {
        return (Math.sqrt(2) / 3) * alas * alas * tinggi;
    }

    public double keliling() {
        return alas * 4;
    }
}
