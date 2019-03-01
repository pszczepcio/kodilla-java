package com.kodilla.sudoku.game;

import com.kodilla.sudoku.board.SudokuBoard;

public class AutomaticSudokuResolution {
    private ConditionsForThreeSections conditionsForThreeSections = new ConditionsForThreeSections();
    private SudokuConditions sudokuConditions;
    private ImplementationSudokuConditions implementationSudokuConditions = new ImplementationSudokuConditions();
    private ConditionsOfSection conditionsOfSection = new ConditionsOfSection();
    private int counter;
    boolean a = false;

    public boolean Solution(){

//            implementationSudokuConditions.attemptToSolve();
//            conditionsOfSection.transitionAfterSections();
//            conditionsOfSection.replenishmentOfSingleFreeField();
            conditionsForThreeSections.checkconditionsForThreeSections();
            SudokuBoard.printBoard();
            System.out.println();
            return true;
    }
}
