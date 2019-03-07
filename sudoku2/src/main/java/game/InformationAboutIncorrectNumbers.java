package game;

import InsertData.InsertNumber;
import InsertData.NumberDTO;
import board.CopyBoardAndBadMove;
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

    public boolean countIncorrectNumbers() {
        if(this.sudokuBoard.getvalueOfSingleField(numberDTO.getRowNumber(), numberDTO.getColumnNumber()) != -1
            && numberDTO !=null && this.sudokuBoard.getvalueOfSingleField(numberDTO.getRowNumber(),numberDTO.getColumnNumber())!=
                copyBoard.getvalueOfSingleField(numberDTO.getRowNumber(),numberDTO.getColumnNumber())) {

            copyBoardAndBadMove = new CopyBoardAndBadMove(sudokuBoard, numberDTO);
            copyBoardAndBadMove.copyBadMove();
            incorrectNumbers = false;
        }
        if(0 < CopyBoardAndBadMove.getBadMoves().size() && CopyBoardAndBadMove.getBadMoves().size() < 2) {
            System.out.print("You enetered 3 incorrect numbers. If you want to undo the game, press \"c\" ");
            System.out.println("or if you want finish the game, press \" e\"");
            if (!insertNumber.insertUndoOrEnd()) {
                undoGame();
                incorrectNumbers = false;
            }else{
                incorrectNumbers = true;
            }
        }
        return incorrectNumbers;
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
