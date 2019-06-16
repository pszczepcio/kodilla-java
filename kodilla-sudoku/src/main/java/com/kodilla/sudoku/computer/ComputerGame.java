//package com.kodilla.sudoku.computer;
//
//import com.kodilla.sudoku.board.SudokuBoard;
//import com.kodilla.sudoku.game.RemoveAllProbableNumber;
//
//public class ComputerGame {
//    private RemoveAllProbableNumber removeAllProbableNumber = new RemoveAllProbableNumber();
//    private boolean game = false;
//    private int counter;
//
//    public boolean sudokuSolution(){
//        counter = 0;
//        while (!game) {
//            RemoveAllProbableNumber.removeAllProbableNumbers();
//            PrintingOfAvailableNumbers.print();
//            SudokuBoard.printBoard();
//
//            EnterOneOccurrenceInSection.createFilledFieldList(0,0,3,3);
//            EnterOneOccurrenceInSection.creatProbableFieldList(0,0,3,3);
//            EnterOneOccurrenceInSection.enterAllSingleValueInSection();
//            OneNumberAvailable.enterOneNumberAvailable();
//            EnterOneOccurrenceInSection.enterAllSingleValueInSection();
//
//            if (!(OneNumberAvailable.enterOneNumberAvailable() || EnterOneOccurrenceInSection.enterAllSingleValueInSection())){
//                game = true;
//            }
//            PrintingOfAvailableNumbers.printProbableValoeInColumn();
//            SudokuBoard.printBoard();
//        }
//        return true;
//    }
//}
