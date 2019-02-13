package nought.and.crosses.play;

import javafx.application.Application;
import javafx.beans.property.ReadOnlyObjectProperty;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class NoughtAndCrosses extends Application {
    private static Pane root = new Pane();
    private static EventHandler<MouseEvent> mouseClicked;
    private String playerName;
    private String playerTwoName;
    private TextField playerTextField;
    private TextField playerTwoTextField;
    private Button playerButton;
    private Button comupterButton;
    private Button playerTwoButton;
    private RadioButton withComputer;
    private RadioButton twoPlayer;
    private Label typeOfGame = new Label("Type game:");
    private ToggleGroup toggleGroup = new ToggleGroup();
    private PlayWithComputer playWithComputer;
    private Play play;
    private boolean value1;
    private boolean value2;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Board board = new Board();
        Label playerLabel = new Label("Player name:");
        Label playerTwo = new Label("Player two:");
        playerLabel.setFont(Font.font(15));
        playerTwo.setFont(Font.font(15));
        playerTextField = new TextField();
        playerTextField.setLayoutX(125);
        playerTextField.setLayoutY(20);

        playerTwoTextField = new TextField();
        playerTwoTextField.setLayoutX(125);
        playerTwoTextField.setLayoutY(20);

        comupterButton = new Button("Computer move");
        playerButton = new Button("Enter");
        playerTwoButton = new Button("Enter");

        comupterButton.setLayoutX(125);
        comupterButton.setLayoutY(20);
        playerButton.setLayoutX(125);
        playerButton.setLayoutY(20);

        withComputer = new RadioButton("with computer");
        withComputer.setToggleGroup(toggleGroup);
        twoPlayer = new RadioButton("two player");
        twoPlayer.setToggleGroup(toggleGroup);

        VBox vBox = new VBox();
        HBox hBox = new HBox();
        vBox.setSpacing(15);
        HBox.setMargin(vBox, new Insets(10));
        HBox.setMargin(root,new Insets(5));

        vBox.getChildren().addAll(typeOfGame, withComputer, twoPlayer, playerLabel, playerTextField);
        vBox.getChildren().addAll(playerButton, comupterButton, playerTwo,playerTwoTextField,playerTwoButton);
        hBox.getChildren().addAll(vBox,root);

        ConditionsForBoard conditionsForBoard = new ConditionsForBoard();
        Computer computer = new Computer(CreatListOfFields.getTextCoordinates());
        CreatListOfFields.ListOffields();
        CreatListOfFields.textList();
        checkTypeOfGame();
        enterPlayerOneName();
        enterPlayerTwoName();
        action();
        computerPlay();

        getRoot().addEventHandler(MouseEvent.MOUSE_CLICKED, mouseClicked);
        root.setPrefSize(600,600);
        root.getChildren().addAll(board.getBoard());
        Scene scene = new Scene(hBox, 820, 613);
        primaryStage.setTitle("Nought And Crosses");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static Pane getRoot() {
        return root;
    }

    public void action(){
        mouseClicked = e -> {
            if(value1) {
                if (e.getButton() == MouseButton.PRIMARY) {
                    playWithComputer.movePlayer(e.getX(), e.getY());
                }
            }else if(value2){
                play.play(e.getX(), e.getY());
            }
        };
    }

    public static EventHandler<MouseEvent> getMouseClicked() {
        return mouseClicked;
    }

    public void enterPlayerOneName() {
        playerButton.setOnAction(e -> {
            playerName = playerTextField.getText();
            playWithComputer = new PlayWithComputer(playerName);
            System.out.println("Player name is: " + playerName);
        });
    }

    public void enterPlayerTwoName(){
        playerTwoButton.setOnAction(e->{
            playerTwoName = playerTwoTextField.getText();
            System.out.println("Player name is: " + playerTwoName);
            if(playerName != null){
                play = new Play(playerName, playerTwoName);
            }
        });
    }

    public void computerPlay(){
        comupterButton.setOnAction(e -> playWithComputer.moveComputer());
    }
    public void checkTypeOfGame(){
        ReadOnlyObjectProperty<Toggle> sel = toggleGroup.selectedToggleProperty();
        sel.addListener(  new ChangeListener<Toggle>() {
            @Override
            public void changed(ObservableValue<? extends Toggle> observable, Toggle oldValue, Toggle newValue) {
                if(newValue == withComputer){
                    System.out.println("Your choice is " + ((ToggleButton)newValue).getText());
                    value1 = true;
                    System.out.println();
                }else if(newValue == twoPlayer){
                    System.out.println("Your choice is " + ((ToggleButton)newValue).getText());
                    value2 = true;
                }else if(newValue == null && !value1 && !value2){
                    System.out.println("You have not made a choice. Please check again.");
                    value1 = false;
                    value2 = false;
                }
            }
        });
    }
}