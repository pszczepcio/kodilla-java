package com.kodilla.sudoku.game;

import com.kodilla.sudoku.board.SudokuBoard;
import com.kodilla.sudoku.numbers.NumbersDto;

public class BlockConditions extends Sections{
    private boolean block;
    private int numberBlock;
    private int column;
    private int row;
    private int number;


    public BlockConditions(NumbersDto numbersDto) {
        this.column = numbersDto.getColumnNumber();
        this.row = numbersDto.getRowNumber();
        this.number = numbersDto.getNumber();
    }

    public int searchBlockNumber(){
        if(1 <= this.column && this.column <= 3 && 1 <= this.row && this.row <= 3){
            return numberBlock = 1;
        }else if(4 <= this.column && this.column <= 6 && 1 <= this.row && this.row <= 3){
            return numberBlock = 2;
        }else if(7 <= this.column && this.column <= 9 && 1 <= this.row && this.row <= 3){
            return numberBlock = 3;
        }else if(1 <= this.column && this.column <= 3 && 4 <= this.row && this.row <= 6){
            return numberBlock = 4;
        }else if(4 <= this.column && this.column <= 6 && 4 <= this.row && this.row <= 6){
            return numberBlock = 5;
        }else if(7 <= this.column && this.column <= 9 && 4 <= this.row && this.row <= 6){
            return numberBlock = 6;
        }else if(1 <= this.column && this.column <= 3 && 7 <= this.row && this.row <= 9){
            return numberBlock = 7;
        }else if(4 <= this.column && this.column <= 6 && 7 <= this.row && this.row <= 9){
            return numberBlock = 8;
        }else if(7 <= this.column && this.column <= 9 && 7 <= this.row && this.row <= 9){
            return numberBlock = 9;
        }else{
            numberBlock = 0;
        }
        return numberBlock;
    }

    public boolean checkConditionForBlock(int number){
        block = true;
        switch (number){
            case SECTION1: {
                for(int i = 1 ; i <= 3 ; i++){
                    for(int j = 1 ; j <= 3 ; j++){
                      //  System.out.println(SudokuBoard.getvalueOfSingleField(i,j));
                        if(SudokuBoard.getvalueOfSingleField(i,j) == this.number){
                            block = false;
                            break;
                        }
                    }
                }
                return block;
            }
            case SECTION2: {
                for(int i = 1 ; i <= 3 ; i++){
                    for(int j = 4 ; j <= 6 ; j++){
                        if(SudokuBoard.getvalueOfSingleField(i,j) == this.number){
                            block = false;
                            break;
                        }
                    }
                }
                return block;
            }
            case SECTION3: {
                for(int i = 1 ; i <= 3 ; i++){
                    for(int j = 7 ; j <=9  ; j++){
                        if(SudokuBoard.getvalueOfSingleField(i,j) == this.number){
                            block = false;
                            break;
                        }
                    }
                }
                return block;
            }
            case SECTION4: {
                for(int i = 4 ; i <=6  ; i++){
                    for(int j = 1 ; j <= 3 ; j++){
                        if(SudokuBoard.getvalueOfSingleField(i,j) == this.number){
                            block = false;
                            break;
                        }
                    }
                }
                return block;
            }
            case SECTION5: {
                for(int i = 4 ; i <=6  ; i++){
                    for(int j = 4 ; j <= 6 ; j++){
                        if(SudokuBoard.getvalueOfSingleField(i,j) == this.number){
                            block = false;
                            break;
                        }
                    }
                }
                return block;
            }
            case SECTION6: {
                for(int i = 4 ; i <=6  ; i++){
                    for(int j = 7 ; j <= 9 ; j++){
                        if(SudokuBoard.getvalueOfSingleField(i,j) == this.number){
                            block = false;
                            break;
                        }
                    }
                }
                return block;
            }
            case SECTION7: {
                for(int i = 7 ; i <=9  ; i++){
                    for(int j = 1 ; j <= 3 ; j++){
                        if(SudokuBoard.getvalueOfSingleField(i,j) == this.number){
                            block = false;
                            break;
                        }
                    }
                }
                return block;
            }
            case SECTION8: {
                for(int i = 7 ; i <=9  ; i++){
                    for(int j = 4 ; j <= 6 ; j++){
                        if(SudokuBoard.getvalueOfSingleField(i,j) == this.number){
                            block = false;
                            break;
                        }
                    }
                }

            }
            case SECTION9: {
                for(int i = 7 ; i <=9  ; i++){
                    for(int j = 7 ; j <= 9 ; j++){
                        System.out.println(SudokuBoard.getvalueOfSingleField(i,j)+ " : " + this.number);
                        if(SudokuBoard.getvalueOfSingleField(i,j) == this.number){
                            block = false;
                            break;
                        }
                    }
                }

            }
        }
        return block;
    }

    public int getColumn() {
        return column;
    }

    public int getRow() {
        return row;
    }

    public int getNumber() {
        return number;
    }
}
