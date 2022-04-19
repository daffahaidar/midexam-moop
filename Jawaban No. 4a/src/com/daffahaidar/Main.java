package com.daffahaidar;

public class Main {
    public static void main(String[] args) {

        String[] words1 = { "1", "2", "3", "4", "5", "7" };
        String[] words2 = { "Number : 1", "Number :2", "Number: 3" };
        String[] words3 = { "Number 4.52 is the data", "Number 24.52 is the data" };
        String[] words4 = { "I would like to sum up 4.52, and uhh 679.02, and then 300.54 also 1000",
                "Oh I forget, I want to sum -4300 as well" };
        String words5 = "First3452Second45.67Third1234Fourth90.222";

        SumData sumData = new SumData();
        System.out.println("Hasil penjumlahan angka pada string 1: " + sumData.simpleparse(words1));
        System.out.println("Hasil penjumlahan angka pada string 2: " + sumData.stringbuilder(words2));
        System.out.println("Hasil penjumlahan angka pada string 3: " + sumData.regex(words3));
        System.out.println("Hasil penjumlahan angka pada string 4: " + sumData.regex(words4));
        System.out.println("Hasil penjumlahan angka pada string 5: " + sumData.regex(words5));

    }

}
