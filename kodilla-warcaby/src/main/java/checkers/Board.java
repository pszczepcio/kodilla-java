package checkers;

import javafx.geometry.Point2D;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.Pane;

import javax.print.DocFlavor;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Board extends Pane {
    private final static double X0 = 135.0;
    private final static double Y0 = 135.0;
    private final static double STEP = 77.5;
    private final static double HALFSTEP = 38.75;
    private static Point2D point1;
    private static String letters[] = {"A","B","C","D","E","F","G","H"};
    private static int numbers[] = {8,7,6,5,4,3,2,1};
    private static int index = 0;
    private static  List<String> nameOfFieldsBoard = new ArrayList<String>();
    private final static List<Point2D> chessBoard = new ArrayList<Point2D>();
    private final static List<Point2D> chessFieldsWhite = new ArrayList<Point2D>();

    public static void creatBoard(){
        for(int i = 0 ; i < 8 ; i++){
            for(int j = 0 ; j < 8 ; j++){
                if(j % 2 != 0 && i % 2 == 0 || j%2 == 0 && i%2 != 0) {
                    chessBoard.add( new Point2D(X0 + i * STEP, Y0 + j * STEP));
                    nameOfFieldsBoard.add( letters[i] + numbers[j]);
                    ++index;
                }
            }
        }
    }



//    public static void creatBlackBoard(){
//        for(int i = 0 ; i < 8 ; i++){
//            for(int j = 0 ; j < 8 ; j++){
//                if( j%2 != 0 && i%2 == 0) {
//                    chessFieldsBlack.add(new Point2D(x0 + j * step, y0 + i * step));
//                }
//                if(j%2 == 0 && i%2 != 0){
//                    chessFieldsBlack.add(new Point2D(x0 + j * step, y0 + i * step));
//                }
//            }
//        }
//    }

//    public static void creatWhiteBoard(){
//        for(int i = 0 ; i < 8 ; i++){
//            for(int j = 0 ; j < 8 ; j++){
//                if( j%2 == 0 && i%2 == 0) {
//                    chessFieldsWhite.add(new Point2D(x0 + j * step, y0 + i * step));
//                }
//                if(j%2 != 0 && i%2 != 0){
//                    chessFieldsWhite.add(new Point2D(x0 + j * step, y0 + i * step));
//                }
//            }
//        }
//    }

    public static void printChessBoard() {
        System.out.println("Chess board size is: " + chessBoard.size());
        for(int i = 0 ; i < 32 ; i++) {
            System.out.println(nameOfFieldsBoard.get(i) + " (" + chessBoard.get(i).getX() + " , " + chessBoard.get(i).getY() + ")");
        }
    }





//   // public static Point2D checkFieldBoard(Point2D point){
//        if(point != null){
//            for (int i = 0; i < Board.getChessFieldsBlack().size(); i++) {
//                if (((Board.getChessFieldsBlack().get(i).getX() - HALFSTEP) < point.getX()) && ((Board.getChessFieldsBlack().get(i).getX() + HALFSTEP) > point.getX()) && ((Board.getChessFieldsBlack().get(i).getY() - HALFSTEP) < point.getY()) && ((Board.getChessFieldsBlack().get(i).getY() + HALFSTEP) > point.getY())) {
//                    point1 = new Point2D(Board.getChessFieldsBlack().get(i).getX(), Board.getChessFieldsBlack().get(i).getY());
//                    return point1;
//                }
//            }
//        }
//        return null;
//    }

//   // public static Point2D checkFieldBoardWhite(Point2D point){
//        if(point !=null){
//            for(int i = 0 ; i < Board.getChessFieldsWhite().size() ; i++){
//                if (((Board.getChessFieldsWhite().get(i).getX() - 77.5) < point.getX()) && ((Board.getChessFieldsWhite().get(i).getX() + 77.5) > point.getX()) && ((Board.getChessFieldsWhite().get(i).getY() - 77.5) < point.getY()) && ((Board.getChessFieldsWhite().get(i).getY() + 77.5) > point.getY())) {
//                    point1 = new Point2D(Board.getChessFieldsWhite().get(i).getX() , Board.getChessFieldsWhite().get(i).getY());
//                    return point1;
//                }
//            }
//        }
//        return null;
//    }

//    public static List<Point2D> getChessFieldsBlack() {
//        return chessFieldsBlack;
//    }


    public static List<Point2D> getChessBoard() {
        return chessBoard;
    }

    public static double getX(int i){
        return Board.getChessBoard().get(i).getX();
    }

    public static double getY(int i){
        return Board.getChessBoard().get(i).getY();
    }


    public static List<String> getNameOfFieldsBoard() {
        return nameOfFieldsBoard;
    }
}
