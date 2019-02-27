package com.kodilla.sudoku.numbers;

public class NumbersDto {
    private int columnNumber;
    private int rowNumber;
    private int number;

    public NumbersDto(int rowNumber, int columnNumber, int number) {
        this.rowNumber = rowNumber;
        this.columnNumber = columnNumber;
        this.number = number;
    }

    public int getColumnNumber() {
        return columnNumber;
    }

    public int getRowNumber() {
        return rowNumber;
    }

    public int getNumber() {
        return number;
    }
}
