package com.kodilla.sudoku.board;

import java.util.ArrayList;
import java.util.List;

public class SudokuBoard {
    private static SudokuRow sudokuRow = new SudokuRow();
    private static List<SudokuRow> sudokuBoard = new ArrayList<>();

    public SudokuBoard() {
        for(int i = 1 ; i <= 9 ; i++){
            sudokuBoard.add(new SudokuRow());
        }
    }

    public static void printBoard(){
        for(int i = 0 ; i < 14 ;i++){
            System.out.print("  --");
        }
        System.out.println();
        for (int i = 0 ; i < getSudokuBoard().size() ; i++) {
            for(int j = 0 ; j < sudokuRow.getRow().size() ; j++){
                if(getSudokuBoard().get(i).getRow().get(j).getValue() == -1){
                    System.out.print("  |  " + " ");
                }else {
                    System.out.print("  |  " + getSudokuBoard().get(i).getRow().get(j).getValue());
                }
            }
            System.out.println("  |");
            for(int a = 0 ; a < 14 ; a++){
                System.out.print("  --");
            }
            System.out.println();
        }
    }

  //  public SudokuBoard deepCopy() throws CloneNotSupportedException{
//        SudokuBoard clonedSudokuBoard = (SudokuBoard)super.clone();
//        clonedSudokuBoard.sudokuBoard = new ArrayList<>();
//        for(SudokuRow theSudokuRow : sudokuBoard){
//            SudokuRow clonedSudokuRow = new SudokuRow(theSudokuRow.getRow().);
//            for (SudokuElement coptSudokuElement: theSudokuRow.getRow()) {
//                clonedSudokuRow.getRow().add(coptSudokuElement);
//                for(int i = 0 ; i < coptSudokuElement.getProbableNumbers().size() ; i++) {
//                    coptSudokuElement.getValue();
//                   coptSudokuElement.getProbableNumbers();
//                }
//            }
//            sudokuBoard.add(clonedSudokuRow);
//        }
//        return clonedSudokuBoard;
   // }

    public  static List<SudokuRow> getSudokuBoard() {
        return sudokuBoard;
    }

    public static int getvalueOfSingleField(int row, int column){
        return getSudokuBoard().get(row).getRow().get(column).getValue();
    }

    public static void setvalueOfSingleField(int row, int column, int number){
        getSudokuBoard().get(row).getRow().get(column).setValue(number);
    }

    public static int getProbaleNumbersSize(int row , int column){
        return getSudokuBoard().get(row).getRow().get(column).getProbableNumbers().size();
    }

    public static int getProbableNumber(int row, int column, int numberOfList){
        return getSudokuBoard().get(row).getRow().get(column).getProbableNumbers().get(numberOfList);
    }

    public static void setSudokuBoard(List<SudokuRow> sudokuBoard) {
        SudokuBoard.sudokuBoard = sudokuBoard;
    }
}
