package com.kodilla.stream.Warcaby;

import javafx.geometry.Point2D;
import javafx.scene.shape.Circle;

import java.util.ArrayList;
import java.util.List;

public class MoveWhite {
    private double x;
    private double y;
    private double nextX;
    private double nextX2;
    private double nextY;
    private List<ChessFields> board;
    private List<Circle> white;
    private List<Circle> black;
    private  List<Double> newBoard = new ArrayList<Double>();
    private static Point2D leftField;
    private static Point2D rightField;

    public void move(double y, double x, List<ChessFields> board, List<Circle> white , List<Circle> black ) {
        this.white = white;
        this.black = black;
        this.board = board;
        nextY = y - 78;
        nextX = x - 78;
        nextX2 = x + 78;

        try {
//            for(int i = 0 ; i < white.size() ; i ++) {
//                if (nextX == white.get(i).getCenterX() && nextY == white.get(i).getCenterY()){
//                    System.out.println("Pole jest zajete przez biały pionek");
//
//                }
//            }
//            for(int i = 0 ; i < black.size() ; i++){
//                if(nextX == black.get(i).getCenterX() && nextY == black.get(i).getCenterY()){
//                    leftField = new Point2D(CheckField.fieldAxis(new Point2D(nextX-78.0, nextY-78.0), board).getX(), CheckField.fieldAxis(new Point2D(nextX-78.0, nextY-78.0), board).getY());
//
//                }
//            }
            leftField = new Point2D(CheckField.fieldAxis(new Point2D(nextX, nextY), board).getX(), CheckField.fieldAxis(new Point2D(nextX, nextY), board).getY());
        }catch (NullPointerException e){
            System.out.println("jedno pole z lewej");
        }

        try {
            rightField = new Point2D(CheckField.fieldAxis(new Point2D(nextX2, nextY), board).getX(), CheckField.fieldAxis(new Point2D(nextX2, nextY), board).getY());
        }catch (NullPointerException e){
            System.out.println("jedno pole z prawej");
        }

        System.out.println(leftField);
        System.out.println(rightField);
    }

    public Point2D getLeftField() {
        return leftField;
    }

    public Point2D getRightField() {
        return rightField;
    }
}
