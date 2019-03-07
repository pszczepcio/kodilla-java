package board;

import InsertData.NumberDTO;
import game.BackTrack;

import java.util.ArrayList;
import java.util.List;

public class CopyBoardAndBadMove {
    private static List<BackTrack> badMoves = new ArrayList<>();
    private NumberDTO numberDTO;
    private SudokuBoard sudokuBoard;
    private SudokuBoard board ;

    public CopyBoardAndBadMove(SudokuBoard sudokuBoard, NumberDTO numberDTO) {
        this.sudokuBoard = sudokuBoard;
        this.numberDTO = numberDTO;
    }

    public void copyBadMove(){
        board = null;
        try{
            board = this.sudokuBoard.deepCopy();
        }catch(CloneNotSupportedException e){
            System.out.println(e);
        }
        badMoves.add(new BackTrack(board,this.numberDTO));

    }


    public SudokuBoard getBoard() {
        return board;
    }

    public static List<BackTrack> getBadMoves() {
        return badMoves;
    }

    public NumberDTO getNumberDTO() {
        return numberDTO;
    }

}
