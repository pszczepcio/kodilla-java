package com.kodilla.rps;

public class Player {
    private String playerName;
    private int numberOfRounds;

    public Player(String playerName, int numberOfWinningRounds) {
        this.playerName = playerName;
        this.numberOfRounds = numberOfWinningRounds;
    }

    public String getPlayerName() {
        return playerName;
    }

    public int getNumberOfRounds() {
        return numberOfRounds;
    }
}
