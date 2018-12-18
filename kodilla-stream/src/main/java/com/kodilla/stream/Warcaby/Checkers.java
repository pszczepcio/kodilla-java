package com.kodilla.stream.Warcaby;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Point2D;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.List;

public class Checkers extends Application{
    private Image imageback = new Image("szachy2.jpg");
    private final static double radius = 35.0;
    private static List<Circle>whiteFigures = new ArrayList<Circle>();
    private static List<Circle>blackFigures = new ArrayList<Circle>();
    private List<ChessFields> listOfChessFields = new ArrayList<ChessFields>();
    private  static double coordinateFieldNextX;
    private  static double coordinateFieldNextY;
    private  double x;
    private  double y;
    private static int number;
    private  int clikleft = 0;
    private  int clikright = 0;
    Point2D afterCheck;



    @Override
    public void start(Stage primaryStage) throws Exception {
        BackgroundSize backgroundSize = new BackgroundSize(800 ,800,false,false,false,false);
        BackgroundImage backgroundImage = new BackgroundImage(imageback,  BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, backgroundSize);
        Background background = new Background(backgroundImage);

        ChessFields B8 = new ChessFields(212.0,134);
        ChessFields D8 = new ChessFields(368.0,134);
        ChessFields F8 = new ChessFields(524.0,134);
        ChessFields H8 = new ChessFields(680.0,134);

        ChessFields A7 = new ChessFields(134.0,212);
        ChessFields C7 = new ChessFields(290.0,212);
        ChessFields E7 = new ChessFields(446.0,212);
        ChessFields G7 = new ChessFields(602.0,213);

        ChessFields B6 = new ChessFields(212.0,290);
        ChessFields D6 = new ChessFields(368.0,290);
        ChessFields F6 = new ChessFields(524.0,290);
        ChessFields H6 = new ChessFields(680.0,290);

        ChessFields A5 = new ChessFields(134.0,368);
        ChessFields C5 = new ChessFields(290.0,368);
        ChessFields E5 = new ChessFields(446.0,368);
        ChessFields G5 = new ChessFields(602.0,368);

        ChessFields B4 = new ChessFields(212.0,446);
        ChessFields D4 = new ChessFields(368.0,446);
        ChessFields F4 = new ChessFields(524.0,446);
        ChessFields H4 = new ChessFields(680.0,446);

        ChessFields A3 = new ChessFields(134.0,524);
        ChessFields C3 = new ChessFields(290.0,524);
        ChessFields E3 = new ChessFields(446.0,524);
        ChessFields G3 = new ChessFields(602.0,524);

        ChessFields B2 = new ChessFields(212.0,602);
        ChessFields D2 = new ChessFields(368.0,602);
        ChessFields F2 = new ChessFields(524.0,602);
        ChessFields H2 = new ChessFields(680.0,602);

        ChessFields A1 = new ChessFields(134.0,680);
        ChessFields C1 = new ChessFields(290.0,680);
        ChessFields E1 = new ChessFields(446.0,680);
        ChessFields G1 = new ChessFields(602.0,680);

        listOfChessFields.add(A1);
        listOfChessFields.add(A3);
        listOfChessFields.add(A5);
        listOfChessFields.add(A7);

        listOfChessFields.add(B2);
        listOfChessFields.add(B4);
        listOfChessFields.add(B6);
        listOfChessFields.add(B8);

        listOfChessFields.add(C1);
        listOfChessFields.add(C3);
        listOfChessFields.add(C5);
        listOfChessFields.add(C7);

        listOfChessFields.add(D2);
        listOfChessFields.add(D4);
        listOfChessFields.add(D6);
        listOfChessFields.add(D8);

        listOfChessFields.add(E1);
        listOfChessFields.add(E3);
        listOfChessFields.add(E5);
        listOfChessFields.add(E7);

        listOfChessFields.add(F2);
        listOfChessFields.add(F4);
        listOfChessFields.add(F6);
        listOfChessFields.add(F8);

        listOfChessFields.add(G1);
        listOfChessFields.add(G3);
        listOfChessFields.add(G5);
        listOfChessFields.add(G7);

        listOfChessFields.add(H2);
        listOfChessFields.add(H4);
        listOfChessFields.add(H6);
        listOfChessFields.add(H8);

        Circle whitePawn1 = new Circle(134,680,radius,Color.WHITE);
        Circle whitePawn2 = new Circle(290,680,radius,Color.WHITE);
        Circle whitePawn3 = new Circle(446,680,radius,Color.WHITE);
        Circle whitePawn4 = new Circle(602,680,radius,Color.WHITE);
        Circle whitePawn5 = new Circle(212,602,radius,Color.WHITE);
        Circle whitePawn6 = new Circle(368,602,radius,Color.WHITE);
        Circle whitePawn7 = new Circle(524,602,radius,Color.WHITE);
        Circle whitePawn8 = new Circle(680,602,radius,Color.WHITE);

        whiteFigures.add(whitePawn1);
        whiteFigures.add(whitePawn2);
        whiteFigures.add(whitePawn3);
        whiteFigures.add(whitePawn4);
        whiteFigures.add(whitePawn5);
        whiteFigures.add(whitePawn6);
        whiteFigures.add(whitePawn7);
        whiteFigures.add(whitePawn8);

        Circle blackPawn1 = new Circle(212,134,radius,Color.BLACK);
        Circle blackPawn2 = new Circle(368,134,radius,Color.BLACK);
        Circle blackPawn3 = new Circle(524,134,radius,Color.BLACK);
        Circle blackPawn4 = new Circle(680,134,radius,Color.BLACK);
        Circle blackPawn5 = new Circle(134,212,radius,Color.BLACK);
        Circle blackPawn6 = new Circle(290,524,radius,Color.BLACK);
        Circle blackPawn7 = new Circle(446,212,radius,Color.BLACK);
        Circle blackPawn8 = new Circle(602,212,radius,Color.BLACK);

        blackFigures.add(blackPawn1);
        blackFigures.add(blackPawn2);
        blackFigures.add(blackPawn3);
        blackFigures.add(blackPawn4);
        blackFigures.add(blackPawn5);
        blackFigures.add(blackPawn6);
        blackFigures.add(blackPawn7);
        blackFigures.add(blackPawn8);

        Pane root = new Pane();
        root.setPrefSize(630,630);
        root.setPadding(new Insets(85.0,85.0,85.0,85.0));

        root.getChildren().addAll(whiteFigures);
        root.getChildren().addAll(blackFigures);
        root.setBackground(background);
        Scene scene = new Scene(root, 800, 800, Color.BLACK);

////////////////////////////////////////Mouse_event///////////////////////////////////////////////////////////////////////////////////////////////////////////
        EventHandler<MouseEvent> fieldHandler = new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {

                if (event.getButton().equals(MouseButton.PRIMARY)) {
                    System.out.println("klikam lewym");
                    Point2D beforeCheck = new Point2D(event.getX(), event.getY());
                    afterCheck = new Point2D(CheckField.fieldAxis(beforeCheck, listOfChessFields).getX(), CheckField.fieldAxis(beforeCheck, listOfChessFields).getY());
                    if (CheckFigureWhite.checkFigureWhite(afterCheck, whiteFigures)) {
                        number = CheckFigureWhite.getNumberFigure();
                        x = afterCheck.getX();
                        y = afterCheck.getY();
                        clikleft++;
                    }
                }

                if (event.getButton().equals(MouseButton.SECONDARY)) {
                    clikright=0;
                    System.out.println("klikam prawym");
                    Point2D nextField = new Point2D(event.getX(), event.getY());
                    CheckField.fieldAxis(nextField, listOfChessFields);
                    coordinateFieldNextX = CheckField.fieldAxis(nextField, listOfChessFields).getX();
                    coordinateFieldNextY = CheckField.fieldAxis(nextField, listOfChessFields).getY();
                    clikright++;
                }
                if (clikleft > 0 && clikright == 1) {
                    clikleft = 0;
                    clikright = 0;
                    MoveWhite move = new MoveWhite();
                    move.move(y, x, listOfChessFields,whiteFigures,blackFigures);

                    try {
                        if (coordinateFieldNextX == move.getLeftField().getX() && coordinateFieldNextY == move.getLeftField().getY()) {
                            for(int i = 0 ; i < blackFigures.size() ; i ++) {
                                if (coordinateFieldNextX == blackFigures.get(i).getCenterX() && coordinateFieldNextY == blackFigures.get(i).getCenterY()) {
                                    whiteFigures.get(number).setCenterX(coordinateFieldNextX);
                                    whiteFigures.get(number).setCenterY(coordinateFieldNextY);
                                }
                            }
                        }
                    } catch (NullPointerException e) {
                        System.out.println("przypisanie pionkowi wspołrzędnej lewej skrajnej");
                    }

                    try {
                        if (coordinateFieldNextX == move.getRightField().getX() && coordinateFieldNextY == move.getRightField().getY()) {
                            whiteFigures.get(number).setCenterX(coordinateFieldNextX);
                            whiteFigures.get(number).setCenterY(coordinateFieldNextY);
                        }
                    } catch (NullPointerException e) {
                        System.out.println("przypisanie pionkowi wspołrzędnej prawej skrajnej");
                    }

                }
            }
        };
        root.addEventHandler(MouseEvent.MOUSE_CLICKED, fieldHandler);
        primaryStage.setTitle("Warcaby");
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.show();

    }
    public static void main(String[] args) {
        launch(args);
    }
}