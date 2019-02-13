package nought.and.crosses.play;

import javafx.geometry.Point2D;
import javafx.scene.input.MouseEvent;


public class PlayWithComputer {
    private Player playerOne;
    private Player computer;
    private Point2D point;
    private boolean winner;
    private static int countClick;
    private static int removeClick;
    private StateOfTheGame stateOfTheGame;
    private String name;
    private double x,y;

    public PlayWithComputer(String name) {
        this.name = name;
        playerOne = new Player(this.name, "X");
        computer = new Player("computer", "O");
    }

    public void movePlayer(double x , double y) {
        if (countClick % 2 == 0) {
            ConditionsForBoard.checkConditionsForBoard(x, y, playerOne.getSign());
            stateOfTheGame = new StateOfTheGame(ConditionsForBoard.getSignList());
            winner = stateOfTheGame.checkStateOfTheGame();
            if (winner) {
                System.out.println("The winner is player: " + playerOne.getName());
                NoughtAndCrosses.getRoot().removeEventHandler(MouseEvent.MOUSE_CLICKED, NoughtAndCrosses.getMouseClicked());
            }
            countClick = countClick + 1 - getRemoveClick();
            setRemoveClick(0);
            System.out.println("Move counter is: " + countClick);
            if(countClick == 9){
                System.out.println("remis");
                NoughtAndCrosses.getRoot().removeEventHandler(MouseEvent.MOUSE_CLICKED, NoughtAndCrosses.getMouseClicked());
            }
        }
    }

    public void moveComputer() {
        if (countClick % 2 != 0) {
            point = Computer.countMove(ConditionsForBoard.getSignList());
            ConditionsForBoard.checkConditionsForBoard(point.getX(), point.getY(), computer.getSign());
            stateOfTheGame = new StateOfTheGame(ConditionsForBoard.getSignList());
            winner = stateOfTheGame.checkStateOfTheGame();
            if (stateOfTheGame.checkStateOfTheGame()) {
                System.out.println("The winner is player: " + computer.getName());
                NoughtAndCrosses.getRoot().removeEventHandler(MouseEvent.MOUSE_CLICKED, NoughtAndCrosses.getMouseClicked());
            }
            countClick += 1;
            System.out.println("Move counter is: " + countClick);
        }
        if(countClick == 9){
            System.out.println("remis");
            NoughtAndCrosses.getRoot().removeEventHandler(MouseEvent.MOUSE_CLICKED, NoughtAndCrosses.getMouseClicked());
        }
    }

    public static int getRemoveClick() {
        return removeClick;
    }

    public static void setRemoveClick(int removeClick) {
        PlayWithComputer.removeClick = removeClick;
    }
}
