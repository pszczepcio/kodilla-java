package game;

import Computer.SudokuSolution;
import board.SudokuBoard;

public class CheckSolution {
    private final static int SUDOKU_SIZE = 81;
    private SudokuBoard sudokuBoard;
    private SudokuBoard copySudokuBoard;
    private  int counter = 0;

    public CheckSolution(SudokuBoard sudokuBoard, SudokuBoard copySudokuBoard) {
        this.sudokuBoard = sudokuBoard;
        this.copySudokuBoard = copySudokuBoard;
    }

    public boolean checkingSolution(){
        for (int i = 0 ; i < 9 ; i++){
            for (int j = 0 ; j < 9 ; j++){
                if (this.sudokuBoard.getvalueOfSingleField(i, j) == copySudokuBoard.getvalueOfSingleField(i, j)){
                    ++counter;
                }
            }
        }
        if(counter == SUDOKU_SIZE){
            return true;
        }
        return false;
    }

}
