package com.kodilla.rps;
import java.util.Random;

public class Computer {
    private static String computer = "Computer";
    private Random generator = new Random();
    private int numberChoice;

    public int lotDrawing(){
        numberChoice = generator.nextInt(2) + 1;
        return numberChoice;
    }

    public static String getComputer() {
        return computer;
    }
}
