package board;

public class StartingBoard {
    private SudokuBoard sudokuBoard;

    public StartingBoard(SudokuBoard sudokuBoard) {
        this.sudokuBoard = sudokuBoard;
    }

    public void createSudokuBord(){
        for (int i = 0 ; i < 9 ; i++){
            this.sudokuBoard.getSudokuBoard().add(new SudokuRow());
        }
        for (int i = 0 ; i < 9 ; i++) {
            for (int j = 0; j < 9; j++) {
                this.sudokuBoard.getSudokuBoard().get(i).getSudokuElementsInRow().add(new SudokuElement());
            }
        }
        for (int i = 0 ; i < 9 ; i++){
            for (int j = 0 ; j < 9 ; j++){
                for (int x = 1 ; x < 10 ; x++){
                    this.sudokuBoard.getSudokuBoard().get(i).getSudokuElementsInRow().get(j).getProbableNumbersList().add(x);
                }
            }
        }
    }

    public SudokuBoard getBoard() {
        return this.sudokuBoard;
    }
}
