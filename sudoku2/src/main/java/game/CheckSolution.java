package game;

import board.SudokuBoard;

public class CheckSolution {
    private SudokuBoard sudokuBoard;
    private SudokuBoard copySudokuBoard;
    private boolean solutionIsGood;

    public CheckSolution(SudokuBoard sudokuBoard, SudokuBoard copySudokuBoard) {
        this.sudokuBoard = sudokuBoard;
        this.copySudokuBoard = copySudokuBoard;
    }

    public boolean checkingSolution(){
        solutionIsGood = true;
        for (int i = 0 ; i < 9 ; i++){
            for (int j = 0 ; j < 9 ; j++){
                if (this.sudokuBoard.getvalueOfSingleField(i, j) != copySudokuBoard.getvalueOfSingleField(i, j)){
                    solutionIsGood = false;
                }
            }
        }
        if(solutionIsGood){
            System.out.println("Your solution is good.");
        }else{
            System.out.println("Your solution is bad");
        }
        return solutionIsGood;
    }

}
