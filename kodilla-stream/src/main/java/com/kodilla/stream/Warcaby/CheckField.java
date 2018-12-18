package com.kodilla.stream.Warcaby;

import javafx.geometry.Point2D;

import java.util.List;

public class CheckField {
    private static double axisX;
    private static double axisY;
    private final static double deltaX = 39;
    private final static double deltaY = 39;


    private static List<ChessFields> copyList;
    private Point2D point;
    private Point2D point2D;


    public static Point2D fieldAxis (Point2D point, List < ChessFields > list){
        axisX = point.getX();
        axisY = point.getY();
        copyList = list;

        for (int i = 0; i < copyList.size(); i++) {
            if ((((copyList.get(i).getAxisFieldX() - deltaX) <= axisX) && (axisX <= (copyList.get(i).getAxisFieldX() + deltaX))) && (((copyList.get(i).getAxisFieldY() - deltaY) <= axisY) && (axisY <= (copyList.get(i).getAxisFieldY() + deltaY)))) {
                Point2D point2D = new Point2D(copyList.get(i).getAxisFieldX(), copyList.get(i).getAxisFieldY());
                return point2D;
            }
        }
        return null;
    }

    public double getAxisX() {
        return point2D.getX();
    }

    public double getAxisY() {
        return point2D.getY();
    }

}
