package ru.netology.calculator;

public class IntsCalculator implements Ints {
    protected final Calculator target;

    public IntsCalculator() { this.target = new Calculator(); }

    @Override
    public int sum(int arg0, int arg1) {
        Calculator.Formula sumFormula = target.newFormula();
        double result = sumFormula
                .addOperand(arg0)
                .addOperand(arg1)
                .calculate(Calculator.Operation.SUM)
                .result();
        return (int)result;
    }

    @Override
    public int mult(int arg0, int arg1) {
        Calculator.Formula multFormula = target.newFormula();
        double result = multFormula
                .addOperand(arg0)
                .addOperand(arg1)
                .calculate(Calculator.Operation.MULT)
                .result();
        return (int)result;
    }

    @Override
    public int pow(int a, int b) {
        Calculator.Formula powFormula = target.newFormula();
        double result = powFormula
                .addOperand(a)
                .addOperand(b)
                .calculate(Calculator.Operation.POW)
                .result();
        return (int)result;
    }
}