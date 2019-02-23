package com.kodilla.rps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ElementsOfGame {
    private static final List<String> listOfElementsInGame = new ArrayList<>();
    private static final Map<String, String> allowedMovements = new HashMap<>();

    public static void elementsOfGame() {
        listOfElementsInGame.add(0,"Stone");
        listOfElementsInGame.add(1,"Paper");
        listOfElementsInGame.add(2,"Scissors");
        listOfElementsInGame.add(3,"Are you sure you want to end the game?");
        listOfElementsInGame.add(4,"Are you sure you want to end your current game?");
    }

    public static void creatAllowedMovements(){
        allowedMovements.put("11", "Dead-heat");
        allowedMovements.put("12", "The paper cover stone");
        allowedMovements.put("13", "Stone crushes scissors");
        allowedMovements.put("21", "The paper cover stone");
        allowedMovements.put("22", "Dead-heat");
        allowedMovements.put("23", "The scissors cut paper");
        allowedMovements.put("33", "Dead-heat");
        allowedMovements.put("31", "Stone cruhes scissors");
        allowedMovements.put("32", "The scissors cut paper");
    }

    public static List<String> getListOfElementsInGame() {
        return listOfElementsInGame;
    }

    public static Map<String, String> getAllowedMovements() {
        return allowedMovements;
    }


}
