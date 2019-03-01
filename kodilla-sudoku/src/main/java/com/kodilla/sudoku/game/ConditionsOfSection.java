package com.kodilla.sudoku.game;

import com.kodilla.sudoku.board.SudokuBoard;
import com.kodilla.sudoku.numbers.NumbersDto;

import java.util.ArrayList;
import java.util.List;

public class ConditionsOfSection {
    private BlockConditions blockConditions;
    private SudokuConditions sudokuConditions;
    private static List<NumbersDto> listOfEnteredDigits = new ArrayList<>();
    private static List<NumbersDto> listOfProbableNumber = new ArrayList<>();
    private static List<Integer> indexList = new ArrayList<>();
    private static List<Integer> typedNumbersVertically = new ArrayList<>();
    private static List<Integer> typedNumbersHorizontally = new ArrayList<>();
    private NumbersDto numbersDto1;
    private int counter;
    private int row;
    private int column;

    public void checkCoditionsOfSection(int iStart, int jStart, int iEnd, int jEnd){
        for(int i = iStart ; i < iEnd ; i++){
            for(int j = jStart ; j < jEnd ; j++){
                if(SudokuBoard.getvalueOfSingleField(i+1 , j+1) != -1){
                    indexList.add(SudokuBoard.getvalueOfSingleField(i+1,j+1));
                }
            }
        }
        for(int i = iStart ; i < iEnd ; i++) {
            for (int j = jStart; j < jEnd; j++) {
                if (SudokuBoard.getvalueOfSingleField(i+1,j+1) == -1){
                    for(int x = 0 ; x < indexList.size() ; x++){
                        SudokuBoard.getSudokuBoard().get(i).getRow().get(j).getProbableNumbers().remove(indexList.get(x));
                    }
                }
            }
        }

        indexList.clear();
        for(int i = iStart ; i < iEnd ; i++) {
            for (int j = jStart; j < jEnd; j++) {
                if(SudokuBoard.getvalueOfSingleField(i+1, j+1) == -1){
                    for (int x = 0 ; x < SudokuBoard.getProbaleNumbersSize(i+1, j+1) ; x++) {
                        listOfProbableNumber.add(new NumbersDto(i+1, j+1, SudokuBoard.getProbableNumber(i+1, j+1, x)));
                    }
                }
            }
        }
        counter = 0;
        numbersDto1 = null;
        for (int i = 1 ; i <= 9 ; i++){
            for (int j = 0 ; j < listOfProbableNumber.size() ; j++){
                if(listOfProbableNumber.get(j).getNumber() == i){
                    numbersDto1 = listOfProbableNumber.get(j);
                    ++counter;
                }
            }
            if(counter == 1){
                sudokuConditions = new SudokuConditions(numbersDto1);
                if (sudokuConditions.checkFreeColumn() && sudokuConditions.checkFreeRow()){
                    SudokuBoard.setvalueOfSingleField(numbersDto1.getRowNumber(), numbersDto1.getColumnNumber(), numbersDto1.getNumber());
                    System.out.println("dupsko");
                }
            }
        }
        numbersDto1 = null;
        listOfProbableNumber.clear();
        counter = 0;
        indexList.clear();
    }

    public void transitionAfterSections(){
        for (int i = 0; i < 9; i = i + 3) {
            for (int j = 0; j < 9; j = j + 3) {
                int iStart = i;
                int jStart = j;
                int iEnd = i + 3;
                int jEnd = j + 3;
                checkCoditionsOfSection(iStart, jStart, iEnd, jEnd);
            }
        }
    }

    public void replenishmentOfSingleFreeField(){
        sudokuConditions = null;
        for(int i = 0 ; i < 9 ; i++){
            for(int j = 0 ; j < 9 ; j++) {
               if(SudokuBoard.getvalueOfSingleField(i+1,j+1) == -1){
                   column = j;
                   ++counter;
               }else if(SudokuBoard.getvalueOfSingleField(i+1, j+1) != -1){
                   typedNumbersHorizontally.add(SudokuBoard.getvalueOfSingleField(i+1,j+1));
               }
            }
            if (counter == 1){

                for(int x = 1 ; x <= 9 ; x++){
                    if (!typedNumbersHorizontally.contains(x)){
                        if(SudokuBoard.getProbaleNumbersSize(i+1, column +1) == 1){
                            System.out.println("cycuszki poziom");
                            numbersDto1 = new NumbersDto(i+1, column +1, SudokuBoard.getProbableNumber(i+1,column+1, 0));
                            sudokuConditions = new SudokuConditions(numbersDto1);
                            blockConditions = new BlockConditions(numbersDto1);
                            if (sudokuConditions.checkFreeRow() && sudokuConditions.checkFreeColumn() &&  blockConditions.checkConditionForBlock(blockConditions.searchBlockNumber())){
                                SudokuBoard.setvalueOfSingleField(numbersDto1.getRowNumber(), numbersDto1.getColumnNumber(), numbersDto1.getNumber());
                            }
                        }
                    }
                }
                counter = 0;
            }
            typedNumbersHorizontally.clear();
            counter = 0;
            numbersDto1 = null;
            column = 0;
        }


        for(int i = 0 ; i < 9 ; i++){
            for(int j = 0 ; j < 9 ; j++) {
                if(SudokuBoard.getvalueOfSingleField(j+1,i+1) == -1){
                    row = j;
                    ++counter;
                }else if(SudokuBoard.getvalueOfSingleField(j+1, i+1) != -1){
                    typedNumbersVertically.add(SudokuBoard.getvalueOfSingleField(j+1,i+1));
                }
            }
            if (counter == 1){
                for (int x = 1 ; x <= 9 ; x++){
                   // System.out.println(SudokuBoard.getProbaleNumbersSize(6,1));
                    if(!typedNumbersVertically.contains(x)) {
                        System.out.println("cycuszki pion");
                        if (SudokuBoard.getProbaleNumbersSize(row + 1, i + 1) == 1) {
                            numbersDto1 = new NumbersDto(row + 1, i + 1, SudokuBoard.getProbableNumber(row + 1, i + 1, 0));
                            sudokuConditions = new SudokuConditions(numbersDto1);
                            blockConditions = new BlockConditions(numbersDto1);
                            if (sudokuConditions.checkFreeRow() && sudokuConditions.checkFreeColumn() &&  blockConditions.checkConditionForBlock(blockConditions.searchBlockNumber())) {
                                SudokuBoard.setvalueOfSingleField(numbersDto1.getRowNumber(), numbersDto1.getColumnNumber(), numbersDto1.getNumber());
                            }
                        }
                    }
                }
                counter = 0;
                typedNumbersVertically.clear();
                numbersDto1= null;
                row = 0;
            }
            typedNumbersVertically.clear();
            counter = 0;
        }
    }


}
