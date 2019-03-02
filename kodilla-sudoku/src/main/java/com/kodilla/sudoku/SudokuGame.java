package com.kodilla.sudoku;


import com.kodilla.sudoku.board.GenerateBoard;
import com.kodilla.sudoku.board.SudokuBoard;
import com.kodilla.sudoku.board.SudokuElement;
import com.kodilla.sudoku.board.SudokuRow;

import com.kodilla.sudoku.numbers.InsertingNumbers;


public class SudokuGame {
    public static void main(String[] args) {
        SudokuBoard sudokuBoard = new SudokuBoard();
        SudokuRow sudokuRow = new SudokuRow();
        SudokuElement sudokuElement = new SudokuElement();
        GenerateBoard generateBoard = new GenerateBoard();
        generateBoard.creatNewBoard();

        InsertingNumbers insertingNumbers = new InsertingNumbers();
        insertingNumbers.checkingInsertNumbers();




        boolean gameFinished = false;
      //  while(!gameFinished) {

            /*
            SudokuGame theGame = new SudokuGame();
            gameFinished = theGame.resolveSudoku();
            */
        }
   // }

    public boolean resolveSudoku() {
        return true;
    }
}
