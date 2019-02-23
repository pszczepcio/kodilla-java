package com.kodilla.rps;

public class NextOrFinishGame {
    public static boolean finishGame(String nextOrFinish){
        if(nextOrFinish.equals("x") || nextOrFinish.equals("X")){
            return true;
        }
        return false;
    }

    public static boolean nextGame(String nextOrFinish){
        if(nextOrFinish.equals("n") || nextOrFinish.equals("N")){
            ScoreRound.setWinningPlayerRounds(0);
            ScoreRound.setWinningComputerRounds(0);
            return false;
        }
        return true;
    }
}
