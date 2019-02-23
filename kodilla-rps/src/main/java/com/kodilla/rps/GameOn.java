package com.kodilla.rps;

public class GameOn {
    private DownloadingData downloadingData;
    private GameSupport gameSupport;
    private static boolean end;

    public boolean playGame() {
        ElementsOfGame.creatAllowedMovements();
        ElementsOfGame.elementsOfGame();
        downloadingData = new DownloadingData();
        if(downloadingData.downLoadingData() != null) {
            gameSupport = new GameSupport(downloadingData.getPlayer());
            GameResult gameResult = gameSupport.startGame();
            if (gameResult.getWinningRoundsByPlayer() > gameResult.getWinningRoundByComputer()) {
                System.out.println("The winner is " + downloadingData.getPlayer().getPlayerName());
                end = true;
            } else if (gameResult.getWinningRoundByComputer() == gameResult.getWinningRoundsByPlayer()) {
                System.out.println("Dead-heat");
                end = true;
            } else if (gameResult.getWinningRoundsByPlayer() < gameResult.getWinningRoundByComputer()) {
                System.out.println("The winner is: " + Computer.getComputer());
                end = true;
            }
        }
        return end;
    }
}
