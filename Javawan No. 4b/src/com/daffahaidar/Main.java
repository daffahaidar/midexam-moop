package com.daffahaidar;

public class Main {
    public static void main(String[] args) {

        Kubus kubus = new Kubus(6);
        Balok balok = new Balok(6, 7, 8);
        Limas limas = new Limas(6, 9);
        Tabung tabung = new Tabung(14, 10);
        Bola bola = new Bola(14);

        System.out.println("Kubus");
        kubus.printAll();
        System.out.println("==========================\n");

        System.out.println("Balok");
        balok.printAll();
        System.out.println("==========================\n");

        System.out.println("Limas");
        limas.printAll();
        System.out.println("==========================\n");

        System.out.println("Tabung");
        tabung.printAll();
        System.out.println("==========================\n");

        System.out.println("Bola");
        bola.printAll();
        System.out.println("==========================\n");

    }
}
