package InsertData;

public class NumberDTO {
    private int columnNumber;
    private int rowNumber;
    private int number;

    public NumberDTO(int rowNumber, int columnNumber, int number) {
        this.rowNumber = rowNumber;
        this.columnNumber = columnNumber;
        this.number = number;
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
