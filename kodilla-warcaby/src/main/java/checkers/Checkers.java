package checkers;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.geometry.Point2D;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;


public class Checkers extends Application {
    private Image imageback = new Image("szachy2.jpg");
    private Point2D field;
    private static Point2D field1;
    private static Point2D field2;


    @Override
    public void start(Stage primaryStage) throws Exception {
        BackgroundSize backgroundSize = new BackgroundSize(800 ,800,false,false,false,false);
        BackgroundImage backgroundImage = new BackgroundImage(imageback,  BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, backgroundSize);
        Background background = new Background(backgroundImage);

        //Creat Board
        Board.creatBlackBoard();
        Board.creatWhiteBoard();
        //Write coordinates board
       // Board.printChessFields();

        //setting of figures
        Figures.startBlackFigures(Board.getChessFieldsBlack());
        Figures.startWhiteFigures(Board.getChessFieldsBlack());
       // Figures.printCoordniateAllFigures();

        //Figures.printCoordniateAllFigures();

        Pane root = new Pane();
        root.setBackground(background);
        root.getChildren().addAll(Figures.getAllFigures());
        Scene scene = new Scene(root, 800, 800);

        EventHandler<MouseEvent> move = new EventHandler<MouseEvent>(){

            @Override
            public void handle(MouseEvent event) {
                if(event.getButton() == MouseButton.PRIMARY) {
                    field = new Point2D(event.getX(), event.getY());
                   // System.out.println(field);
                   // System.out.println(Board.checkFieldBoard(field));
                    System.out.println(Figures.CoordniatesFigure(field,Color.WHITE));
                }else if(event.getButton() == MouseButton.SECONDARY){
                    field1 = new Point2D(event.getX() , event.getY());
                    System.out.println(Figures.NextField(Board.checkFieldBoard(field1)));
                }
            }
        };



        root.addEventHandler(MouseEvent.MOUSE_CLICKED,move);

        primaryStage.setTitle("Warcaby");
        primaryStage.setScene(scene);
        primaryStage.setWidth(820);
        primaryStage.setResizable(false);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
