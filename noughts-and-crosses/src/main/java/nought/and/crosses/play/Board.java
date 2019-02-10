package nought.and.crosses.play;


import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import java.util.ArrayList;
import java.util.List;

public class Board{
    private List<Rectangle> board = new ArrayList<>();

    public Board() {
        for(int i = 0 ; i < 3 ; i++){
            for(int j = 0 ; j < 3 ; j++){
                Rectangle field = new Rectangle(i*200, j*200, 200, 200);
                field.setFill(Color.WHITESMOKE);
                field.setStroke(Color.BLACK);
                board.add(field);
            }
        }
    }

    public List<Rectangle> getBoard() {
        return board;
    }
}
