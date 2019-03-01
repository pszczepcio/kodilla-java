package com.kodilla.sudoku.board;

public class GenerateBoard {
    //private SudokuBoard sudokuBoard = new SudokuBoard();

    public void creatNewBoard() {
        SudokuBoard.setvalueOfSingleField(1, 2, 2);
        SudokuBoard.setvalueOfSingleField(2, 1, 8);
        SudokuBoard.setvalueOfSingleField(3, 2, 3);

        SudokuBoard.setvalueOfSingleField(1, 4, 5);
        SudokuBoard.setvalueOfSingleField(1, 6, 1);
        SudokuBoard.setvalueOfSingleField(2, 4, 2);
        SudokuBoard.setvalueOfSingleField(2, 6, 3);
        SudokuBoard.setvalueOfSingleField(3, 5, 6);

        SudokuBoard.setvalueOfSingleField(1, 8, 9);
        SudokuBoard.setvalueOfSingleField(2, 9, 6);
        SudokuBoard.setvalueOfSingleField(3, 8, 7);

        SudokuBoard.setvalueOfSingleField(4, 3, 1);
        SudokuBoard.setvalueOfSingleField(5, 1, 5);
        SudokuBoard.setvalueOfSingleField(5, 2, 4);
        SudokuBoard.setvalueOfSingleField(6, 3, 2);

        SudokuBoard.setvalueOfSingleField(4, 7, 6);
        SudokuBoard.setvalueOfSingleField(5, 8, 1);
        SudokuBoard.setvalueOfSingleField(5, 9, 9);
        SudokuBoard.setvalueOfSingleField(6, 7, 7);

        SudokuBoard.setvalueOfSingleField(7, 2, 9);
        SudokuBoard.setvalueOfSingleField(8, 1, 2);
        SudokuBoard.setvalueOfSingleField(9, 2, 1);

        SudokuBoard.setvalueOfSingleField(7, 5, 3);
        SudokuBoard.setvalueOfSingleField(8, 4, 8);
        SudokuBoard.setvalueOfSingleField(9, 4, 9);
        SudokuBoard.setvalueOfSingleField(8, 6, 4);
        SudokuBoard.setvalueOfSingleField(9, 6, 7);

        SudokuBoard.setvalueOfSingleField(7, 8, 8);
        SudokuBoard.setvalueOfSingleField(8, 9, 7);
        SudokuBoard.setvalueOfSingleField(9, 8, 6);

        SudokuBoard.setvalueOfSingleField(9, 3, 8);
//        SudokuBoard.setvalueOfSingleField(1, 3, 6);
//        SudokuBoard.setvalueOfSingleField(1, 7, 3);
//        SudokuBoard.setvalueOfSingleField(1, 9, 8);
//        SudokuBoard.setvalueOfSingleField(9, 1, 3);

        SudokuBoard.printBoard();
    }
}
