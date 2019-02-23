package com.kodilla.rps;


public class ScoreRound {
    private final static String CASE1 = "11";
    private final static String CASE2 = "12";
    private final static String CASE3 = "13";
    private final static String CASE4 = "21";
    private final static String CASE5 = "22";
    private final static String CASE6 = "23";
    private final static String CASE7 = "31";
    private final static String CASE8 = "32";
    private final static String CASE9 = "33";
    private Round round;
    private static int winningPlayerRounds = 0;
    private static int winningComputerRounds = 0;

    public void checkScoreRound(String choicePlayers){
        ElementsOfGame.creatAllowedMovements();
        switch (choicePlayers){
            case CASE1: {
                System.out.println(ElementsOfGame.getAllowedMovements().get(CASE1));
                System.out.println();
                winningComputerRounds++;
                winningPlayerRounds++;
                break;
            }
            case CASE2:{
                System.out.println(ElementsOfGame.getAllowedMovements().get(CASE2));
                System.out.println();
                winningComputerRounds++;
                break;
            }
            case CASE3: {
                System.out.println(ElementsOfGame.getAllowedMovements().get(CASE3));
                System.out.println();
                winningPlayerRounds++;
                break;
            }
            case CASE4: {
                System.out.println(ElementsOfGame.getAllowedMovements().get(CASE4));
                System.out.println();
                winningPlayerRounds++;
                break;
            }
            case CASE5: {
                System.out.println(ElementsOfGame.getAllowedMovements().get(CASE5));
                System.out.println();
                winningComputerRounds++;
                winningPlayerRounds++;
                break;
            }
            case CASE6: {
                System.out.println(ElementsOfGame.getAllowedMovements().get(CASE6));
                System.out.println();
                winningComputerRounds++;
                break;
            }
            case CASE7: {
                System.out.println(ElementsOfGame.getAllowedMovements().get(CASE7));
                System.out.println();
                winningComputerRounds++;
                break;
            }
            case CASE8: {
                System.out.println(ElementsOfGame.getAllowedMovements().get(CASE8));
                System.out.println();
                winningPlayerRounds++;
                break;
            }
            case CASE9: {
                System.out.println(ElementsOfGame.getAllowedMovements().get(CASE9));
                System.out.println();
                winningComputerRounds++;
                winningPlayerRounds++;
                break;
            }
        }
    }

    public static int getWinningPlayerRounds() {
        return winningPlayerRounds;
    }

    public static int getWinningComputerRounds() {
        return winningComputerRounds;
    }

    public static void setWinningPlayerRounds(int winningPlayerRounds) {
        ScoreRound.winningPlayerRounds = winningPlayerRounds;
    }

    public static void setWinningComputerRounds(int winningComputerRounds) {
        ScoreRound.winningComputerRounds = winningComputerRounds;
    }
}
