package checkers;

import javafx.geometry.Point2D;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;



public class Player extends Figures{
    private static Point2D point2D;
    private static Point2D empty;
    private  String name;
    private  Color color;

    public Player(String name, Color color){
        this.name = name;
        this.color = color;
    }

    public  boolean playerPlay(Point2D point2D , Point2D empty, Color color){
        point2D = point2D;
        empty = empty;
        Figures.moveFigure(point2D, empty, this.color);
        return true;
    }

    public String getName() {
        return name;
    }

    public  Color getColor() {
        return this.color;
    }
}
