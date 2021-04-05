package com.kodilla;

public class Calculator {

    private int addAToB(int a, int b){
        return a + b;
    }

    public int subtractAFromB(int a, int b) {
        return b - a;
    }

    public static void main(String[] args) {

        int a = 3;
        int b = 5;

        Calculator calculator = new Calculator();
        int resultAdd = calculator.addAToB(a, b);
        int resultSubtract = calculator.subtractAFromB(a, b);

        System.out.println("The result of " + a + " + " + b + " = " + resultAdd);
        System.out.println();
        System.out.println("The result of " + b + " - " + a + " = " + resultSubtract);
    }

}
