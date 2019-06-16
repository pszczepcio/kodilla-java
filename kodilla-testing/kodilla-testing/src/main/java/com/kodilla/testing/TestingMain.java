package com.kodilla.testing;

import com.kodilla.testing.user.SimpleUser;
import com.kodilla.testing.calculator.Calculator;


public class TestingMain {
    public static void main(String[] args) {
        SimpleUser simpleuser = new SimpleUser("theForumUser");

        String result = simpleuser.getUsername();

        if (result.equals("theForumUser")) {
            System.out.println("Test ok");
        } else {
            System.out.println("Error!");
        }

        //test jednostkowy
        System.out.println("Test kalkulatora");
        Calculator calculator = new Calculator(1, 2);
        if (calculator.getA() + calculator.getB() == calculator.add()) {
            System.out.println(calculator.getA() + " + " + calculator.getB() + " = " + calculator.add());
        } else {
            System.out.print("Error!");
        }
        if (calculator.getA() - calculator.getB() == calculator.subtract()) {
            System.out.print(calculator.getA() + " - " + calculator.getB() + " = " + calculator.subtract());
        } else {
            System.out.print("Error!");
        }
    }
}
