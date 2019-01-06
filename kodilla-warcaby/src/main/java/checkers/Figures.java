package checkers;

import javafx.geometry.Point2D;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;

import java.util.ArrayList;
import java.util.List;

public class Figures extends Pane {
    private final static double RADIUS = 35.0;
    private final static double HALFSTEP = 38.75;
    private final static double STEP = 77.5;
    private final static Color COLORBLACK = Color.BLACK;
    private final static Color COLORWHITE = Color.WHITE;
    private static Circle circle;
    private static List<Circle> allFigures = new ArrayList<Circle>();
    private static Point2D point;
    private static boolean value;
    private static boolean value1;
    private static int a;



    public static void startBlackFigures(List<Point2D> board){
        for(int i = 0 ; i < 12 ; i++){
            circle = new Circle(board.get(i).getX() , board.get(i).getY(), RADIUS , COLORBLACK);
            allFigures.add(circle);
        }
    }

    public static void startWhiteFigures(List<Point2D> board){
        for(int i = 20 ; i < Board.getChessFieldsBlack().size() ; i ++){
            circle = new Circle(board.get(i).getX() , board.get(i).getY() , RADIUS , COLORWHITE);
            allFigures.add(circle);
        }
    }

    public static void printCoordniateAllFigures(){
        System.out.println("Współrzedne pionków wynoszą: ");
        for(int i = 0 ; i < allFigures.size() ; i++){
            System.out.println(i + ". " + "x = " + allFigures.get(i).getCenterX() + ", y = " + allFigures.get(i).getCenterY());
        }
    }

    public static Point2D CoordniatesFigure(Point2D boardPoint, Color color){
            if(boardPoint != null) {
                for (int i = 0; i < getAllFigures().size(); i++) {
                    if (((getCenterXFigure(i) - RADIUS) < boardPoint.getX()) && ((getCenterXFigure(i) + RADIUS) > boardPoint.getX()) && ((getCenterYFigure(i) - RADIUS) < boardPoint.getY()) && ((getCenterYFigure(i) + RADIUS) > boardPoint.getY()) && (getColorFigure(i) == color)) {
                        point = new Point2D(getCenterXFigure(i), getCenterYFigure(i));
                        return point;
                    }
                }
            }
        return null;
    }

    public static Point2D NextField(Point2D emptyfield){
        if(emptyfield != null){
            for(int i = 0 ; i < getAllFigures().size() ; i++){
                if((getCenterXFigure(i) == emptyfield.getX()) && (getCenterYFigure(i) == emptyfield.getY())){
                    return null;
                }
            }
        }
        return emptyfield;
    }

    public static boolean moveFigure(Point2D boardPoint , Point2D boardPoint2, Color color ){
        if(boardPoint != null && boardPoint2 != null){
            for(int i = 0 ; i < getAllFigures().size() ; i++){
                if(boardPoint.getX() == getCenterXFigure(i) && boardPoint.getY() == getCenterYFigure(i)){
                    a=i;
                    value = true;

                }
            }
            for(int i = 0 ; i < Board.getChessFieldsBlack().size() ; i++){
                if(boardPoint.getX() - STEP == boardPoint2.getX() && boardPoint.getY() - STEP == boardPoint2.getY()){
                    value1 = true;
                }
            }

            for(int i = 0 ; i < Board.getChessFieldsBlack().size() ; i++){
                if(boardPoint.getX() + STEP == boardPoint2.getX() && boardPoint.getY() - STEP == boardPoint2.getY()){
                    value1 = true;
                }
            }

            for(int i = 0 ; i < Board.getChessFieldsBlack().size() ; i++){
                if(boardPoint.getX() - STEP == boardPoint2.getX() && boardPoint.getY() + STEP == boardPoint2.getY()){
                    value1 = true;
                }
            }

            for(int i = 0 ; i < Board.getChessFieldsBlack().size() ; i++){
                if(boardPoint.getX() + STEP == boardPoint2.getX() && boardPoint.getY() + STEP == boardPoint2.getY()){
                    value1 = true;
                }
            }

            for(int i = 0 ; i < getAllFigures().size() ; i++) {
                if (value == true && value1 == true && color == COLORWHITE ) {
                    getAllFigures().get(a).setCenterX(boardPoint2.getX());
                    getAllFigures().get(a).setCenterY(boardPoint2.getY());
                    value = false;
                    value1 = false;
                    return true;
                }
            }

            for(int i = 0 ; i < getAllFigures().size() ; i++) {
                if (value == true && value1 == true && color == COLORBLACK ) {
                    getAllFigures().get(a).setCenterX(boardPoint2.getX());
                    getAllFigures().get(a).setCenterY(boardPoint2.getY());
                    value = false;
                    value1 = false;
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean beatFigure(Point2D boardPoint, Point2D boardPoint2){
        if(boardPoint != null && boardPoint2 != null){

        }
        return true;
    }

    public static List<Circle> getAllFigures() {
        return allFigures;
    }

    public static double getCenterXFigure(int i){
        return getAllFigures().get(i).getCenterX();
    }

    public static double getCenterYFigure(int i){
        return getAllFigures().get(i).getCenterY();
    }

    public static Paint getColorFigure(int i){
        return getAllFigures().get(i).getFill();
    }

    public static Point2D getPoint() {
        return point;
    }
}
