package game;

import InsertData.InsertNumber;
import board.SudokuBoard;

public class CheckResult {
    private CheckSolution checkSolution;
    private static SudokuBoard sudokuBoard;
    private static SudokuBoard copySudokuBoard;
    private int counter = 0;
    private InsertNumber insertNumber = new InsertNumber(sudokuBoard, copySudokuBoard);
    private boolean choice;

    public CheckResult(SudokuBoard sudokuBoard, SudokuBoard copySudokuBoard) {
        this.sudokuBoard = sudokuBoard;
        this.copySudokuBoard = copySudokuBoard;
    }

    public boolean checkFields(){
        for (int i = 0 ; i < 9 ; i++){
            for(int j = 0 ; j < 9 ; j++){
                if(this.sudokuBoard.getvalueOfSingleField(i,j) != -1){
                    ++ counter;
                }
                if(counter == 81){
                    choice = true;
                }else {
                    choice = false;
                }
            }
        }
        return choice;
    }

    public boolean checkResultGame(){
        System.out.println("Do you want check result? Enter Yes \"y\" or No \"n\". ");
        if (!insertNumber.insertYesOrNo()){
            checkSolution = new CheckSolution(this.sudokuBoard, this.copySudokuBoard);
            choice = checkSolution.checkingSolution();
        }else{
            choice = false;
        }
        return choice;
    }
}
