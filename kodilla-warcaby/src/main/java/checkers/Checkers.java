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
    private Point2D field = null;
    private Point2D field1 = null;
    private static boolean playerMovement = false;
    private boolean endGame = true;
    private static int step = 0;


    @Override
    public void start(Stage primaryStage) throws Exception {
        BackgroundSize backgroundSize = new BackgroundSize(800 ,800,false,false,false,false);
        BackgroundImage backgroundImage = new BackgroundImage(imageback,  BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, backgroundSize);
        Background background = new Background(backgroundImage);

        //Creat Board
        Board.creatBlackBoard();
        Board.creatWhiteBoard();
        //setting of figures
        Figures.startBlackFigures(Board.getChessFieldsBlack());
        Figures.startWhiteFigures(Board.getChessFieldsBlack());

        Pane root = new Pane();
        root.setBackground(background);
        root.getChildren().addAll(Figures.getAllFigures());
        Scene scene = new Scene(root, 800, 800);

        EventHandler<MouseEvent> move = new EventHandler<MouseEvent>(){
            @Override
            public void handle(MouseEvent event) {
                Player one = new Player("A", Color.WHITE);
                Player two = new Player("B", Color.BLACK);

                if (!endGame) {
                    return;
                }
                if (event.getButton().equals(MouseButton.PRIMARY) && step == 0) {
                    field = Board.checkFieldBoard(new Point2D(event.getX(), event.getY()));
                    if((Figures.CoordniatesFigure(field,Color.BLACK) != null) /*|| (Board.checkFieldBoardWhite(field) != null)*/){
                        System.out.println("zle kliknałeś");
                        return;
                    }
                    ++step;
                } else if (event.getButton().equals(MouseButton.SECONDARY) && step == 1) {
                    field1 = Board.checkFieldBoard(new Point2D(event.getX(), event.getY()));
                    if((Figures.CoordniatesFigure(field1,Color.BLACK) != null) && (Figures.CoordniatesFigure(field1, Color.WHITE)!=null)){
                        return;
                    }
                   ++step;
                   playerMovement = true;
                }
                if(playerMovement)
                one.playerPlay(Figures.CoordniatesFigure(field, Color.WHITE), Figures.NextField(field1), one.getColor());

                if (event.getButton().equals(MouseButton.PRIMARY) && step == 2) {
                    field = Board.checkFieldBoard(new Point2D(event.getX(), event.getY()));
                    if(Figures.CoordniatesFigure(field,Color.WHITE) != null){
                        return;
                    }
                    ++step;
                } else if (event.getButton().equals(MouseButton.SECONDARY) && step == 3) {
                    field1 = Board.checkFieldBoard(new Point2D(event.getX(), event.getY()));
                    if((Figures.CoordniatesFigure(field1,Color.BLACK) != null) && (Figures.CoordniatesFigure(field1, Color.WHITE)!=null)){
                        return;
                    }
                    step = 0;
                    playerMovement = false;
                }
                if(!playerMovement) {
                    two.playerPlay(Figures.CoordniatesFigure(field, Color.BLACK), Figures.NextField(field1), two.getColor());
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
