package Computer;

import board.SudokuBoard;
import java.util.stream.IntStream;

public class Solve {
    private static final int BOARD_SIZE = 9;
    private static final int SUBSECTION_SIZE = 3;
    private static final int NO_VALUE = -1;
    private static final int MIN_VALUE = 1;
    private static final int MAX_VALUE = 9;

    public boolean solve(SudokuBoard sudokuBoard) {
        for (int row = 0; row < BOARD_SIZE; row++) {
            for (int column = 0; column < BOARD_SIZE; column++) {
                if (sudokuBoard.getvalueOfSingleField(row, column) == NO_VALUE) {
                    for (int k = MIN_VALUE; k <= MAX_VALUE; k++) {
                        sudokuBoard.setValueOfSingleField(row,column,k);
                        if (isValid(sudokuBoard, row, column) && solve(sudokuBoard)) {
                            return true;
                        }
                        sudokuBoard.setValueOfSingleField(row, column, NO_VALUE);
                    }
                    return false;
                }
            }
        }
        return true;
    }

    private boolean isValid(SudokuBoard sudokuBoard, int row, int column) {
        return (rowConstraint(sudokuBoard, row)
                && columnConstraint(sudokuBoard, column)
                && subsectionConstraint(sudokuBoard, row, column));
    }

    private boolean rowConstraint(SudokuBoard sudokuBoard, int row) {
        boolean[] constraint = new boolean[BOARD_SIZE];
        return IntStream.range(0, BOARD_SIZE)
                .allMatch(column -> checkConstraint(sudokuBoard, row, constraint, column));
    }

    private boolean columnConstraint(SudokuBoard sudokuBoard, int column) {
        boolean[] constraint = new boolean[BOARD_SIZE];
        return IntStream.range(0, BOARD_SIZE)
                .allMatch(row -> checkConstraint(sudokuBoard, row, constraint, column));
    }

    private boolean subsectionConstraint(SudokuBoard sudokuBoard, int row, int column) {
        boolean[] constraint = new boolean[BOARD_SIZE];
        int subsectionRowStart = (row / SUBSECTION_SIZE) * SUBSECTION_SIZE;
        int subsectionRowEnd = subsectionRowStart + SUBSECTION_SIZE;

        int subsectionColumnStart = (column / SUBSECTION_SIZE) * SUBSECTION_SIZE;
        int subsectionColumnEnd = subsectionColumnStart + SUBSECTION_SIZE;

        for (int r = subsectionRowStart; r < subsectionRowEnd; r++) {
            for (int c = subsectionColumnStart; c < subsectionColumnEnd; c++) {
                if (!checkConstraint(sudokuBoard, r, constraint, c)) return false;
            }
        }
        return true;
    }

    private boolean checkConstraint(SudokuBoard sudokuBoard, int row, boolean[] constraint, int column) {
        if (sudokuBoard.getvalueOfSingleField(row, column) != -1) {
            if (!constraint[sudokuBoard.getvalueOfSingleField(row, column) - 1]) {
                constraint[sudokuBoard.getvalueOfSingleField(row, column) - 1] = true;
            } else {
                return false;
            }
        }
        return true;
    }
}
