package nought.and.crosses.play;

import javafx.scene.input.MouseEvent;

public class Play {
    private static int countClick;
    private static int removeClick;
    private boolean winner = false;

    public void play(double x, double y) {
        Player playerOne = new Player("Piotrek", "X");
        Player playerTwo = new Player("Mariola", "0");
        Player computer = new Player("Computer", "0");

        countClick = countClick + 1 - getRemoveClick();
        setRemoveClick(0);

        if (countClick % 2 != 0) {
             ConditionsForBoard.checkConditionsForBoard(x, y, playerOne.getSign());
             StateOfTheGame stateOfTheGame = new StateOfTheGame(ConditionsForBoard.getSignList());
             winner = stateOfTheGame.checkStateOfTheGame();
             if(winner) {
                 System.out.println("The winner is player: " + playerOne.getName());
                 NoughtAndCrosses.getRoot().removeEventHandler(MouseEvent.MOUSE_CLICKED , NoughtAndCrosses.getMouseClicked());
             }
        }else if(countClick%2==0){
                ConditionsForBoard.checkConditionsForBoard(x, y, playerTwo.getSign());
                StateOfTheGame stateOfTheGame = new StateOfTheGame(ConditionsForBoard.getSignList());
                winner = stateOfTheGame.checkStateOfTheGame();
                if(stateOfTheGame.checkStateOfTheGame()) {
                    System.out.println("The winner is player: " + playerTwo.getName());
                    NoughtAndCrosses.getRoot().removeEventHandler(MouseEvent.MOUSE_CLICKED , NoughtAndCrosses.getMouseClicked());
                }
        }
        if(countClick == 9){
            System.out.println("Remis");
        }

    }

    public static int getRemoveClick() {
        return removeClick;
    }

    public static void setRemoveClick(int removeClick) {
        Play.removeClick = removeClick;
    }

}
