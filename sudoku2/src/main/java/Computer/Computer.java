package Computer;

import board.SudokuBoard;




public class Computer {
    private SudokuBoard sudokuBoard;

    public Computer(SudokuBoard sudokuBoard) {
        this.sudokuBoard = sudokuBoard;
    }

    public void sudokuSolution(){
        Solve solve = new Solve();
        solve.solve(this.sudokuBoard);
        this.sudokuBoard.printBoard();
    }
}

