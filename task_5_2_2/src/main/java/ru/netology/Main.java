package ru.netology;

import ru.netology.binops.BinOps;

public class Main {
    public static void main(String[] args) {
        BinOps bins = new BinOps();

        // Sum test
        String binSum;
        binSum = bins.sum("10", "01");
        System.out.println("0b10 plus 0b01 is 0b" + binSum);
        binSum = bins.sum("11", "01");
        System.out.println("0b10 plus 0b01 is 0b" + binSum);
        binSum = bins.sum("ab", "11");
        binSum = bins.sum("10", "cd");
        System.out.println();

        // Multiply test
        String binMult;
        binMult = bins.mult("10", "01");
        System.out.println("0b10 multiply 0b01 is 0b" + binMult);
        binMult = bins.mult("11", "10");
        System.out.println("0b11 multiply 0b10 is 0b" + binMult);
        binMult = bins.mult("00", "10");
        System.out.println("0b00 multiply 0b10 is 0b" + binMult);
        binMult = bins.mult("ef", "01");
        binMult = bins.mult("10", "gh");
    }
}