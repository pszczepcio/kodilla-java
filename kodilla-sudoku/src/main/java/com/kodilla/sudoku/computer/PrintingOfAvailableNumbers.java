//package com.kodilla.sudoku.computer;
//
//import com.kodilla.sudoku.board.SudokuBoard;
//
//public class PrintingOfAvailableNumbers {
//
//    public static void print(){
//        for (int i = 0 ; i < 9 ; i++){
//            for(int j = 0 ; j < 9 ; j++) {
//                System.out.print(i + "," + j + " : ");
//                System.out.print(SudokuBoard.getSudokuBoard().get(i).getRow().get(j).getProbableNumbers().size() + " : ");
//                for (int a = 0; a < SudokuBoard.getProbaleNumbersSize(i, j); a++) {
//                    System.out.print(" " +SudokuBoard.getProbableNumber(i,j,a));
//                }
//                System.out.println();
//            }
//        }
//    }
//
//    public static void printProbableValoeInColumn(){
//        for(int i = 0 ; i < 9 ; i++){
//            for(int j = 0 ; j < 9 ; j++) {
//                if (SudokuBoard.getvalueOfSingleField(j,i) == -1){
//                System.out.print(j + " : " + i + " : ");
//                System.out.print(SudokuBoard.getSudokuBoard().get(j).getRow().get(i).getProbableNumbers().size() + " :  ");
//                for (int x = 0; x < SudokuBoard.getProbaleNumbersSize(j, i); x++) {
//                    System.out.print(SudokuBoard.getProbableNumber(j, i, x));
//                }
//                System.out.println();
//            }
//            }
//        }
//        System.out.println();
//        System.out.println();
//    }
//}
