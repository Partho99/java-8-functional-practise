package com.functionalprogramming.lambda.demo;

public class CalculatorImpl implements Calculator{
    public CalculatorImpl(int x){

        System.out.println("calling constructor block" + x);
    }
    static {
        System.out.println("calling static block");
    }
    @Override
    public void switchOn() {
        System.out.println("Switch ON");
    }

//    Calculator calculator = () -> System.out.println("Switch ON");
}
