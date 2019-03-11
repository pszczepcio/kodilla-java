package game;

import InsertData.InsertNumber;
import InsertData.NumberDTO;
import board.SudokuBoard;

public class InformationAboutIncorrectNumbers {
    InsertNumber insertNumber = new InsertNumber();
    private CopyBoardAndBadMove copyBoardAndBadMove;
    private SudokuBoard sudokuBoard;
    private SudokuBoard copyBoard;
    private NumberDTO numberDTO;
    private boolean incorrectNumbers;

    public InformationAboutIncorrectNumbers(SudokuBoard copyBoard, SudokuBoard sudokuBoard, NumberDTO numberDTO) {
        this.copyBoard = copyBoard;
        this.sudokuBoard = sudokuBoard;
        this.numberDTO = numberDTO;
    }

    public void countIncorrectNumbers() {
        if(this.sudokuBoard.getvalueOfSingleField(numberDTO.getRowNumber(), numberDTO.getColumnNumber()) != -1
                && numberDTO != null
                && this.sudokuBoard.getvalueOfSingleField(numberDTO.getRowNumber(),numberDTO.getColumnNumber())!=
                copyBoard.getvalueOfSingleField(numberDTO.getRowNumber(),numberDTO.getColumnNumber())) {

            copyBoardAndBadMove = new CopyBoardAndBadMove(sudokuBoard, numberDTO);
            copyBoardAndBadMove.copyBadMove();
            incorrectNumbers = false;
        }
    }

    private void undoGame(){
        for (int i = 0 ; i < CopyBoardAndBadMove.getBadMoves().size() ; i++){
            numberDTO = CopyBoardAndBadMove.getBadMoves().get(i).getNumberDTO();
            this.sudokuBoard.getSudokuBoard().get(numberDTO.getRowNumber()).getSudokuElementsInRow().get(numberDTO.getColumnNumber()).setValue(-1);
            sudokuBoard.printBoard();
        }
        CopyBoardAndBadMove.getBadMoves().clear();
        System.out.println("size "+ CopyBoardAndBadMove.getBadMoves().size());
    }
}
