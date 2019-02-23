package com.kodilla.rps;

public class GameResult {
    private int winningRoundsByPlayer;
    private int winningRoundByComputer;

    public GameResult(int winningRoundsByPlayer, int winningRoundByComputer) {
        this.winningRoundsByPlayer = winningRoundsByPlayer;
        this.winningRoundByComputer = winningRoundByComputer;
    }

    public int getWinningRoundsByPlayer() {
        return winningRoundsByPlayer;
    }

    public int getWinningRoundByComputer() {
        return winningRoundByComputer;
    }
}
