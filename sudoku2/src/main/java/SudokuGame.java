

import Computer.SudokuSolution;
import InsertData.InsertNumber;
import InsertData.NumberDTO;
import board.*;
import game.CheckSolution;
import game.InformationAboutIncorrectNumbers;


public class SudokuGame {
    public static void main(String[] args) {
        InformationAboutIncorrectNumbers informationAboutIncorrectNumbers;
        //CopyBoardAndBadMove copyBoardAndBadMove;
        SudokuBoard sudokuBoard;
        GameStart gameStart = new GameStart();
        NumberDTO numberDTO;
        sudokuBoard = gameStart.startSudoku();
        InsertNumber insertNumber = new InsertNumber(sudokuBoard);
        SudokuSolution sudokuSolution = new SudokuSolution(sudokuBoard);
        sudokuSolution.SudokuSolution();
        SudokuGame sudokuGame = new SudokuGame();
        boolean gameFinished = false;


        while(!gameFinished) {
            numberDTO = insertNumber.checkingInsertNumbers();
            if (numberDTO != null){
                sudokuBoard.setValueOfSingleField(numberDTO.getRowNumber(),
                        numberDTO.getColumnNumber(),
                        numberDTO.getNumber());
                for(int i = 0 ; i < 50 ; i++){
                    System.out.println();
                }
                sudokuBoard.printBoard();
            }

            informationAboutIncorrectNumbers = new InformationAboutIncorrectNumbers(sudokuSolution.getCopySudokuBoard(), sudokuBoard, numberDTO);
            gameFinished = informationAboutIncorrectNumbers.countIncorrectNumbers();

            CheckSolution checkSolution = new CheckSolution(sudokuBoard,sudokuSolution.getCopySudokuBoard());
             if(checkSolution.checkingSolution()){
                 gameFinished = sudokuGame.resolveSudoku();
                 if(!gameFinished){
                     sudokuBoard.getSudokuBoard().clear();
                     sudokuBoard = gameStart.startSudoku();
                     sudokuSolution.SudokuSolution();
                 }
             }
        }

        System.out.println("Game End");
    }

    private  boolean resolveSudoku(){
        InsertNumber insertNumber = new InsertNumber();
        return insertNumber.playAgain();
    }
}
