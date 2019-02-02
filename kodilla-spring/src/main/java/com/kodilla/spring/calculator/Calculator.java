package com.kodilla.spring.calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Calculator {
    @Autowired
    private Display display;

    private double a;
    private double b;

    public double add(double a , double b){
        display.display(a+b);
        return a + b;
    }

    public double sub(double a , double b){
        display.display(a-b);
        return a - b;
    }

    public double mul(double a , double b){
        display.display(a*b);
        return a * b;
    }

    public double div(double a , double b){
        if(b != 0){
            display.display(a/b);
            return a/b;
        }
        return 0;
    }
}
