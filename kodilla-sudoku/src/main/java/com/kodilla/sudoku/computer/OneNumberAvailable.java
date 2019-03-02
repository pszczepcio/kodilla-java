package com.kodilla.sudoku.computer;

import com.kodilla.sudoku.board.SudokuBoard;
import com.kodilla.sudoku.game.RemoveAllProbableNumber;

public class OneNumberAvailable {
    private static boolean oneNumberAvailable ;

    public static boolean enterOneNumberAvailable(){
        oneNumberAvailable = false;
        for(int i = 0 ; i < 9 ; i ++){
            for(int j = 0 ; j < 9 ; j++){
                if (SudokuBoard.getvalueOfSingleField(i, j)==-1 && SudokuBoard.getProbaleNumbersSize(i,j) == 1){
                    SudokuBoard.setvalueOfSingleField(i, j, SudokuBoard.getProbableNumber(i, j,0));
                    RemoveAllProbableNumber.removeAllProbableNumbers();
                    oneNumberAvailable = true;
                }
            }
        }
        return oneNumberAvailable;
    }
}
