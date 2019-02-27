package com.kodilla.sudoku.game;

import com.kodilla.sudoku.board.SudokuBoard;
import com.kodilla.sudoku.numbers.NumbersDto;

public class SudokuConditions {
    private boolean available;
    private boolean allColumn;
    private boolean allRow;
    private boolean freeField;
    private int column;
    private int row;
    private int number;


    public SudokuConditions(NumbersDto numbersDto) {
        this.column = numbersDto.getColumnNumber();
        this.row = numbersDto.getRowNumber();
        this.number = numbersDto.getNumber();
    }

    public boolean checkFreeColumn(){
        allColumn = false;
        for (int i = 0; i < 9; i++) {
            if (SudokuBoard.getvalueOfSingleField(this.row, i+1) != this.number) {
                allColumn = true;
            } else {
                allColumn = false;
                break;
            }
        }
        return allColumn;
    }

    public boolean checkFreeRow(){
        allRow = false;
        for (int i = 0; i < 9; i++) {
            if (SudokuBoard.getvalueOfSingleField(i+1, this.column) != this.number){
                allRow = true;
            }else{
                allRow = false;
                break;
            }
        }
        return allRow;
    }

    public boolean checkFreeField(){
        freeField = false;
        if(SudokuBoard.getvalueOfSingleField(this.row , this.column) == -1){
            return freeField = true;
        }
        return freeField;
    }

    public boolean checkFreeColumnAndRow() {
        checkFreeColumn();
        checkFreeRow();
        checkFreeField();
        System.out.println(checkFreeColumn());
        System.out.println(freeField + ", " + allColumn + ", " + allRow);
        if(freeField && allColumn && allRow){
            available = true;
        }
      return available;
   }
}
