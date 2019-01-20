package checkers;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Checkers extends Application {
    private Image imageback = new Image("szachy2.jpg");
    private boolean endGame = true;
    private boolean stanGry = false;
    private static Pane root;


    @Override
    public void start(Stage primaryStage) throws Exception {
        BackgroundSize backgroundSize = new BackgroundSize(800 ,800,false,false,false,false);
        BackgroundImage backgroundImage = new BackgroundImage(imageback,  BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, backgroundSize);
        Background background = new Background(backgroundImage);

        Board.creatBoard();
        //Board.printChessBoard();
        InitialStateGame.initialGame();
        root = new Pane();
        root.setBackground(background);
        root.getChildren().addAll(InitialStateGame.getCollectionOfFigures());
        root.getChildren().addAll(creatKingFigure.getKing());
        System.out.println("Zaczynają białe");
        Player one = new Player("Piotrek", Color.WHITE);
        Player two = new Player("Mariola", Color.BLACK);

        EventHandler<MouseEvent> play = new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                try {
                    if (!stanGry) {
                        if (one.playerPlay(event, one)) {
                            System.out.println("The movement was made by the player: " + one.getName());
                            stanGry = true;
                        }
                    }
                    if (stanGry) {
                        if (two.playerPlay(event, two)) {
                            System.out.println("The movement was made by the player: " + two.getName());
                            stanGry = false;
                        }
                    }
                }catch (NullPointerException e){

                }
            }
        };
        root.addEventHandler(MouseEvent.MOUSE_CLICKED,play);
        EventHandler<MouseEvent>posibbleMoveWhite = new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                if (!stanGry) {
                    if(!PossibleMoves.possibleBeat(event, one.getColor())){
                        PossibleMoves.posibleMoves(event, one.getColor());
                    }
                }
            }
        };

        for(int i = 0 ; i < InitialStateGame.getCollectionOfFigures().size() ; i++) {
            if (InitialStateGame.getCollectionOfFigures().get(i).getFill() == Color.WHITE) {
                InitialStateGame.getCollectionOfFigures().get(i).addEventHandler(MouseEvent.MOUSE_ENTERED, posibbleMoveWhite);
            }
        }
        EventHandler<MouseEvent>posibbleMoveBlack = new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                if (stanGry) {
                    if(!PossibleMoves.possibleBeat(event, two.getColor())){
                        PossibleMoves.posibleMoves(event, two.getColor());
                    }
                }
            }
        };
        for(int i = 0 ; i < InitialStateGame.getCollectionOfFigures().size() ; i++) {
            if (InitialStateGame.getCollectionOfFigures().get(i).getFill() == Color.BLACK) {
                InitialStateGame.getCollectionOfFigures().get(i).addEventHandler(MouseEvent.MOUSE_ENTERED, posibbleMoveBlack);
            }
        }
        Scene scene = new Scene(root, 800, 800);
        primaryStage.setTitle("Warcaby");
        primaryStage.setScene(scene);
        primaryStage.setWidth(820);
        primaryStage.setResizable(false);
        primaryStage.show();
    }

    public static Pane getRoot() {
        return root;
    }

    public static void main(String[] args) {
        launch(args);
    }
}
