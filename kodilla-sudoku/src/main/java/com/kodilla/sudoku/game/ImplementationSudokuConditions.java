package com.kodilla.sudoku.game;

import com.kodilla.sudoku.board.SudokuBoard;

import java.util.ArrayList;
import java.util.List;

public class ImplementationSudokuConditions {
    private static final int CASE1 = 1;
    private static final int CASE2 = 2;
    private static final int CASE3 = 3;
    private static final int CASE4 = 4;
    private static final int CASE5 = 5;
    private static final int CASE6 = 6;
    private static final int CASE7 = 7;
    private static final int CASE8 = 8;
    private static final int CASE9 = 9;
    private boolean writeNumber;
    private boolean singleSelection;
    private static List<Integer> numbersEntered = new ArrayList<>();
    private List<SingleBlock> singleBlockList = new ArrayList<>();
    private int numberRepetitions;
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
                if(SudokuBoard.getProbaleNumbersSize(i+1,j+1) == 1){
                    SudokuBoard.setvalueOfSingleField(i+1, j+1, SudokuBoard.getProbableNumber(i+1, j+1, 0));
                    SudokuBoard.getSudokuBoard().get(i).getRow().get(j).getProbableNumbers().remove(0);
                    writeNumber = true;
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
            case CASE1: {
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
            case CASE2: {
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
            case  CASE3: {
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
            case CASE4: {
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
            case CASE5: {
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
            case CASE6: {
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
            case CASE7: {
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
            case CASE8: {
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
            case CASE9: {
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

    public boolean singleSelectionInBlock(int iStart, int jStart, int iEnd, int jEnd){
        singleSelection = false;
        singleBlockList.clear();
        for(int i = iStart ; i < iEnd ; i++) {
            for (int j = jStart; j < jEnd; j++) {
                if (SudokuBoard.getvalueOfSingleField(i + 1, j + 1) == -1) {
                    for (int a = 0; a < SudokuBoard.getProbaleNumbersSize(i + 1, j + 1) ; a++) {
                        singleBlockList.add(new SingleBlock(i, j, SudokuBoard.getProbableNumber(i + 1, j + 1, a)));
                    }
                }
            }
        }
        for(int j = 1 ; j <= 9 ; j++){
            for(int i = 0 ; i < singleBlockList.size() ; i++){
                if(singleBlockList.get(i).getNumber() == j){
                    numberRepetitions = i;
                    counter++;
                }
            }
            if(counter == 1){
                SudokuBoard.setvalueOfSingleField(singleBlockList.get(numberRepetitions).getRow() +1 , singleBlockList.get(numberRepetitions).getColumn() + 1, singleBlockList.get(numberRepetitions).getNumber());
                singleSelection = true;
            }
            counter = 0;
        }
        return singleSelection;
    }

}