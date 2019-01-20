package checkers;

import javafx.geometry.Point2D;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.StrokeType;

import java.util.ArrayList;
import java.util.List;

public class creatKingFigure {
    private static List<Circle>king = new ArrayList<Circle>();
    private static int numberList = 0;
    private static Player player;
    private final static double RADIUS = 35.0;
    private static double x;
    private static double y;
    private static Point2D A1 = new Point2D(135.0 , 677.5);
    private static Point2D C1 = new Point2D(290.0 , 677.5);
    private static Point2D E1 = new Point2D(445.0 , 677.5);
    private static Point2D G1 = new Point2D(600.0 , 677.5);
    private static Point2D B8 = new Point2D(212.5 , 135);
    private static Point2D D8 = new Point2D(367.5 , 135);
    private static Point2D F8 = new Point2D(522.5 , 135);
    private static Point2D H8 = new Point2D(677.5 , 135);

    public static void checkFiguresFinishFields(Player a) {
        player = a;
        if (player.getColor() == Color.WHITE) {
            for (int i = 0; i < InitialStateGame.getCollectionOfFigures().size(); i++) {
                if ((InitialStateGame.getCenterXFigure(i) == H8.getX() && InitialStateGame.getCenterYFigure(i) == H8.getY() || InitialStateGame.getCenterXFigure(i) == F8.getX() && InitialStateGame.getCenterYFigure(i) == F8.getY() || InitialStateGame.getCenterXFigure(i) == D8.getX() && InitialStateGame.getCenterYFigure(i) == D8.getY() || InitialStateGame.getCenterXFigure(i) == B8.getX() && InitialStateGame.getCenterYFigure(i) == B8.getY()) && InitialStateGame.getCollectionOfFigures().get(i).getFill() == player.getColor()) {
                    InitialStateGame.getCollectionOfFigures().get(i).setStrokeType(StrokeType.INSIDE);
                    InitialStateGame.getCollectionOfFigures().get(i).setStroke(Color.BLACK);
                    InitialStateGame.getCollectionOfFigures().get(i).setStrokeWidth(5);
                    king.add(numberList , InitialStateGame.getCollectionOfFigures().get(i));
                    InitialStateGame.getCollectionOfFigures().remove(i);
                    Checkers.getRoot().getChildren().remove(i);
                    Checkers.getRoot().getChildren().add(king.get(numberList));
                    ++numberList;

                }
            }
        }
        if (player.getColor() == Color.BLACK) {
            for (int i = 0; i < InitialStateGame.getCollectionOfFigures().size(); i++) {
                if ((InitialStateGame.getCenterXFigure(i) == A1.getX() && InitialStateGame.getCenterYFigure(i) == A1.getY() || InitialStateGame.getCenterXFigure(i) == C1.getX() && InitialStateGame.getCenterYFigure(i) == C1.getY() || InitialStateGame.getCenterXFigure(i) == E1.getX() && InitialStateGame.getCenterYFigure(i) == E1.getY() || InitialStateGame.getCenterXFigure(i) == G1.getX() && InitialStateGame.getCenterYFigure(i) == G1.getY()) && InitialStateGame.getCollectionOfFigures().get(i).getFill() == player.getColor()) {
                    InitialStateGame.getCollectionOfFigures().get(i).setStrokeType(StrokeType.INSIDE);
                    InitialStateGame.getCollectionOfFigures().get(i).setStroke(Color.WHITE);
                    InitialStateGame.getCollectionOfFigures().get(i).setStrokeWidth(5);
                }
            }
        }
    }
    public static void creatKing(double x , double y , Color color){
        Circle circle = new Circle(x , y , RADIUS , color);
        getKing().add(circle);
    }

    public static List<Circle> getKing() {
        return king;
    }
}
