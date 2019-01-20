package checkers;

import javafx.geometry.Point2D;
import javafx.scene.paint.Color;

public class MoveFigure {
    private final static double STEP = 77.5;
    private static Point2D oldField;
    private static Point2D newField;
    private static int numberFigure;
    private static Color color;

    public static void oneMoveFigure(int number , Point2D point1 , Point2D point2 , Color a) {
        oldField = point1;
        newField = point2;
        numberFigure = number;
        color = a;
        if(color == Color.WHITE){
            if((oldField.getX() - STEP == newField.getX() && oldField.getY() - STEP == newField.getY()) || ((oldField.getX() + STEP == newField.getX()  && oldField.getY() - STEP  == newField.getY()))){
                InitialStateGame.getCollectionOfFigures().get(numberFigure).setCenterX(newField.getX());
                InitialStateGame.getCollectionOfFigures().get(numberFigure).setCenterY(newField.getY());
            }
        }else if(color == Color.BLACK){
            if((oldField.getX() - STEP == newField.getX() && oldField.getY() + STEP == newField.getY()) || (oldField.getX() + STEP == newField.getX()  && oldField.getY() + STEP  == newField.getY())){
                InitialStateGame.getCollectionOfFigures().get(numberFigure).setCenterX(newField.getX());
                InitialStateGame.getCollectionOfFigures().get(numberFigure).setCenterY(newField.getY());
            }
        }
    }
    public static int getNumberFigure() {
        return numberFigure;
    }
}
