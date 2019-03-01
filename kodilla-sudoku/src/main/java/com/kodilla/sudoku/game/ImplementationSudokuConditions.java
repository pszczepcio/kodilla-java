package com.kodilla.sudoku.game;

import com.kodilla.sudoku.board.SudokuBoard;

import java.util.ArrayList;
import java.util.List;

public class ImplementationSudokuConditions extends Sections{
    private boolean writeNumber;
    private static List<Integer> numbersEntered = new ArrayList<>();
    private List<Integer> list;
    private int numberBlock;
    private int counter;

    public boolean attemptToSolve() {
        writeNumber = false;
        for(int i = 0 ; i < 9 ; i++){
            for(int j = 0 ; j < 9 ; j++){
                if(SudokuBoard.getSudokuBoard().get(i).getRow().get(j).getValue() == -1){
                    checkSingleField(i,j);
                    numbersEntered.clear();
                }
            }
        }
        for(int i = 0 ; i < 9 ; i++){
            for(int j = 0 ; j < 9 ; j++){
                numberBlock = searchBlockNumber(i+1,j+1);
                list = busyFieldsInBlock(numberBlock);
              //  System.out.println(numberBlock);
                if(SudokuBoard.getProbaleNumbersSize(i+1,j+1) == 1){
                    numberBlock = searchBlockNumber(i+1,j+1);
                    list = busyFieldsInBlock(numberBlock);
                    for (int x = 0 ; x < list.size() ; x++ ) {
                        if(SudokuBoard.getProbableNumber(i+1,j+1, 0 ) != list.get(x)){
                            ++counter;
                        }
                        if (counter == list.size()) {
                            SudokuBoard.setvalueOfSingleField(i + 1, j + 1, SudokuBoard.getProbableNumber(i + 1, j + 1, 0));
                            SudokuBoard.getSudokuBoard().get(i).getRow().get(j).getProbableNumbers().remove(0);
                            writeNumber = true;
                        }
                    }
                }
            }
        }
        return writeNumber;
    }

    public void checkSingleField(int row, int column){
        for(int i = 0 ; i < 9 ; i++){
            if(SudokuBoard.getSudokuBoard().get(row).getRow().get(i).getValue() != -1){
                numbersEntered.add(SudokuBoard.getSudokuBoard().get(row).getRow().get(i).getValue());
            }
        }
        for (int i = 0 ; i < numbersEntered.size() ; i++){
            SudokuBoard.getSudokuBoard().get(row).getRow().get(column).getProbableNumbers().remove(numbersEntered.get(i));
        }
        numbersEntered.clear();
        for(int i = 0 ; i < 9 ; i++){
            if(SudokuBoard.getSudokuBoard().get(i).getRow().get(column).getValue() != -1){
                numbersEntered.add(SudokuBoard.getSudokuBoard().get(i).getRow().get(column).getValue());
            }
        }
        for(int i = 0 ; i < numbersEntered.size() ; i++){
            SudokuBoard.getSudokuBoard().get(row).getRow().get(column).getProbableNumbers().remove(numbersEntered.get(i));
        }
        numbersEntered.clear();

        int block = searchBlockNumber(row+1,column+1);
        list = busyFieldsInBlock(block);
        for(int i = 0 ; i < list.size() ; i++){
            SudokuBoard.getSudokuBoard().get(row).getRow().get(column).getProbableNumbers().remove(list.get(i));
        }
        list.clear();
    }

    public int searchBlockNumber(int row , int column){
        if(1 <= column && column <= 3 && 1 <= row && row <= 3){
            return numberBlock = 1;
        }else if(4 <= column && column <= 6 && 1 <= row && row <= 3){
            return numberBlock = 2;
        }else if(7 <= column && column <= 9 && 1 <= row && row <= 3){
            return numberBlock = 3;
        }else if(1 <= column && column <= 3 && 4 <= row && row <= 6){
            return numberBlock = 4;
        }else if(4 <= column && column <= 6 && 4 <= row && row <= 6){
            return numberBlock = 5;
        }else if(7 <= column && column <= 9 && 4 <= row && row <= 6){
            return numberBlock = 6;
        }else if(1 <= column && column <= 3 && 7 <= row && row <= 9){
            return numberBlock = 7;
        }else if(4 <= column && column <= 6 && 7 <= row && row <= 9){
            return numberBlock = 8;
        }else if(7 <= column && column <= 9 && 7 <= row && row <= 9){
            return numberBlock = 9;
        }else{
            numberBlock = 0;
        }
        return numberBlock;
    }

