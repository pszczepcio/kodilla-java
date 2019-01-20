package checkers;

import javafx.geometry.Point2D;
import javafx.scene.paint.Color;

public class CheckFigure {
    private static Point2D oldPoint;
    private static int numberOfFigure;
    private final static Color WHITE = Color.WHITE;
    private final static Color BLACK = Color.BLACK;

    public static Point2D checkFigureField(Point2D point, Color color){
        for (int i = 0; i < InitialStateGame.getCollectionOfFigures().size() ; i++) {
            if (point.getX() - 35 < InitialStateGame.getCenterXFigure(i) && point.getX() + 35 > InitialStateGame.getCenterXFigure(i) && point.getY() - 35 < InitialStateGame.getCenterYFigure(i) && point.getY() + 35 > InitialStateGame.getCenterYFigure(i) && InitialStateGame.getCollectionOfFigures().get(i).getFill().equals(color)){
                numberOfFigure = i;
                oldPoint = new Point2D(InitialStateGame.getCenterXFigure(i) , InitialStateGame.getCenterYFigure(i));
                return oldPoint;
            }
            for(int j = 0 ; j < creatKingFigure.getKing().size() ; j++){
                if(point.getX() - 35 < creatKingFigure.getKing().get(j).getCenterX() && point.getX() + 35 > creatKingFigure.getKing().get(j).getCenterX() && point.getY() - 35 < creatKingFigure.getKing().get(j).getCenterY() && point.getY() + 35 > creatKingFigure.getKing().get(j).getCenterY() && creatKingFigure.getKing().get(j).getFill().equals(color)){
                    numberOfFigure = j;
                    oldPoint = new Point2D(creatKingFigure.getKing().get(numberOfFigure).getCenterX() , creatKingFigure.getKing().get(numberOfFigure).getCenterY());
                    return oldPoint;
                }
            }
        }
        return null;
    }

    public static int getNumberOfFigure() {
        return numberOfFigure;
    }
}
