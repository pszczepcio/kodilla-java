package board;

public class GameStart {
    private SudokuBoard sudokuBoard = new SudokuBoard();
    private StartingBoard startingBoard = new StartingBoard(sudokuBoard);

    public SudokuBoard startSudoku(){
        startingBoard.createSudokuBord();
        sudokuBoard = startingBoard.getBoard();
        GeneratedBoard generatedBoard = new GeneratedBoard(sudokuBoard);
        generatedBoard.createNewBoard();
        return sudokuBoard;
    }
}
