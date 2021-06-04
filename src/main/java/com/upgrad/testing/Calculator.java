package com.upgrad.testing;

public class Calculator {

    public int add(int a, int b){
        return a+b;
    }
    public int subtract(int a, int b){
        return a-b;
    }
    public int multiply(int a, int b){
        return a*b;
    }
    public int divide(int a, int b){
        return a/b;
    }

    public int someMethodWithLoop(int number){
        int sum = 0;
        for(int i = 0; i <= number; i++){
            sum+= number;
        }
        return sum;
    }
}
