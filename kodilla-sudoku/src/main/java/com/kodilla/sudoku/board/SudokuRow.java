//package com.kodilla.sudoku.board;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class SudokuRow {
//    private List<SudokuElement> row = new ArrayList<>();
//
//    public SudokuRow(List<SudokuElement> row) {
//            this.row = row;
//        //        for(int i = 1 ; i <= 9 ; i++){
////            row.add(new SudokuElement());
////        }
//    }
//
//    public List<SudokuElement> getRow() {
//        return row;
//    }
//
//    public int getProbaleNumbers(int i, int j){
//        return  getRow().get(i).getProbableNumbers().get(j);
//    }
//
//    public void removeProbableNumber(int i , int j){
//        getRow().get(i).getProbableNumbers().remove(j);
//    }
//
//}
