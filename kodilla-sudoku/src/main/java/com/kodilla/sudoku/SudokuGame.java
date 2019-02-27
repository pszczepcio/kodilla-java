package com.kodilla.sudoku;


import com.kodilla.sudoku.board.GenerateBoard;
import com.kodilla.sudoku.board.SudokuBoard;
import com.kodilla.sudoku.game.BlockConditions;
import com.kodilla.sudoku.game.SudokuConditions;
import com.kodilla.sudoku.numbers.InsertingNumbers;
import com.kodilla.sudoku.numbers.NumbersDto;


public class SudokuGame {
    public static void main(String[] args) {
        SudokuBoard sudokuBoard = new SudokuBoard();
        GenerateBoard generateBoard = new GenerateBoard();
        generateBoard.creatNewBoard();

        NumbersDto numbersDto ;
        InsertingNumbers insertingNumbers = new InsertingNumbers();
        SudokuConditions sudokuConditions;
        boolean gameFinished = false;
        while(!gameFinished) {
            /*
            SudokuGame theGame = new SudokuGame();
            gameFinished = theGame.resolveSudoku();
            */
            insertingNumbers.checkingInsertNumbers();
            numbersDto = insertingNumbers.getNumbersDto();
            System.out.println(numbersDto.getRowNumber() + ", " + numbersDto.getColumnNumber() + ", " + numbersDto.getNumber());
            sudokuConditions = new SudokuConditions(numbersDto);
            BlockConditions blockConditions = new BlockConditions(numbersDto);
            if(sudokuConditions.checkFreeColumnAndRow() && blockConditions.checkConditionForBlock(blockConditions.searchBlockNumber())) {
                SudokuBoard.setvalueOfSingleField(insertingNumbers.getNumbersDto().getRowNumber(), insertingNumbers.getNumbersDto().getColumnNumber()
                        , insertingNumbers.getNumbersDto().getNumber());
                for (int i = 0; i < 50; i++) {
                    System.out.println();
                }
                SudokuBoard.printBoard();
            }
        }
    }

    public boolean resolveSudoku() {
        return true;
    }
}
