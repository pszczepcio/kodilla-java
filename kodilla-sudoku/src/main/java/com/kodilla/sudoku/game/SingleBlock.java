package com.kodilla.sudoku.game;

public class SingleBlock {
    private int row;
    private int column;
    private int number;

    public SingleBlock(int row, int column, int number) {
        this.row = row;
        this.column = column;
        this.number = number;
    }

    public int getRow() {
        return row;
    }

    public int getColumn() {
        return column;
    }

    public int getNumber() {
        return number;
    }
}
