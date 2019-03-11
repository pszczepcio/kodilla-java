
import Computer.SudokuSolution;
import InsertData.InsertNumber;
import InsertData.NumberDTO;
import board.GameStart;
import board.SudokuBoard;
import game.CheckResult;
import game.InformationAboutIncorrectNumbers;

public class SudokuGame {

    public static void main(String[] args) {
        InformationAboutIncorrectNumbers informationAboutIncorrectNumbers;
        SudokuBoard sudokuBoard;
        GameStart gameStart = new GameStart();
        sudokuBoard = gameStart.startSudoku();
        SudokuSolution sudokuSolution = new SudokuSolution(sudokuBoard);
        sudokuSolution.SudokuSolution();
        InsertNumber insertNumber = new InsertNumber(sudokuBoard , sudokuSolution.getCopySudokuBoard());
        boolean gameFinished = false;

        while(!gameFinished) {
            NumberDTO numberDTO = insertNumber.checkingInsertNumbers();
            if (numberDTO != null) {
                sudokuBoard.setValueOfSingleField(numberDTO.getRowNumber(),
                        numberDTO.getColumnNumber(),
                        numberDTO.getNumber());
                for (int i = 0; i < 50; i++) {
                    System.out.println();
                }
                sudokuBoard.printBoard();
                informationAboutIncorrectNumbers = new InformationAboutIncorrectNumbers(sudokuSolution.getCopySudokuBoard(), sudokuBoard, numberDTO);
                informationAboutIncorrectNumbers.countIncorrectNumbers();
            }
            CheckResult checkResult = new CheckResult(sudokuBoard, sudokuSolution.getCopySudokuBoard());
            if(checkResult.checkFields()){
                checkResult.checkResultGame();
                if (!insertNumber.playAgain()){
                    sudokuBoard.getSudokuBoard().clear();
                    sudokuBoard = gameStart.startSudoku();
                }else{
                    gameFinished = true;
                }
            }
        }
        System.out.println("Game End");
    }
}
