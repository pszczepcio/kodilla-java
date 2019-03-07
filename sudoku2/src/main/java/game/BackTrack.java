package game;

import InsertData.NumberDTO;
import board.SudokuBoard;

public class BackTrack {
    private SudokuBoard sudokuBoard;
    private NumberDTO numberDTO;

    public BackTrack(SudokuBoard sudokuBoard, NumberDTO numberDTO) {
        this.sudokuBoard = sudokuBoard;
        this.numberDTO = numberDTO;
    }

    public SudokuBoard getSudokuBoard() {
        return sudokuBoard;
    }

    public NumberDTO getNumberDTO() {
        return numberDTO;
    }
}
