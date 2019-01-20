package checkers;

import javafx.geometry.Point2D;

public class CheckFieldBoard extends Board {
    private static Point2D fieldPoint;
    private static Point2D freeFieldPoint;
    private final static double HALFSTEP = 38.75;

    public static Point2D checkField(Point2D point){
        for(int i = 0 ; i < Board.getChessBoard().size() ; i++){
            if((Board.getX(i) - HALFSTEP < point.getX() && Board.getX(i) + HALFSTEP > point.getX()) &&(Board.getY(i) - HALFSTEP < point.getY() && Board.getY(i) + HALFSTEP > point.getY())){
                    fieldPoint = new Point2D(Board.getX(i),Board.getY(i));
                    return fieldPoint;
                }
            }
        return null;
    }
    public static Point2D checkFreeField(Point2D point){
        for(int i = 0 ; i < InitialStateGame.getCollectionOfFigures().size() ; i ++){
            if(point.getX() == InitialStateGame.getCenterXFigure(i) && point.getY() == InitialStateGame.getCenterYFigure(i)){
                return null;
            }
        }
        freeFieldPoint = point;
        return freeFieldPoint;
    }
}
