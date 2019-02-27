package com.kodilla.sudoku.board;

import java.util.ArrayList;
import java.util.List;

public class SudokuElement {
    public static int EMPTY = -1;
    private int value;
    private List<Integer> probableNumbers = new ArrayList<>();

    public SudokuElement() {
        value = EMPTY;
        for(int i = 1 ; i <= 9 ; i++){
            probableNumbers.add(i);
        }
    }

    public int getValue() {
        return value;
    }

    public List<Integer> getProbableNumbers() {
        return probableNumbers;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
