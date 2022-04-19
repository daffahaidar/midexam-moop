package com.daffahaidar;

public class Tabung extends Shape {
    // instansiasi variables
    private double jari;
    private double tinggi;

    // constructor
    public Tabung(double diameter, double tinggi) {
        this.jari = (diameter / 2);
        this.tinggi = tinggi;
    }

    public double luas() {
        return Math.PI * Math.pow(jari, 2);
    }

    public double volume() {
        return Math.PI * Math.pow(jari, 2) * tinggi;
    }

    public double keliling() {
        return 2 * Math.PI * jari + 2 * Math.PI * Math.pow(jari, 2);
    }
}
