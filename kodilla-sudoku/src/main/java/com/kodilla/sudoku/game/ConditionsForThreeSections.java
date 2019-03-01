package com.kodilla.sudoku.game;

import com.kodilla.sudoku.board.SudokuBoard;
import com.kodilla.sudoku.numbers.NumbersDto;

import java.util.ArrayList;
import java.util.List;

public class ConditionsForThreeSections {
    private List<NumbersDto> column1 = new ArrayList<>();
    private List<NumbersDto> column2 = new ArrayList<>();
    private List<NumbersDto> column3 = new ArrayList<>();
    private NumbersDto numbersDto1;
    private NumbersDto numbersDto2;
    private NumbersDto numbersDto3;
    private boolean valueColumn1;
    private boolean valueColumn2;
    private boolean valueColumn3;
    private int number;

    public boolean checkconditionsForThreeSections(){
        for(int i = 1 ; i <= 3 ; i++){
            for(int j = 1 ; j <=9 ; j++){
                if (SudokuBoard.getvalueOfSingleField(j,i) != -1 && i == 1){
                    column1.add(new NumbersDto(j,i,SudokuBoard.getvalueOfSingleField(j,i)));
                }else if (SudokuBoard.getvalueOfSingleField(j,i) != -1 && i == 2){
                    column2.add(new NumbersDto(j,i,SudokuBoard.getvalueOfSingleField(j,i)));
                }else if (SudokuBoard.getvalueOfSingleField(j,i) != -1 && i == 3){
                    column3.add(new NumbersDto(j,i,SudokuBoard.getvalueOfSingleField(j,i)));
                }
            }
        }

        for(int i = 1 ; i <= 9 ; i++){
            number = i;
            valueColumn1 = column1.contains(i);
            valueColumn2 = column2.contains(i);
            valueColumn3 = column3.contains(i);

            if(valueColumn1 == true && valueColumn2 == true && valueColumn3 == false){
                for(NumbersDto list : column1){
                    if(number == list.getNumber()){
                        numbersDto1 = new NumbersDto(list.getRowNumber(), list.getColumnNumber(), list.getNumber());
                    }
                }
            }else if (valueColumn1 == true && valueColumn2 == false && valueColumn3 == true){
                for(NumbersDto list : column2){
                    if(number == list.getNumber()){
                        numbersDto2 = new NumbersDto(list.getRowNumber(), list.getColumnNumber(), list.getNumber());
                    }
                }

            }else if (valueColumn1 == false && valueColumn2 == true && valueColumn3 == true){

            }
        }
        System.out.println(column1.size());
        System.out.println(column2.size());
        System.out.println(column3.size());
        System.out.println(numbersDto2.getRowNumber() +", "+numbersDto2.getColumnNumber()+", "+numbersDto2.getNumber());
        return true;
    }
}
