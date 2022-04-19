package com.daffahaidar;

import java.util.Scanner;

// Metode Input langsung ke parameter object
// class Main {
// public static void main(String[] args) {
// new Employee("Yohannes", 20, 367123, 12317, "BUMN", 3000000);
// new Employee("Nisa", 19, 3623423, 172347, "BUMN", 2000000);
// new Employee("Joe", 21, 824724, 1234324, 4000000);
// new Employee("Ilham", 22, 8287724, 12345324, 5000000);
// new Employee("Johnny", 23, 723234, 2424324, "Computer Science", 600000);
// new Employee("Santy", 24, 723234, 1234324, "Sastra Inggris", 700000);

// // show all data
// System.out.println("Data Employee");
// System.out.println("==========================");
// for (int i = 0; i < Employee.name.size(); i++) {
// System.out.println("Name : " + Employee.name.get(i));
// System.out.println("Age : " + Employee.age.get(i));
// System.out.println("Penghasilan : " + Employee.salary.get(i));
// System.out.println("NIK : " + Employee.nik.get(i));
// System.out.println("NIM : " + Employee.nim.get(i));
// System.out.println("Departement : " + Employee.departement.get(i));
// System.out.println("==========================");

// }
// }
// }

// Metode User Input
class Main {

    static Scanner input = new Scanner(System.in);
    static Scanner string = new Scanner(System.in);
    static String nama;
    static int umur;
    static int nik;
    static int nim;
    static String departement;
    static int salary;

    public static void main(String[] args) {
        int choose;
        do {
            System.out.println("=======================");
            System.out.println(" Menu ");
            System.out.println("=======================");
            System.out.println("1. Add Data");
            System.out.println("2. View Data");
            System.out.println("3. Exit");
            System.out.println("Choose : ");
            choose = input.nextInt();

            switch (choose) {
                case 1:
                    System.out.print("Input name : ");
                    nama = string.nextLine();
                    System.out.print("Input age : ");
                    umur = input.nextInt();
                    System.out.print("Input NIK : ");
                    nik = input.nextInt();
                    System.out.print("Input NIM : ");
                    nim = input.nextInt();
                    System.out.print("Input departement : ");
                    departement = string.nextLine();
                    System.out.print("Input salary : ");
                    salary = input.nextInt();
                    new Employee(nama, umur, nik, nim, departement, salary);
                    break;

                case 2:
                    for (int i = 0; i < Employee.name.size(); i++) {
                        System.out.println("\nNama : " + Employee.name.get(i));
                        System.out.println("Umur : " + Employee.age.get(i));
                        System.out.println("Penghasilan : " + Employee.salary.get(i));
                        System.out.println("NIK : " + Employee.nik.get(i));
                        System.out.println("NIM : " + Employee.nim.get(i));
                        System.out.println("Jurusan : " + Employee.departement.get(i));
                        System.out.println("=======================");
                    }
                    break;

                default:
                    System.out.println("Exit");
                    break;
            }
        } while (choose != 3);

    }
}
