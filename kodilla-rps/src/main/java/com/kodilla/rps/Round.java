package com.kodilla.rps;

import java.util.Scanner;

public class Round {
    private Computer computerMove = new Computer();
    private String computerChoice;
    private String playerChoice;
    private int playerNumber;
    private int computerNumber;

    private Scanner gm = new Scanner(System.in);
    private boolean choseNumber = true;

    public String round() {
        choseNumber = true;
        System.out.println("Please choice a number 1, 2 or 3.");
        while (choseNumber) {
            playerNumber = gm.nextInt();
            if (playerNumber != 1 && playerNumber != 2 && playerNumber != 3) {
                System.out.println("You have chosen the wrong number, please choose again:");
            }else{
                playerChoice = Integer.toString(playerNumber);
                choseNumber = false;
            }
        }
        computerNumber = computerMove.lotDrawing();
        computerChoice = Integer.toString(computerNumber);
        return playerChoice+computerChoice;
    }

    public int getPlayerNumber() {
        return playerNumber;
    }

    public int getComputerNumber() {
        return computerNumber;
    }
}
