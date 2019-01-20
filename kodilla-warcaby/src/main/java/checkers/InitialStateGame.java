package checkers;

import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import java.util.ArrayList;
import java.util.List;

public class InitialStateGame {
    private final static double RADIUS = 35.0;
    private static int index1 = 0;
    private static Circle whitePawn;
    private static Circle blackPawn;
    private static List<Circle> CollectionOfFigures = new ArrayList<Circle>();

    public static void initialGame() {
        for (int i = 4; i < 29; ) {
            blackPawn = new Circle(Board.getX(i), Board.getY(i), RADIUS, Color.BLACK);
            CollectionOfFigures.add( blackPawn);
            i += 8;
            ++index1;
        }
        for(int i = 0 ; i < 25 ;){
            blackPawn = new Circle(Board.getX(i), Board.getY(i), RADIUS, Color.BLACK);
            CollectionOfFigures.add( blackPawn);
            i += 8;
            ++index1;
        }

        for (int i = 5; i < 30; ) {
            blackPawn = new Circle(Board.getX(i), Board.getY(i), RADIUS, Color.BLACK);
            CollectionOfFigures.add( blackPawn);
            i += 8;
            ++index1;
        }

        for (int i = 2; i < 27; ) {
            whitePawn = new Circle(Board.getX(i) , Board.getY(i), RADIUS , Color.WHITE);
            CollectionOfFigures.add(index1,whitePawn);
            i += 8;
            ++index1;
        }

        for (int i = 7; i < 32; ) {
            whitePawn = new Circle(Board.getX(i) , Board.getY(i), RADIUS , Color.WHITE);
            CollectionOfFigures.add(index1,whitePawn);
            i += 8;
            ++index1;
        }

        for (int i = 3; i < 28; ) {
            whitePawn = new Circle(Board.getX(i) , Board.getY(i), RADIUS , Color.WHITE);
            CollectionOfFigures.add(index1,whitePawn);
            i += 8;
            ++index1;
        }
    }
    public static List<Circle> getCollectionOfFigures() {
        return CollectionOfFigures;
    }
    public static double getCenterXFigure(int i){
        return CollectionOfFigures.get(i).getCenterX();
    }
    public static double getCenterYFigure(int i){
        return CollectionOfFigures.get(i).getCenterY();
    }
}