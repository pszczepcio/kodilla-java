package checkers;

import javafx.geometry.Point2D;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import sun.plugin2.os.windows.SECURITY_ATTRIBUTES;

import java.util.ArrayList;
import java.util.List;

public class Beat {
    private final static double STEP = 77.5;
    private final static double TWOSTEP = 155;
    private static Point2D beatenWhite;
    private static Point2D beatenBlack;
    private static Point2D figureField;
    private static Point2D nextField;
    private static int removeFigureBlack;
    private static int removeFigureBlack1;
    private static int removeFigureBlack2;
    private static int removeFigureWhite;
    private static int removeFigureWhite1;
    private static int removeFigureWhite2;
    private static int number;
    private static double blackXLeft;
    private static double blackXRight;
    private static double blackY;
    private static double whiteXLeft;
    private static double whiteXRight;
    private static double whiteY;
    private static double doubleMovementY;
    private static double oponentMoveY;
    private static boolean value5;
    private static boolean value6;
    private static boolean value7;
    private static boolean value8;
    private static Color figureColor;
    private static Color colorOpponent;
    private static Player player;

    public static void calculatingTheWhippingMovement(Player a){
        player = a;
        for(int i = 0 ; i < InitialStateGame.getCollectionOfFigures().size() ; i++){
            if(player.getColor() == Color.WHITE){
                colorOpponent = Color.BLACK;
                oponentMoveY = InitialStateGame.getCenterYFigure(i) + STEP;
                doubleMovementY = InitialStateGame.getCenterYFigure(i) - TWOSTEP;
            }else if(player.getColor() == Color.BLACK){
                colorOpponent = Color.WHITE;
                oponentMoveY = InitialStateGame.getCenterYFigure(i) - STEP;
                doubleMovementY = InitialStateGame.getCenterYFigure(i) + TWOSTEP;
            }
            if((InitialStateGame.getCollectionOfFigures().get(i).getFill() == player.getColor() && (CheckFieldBoard.checkFreeField(new Point2D(InitialStateGame.getCenterXFigure(i) - TWOSTEP , doubleMovementY)) != null || CheckFieldBoard.checkFreeField(new Point2D(InitialStateGame.getCenterXFigure(i) + TWOSTEP , doubleMovementY)) != null)) &&(InitialStateGame.getCollectionOfFigures().get(i).getFill() == colorOpponent && (CheckFieldBoard.checkFreeField(new Point2D(InitialStateGame.getCenterXFigure(i) - STEP , oponentMoveY)) == null || CheckFieldBoard.checkFreeField(new Point2D(InitialStateGame.getCenterXFigure(i) + STEP , oponentMoveY)) == null))){
                System.out.println("you have beat");
            }
        }
    }

    public static boolean beating(int a , Point2D point1 , Point2D point2 , Color color){
        figureField = point1;
        nextField = point2;
        number = a;
        figureColor = color;
        if(figureColor == Color.WHITE){
            blackXLeft = figureField.getX() - STEP;
            blackXRight = figureField.getX() + STEP;
            blackY = figureField.getY() - STEP;
            for(int i = 0 ; i < InitialStateGame.getCollectionOfFigures().size() ; i++){
                if((InitialStateGame.getCenterXFigure(i) == blackXRight && InitialStateGame.getCenterYFigure(i) == blackY) && InitialStateGame.getCollectionOfFigures().get(i).getFill().equals(Color.BLACK)) /*||(InitialStateGame.getCenterXFigure(i) == blackXLeft && InitialStateGame.getCenterYFigure(i) == blackY)) && InitialStateGame.getCollectionOfFigures().get(i).getFill().equals(Color.BLACK)*/{
                    removeFigureBlack1 = i;
                    value5 = true;
                }
                if((InitialStateGame.getCenterXFigure(i) == blackXLeft && InitialStateGame.getCenterYFigure(i) == blackY) && InitialStateGame.getCollectionOfFigures().get(i).getFill().equals(Color.BLACK)){
                    removeFigureBlack2 = i;
                    value6 = true;
                }
            }
            if(figureField.getX() + TWOSTEP == nextField.getX() && figureField.getY() - TWOSTEP == nextField.getY() && value5){
                InitialStateGame.getCollectionOfFigures().get(number).setCenterX(nextField.getX());
                InitialStateGame.getCollectionOfFigures().get(number).setCenterY(nextField.getY());
                InitialStateGame.getCollectionOfFigures().remove(removeFigureBlack1);
                removeFigureBlack = removeFigureBlack1;
                value5 = false;
                return true;
            }else if(figureField.getX() - TWOSTEP == nextField.getX() && figureField.getY() - TWOSTEP == nextField.getY() && value6){
                InitialStateGame.getCollectionOfFigures().get(number).setCenterX(nextField.getX());
                InitialStateGame.getCollectionOfFigures().get(number).setCenterY(nextField.getY());
                InitialStateGame.getCollectionOfFigures().remove(removeFigureBlack2);
                removeFigureBlack = removeFigureBlack2;
                value6 = false;
                return true;
            }
        }

        if(figureColor == Color.BLACK){
            whiteXLeft = figureField.getX() - STEP;
            whiteXRight = figureField.getX() + STEP;
            whiteY = figureField.getY() + STEP;
            for(int j = 0 ; j < InitialStateGame.getCollectionOfFigures().size() ; j++){
                if((InitialStateGame.getCollectionOfFigures().get(j).getFill().equals(Color.WHITE)) && (InitialStateGame.getCenterXFigure(j) == whiteXLeft && InitialStateGame.getCenterYFigure(j) == whiteY)) /*((InitialStateGame.getCenterXFigure(j) == whiteXLeft && InitialStateGame.getCenterYFigure(j) == whiteY) || (InitialStateGame.getCenterXFigure(j) == whiteXRight && InitialStateGame.getCenterYFigure(j) == whiteY)))*/{
                    removeFigureWhite1 = j;
                    value5 = true;
                }
                if((InitialStateGame.getCollectionOfFigures().get(j).getFill().equals(Color.WHITE) && (InitialStateGame.getCenterXFigure(j) == whiteXRight && InitialStateGame.getCenterYFigure(j) == whiteY))){
                    removeFigureWhite2 = j;
                    value6 = true;
                }
            }
            if(figureField.getX() - TWOSTEP == nextField.getX() && figureField.getY() + TWOSTEP == nextField.getY() && value5){
                InitialStateGame.getCollectionOfFigures().get(number).setCenterX(nextField.getX());
                InitialStateGame.getCollectionOfFigures().get(number).setCenterY(nextField.getY());
                InitialStateGame.getCollectionOfFigures().remove(removeFigureWhite1);
                removeFigureWhite = removeFigureWhite1;
                value5 = false;
                return true;
            }else if(figureField.getX() + TWOSTEP == nextField.getX() && figureField.getY() + TWOSTEP == nextField.getY() && value6){
                InitialStateGame.getCollectionOfFigures().get(number).setCenterX(nextField.getX());
                InitialStateGame.getCollectionOfFigures().get(number).setCenterY(nextField.getY());
                InitialStateGame.getCollectionOfFigures().remove(removeFigureWhite2);
                removeFigureWhite = removeFigureWhite2;
                value6 = false;
                return true;
            }
        }
        return false;
    }

    public static int getRemoveFigureBlack() {
        return removeFigureBlack;
    }

    public static int getRemoveFigureWhite() {
        return removeFigureWhite;
    }
}
