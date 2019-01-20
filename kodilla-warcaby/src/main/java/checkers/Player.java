package checkers;

import javafx.geometry.Point2D;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;

public class Player extends Pane {
    private Point2D fieldFigureFirst;
    private Point2D fieldFigureSecond;
    private Point2D nextField;
    private boolean beat = false;
    private  String name;
    private  Color color;
    private MouseEvent event;
    private int step;
    private int step1;
    private int figureNumber;

    public Player(String name, Color color){
        this.name = name;
        this.color = color;
    }
    public  boolean playerPlay(MouseEvent mouseEvent,Player player){
        this.event = mouseEvent;
        if((this.event.getButton() == MouseButton.PRIMARY) && step1 == 0 ){
            fieldFigureFirst = CheckFigure.checkFigureField(new Point2D(event.getX() , event.getY()) , getColor());
            figureNumber = CheckFigure.getNumberOfFigure();
            if(fieldFigureFirst != null){
                ++step;
            }
        }else if((this.event.getButton() == MouseButton.SECONDARY) && step > 0){
            fieldFigureSecond = CheckFieldBoard.checkField(new Point2D(event.getX(), event.getY()));
            if(fieldFigureSecond != null && CheckFieldBoard.checkFreeField(fieldFigureSecond) != null){
                nextField = CheckFieldBoard.checkFreeField(fieldFigureSecond);
                if(nextField != null) {
                    ++step1;
                }
            }
        }
        if(step > 0 && step1 == 1 && getColor() == Color.WHITE){
            MoveFigure.oneMoveFigure(figureNumber , fieldFigureFirst , nextField , getColor());
            beat = Beat.beating(figureNumber , fieldFigureFirst , nextField , getColor());
            if(beat){
                Checkers.getRoot().getChildren().remove(Beat.getRemoveFigureBlack());
            }
            creatKingFigure.checkFiguresFinishFields(player);
            step = 0;
            step1 = 0;
            return true;
        }
        if(step > 0 && step1 == 1 && getColor() == Color.BLACK){
                MoveFigure.oneMoveFigure(figureNumber , fieldFigureFirst , nextField , getColor());
                beat = Beat.beating(figureNumber , fieldFigureFirst , nextField , getColor());
                if(beat){
                    Checkers.getRoot().getChildren().remove(Beat.getRemoveFigureWhite());
                }
                creatKingFigure.checkFiguresFinishFields(player);
                step = 0;
                step1 = 0;
                return true;
            }
            return false;
    }
    public String getName() {
        return name;
    }
    public  Color getColor() {
        return this.color;
    }
}
