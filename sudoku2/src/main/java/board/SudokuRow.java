package board;

import java.util.ArrayList;
import java.util.List;

public class SudokuRow {

    private List<SudokuElement> sudokuElementsInRow = new ArrayList<>();


    public List<SudokuElement> getSudokuElementsInRow() {
        return sudokuElementsInRow;
    }

    public void setSudokuElementsInRow(List<SudokuElement> sudokuElementsInRow) {
        this.sudokuElementsInRow = sudokuElementsInRow;
    }
}
