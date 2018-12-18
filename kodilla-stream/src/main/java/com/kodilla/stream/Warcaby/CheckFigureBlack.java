package com.kodilla.stream.Warcaby;

import javafx.geometry.Point2D;
import javafx.scene.shape.Circle;

import java.util.List;

public class CheckFigureBlack {
    private static List<Circle> blackFigureCheck;
    private static int numberBlackFigure;
    private Point2D pointBlackFigure;
    private static Point2D xYField;

    public static boolean checkBlackFigure(Point2D xYfield, List<Circle> list){
        blackFigureCheck = list;
        xYField = xYfield;
        for(int i = 0 ; i < blackFigureCheck.size() ; i ++){
            if ((xYField.getX() == blackFigureCheck.get(i).getCenterX()) && (xYField.getY() == blackFigureCheck.get(i).getCenterY())){
                numberBlackFigure = i;
                return true;
            }
        }
        return false;
    }

    public static int getNumberBlackFigure() {
        return numberBlackFigure;
    }
}
