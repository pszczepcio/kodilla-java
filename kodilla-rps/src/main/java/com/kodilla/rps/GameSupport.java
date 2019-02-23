package com.kodilla.rps;

public class GameSupport {
    private Round checkRound = new Round();
    private ScoreRound scoreRound = new ScoreRound();
    private String keyValueFromAllowedMovements = "";
    private Player player;
    private int round = 0;
    private boolean checkAllRounds = true;

    public GameSupport(Player player) {
        this.player = player;
    }

    public GameResult startGame() {
        ElementsOfGame.elementsOfGame();
        while (checkAllRounds) {
            round++;
            keyValueFromAllowedMovements = checkRound.round();
            System.out.println("Number round: " + round);
            System.out.print(player.getPlayerName() + " selected : ");
            System.out.println(ElementsOfGame.getListOfElementsInGame().get((checkRound.getPlayerNumber() -1)));
            System.out.println("Computer selected : " + ElementsOfGame.getListOfElementsInGame().get(checkRound.getComputerNumber() - 1));
            scoreRound.checkScoreRound(keyValueFromAllowedMovements);
            System.out.println("The result of the round:");
            System.out.print(player.getPlayerName() +": " + ScoreRound.getWinningPlayerRounds() + " - ");
            System.out.println(Computer.getComputer() + ": " + ScoreRound.getWinningComputerRounds());
            System.out.println();
            if(round == player.getNumberOfRounds()){
                System.out.println("Total score: ");
                System.out.println(player.getPlayerName() + " : " + ScoreRound.getWinningPlayerRounds());
                System.out.println(Computer.getComputer() + " : " + ScoreRound.getWinningComputerRounds());
                checkAllRounds = false;
            }
        }
        return new GameResult(ScoreRound.getWinningPlayerRounds(), ScoreRound.getWinningComputerRounds());
    }
}
