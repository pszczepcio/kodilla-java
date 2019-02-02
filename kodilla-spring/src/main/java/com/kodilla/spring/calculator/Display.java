package com.kodilla.spring.calculator;

import org.springframework.stereotype.Component;

@Component
public class Display {
    private double val;
    public void display(double val){
        System.out.println(val);
    }
}
