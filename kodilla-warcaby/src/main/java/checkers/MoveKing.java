package checkers;

import javafx.geometry.Point2D;
import javafx.scene.paint.Color;

public class MoveKing {
    private final static double STEP = 77.5;
    private static Point2D point;
    private static Point2D nextPoint;
    private static Color color;

    public static void moveKingRight(Point2D point1 , Point2D point2 , Color color1){
        point = point1;
        nextPoint = point2;
        color = color1;

    }
}
