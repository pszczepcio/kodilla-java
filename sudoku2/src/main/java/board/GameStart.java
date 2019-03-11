package board;

public class GameStart {
    private  SudokuBoard sudokuBoard = new SudokuBoard();
    private  StartingBoard startingBoard = new StartingBoard(sudokuBoard);

    public  SudokuBoard startSudoku(){
        startingBoard.createSudokuBord();
        sudokuBoard = startingBoard.getBoard();
        GeneratedBoard generatedBoard = new GeneratedBoard(sudokuBoard);
        generatedBoard.createNewBoard();
        return sudokuBoard;
    }

    public SudokuBoard startsudoku2(){
        startingBoard.createSudokuBord();
        sudokuBoard = startingBoard.getBoard();
        GeneratedBoard generatedBoard = new GeneratedBoard(sudokuBoard);
        generatedBoard.creatBoard2();
        return sudokuBoard;
    }
}