package com.daffahaidar;

public abstract class Shape {
    // abstract method untuk luas
    public abstract double luas();

    // abstract method untuk keliling
    public abstract double keliling();

    // abstract method untuk volume
    public abstract double volume();

    // method untuk menampilkan hasil luas
    public void printluas() {
        System.out.printf("Luas: %.2f\n", luas());
    }

    // method untuk menampilkan hasil keliling
    public void printkeliling() {
        System.out.printf("Keliling: %.2f\n", keliling());
    }

    // method untuk menampilkan hasil volume
    public void printVolume() {
        System.out.printf("Volume: %.2f\n", volume());
    }

    // method untuk menampilkan hasil luas dan keliling
    public void printAll() {
        printVolume();
        printluas();
        printkeliling();
    }
}
