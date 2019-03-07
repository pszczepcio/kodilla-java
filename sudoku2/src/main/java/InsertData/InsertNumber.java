package InsertData;

import Computer.Computer;
import board.SudokuBoard;

import java.util.Scanner;

public class InsertNumber {
    private NumberDTO numberDTO;
    private SudokuBoard sudokuBoard;
    private Scanner scanner = new Scanner(System.in);
    private final static String SUDOKU = "sudoku";
    private final static String YES = "y";
    private final static String NO = "n";
    private final static String UNDO = "c";
    private final static String END = "e";
    private String insertYesOrNo;
    private String insertUndoOrEnd;

    private Computer computer;
    private String word;
    private int columnNumber ;
    private int rowNumber ;
    private int number ;
    private boolean yesOrNo;
    private boolean choiceYesOrNo;
    private boolean undOrEnd;
    private boolean choiceUndOrEnd;

    public InsertNumber() {
    }

    public InsertNumber(SudokuBoard sudokuBoard) {
        this.sudokuBoard = sudokuBoard;
    }

    private void insertColumnNumber(){
        while (!scanner.hasNextInt()){
            word = scanner.next();
            checkWordSudoku(word);
        }
        columnNumber = scanner.nextInt()-1;
    }

    private void insertRowNumber(){
        while(!scanner.hasNextInt()){
            scanner.next();
            word = scanner.next();
            checkWordSudoku(word);
        }
        rowNumber = scanner.nextInt()-1;
    }

    private void insertNumber(){
        while(!scanner.hasNextInt()){
            scanner.next();
            word = scanner.next();
            checkWordSudoku(word);
        }
        int number1 = scanner.nextInt();
        if(1 <= number1 && number1 <= 9){
            number = number1;
        }
    }

    private boolean insertYesOrNo(){
        yesOrNo = false;
        insertYesOrNo = scanner.next();
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

    public boolean insertUndoOrEnd(){
        undOrEnd = false;
        insertUndoOrEnd = scanner.next();
        while (!undOrEnd){
            if (insertUndoOrEnd.equals(UNDO)){
                choiceUndOrEnd = false;
                undOrEnd = true;
            }else if (insertUndoOrEnd.equals(END)){
                choiceUndOrEnd = true;
                undOrEnd = true;
            }
        }
        return choiceUndOrEnd;
    }

    public NumberDTO checkingInsertNumbers(){
        numberDTO = null;
        System.out.print("Please insert the column number :");
        insertColumnNumber();
        System.out.print("Please insert the row number :");
        insertRowNumber();
        System.out.print("Please enter a number from 1 to 9 :");
        insertNumber();
        if((0 <= this.columnNumber && this.columnNumber < 9) && (0 <= this.rowNumber && this.rowNumber < 9) && this.sudokuBoard.getvalueOfSingleField(this.rowNumber, this.columnNumber) == -1){
            numberDTO = new NumberDTO(getRowNumber(), getColumnNumber(), getNumber());
        }else /*if (this.columnNumber > 9 || this.rowNumber > 9 || number > 9)*/{
            System.out.println("You entered the wrong number or occupied field");
            numberDTO = null;
        }
        return numberDTO;
    }

    private void checkWordSudoku(String word){
        if(word.equals(SUDOKU)){
            computer = new Computer(this.sudokuBoard);
            computer.sudokuSolution();
            return;
        }
        System.out.println("You entered a letter instead of a number or you entered a letter. Please enter the correct number.");
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

    public NumberDTO getNumbersDto() {
        return new NumberDTO(getRowNumber(), getColumnNumber(), getNumber());
    }
}
