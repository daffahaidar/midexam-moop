package com.daffahaidar;

public class Bola extends Shape {
    // instansiasi variabel
    private double diameter;

    // constructor
    public Bola(double diameter) {
        this.diameter = diameter;
    }

    public double luas() {
        return Math.PI * Math.pow((diameter / 2), 2);
    }

    public double keliling() {
        return Math.PI * diameter;
    }

    public double volume() {
        return (4 / 3) * Math.PI * Math.pow((diameter / 2), 3);
    }

}
