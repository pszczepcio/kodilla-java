package InsertData;
import board.GameStart;
import board.SudokuBoard;
import java.util.Scanner;

public class InsertNumber {
    private NumberDTO numberDTO;
    private SudokuBoard sudokuBoard;
    private SudokuBoard copySudokuBoard;
    private Scanner scanner = new Scanner(System.in);
    private final static String SUDOKU = "sudoku";
    private final static String YES = "y";
    private final static String NO = "n";
    private String word;
    private int columnNumber ;
    private int rowNumber ;
    private int number ;
    private boolean choiceYesOrNo;

    public InsertNumber() {
    }

    public InsertNumber(SudokuBoard sudokuBoard, SudokuBoard copySudokuBoard) {
        this.sudokuBoard = sudokuBoard;
        this.copySudokuBoard = copySudokuBoard;
    }

    public boolean insertColumnNumber(){
        while (!scanner.hasNextInt()){
            word = scanner.next();
            if(!checkWordSudoku(word)){
                return true;
            }else{
                return false;
            }
        }
        columnNumber = scanner.nextInt()-1;
        return false;
    }

    private boolean insertRowNumber(){
        while(!scanner.hasNextInt()){
            word = scanner.next();
            if (!checkWordSudoku(word)) {
                return true;
            }else {
                return false;
            }
        }
        rowNumber = scanner.nextInt()-1;
        return false;
    }

    private boolean insertNumber(){
        while(!scanner.hasNextInt()){
            word = scanner.next();
            if (!checkWordSudoku(word)) {
                return true;
            }else {
                return false;
            }
        }
        int number1 = scanner.nextInt();
        if(1 <= number1 && number1 <= 9){
            number = number1;
        }
        return false;
    }

    public boolean insertYesOrNo(){
        boolean yesOrNo = false;
        String insertYesOrNo = scanner.next();
        while (!yesOrNo){
            if (insertYesOrNo.equals(YES)){
                choiceYesOrNo = false;
                yesOrNo = true;
            }else if (insertYesOrNo.equals(NO)){
                choiceYesOrNo = true;
                yesOrNo = true;
            }
        }
        return choiceYesOrNo;
    }

    public NumberDTO checkingInsertNumbers(){
        System.out.print("Please insert the column number :");
        if (insertColumnNumber()){
            return numberDTO = new NumberDTO(0,0,0);
        }
        System.out.print("Please insert the row number :");
        if (insertRowNumber()){
            return numberDTO = new NumberDTO(0,0,0);
        }
        System.out.print("Please enter a number from 1 to 9 :");
        if (insertNumber()){
            return numberDTO = new NumberDTO(0,0,0);
        }

        if((0 <= this.columnNumber && this.columnNumber < 9)
                && (0 <= this.rowNumber && this.rowNumber < 9) && this.sudokuBoard.getvalueOfSingleField(this.rowNumber, this.columnNumber) == -1
                || this.sudokuBoard.getSudokuBoard().get(this.rowNumber).getSudokuElementsInRow().get(this.columnNumber).isChange()){
            numberDTO = new NumberDTO(getRowNumber(), getColumnNumber(), getNumber());
        }else {
            System.out.println("You entered the wrong number or occupied field");
            numberDTO = null;
        }
        return numberDTO;
    }

    public boolean checkWordSudoku(String word){
        boolean value;
        boolean value2;
        if(word.equals(SUDOKU)){
            copySudokuBoard.printBoard();
            value = playAgain();
            if (!value){
                sudokuBoard.getSudokuBoard().clear();
                GameStart gameStart = new GameStart();
                sudokuBoard = gameStart.startSudoku();
                value2 = true;
            }else {
                value2 = false;
            }
        }else {
            System.out.println("You entered a letter instead of a number or you entered a letter. Please enter the correct number.");
            value2 = true;
        }
        return value2;
    }

    public boolean playAgain(){
        System.out.println("Do you want play again? Enter \"y\" or \"n\". ");
        return insertYesOrNo();
    }

    public int getColumnNumber() {
        return columnNumber;
    }

    public int getRowNumber() {
        return rowNumber;
    }

    public int getNumber() {
        return number;
    }
}
