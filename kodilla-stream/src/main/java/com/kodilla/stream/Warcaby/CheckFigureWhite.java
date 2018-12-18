package com.kodilla.stream.Warcaby;

import javafx.geometry.Point2D;
import javafx.scene.shape.Circle;

import java.util.List;

public class CheckFigureWhite {
    private static List<Circle> whiteFigureCheck;
    private static int numberWhiteFigure;
    private Point2D pointWhiteFigure ;
    private  static Point2D xYField ;

    public static boolean checkFigureWhite(Point2D xYfield,List<Circle> list ) {
        whiteFigureCheck = list;
        xYField = xYfield;
        for(int i = 0 ; i < whiteFigureCheck.size() ; i ++){
            if((xYField.getX() == whiteFigureCheck.get(i).getCenterX()) && (xYField.getY() == whiteFigureCheck.get(i).getCenterY())){
                numberWhiteFigure = i;
                return true;
            }
        }
        return false;
    }

    public static int getNumberFigure(){
        return numberWhiteFigure;
    }
}
