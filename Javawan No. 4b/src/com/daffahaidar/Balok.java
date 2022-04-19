package com.daffahaidar;

public class Balok extends Shape {
    // instansiasi variables
    private double panjang;
    private double lebar;
    private double tinggi;

    // constructor
    public Balok(double panjang, double lebar, double tinggi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }

    public double luas() {
        return 2 * (panjang * lebar + panjang * tinggi + lebar * tinggi);
    }

    public double volume() {
        return panjang * lebar * tinggi;
    }

    public double keliling() {
        return 4 * (panjang + lebar + tinggi);
    }
}
