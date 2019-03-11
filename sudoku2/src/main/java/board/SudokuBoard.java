package board;

import java.util.ArrayList;
import java.util.List;

public class SudokuBoard extends ProtoType {
    private List<SudokuRow> sudokuBoard = new ArrayList<>();

    public List<SudokuRow> getSudokuBoard() {
        return sudokuBoard;
    }

    public int getvalueOfSingleField(int row, int column){
        return getSudokuBoard().get(row).getSudokuElementsInRow().get(column).getValue();
    }

    public void setValueOfSingleField(int row, int column, int number){
        getSudokuBoard().get(row).getSudokuElementsInRow().get(column).setValue(number);
    }

    public void printBoard(){
        for(int i = 0 ; i < 14 ;i++){
            System.out.print("  --");
        }
        System.out.println();
        for (int i = 0 ; i < getSudokuBoard().size() ; i++) {
            for(int j = 0 ; j < getSudokuBoard().get(i).getSudokuElementsInRow().size() ; j++){
                if(getSudokuBoard().get(i).getSudokuElementsInRow().get(j).getValue() == -1){
                    System.out.print("  |  " + " ");
                }else {
                    System.out.print("  |  " + getSudokuBoard().get(i).getSudokuElementsInRow().get(j).getValue());
                }
            }
            System.out.println("  |");
            for(int a = 0 ; a < 14 ; a++){
                System.out.print("  --");
            }
            System.out.println();
        }
    }

    public SudokuBoard deepCopy() throws CloneNotSupportedException{
        SudokuBoard clonedSudokuBoard = (SudokuBoard)super.clone();
        clonedSudokuBoard.sudokuBoard = new ArrayList<>();
        for(SudokuRow row: sudokuBoard){
            SudokuRow clonedSudokuRow = new SudokuRow();
            clonedSudokuRow.getSudokuElementsInRow();
            for (SudokuElement element: row.getSudokuElementsInRow()){
                SudokuElement clonedElement = new SudokuElement();
                clonedElement.setValue(element.getValue());
                for(Integer numbers: element.getProbableNumbersList()) {
                    clonedElement.getProbableNumbersList().add(numbers);
                }
                clonedSudokuRow.getSudokuElementsInRow().add(clonedElement);
            }
            clonedSudokuBoard.getSudokuBoard().add(clonedSudokuRow);
        }
        return clonedSudokuBoard;
    }
}
