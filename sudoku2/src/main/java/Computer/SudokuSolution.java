package Computer;

import board.SudokuBoard;

public class SudokuSolution {
    private Solve solve = new Solve();
    private SudokuBoard sudokuBoard;
    private SudokuBoard copySudokuBoard;

    public SudokuSolution(SudokuBoard sudokuBoard) {
        this.sudokuBoard = sudokuBoard;
    }

    public void SudokuSolution(){
        copySudokuBoard = null;
        try{
            copySudokuBoard = this.sudokuBoard.deepCopy();
        }catch (CloneNotSupportedException e){
            System.out.println(e);
        }

        solve.solve(copySudokuBoard);
    }

    public SudokuBoard getCopySudokuBoard() {
        return copySudokuBoard;
    }
}
