package ru.netology.binops;

public class BinOps {
    public String sum(String a, String b) {
        int arg0 = 0;
        int arg1 = 0;
        int intSum;
        String binSum;

        try {
            arg0 = Integer.parseInt(a, 2);
        } catch (NumberFormatException nfe) {
            System.out.println("Wrong argument \"a\" format.");
            return "";
        }

        try {
            arg1 = Integer.parseInt(b, 2);
        } catch (NumberFormatException nfe) {
            System.out.println("Wrong argument \"b\" format.");
            return "";
        }

        intSum = arg0 + arg1;
        binSum = Integer.toBinaryString(intSum);
        return binSum;
    }

    public String mult(String a, String b) {
        int arg0 = 0;
        int arg1 = 0;
        int intMult;
        String binMult;

        try {
            arg0 = Integer.parseInt(a, 2);
        } catch (NumberFormatException nfe) {
            System.out.println("Wrong argument \"a\" format.");
            return "";
        }

        try {
            arg1 = Integer.parseInt(b, 2);
        } catch (NumberFormatException nfe) {
            System.out.println("Wrong argument \"b\" format.");
            return "";
        }

        intMult = arg0 * arg1;
        binMult = Integer.toBinaryString(intMult);
        return binMult;
    }
}