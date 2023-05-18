package ru.netology;

import ru.netology.calculator.Ints;
import ru.netology.calculator.IntsCalculator;

public class Main {
    public static void main(String[] args) {
        Ints calc = new IntsCalculator();

        System.out.println("2 plus 2 is " + calc.sum(2, 2));
        System.out.println("10 plus 22 is " + calc.sum(10, 22));
        System.out.println("2 pow 10 is " + calc.pow(2, 10));
    }
}