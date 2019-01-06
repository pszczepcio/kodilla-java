package checkers;

import javafx.geometry.Point2D;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;



public class Player extends Figures{
    private  static Point2D point2D;
    private  static Point2D empty;

    public Player(){}

    public static boolean playerPlay(Point2D point2D , Point2D empty ){
        point2D = point2D;
        empty = empty;
        Figures.moveFigure(point2D,empty);
        return true;

    }
}