    public List<Integer> busyFieldsInBlock(int numberBlock){
        switch (numberBlock){
            case SECTION1: {
                numbersEntered.clear();
                for(int i = 0 ; i < 3 ; i++){
                    for(int j = 0 ; j < 3 ; j++){
                        if(SudokuBoard.getvalueOfSingleField(i+1,j+1) != -1) {
                            numbersEntered.add(SudokuBoard.getvalueOfSingleField(i + 1, j + 1));
                        }
                    }
                }
                break;
            }
            case SECTION2: {
                numbersEntered.clear();
                for(int i = 0 ; i < 3 ; i++){
                    for(int j = 3 ; j < 6 ; j++){
                        if(SudokuBoard.getvalueOfSingleField(i+1,j+1) != -1) {
                            numbersEntered.add(SudokuBoard.getvalueOfSingleField(i + 1, j + 1));
                        }
                    }
                }
                break;
            }
            case  SECTION3: {
                numbersEntered.clear();
                for(int i = 0 ; i < 3 ; i++){
                    for(int j = 6 ; j < 9 ; j++){
                        if(SudokuBoard.getvalueOfSingleField(i+1,j+1) != -1) {
                            numbersEntered.add(SudokuBoard.getvalueOfSingleField(i + 1, j + 1));
                        }
                    }
                }
                break;
            }
            case SECTION4: {
                numbersEntered.clear();
                for(int i = 3 ; i < 6 ; i++){
                    for(int j = 0 ; j < 3 ; j++){
                        if(SudokuBoard.getvalueOfSingleField(i+1,j+1) != -1) {
                            numbersEntered.add(SudokuBoard.getvalueOfSingleField(i + 1, j + 1));
                        }
                    }
                }
                break;
            }
            case SECTION5: {
                numbersEntered.clear();
                for(int i = 3 ; i < 6 ; i++){
                    for(int j = 3 ; j < 6 ; j++){
                        if(SudokuBoard.getvalueOfSingleField(i+1,j+1) != -1) {
                            numbersEntered.add(SudokuBoard.getvalueOfSingleField(i + 1, j + 1));
                        }
                    }
                }
                break;
            }
            case SECTION6: {
                numbersEntered.clear();
                for(int i = 3 ; i < 6 ; i++){
                    for(int j = 6 ; j < 9 ; j++){
                        if(SudokuBoard.getvalueOfSingleField(i+1,j+1) != -1) {
                            numbersEntered.add(SudokuBoard.getvalueOfSingleField(i + 1, j + 1));
                        }
                    }
                }
                break;
            }
            case SECTION7: {
                numbersEntered.clear();
                for(int i = 6 ; i < 9 ; i++){
                    for(int j = 0 ; j < 3 ; j++){
                        if(SudokuBoard.getvalueOfSingleField(i+1,j+1) != -1) {
                            numbersEntered.add(SudokuBoard.getvalueOfSingleField(i + 1, j + 1));
                        }
                    }
                }
                break;
            }
            case SECTION8: {
                numbersEntered.clear();
                for(int i = 6 ; i < 9 ; i++){
                    for(int j = 3 ; j < 6 ; j++){
                        if(SudokuBoard.getvalueOfSingleField(i+1,j+1) != -1) {
                            numbersEntered.add(SudokuBoard.getvalueOfSingleField(i + 1, j + 1));
                        }
                    }
                }
                break;
            }
            case SECTION9: {
                numbersEntered.clear();
                for(int i = 6 ; i < 9 ; i++){
                    for(int j = 6 ; j < 9 ; j++){
                        if(SudokuBoard.getvalueOfSingleField(i+1,j+1) != -1) {
                            numbersEntered.add(SudokuBoard.getvalueOfSingleField(i + 1, j + 1));
                        }
                    }
                }
                break;
            }
        }
        return numbersEntered;
    }
}
