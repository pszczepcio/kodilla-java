package board;

import java.util.ArrayList;
import java.util.List;

public class SudokuElement {
    private final static int EMPTY = -1;
    private int value = EMPTY;
    private boolean change = true;
    private List<Integer> probableNumbersList = new ArrayList<>();


    public List<Integer> getProbableNumbersList() {
        return probableNumbersList;
    }

    public int getValue() {
        return value;
    }

    public Integer setValue(Integer value) {
        return this.value = value;
    }

    public boolean isChange() {
        return change;
    }

    public void setChange(boolean change) {
        this.change = change;
    }
}
