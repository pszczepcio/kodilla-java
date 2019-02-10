package nought.and.crosses.play;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;

import javafx.stage.Stage;

public class NoughtAndCrosses extends Application {
   private static Pane root = new Pane();
   private static EventHandler<MouseEvent> mouseClicked;

   public static void main(String[] args) {
        launch(args);
   }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Board board = new Board();
        CheckField checkField = new CheckField();

        mouseClicked = e -> {
            if(e.getButton() == MouseButton.PRIMARY){
                    Play play = new Play();
                    play.play(e.getX(), e.getY());
                }
        };

        getRoot().addEventHandler(MouseEvent.MOUSE_CLICKED, mouseClicked);
        root.getChildren().addAll(board.getBoard());
        Scene scene = new Scene(root, 600, 600);
        primaryStage.setTitle("Nought And Crosses");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static Pane getRoot() {
        return root;
    }

    public static EventHandler<MouseEvent> getMouseClicked() {
        return mouseClicked;
    }
}

