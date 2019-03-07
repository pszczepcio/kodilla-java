package SudokuRules;

import board.SudokuBoard;
import game.Sections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CheckSudokuRules extends Sections {
    private SudokuBoard sudokuBoard;
    private final static int SIZE = 9;
    private int counter;
    private boolean valueCounter;
    private Set<Integer> numbersInRow = new HashSet<>();
    private List<Boolean> booleanNumberInRow = new ArrayList<>();
    private Set<Integer> numbersInColumn = new HashSet<>();
    private List<Boolean> booleanNumberInColumn = new ArrayList<>();
    private Set<Integer> numbersInSection = new HashSet<>();
    private static List<Boolean> booleanNumberInSection = new ArrayList<>();
    private boolean valueSection;
    private boolean numberSection;

    public CheckSudokuRules(SudokuBoard sudokuBoard) {
        this.sudokuBoard = sudokuBoard;
    }

    private boolean checkingFillingSudoku(){
        counter = 0;
        valueCounter = false;
        for(int i = 0 ; i < 9 ; i++){
            for (int j = 0 ; j < 9 ; j++){
                if(this.sudokuBoard.getvalueOfSingleField(i, j) != -1){
                    ++counter;
                }
                if (counter == 81){
                    valueCounter = true;
                }
            }
        }
        return valueCounter;
    }

    private boolean checkRow() {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                numbersInRow.add(this.sudokuBoard.getvalueOfSingleField(i, j));
            }
            if (numbersInRow.size() == SIZE) {
                booleanNumberInRow.add(true);
            }
        }
        if (booleanNumberInRow.size() == SIZE) {
            numbersInRow.clear();
            booleanNumberInRow.clear();
            return true;
        }else {
            numbersInRow.clear();
            booleanNumberInRow.clear();
            return  false;
        }
    }

    private boolean checkColumn(){
        for (int i = 0 ; i < 9 ; i++){
            for (int j = 0 ; j < 9 ; j++){
                numbersInColumn.add(this.sudokuBoard.getvalueOfSingleField(j, i));
            }
            if (numbersInColumn.size() == SIZE){
                booleanNumberInColumn.add(true);
            }
            numbersInColumn.clear();
        }
        if (booleanNumberInColumn.size() == SIZE){
            numbersInColumn.clear();
            booleanNumberInColumn.clear();
            return true;
        }else {
            numbersInColumn.clear();
            booleanNumberInColumn.clear();
            return false;
        }

    }

    private boolean checkSections(int iStart, int jStart, int iEnd, int jEnd){
        numberSection = false;
        for (int i = iStart ; i < iEnd ; i++){
            for (int j = jStart ; j < jEnd ; j++) {
                numbersInSection.add(this.sudokuBoard.getvalueOfSingleField(i, j));
            }
        }
        if (numbersInSection.size() == SIZE){
            numberSection = true;
        }
        return numberSection;
    }

    private boolean checkAllSections(){
        valueSection = false;
        for (int i = 0 ; i < 9 ; i+=3){
            for (int j = 0 ; j < 9 ; j+=3){
                int iStart = i;
                int jStart = j;
                int iEnd = i + 3;
                int jEnd = j + 3;
                booleanNumberInSection.add(checkSections(iStart, jStart, iEnd, jEnd));
            }
        }
        if (!(booleanNumberInSection.contains(false))) {
            valueSection  = true;
            System.out.println(booleanNumberInSection.size());
        }
        booleanNumberInSection.clear();
        return valueSection;
    }

    public boolean checkAllConditions(){
        if(checkingFillingSudoku()&& checkRow() && checkColumn() && checkAllSections()){
            return true;
        }
        return false;
    }
}
