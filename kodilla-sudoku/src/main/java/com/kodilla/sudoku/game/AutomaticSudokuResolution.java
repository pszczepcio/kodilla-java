package com.kodilla.sudoku.game;

import com.kodilla.sudoku.board.SudokuBoard;

public class AutomaticSudokuResolution {
    private ImplementationSudokuConditions implementationSudokuConditions = new ImplementationSudokuConditions();
    private int counter;

    public boolean Solution(){
        counter = 0;
        while(counter < 10){
            implementationSudokuConditions.attemptToSolve();
            for (int i = 0; i < 9; i = i + 3) {
                for (int j = 0; j < 9; j = j + 3) {
                    implementationSudokuConditions.attemptToSolve();
                    int iStart = i;
                    int jStart = j;
                    int iEnd = i + 3;
                    int jEnd = j + 3;
                    implementationSudokuConditions.attemptToSolve();
                    implementationSudokuConditions.singleSelectionInBlock(iStart, jStart, iEnd, jEnd);
                    implementationSudokuConditions.attemptToSolve();
                }
                implementationSudokuConditions.attemptToSolve();
            }
            counter++;
            implementationSudokuConditions.attemptToSolve();
        }
        SudokuBoard.printBoard();
        return true;
    }
}
