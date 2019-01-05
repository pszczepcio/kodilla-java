package checkers;

import javafx.geometry.Point2D;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;

import java.util.ArrayList;
import java.util.List;

public class Figures extends Pane {
    private final static double RADIUS = 35.0;
    private final static double HALFSTEP = 38.75;
    private final static Color COLORBLACK = Color.BLACK;
    private final static Color COLORWHITE = Color.WHITE;
    private static Circle circle;
    private static List<Circle> allFigures = new ArrayList<Circle>();
    //private static Board board;
    private static Point2D boardPoint;
    private static Point2D point;;
    private static boolean emptyField;
    private static boolean emptyField2 ;

    private static boolean fieldWithoutfigure = true;


    public static void startBlackFigures(List<Point2D> board){
        for(int i = 0 ; i < 8 ; i++){
            circle = new Circle(board.get(i).getX() , board.get(i).getY(), RADIUS , COLORBLACK);
            allFigures.add(circle);
        }
    }
    public static void startWhiteFigures(List<Point2D> board){
        for(int i = 24 ; i < Board.getChessFieldsBlack().size() ; i ++){
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
                        //System.out.println("x = " + point.getX() + ", y = " + point.getY());
                        return point;
                    }
                }
            }
        return null;
    }

    public static Point2D NextField(Point2D emptyfield){
        if(emptyfield != null){
            //System.out.println(emptyfield.getX() + ", " + emptyfield.getY());
            //System.out.println(getAllFigures().get(0).getCenterX() + ", " + getAllFigures().get(0).getCenterY());
            for(int i = 0 ; i < getAllFigures().size() ; i++){
               // System.out.println(getCenterXFigure(i) + ", " + getCenterYFigure(i));
                if((getAllFigures().get(i).getCenterX() == emptyfield.getX()) && (getAllFigures().get(i).getCenterY() == emptyfield.getY())){
                    return null;
                }
            }
        }
        return emptyfield;
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
