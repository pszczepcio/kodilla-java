package com.kodilla.sudoku.board;

public class GenerateBoard {

    public void creatNewBoard() {


        SudokuBoard.setvalueOfSingleField(0, 1, 2);
        SudokuBoard.setvalueOfSingleField(1, 0, 8);
        SudokuBoard.setvalueOfSingleField(2, 1, 3);

        SudokuBoard.setvalueOfSingleField(0, 3, 5);
        SudokuBoard.setvalueOfSingleField(0, 5, 1);
        SudokuBoard.setvalueOfSingleField(1, 3, 2);
        SudokuBoard.setvalueOfSingleField(1, 5, 3);
        SudokuBoard.setvalueOfSingleField(2, 4, 6);

        SudokuBoard.setvalueOfSingleField(0, 7, 9);
        SudokuBoard.setvalueOfSingleField(1, 8, 6);
        SudokuBoard.setvalueOfSingleField(2, 7, 7);

        SudokuBoard.setvalueOfSingleField(3, 2, 1);
        SudokuBoard.setvalueOfSingleField(4, 0, 5);
        SudokuBoard.setvalueOfSingleField(4, 1, 4);
        SudokuBoard.setvalueOfSingleField(5, 2, 2);

        SudokuBoard.setvalueOfSingleField(3, 6, 6);
        SudokuBoard.setvalueOfSingleField(4, 7, 1);
        SudokuBoard.setvalueOfSingleField(4, 8, 9);
        SudokuBoard.setvalueOfSingleField(5, 6, 7);

        SudokuBoard.setvalueOfSingleField(6, 1, 9);
        SudokuBoard.setvalueOfSingleField(7, 0, 2);
        SudokuBoard.setvalueOfSingleField(8, 1, 1);

        SudokuBoard.setvalueOfSingleField(6, 4, 3);
        SudokuBoard.setvalueOfSingleField(7, 3, 8);
        SudokuBoard.setvalueOfSingleField(8, 3, 9);
        SudokuBoard.setvalueOfSingleField(7, 5, 4);
        SudokuBoard.setvalueOfSingleField(8, 5, 7);

        SudokuBoard.setvalueOfSingleField(6, 7, 8);
        SudokuBoard.setvalueOfSingleField(7, 8, 7);
        SudokuBoard.setvalueOfSingleField(8, 7, 6);

//        SudokuBoard.setvalueOfSingleField(8, 2, 8);
//        SudokuBoard.setvalueOfSingleField(1, 3, 6);
//        SudokuBoard.setvalueOfSingleField(1, 7, 3);
//        SudokuBoard.setvalueOfSingleField(1, 9, 8);
//        SudokuBoard.setvalueOfSingleField(9, 1, 3);

        SudokuBoard.printBoard();
    }
}
