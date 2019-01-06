package checkers;

import javafx.geometry.Point2D;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.Pane;

import java.util.ArrayList;
import java.util.List;

public class Board extends Pane {
    private final static double x0 = 135.0;
    private final static double y0 = 135.0;
    private final static double step = 77.5;
    private final static double HALFSTEP = 38.75;
    private static Point2D point1;
    private final static List<Point2D> chessFieldsBlack = new ArrayList<Point2D>();
    private final static List<Point2D> chessFieldsWhite = new ArrayList<Point2D>();

    public static void creatBlackBoard(){
        for(int i = 0 ; i < 8 ; i++){
            for(int j = 0 ; j < 8 ; j++){
                if( j%2 != 0 && i%2 == 0) {
                    chessFieldsBlack.add(new Point2D(x0 + j * step, y0 + i * step));
                }
                if(j%2 == 0 && i%2 != 0){
                    chessFieldsBlack.add(new Point2D(x0 + j * step, y0 + i * step));
                }
            }
        }
    }

    public static void creatWhiteBoard(){
        for(int i = 0 ; i < 8 ; i++){
            for(int j = 0 ; j < 8 ; j++){
                if( j%2 == 0 && i%2 == 0) {
                    chessFieldsWhite.add(new Point2D(x0 + j * step, y0 + i * step));
                }
                if(j%2 != 0 && i%2 != 0){
                    chessFieldsWhite.add(new Point2D(x0 + j * step, y0 + i * step));
                }
            }
        }
    }

    public static void printChessFields(){
        System.out.println("Liczba czarnych pól : " + chessFieldsBlack.size());
        for(int i = 0; i<chessFieldsBlack.size(); i++){
            System.out.println("x = " + chessFieldsBlack.get(i).getX() + ", y = " + chessFieldsBlack.get(i).getY() );
        }
        System.out.println();
        System.out.println("Liczba białych pól : " + chessFieldsWhite.size());
        for(int i = 0; i<chessFieldsWhite.size(); i++){
            System.out.println("x = " + chessFieldsWhite.get(i).getX() + ", y = " + chessFieldsWhite.get(i).getY() );
        }
        System.out.println();
    }

    public static Point2D checkFieldBoard(Point2D point){
        if(point != null){
            for (int i = 0; i < Board.getChessFieldsBlack().size(); i++) {
                if (((Board.getChessFieldsBlack().get(i).getX() - HALFSTEP) < point.getX()) && ((Board.getChessFieldsBlack().get(i).getX() + HALFSTEP) > point.getX()) && ((Board.getChessFieldsBlack().get(i).getY() - HALFSTEP) < point.getY()) && ((Board.getChessFieldsBlack().get(i).getY() + HALFSTEP) > point.getY())) {
                    point1 = new Point2D(Board.getChessFieldsBlack().get(i).getX(), Board.getChessFieldsBlack().get(i).getY());
                    return point1;
                }
            }
        }
        return null;
    }

    public static Point2D checkFieldBoardWhite(Point2D point){
        if(point !=null){
            for(int i = 0 ; i < Board.getChessFieldsWhite().size() ; i++){
                if (((Board.getChessFieldsWhite().get(i).getX() - 77.5) < point.getX()) && ((Board.getChessFieldsWhite().get(i).getX() + 77.5) > point.getX()) && ((Board.getChessFieldsWhite().get(i).getY() - 77.5) < point.getY()) && ((Board.getChessFieldsWhite().get(i).getY() + 77.5) > point.getY())) {
                    point1 = new Point2D(Board.getChessFieldsWhite().get(i).getX() , Board.getChessFieldsWhite().get(i).getY());
                    return point1;
                }
            }
        }
        return null;
    }

    public static List<Point2D> getChessFieldsBlack() {
        return chessFieldsBlack;
    }

    public static List<Point2D> getChessFieldsWhite() {
        return chessFieldsWhite;
    }

}
